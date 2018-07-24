package com.manparvesh.politeness;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.manparvesh.politeness.subcommands.PolitenessCommand;
import com.manparvesh.politeness.subcommands.REPL;

import java.util.HashMap;
import java.util.Map;

// @SpringBootApplication
public class Application {

    public static void main(final String[] args) {
        // SpringApplication.run(Application.class, args);

        final Map<String, PolitenessCommand> subCommands = new HashMap<>();
        subCommands.put("repl", new REPL());

        final PolitenessCommandLine commandLine = new PolitenessCommandLine();
        final JCommander jCommander = new JCommander(commandLine);

        for (Map.Entry<String, PolitenessCommand> commandEntry : subCommands.entrySet()) {
            jCommander.addCommand(commandEntry.getKey(), commandEntry.getValue());
        }
        try {
            jCommander.parse(args);
        } catch (ParameterException e) {
            System.out.println(e.getMessage());
            jCommander.usage();
            System.exit(1);
            return;
        }

        commandLine.parse(jCommander);

        final String parseCommand = jCommander.getParsedCommand();
        if (parseCommand != null) {
            subCommands.get(parseCommand).parse();
        }
    }
}
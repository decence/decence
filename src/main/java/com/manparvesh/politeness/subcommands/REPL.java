package com.manparvesh.politeness.subcommands;

import com.beust.jcommander.Parameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Parameters(commandDescription = "A Read–Eval–Print Loop (REPL) for Politeness language")
public class REPL implements PolitenessCommand {

    public static final String REPL_WELCOME = ""
            + "                  _   _   _                                          \n"
            + "                 | | (_) | |                                         \n"
            + "  _ __     ___   | |  _  | |_    ___   _ __     ___   ___   ___      \n"
            + " | '_ \\   / _ \\  | | | | | __|  / _ \\ | '_ \\   / _ \\ / __| / __|\n"
            + " | |_) | | (_) | | | | | | |_  |  __/ | | | | |  __/ \\__ \\ \\__ \\ \n"
            + " | .__/   \\___/  |_| |_|  \\__|  \\___| |_| |_|  \\___| |___/ |___/ \n"
            + " | |                                                                 \n"
            + " |_|                                                                 \n"
            + "\n"
            + "A programming language based on politeness and good manners"
            + "\n"
            + "\n";
    public static final String REPL_PROMPT = ">> ";
    public static final String REPL_EXIT = "exit()";
    public static final String REPL_GOODBYE = "Goodbye";

    private InputStream inputStream;

    public REPL(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void parse() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;

        System.out.println(REPL_WELCOME);

        do {
            try {
                // JCommander.getConsole().print(">> ");
                System.out.print(REPL_PROMPT);

                line = bufferedReader.readLine();

                if (REPL_EXIT.equals(line)) {
                    System.out.println(REPL_GOODBYE);
                    break;
                }

                // todo add compilation of programs
                System.out.println(line);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (line != null);
    }
}

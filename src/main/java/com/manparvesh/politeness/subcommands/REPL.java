package com.manparvesh.politeness.subcommands;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Parameters(commandDescription = "A Read–Eval–Print Loop (REPL) for Politeness language")
public class REPL implements PolitenessCommand {

    @Override
    public void parse() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        System.out.println(""
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
                + "\n"
        );

        do {
            try {
                // JCommander.getConsole().print(">> ");
                System.out.print(">> ");

                line = bufferedReader.readLine();

                if ("exit()".equals(line)) {
                    System.out.println("Goodbye");
                    break;
                }

                // todo add compilation of programs
                JCommander.getConsole().println(line);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (line != null);
    }
}

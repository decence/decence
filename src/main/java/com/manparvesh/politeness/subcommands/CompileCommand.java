package com.manparvesh.politeness.subcommands;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.manparvesh.politeness.antlr.PolitenessLexer;
import com.manparvesh.politeness.antlr.PolitenessParser;
import com.manparvesh.politeness.listeners.MyListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileInputStream;
import java.io.IOException;

@Parameters(commandDescription = "Compile programs written in the politeness language")
public class CompileCommand implements PolitenessCommand {

    @Parameter(required = true)
    private String file;

    @Override public void parse() {
        try {
            ANTLRInputStream inputStream = new ANTLRInputStream(new FileInputStream(file));

            PolitenessLexer lexer = new PolitenessLexer(inputStream);
            PolitenessParser parser = new PolitenessParser(new CommonTokenStream(lexer));

            parser.addParseListener(new MyListener());

            // start parsing
            parser.program();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

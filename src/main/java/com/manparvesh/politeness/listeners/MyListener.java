package com.manparvesh.politeness.listeners;

import com.manparvesh.politeness.antlr.PolitenessBaseListener;
import com.manparvesh.politeness.antlr.PolitenessParser;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class MyListener extends PolitenessBaseListener {
    private Map<String, Integer> variables;

    public MyListener() {
        variables = new HashMap<>();
    }

    @Override
    public void exitAssign(PolitenessParser.AssignContext assignContext) {
        // this is called when the parser is finished parsing the assign statement
        log.info("assign statement used");

    }

    @Override
    public void exitAdd(PolitenessParser.AddContext addContext) {
        // This method is called when the parser has finished
        // parsing the add statement
        log.info("add statement used");
    }

    @Override
    public void exitPrint(PolitenessParser.PrintContext printContext) {
        // This method is called when the parser has finished
        // parsing the print statement
        log.info("print statement used");
    }

    @Override
    public void exitPrintln(PolitenessParser.PrintlnContext printlnContext) {
        // This method is called when the parser has finished
        // parsing the print statement
        log.info("println statement used");
    }

}

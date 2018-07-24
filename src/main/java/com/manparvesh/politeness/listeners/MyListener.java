package com.manparvesh.politeness.listeners;

import com.manparvesh.politeness.antlr.PolitenessBaseListener;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

import static com.manparvesh.politeness.antlr.PolitenessParser.AssignContext;

@Slf4j
public class MyListener extends PolitenessBaseListener {
    private Map<String, Integer> variables;

    public MyListener() {
        variables = new HashMap<>();
    }

    @Override
    public void exitAssign(AssignContext assignContext) {
        // this is called when the parser is finished parsing the assign statement
        log.info("assign statement used");

    }
}

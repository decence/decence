package com.manparvesh.politeness.subcommands;

import com.google.common.io.Resources;
import com.manparvesh.politeness.Application;
import org.junit.Test;

public class CompileCommandTest {
    @Test
    public void compileTest() {
        Application.main(new String[] { "compile", Resources.getResource("hw.pls").getFile() });
    }
}
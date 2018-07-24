package com.manparvesh.politeness.subcommands;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.manparvesh.politeness.subcommands.REPL.REPL_EXIT;
import static com.manparvesh.politeness.subcommands.REPL.REPL_GOODBYE;
import static com.manparvesh.politeness.subcommands.REPL.REPL_PROMPT;
import static com.manparvesh.politeness.subcommands.REPL.REPL_WELCOME;
import static org.junit.Assert.assertEquals;

public class REPLTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testREPL() {
        final String HELLO = "hello\n";
        String inputString = ""
                + HELLO
                + REPL_EXIT;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(inputString.getBytes());
        REPL repl = new REPL(byteArrayInputStream);
        repl.parse();
        assertEquals(REPL_WELCOME
                + "\n"
                + REPL_PROMPT + HELLO
                + REPL_PROMPT + REPL_GOODBYE + "\n", outContent.toString());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
}
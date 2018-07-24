// Generated from /home/manparvesh/Desktop/github_repos/grace/src/main/antlr/com/manparvesh/politeness/antlr/Politeness.g4 by ANTLR 4.7
package com.manparvesh.politeness.antlr;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class PolitenessParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, ID = 9,
            NUMBER = 10, WS = 11;
    public static final int
            RULE_program = 0, RULE_statement = 1, RULE_assign = 2, RULE_print = 3,
            RULE_println = 4, RULE_add = 5;
    public static final String[] ruleNames = {
            "program", "statement", "assign", "print", "println", "add"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r.\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\6\2\21\n\2\r\2\16\2\22\3\2" +
                    "\3\2\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3" +
                    "\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\13\f\2+\2" +
                    "\16\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\n%\3\2\2\2\f)\3\2\2\2" +
                    "\16\20\7\3\2\2\17\21\5\4\3\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2" +
                    "\22\23\3\2\2\2\23\24\3\2\2\2\24\25\7\4\2\2\25\3\3\2\2\2\26\33\5\6\4\2" +
                    "\27\33\5\f\7\2\30\33\5\b\5\2\31\33\5\n\6\2\32\26\3\2\2\2\32\27\3\2\2\2" +
                    "\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\7\5\2\2\35\36\7\f\2\2" +
                    "\36\37\7\6\2\2\37 \7\13\2\2 \7\3\2\2\2!\"\7\7\2\2\"#\t\2\2\2#$\7\b\2\2" +
                    "$\t\3\2\2\2%&\7\t\2\2&\'\t\2\2\2\'(\7\b\2\2(\13\3\2\2\2)*\7\f\2\2*+\7" +
                    "\n\2\2+,\7\f\2\2,\r\3\2\2\2\4\22\32";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'begin'", "'end'", "'kindly set '", "'to'", "'kindly print('",
            "')'", "'kindly println('", "'+'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, "ID", "NUMBER",
            "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public PolitenessParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Politeness.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgramContext program() throws RecognitionException {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(12);
                match(T__0);
                setState(14);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(13);
                            statement();
                        }
                    }
                    setState(16);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0
                        && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__6) | (1L << NUMBER))) != 0));
                setState(18);
                match(T__1);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            setState(24);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
            case T__2:
                enterOuterAlt(_localctx, 1);
            {
                setState(20);
                assign();
            }
            break;
            case NUMBER:
                enterOuterAlt(_localctx, 2);
            {
                setState(21);
                add();
            }
            break;
            case T__4:
                enterOuterAlt(_localctx, 3);
            {
                setState(22);
                print();
            }
            break;
            case T__6:
                enterOuterAlt(_localctx, 4);
            {
                setState(23);
                println();
            }
            break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AssignContext assign() throws RecognitionException {
        AssignContext _localctx = new AssignContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_assign);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(26);
                match(T__2);
                setState(27);
                match(NUMBER);
                setState(28);
                match(T__3);
                setState(29);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrintContext print() throws RecognitionException {
        PrintContext _localctx = new PrintContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_print);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(31);
                match(T__4);
                setState(32);
                _la = _input.LA(1);
                if (!(_la == ID || _la == NUMBER)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(33);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final PrintlnContext println() throws RecognitionException {
        PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_println);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(35);
                match(T__6);
                setState(36);
                _la = _input.LA(1);
                if (!(_la == ID || _la == NUMBER)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF)
                        matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
                setState(37);
                match(T__5);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final AddContext add() throws RecognitionException {
        AddContext _localctx = new AddContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_add);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(39);
                match(NUMBER);
                setState(40);
                match(T__7);
                setState(41);
                match(NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProgramContext extends ParserRuleContext {
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override public int getRuleIndex() {
            return RULE_program;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).enterProgram(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).exitProgram(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public AssignContext assign() {
            return getRuleContext(AssignContext.class, 0);
        }

        public AddContext add() {
            return getRuleContext(AddContext.class, 0);
        }

        public PrintContext print() {
            return getRuleContext(PrintContext.class, 0);
        }

        public PrintlnContext println() {
            return getRuleContext(PrintlnContext.class, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).exitStatement(this);
        }
    }

    public static class AssignContext extends ParserRuleContext {
        public AssignContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NUMBER() {
            return getToken(PolitenessParser.NUMBER, 0);
        }

        public TerminalNode ID() {
            return getToken(PolitenessParser.ID, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_assign;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).enterAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).exitAssign(this);
        }
    }

    public static class PrintContext extends ParserRuleContext {
        public PrintContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NUMBER() {
            return getToken(PolitenessParser.NUMBER, 0);
        }

        public TerminalNode ID() {
            return getToken(PolitenessParser.ID, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_print;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).exitPrint(this);
        }
    }

    public static class PrintlnContext extends ParserRuleContext {
        public PrintlnContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode NUMBER() {
            return getToken(PolitenessParser.NUMBER, 0);
        }

        public TerminalNode ID() {
            return getToken(PolitenessParser.ID, 0);
        }

        @Override public int getRuleIndex() {
            return RULE_println;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).enterPrintln(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).exitPrintln(this);
        }
    }

    public static class AddContext extends ParserRuleContext {
        public AddContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> NUMBER() {
            return getTokens(PolitenessParser.NUMBER);
        }

        public TerminalNode NUMBER(int i) {
            return getToken(PolitenessParser.NUMBER, i);
        }

        @Override public int getRuleIndex() {
            return RULE_add;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).enterAdd(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof PolitenessListener)
                ((PolitenessListener)listener).exitAdd(this);
        }
    }
}
// Generated from /home/manparvesh/Desktop/github_repos/grace/src/main/antlr/com/manparvesh/politeness/antlr/Politeness.g4 by ANTLR 4.7
package com.manparvesh.politeness.antlr;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class PolitenessLexer extends Lexer {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, ID = 9,
            NUMBER = 10, WS = 11;
    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "ID",
            "NUMBER", "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\re\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6" +
                    "\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3" +
                    "\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\6\nV\n\n\r\n\16\nW\3\13\6\13" +
                    "[\n\13\r\13\16\13\\\3\f\6\f`\n\f\r\f\16\fa\3\f\3\f\2\2\r\3\3\5\4\7\5\t" +
                    "\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\5\3\2c|\3\2\62;\4\2\13\f\"\"" +
                    "\2g\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3" +
                    "\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2" +
                    "\2\3\31\3\2\2\2\5\37\3\2\2\2\7#\3\2\2\2\t/\3\2\2\2\13\62\3\2\2\2\r@\3" +
                    "\2\2\2\17B\3\2\2\2\21R\3\2\2\2\23U\3\2\2\2\25Z\3\2\2\2\27_\3\2\2\2\31" +
                    "\32\7d\2\2\32\33\7g\2\2\33\34\7i\2\2\34\35\7k\2\2\35\36\7p\2\2\36\4\3" +
                    "\2\2\2\37 \7g\2\2 !\7p\2\2!\"\7f\2\2\"\6\3\2\2\2#$\7m\2\2$%\7k\2\2%&\7" +
                    "p\2\2&\'\7f\2\2\'(\7n\2\2()\7{\2\2)*\7\"\2\2*+\7u\2\2+,\7g\2\2,-\7v\2" +
                    "\2-.\7\"\2\2.\b\3\2\2\2/\60\7v\2\2\60\61\7q\2\2\61\n\3\2\2\2\62\63\7m" +
                    "\2\2\63\64\7k\2\2\64\65\7p\2\2\65\66\7f\2\2\66\67\7n\2\2\678\7{\2\289" +
                    "\7\"\2\29:\7r\2\2:;\7t\2\2;<\7k\2\2<=\7p\2\2=>\7v\2\2>?\7*\2\2?\f\3\2" +
                    "\2\2@A\7+\2\2A\16\3\2\2\2BC\7m\2\2CD\7k\2\2DE\7p\2\2EF\7f\2\2FG\7n\2\2" +
                    "GH\7{\2\2HI\7\"\2\2IJ\7r\2\2JK\7t\2\2KL\7k\2\2LM\7p\2\2MN\7v\2\2NO\7n" +
                    "\2\2OP\7p\2\2PQ\7*\2\2Q\20\3\2\2\2RS\7-\2\2S\22\3\2\2\2TV\t\2\2\2UT\3" +
                    "\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\24\3\2\2\2Y[\t\3\2\2ZY\3\2\2\2[" +
                    "\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\26\3\2\2\2^`\t\4\2\2_^\3\2\2\2`a\3\2" +
                    "\2\2a_\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\b\f\2\2d\30\3\2\2\2\6\2W\\a\3\b\2" +
                    "\2";
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
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

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

    public PolitenessLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}
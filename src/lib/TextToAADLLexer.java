// Generated from TextToAADL.g4 by ANTLR 4.9.2

    package lib;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TextToAADLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Struct_noun=1, Comma=2, And=3, End=4, IT=5, TO=6, THEM=7, FROM=8, Struct_verb=9, 
		FUNC_VERB=10, ENERGY=11, SOLID=12, LIQUID=13, GAS=14, SIGNAL=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Struct_noun", "Comma", "And", "End", "IT", "TO", "THEM", "FROM", "Struct_verb", 
			"FUNC_VERB", "ENERGY", "SOLID", "LIQUID", "GAS", "SIGNAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "','", "'and'", "'.'", "'it'", "'to'", "'them'", "'from'", 
			"'consists'", null, null, "'ground coffee'", null, "'steam'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Struct_noun", "Comma", "And", "End", "IT", "TO", "THEM", "FROM", 
			"Struct_verb", "FUNC_VERB", "ENERGY", "SOLID", "LIQUID", "GAS", "SIGNAL", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public TextToAADLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TextToAADL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u012a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6"+
		"\2%\n\2\r\2\16\2&\3\2\7\2*\n\2\f\2\16\2-\13\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00bc\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00ee\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0119\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\6\20\u0122"+
		"\n\20\r\20\16\20\u0123\3\21\6\21\u0127\n\21\r\21\16\21\u0128\2\2\22\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22\3\2\6\3\2C\\\4\2C\\aa\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u013d"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3$\3\2"+
		"\2\2\5.\3\2\2\2\7\60\3\2\2\2\t\64\3\2\2\2\13\66\3\2\2\2\r9\3\2\2\2\17"+
		"<\3\2\2\2\21A\3\2\2\2\23F\3\2\2\2\25\u00bb\3\2\2\2\27\u00ed\3\2\2\2\31"+
		"\u00ef\3\2\2\2\33\u0118\3\2\2\2\35\u011a\3\2\2\2\37\u0121\3\2\2\2!\u0126"+
		"\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'+\3\2\2\2"+
		"(*\t\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\4\3\2\2\2-+\3\2\2"+
		"\2./\7.\2\2/\6\3\2\2\2\60\61\7c\2\2\61\62\7p\2\2\62\63\7f\2\2\63\b\3\2"+
		"\2\2\64\65\7\60\2\2\65\n\3\2\2\2\66\67\7k\2\2\678\7v\2\28\f\3\2\2\29:"+
		"\7v\2\2:;\7q\2\2;\16\3\2\2\2<=\7v\2\2=>\7j\2\2>?\7g\2\2?@\7o\2\2@\20\3"+
		"\2\2\2AB\7h\2\2BC\7t\2\2CD\7q\2\2DE\7o\2\2E\22\3\2\2\2FG\7e\2\2GH\7q\2"+
		"\2HI\7p\2\2IJ\7u\2\2JK\7k\2\2KL\7u\2\2LM\7v\2\2MN\7u\2\2N\24\3\2\2\2O"+
		"P\7e\2\2PQ\7q\2\2QR\7p\2\2RS\7v\2\2ST\7c\2\2TU\7k\2\2UV\7p\2\2V\u00bc"+
		"\7u\2\2WX\7k\2\2XY\7o\2\2YZ\7r\2\2Z[\7q\2\2[\\\7t\2\2\\]\7v\2\2]\u00bc"+
		"\7u\2\2^_\7g\2\2_`\7z\2\2`a\7r\2\2ab\7q\2\2bc\7t\2\2cd\7v\2\2d\u00bc\7"+
		"u\2\2ef\7e\2\2fg\7q\2\2gh\7p\2\2hi\7x\2\2ij\7g\2\2jk\7t\2\2kl\7v\2\2l"+
		"\u00bc\7u\2\2mn\7v\2\2no\7t\2\2op\7c\2\2pq\7p\2\2qr\7u\2\2rs\7h\2\2st"+
		"\7g\2\2tu\7t\2\2u\u00bc\7u\2\2vw\7t\2\2wx\7g\2\2xy\7e\2\2yz\7g\2\2z{\7"+
		"k\2\2{|\7x\2\2|}\7g\2\2}\u00bc\7u\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7g\2\2\u0081\u0082\7t\2\2\u0082\u0083\7i\2\2\u0083\u0084\7k\2\2"+
		"\u0084\u0085\7|\2\2\u0085\u0086\7g\2\2\u0086\u00bc\7u\2\2\u0087\u0088"+
		"\7f\2\2\u0088\u0089\7g\2\2\u0089\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7t\2\2\u008d\u008e\7i\2\2\u008e\u008f\7k\2\2"+
		"\u008f\u0090\7|\2\2\u0090\u0091\7g\2\2\u0091\u00bc\7u\2\2\u0092\u0093"+
		"\7f\2\2\u0093\u0094\7k\2\2\u0094\u0095\7u\2\2\u0095\u0096\7v\2\2\u0096"+
		"\u0097\7t\2\2\u0097\u0098\7k\2\2\u0098\u0099\7d\2\2\u0099\u009a\7w\2\2"+
		"\u009a\u009b\7v\2\2\u009b\u009c\7g\2\2\u009c\u00bc\7u\2\2\u009d\u009e"+
		"\7u\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7r\2\2\u00a0\u00a1\7c\2\2\u00a1"+
		"\u00a2\7t\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\u00bc\7u\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7q\2\2\u00a8\u00a9"+
		"\7w\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00bc\7u\2\2\u00ad\u00ae\7u\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7q\2\2"+
		"\u00b0\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00bc\7u\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7r\2\2\u00b6\u00b7\7r\2\2\u00b7"+
		"\u00b8\7n\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bc\7u\2\2"+
		"\u00bbO\3\2\2\2\u00bbW\3\2\2\2\u00bb^\3\2\2\2\u00bbe\3\2\2\2\u00bbm\3"+
		"\2\2\2\u00bbv\3\2\2\2\u00bb~\3\2\2\2\u00bb\u0087\3\2\2\2\u00bb\u0092\3"+
		"\2\2\2\u00bb\u009d\3\2\2\2\u00bb\u00a6\3\2\2\2\u00bb\u00ad\3\2\2\2\u00bb"+
		"\u00b3\3\2\2\2\u00bc\26\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7j\2\2"+
		"\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7o\2\2\u00c2\u00c3"+
		"\7c\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7\"\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7p\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7i\2\2"+
		"\u00ca\u00ee\7{\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7e\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1"+
		"\u00d2\7k\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7n\2\2"+
		"\u00d5\u00d6\7\"\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9"+
		"\7g\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7i\2\2\u00db\u00ee\7{\2\2\u00dc"+
		"\u00dd\7o\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7e\2\2\u00df\u00e0\7j\2\2"+
		"\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4"+
		"\7e\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7\"\2\2\u00e7"+
		"\u00e8\7g\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2"+
		"\u00eb\u00ec\7i\2\2\u00ec\u00ee\7{\2\2\u00ed\u00bd\3\2\2\2\u00ed\u00cb"+
		"\3\2\2\2\u00ed\u00dc\3\2\2\2\u00ee\30\3\2\2\2\u00ef\u00f0\7i\2\2\u00f0"+
		"\u00f1\7t\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7w\2\2\u00f3\u00f4\7p\2\2"+
		"\u00f4\u00f5\7f\2\2\u00f5\u00f6\7\"\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7h\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7g\2\2\u00fc\32\3\2\2\2\u00fd\u00fe\7y\2\2\u00fe\u00ff\7c\2\2\u00ff"+
		"\u0100\7v\2\2\u0100\u0101\7g\2\2\u0101\u0119\7t\2\2\u0102\u0103\7n\2\2"+
		"\u0103\u0104\7k\2\2\u0104\u0105\7s\2\2\u0105\u0106\7w\2\2\u0106\u0107"+
		"\7k\2\2\u0107\u0108\7f\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7e\2\2\u010a"+
		"\u010b\7q\2\2\u010b\u010c\7h\2\2\u010c\u010d\7h\2\2\u010d\u010e\7g\2\2"+
		"\u010e\u0119\7g\2\2\u010f\u0110\7j\2\2\u0110\u0111\7q\2\2\u0111\u0112"+
		"\7v\2\2\u0112\u0113\7\"\2\2\u0113\u0114\7y\2\2\u0114\u0115\7c\2\2\u0115"+
		"\u0116\7v\2\2\u0116\u0117\7g\2\2\u0117\u0119\7t\2\2\u0118\u00fd\3\2\2"+
		"\2\u0118\u0102\3\2\2\2\u0118\u010f\3\2\2\2\u0119\34\3\2\2\2\u011a\u011b"+
		"\7u\2\2\u011b\u011c\7v\2\2\u011c\u011d\7g\2\2\u011d\u011e\7c\2\2\u011e"+
		"\u011f\7o\2\2\u011f\36\3\2\2\2\u0120\u0122\t\4\2\2\u0121\u0120\3\2\2\2"+
		"\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124 \3"+
		"\2\2\2\u0125\u0127\t\5\2\2\u0126\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\"\3\2\2\2\n\2&+\u00bb\u00ed\u0118"+
		"\u0123\u0128\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
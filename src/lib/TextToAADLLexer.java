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
		Struct_noun=1, Connected_Verb=2, Comma=3, And=4, End=5, IT=6, TO=7, THEM=8, 
		FROM=9, Struct_verb=10, FUNC_VERB=11, ENERGY=12, SOLID=13, LIQUID=14, 
		GAS=15, SIGNAL=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Struct_noun", "Connected_Verb", "Comma", "And", "End", "IT", "TO", "THEM", 
			"FROM", "Struct_verb", "FUNC_VERB", "ENERGY", "SOLID", "LIQUID", "GAS", 
			"SIGNAL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'connected'", "','", "'and'", "'.'", "'it'", "'to'", "'them'", 
			"'from'", "'consists'", null, null, "'ground coffee'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Struct_noun", "Connected_Verb", "Comma", "And", "End", "IT", "TO", 
			"THEM", "FROM", "Struct_verb", "FUNC_VERB", "ENERGY", "SOLID", "LIQUID", 
			"GAS", "SIGNAL", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u015b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\6\2\'\n\2\r\2\16\2(\3\2\7\2,\n\2\f\2\16\2/\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c8\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fe\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0129"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u014a\n\20\3\21\6\21\u014d\n\21\r\21\16\21\u014e"+
		"\3\21\7\21\u0152\n\21\f\21\16\21\u0155\13\21\3\22\6\22\u0158\n\22\r\22"+
		"\16\22\u0159\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23\3\2\7\4\2\62;C\\\5\2\62;C\\aa\5\2\62"+
		";C\\c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0172\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3&\3\2\2\2\5\60\3"+
		"\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13@\3\2\2\2\rB\3\2\2\2\17E\3\2\2\2\21H\3"+
		"\2\2\2\23M\3\2\2\2\25R\3\2\2\2\27\u00c7\3\2\2\2\31\u00fd\3\2\2\2\33\u00ff"+
		"\3\2\2\2\35\u0128\3\2\2\2\37\u0149\3\2\2\2!\u014c\3\2\2\2#\u0157\3\2\2"+
		"\2%\'\t\2\2\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)-\3\2\2\2*,\t\3"+
		"\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\4\3\2\2\2/-\3\2\2\2\60\61"+
		"\7e\2\2\61\62\7q\2\2\62\63\7p\2\2\63\64\7p\2\2\64\65\7g\2\2\65\66\7e\2"+
		"\2\66\67\7v\2\2\678\7g\2\289\7f\2\29\6\3\2\2\2:;\7.\2\2;\b\3\2\2\2<=\7"+
		"c\2\2=>\7p\2\2>?\7f\2\2?\n\3\2\2\2@A\7\60\2\2A\f\3\2\2\2BC\7k\2\2CD\7"+
		"v\2\2D\16\3\2\2\2EF\7v\2\2FG\7q\2\2G\20\3\2\2\2HI\7v\2\2IJ\7j\2\2JK\7"+
		"g\2\2KL\7o\2\2L\22\3\2\2\2MN\7h\2\2NO\7t\2\2OP\7q\2\2PQ\7o\2\2Q\24\3\2"+
		"\2\2RS\7e\2\2ST\7q\2\2TU\7p\2\2UV\7u\2\2VW\7k\2\2WX\7u\2\2XY\7v\2\2YZ"+
		"\7u\2\2Z\26\3\2\2\2[\\\7e\2\2\\]\7q\2\2]^\7p\2\2^_\7v\2\2_`\7c\2\2`a\7"+
		"k\2\2ab\7p\2\2b\u00c8\7u\2\2cd\7k\2\2de\7o\2\2ef\7r\2\2fg\7q\2\2gh\7t"+
		"\2\2hi\7v\2\2i\u00c8\7u\2\2jk\7g\2\2kl\7z\2\2lm\7r\2\2mn\7q\2\2no\7t\2"+
		"\2op\7v\2\2p\u00c8\7u\2\2qr\7e\2\2rs\7q\2\2st\7p\2\2tu\7x\2\2uv\7g\2\2"+
		"vw\7t\2\2wx\7v\2\2x\u00c8\7u\2\2yz\7v\2\2z{\7t\2\2{|\7c\2\2|}\7p\2\2}"+
		"~\7u\2\2~\177\7h\2\2\177\u0080\7g\2\2\u0080\u0081\7t\2\2\u0081\u00c8\7"+
		"u\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7e\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7k\2\2\u0087\u0088\7x\2\2\u0088\u0089\7g\2\2\u0089"+
		"\u00c8\7u\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c\u008d\7g\2\2"+
		"\u008d\u008e\7t\2\2\u008e\u008f\7i\2\2\u008f\u0090\7k\2\2\u0090\u0091"+
		"\7|\2\2\u0091\u0092\7g\2\2\u0092\u00c8\7u\2\2\u0093\u0094\7f\2\2\u0094"+
		"\u0095\7g\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7g\2\2"+
		"\u0098\u0099\7t\2\2\u0099\u009a\7i\2\2\u009a\u009b\7k\2\2\u009b\u009c"+
		"\7|\2\2\u009c\u009d\7g\2\2\u009d\u00c8\7u\2\2\u009e\u009f\7f\2\2\u009f"+
		"\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7v\2\2\u00a2\u00a3\7t\2\2"+
		"\u00a3\u00a4\7k\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\u00c8\7u\2\2\u00a9\u00aa\7u\2\2\u00aa"+
		"\u00ab\7g\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7t\2\2"+
		"\u00ae\u00af\7c\2\2\u00af\u00b0\7v\2\2\u00b0\u00b1\7g\2\2\u00b1\u00c8"+
		"\7u\2\2\u00b2\u00b3\7e\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7w\2\2\u00b5"+
		"\u00b6\7r\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\u00c8\7u\2\2"+
		"\u00b9\u00ba\7u\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd"+
		"\7t\2\2\u00bd\u00be\7g\2\2\u00be\u00c8\7u\2\2\u00bf\u00c0\7u\2\2\u00c0"+
		"\u00c1\7w\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7n\2\2"+
		"\u00c4\u00c5\7k\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c8\7u\2\2\u00c7[\3\2\2"+
		"\2\u00c7c\3\2\2\2\u00c7j\3\2\2\2\u00c7q\3\2\2\2\u00c7y\3\2\2\2\u00c7\u0082"+
		"\3\2\2\2\u00c7\u008a\3\2\2\2\u00c7\u0093\3\2\2\2\u00c7\u009e\3\2\2\2\u00c7"+
		"\u00a9\3\2\2\2\u00c7\u00b2\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00bf\3\2"+
		"\2\2\u00c8\30\3\2\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7j\2\2\u00cb\u00cc"+
		"\7g\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7o\2\2\u00ce\u00cf\7c\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\u00d1\7\"\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7p\2"+
		"\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7i\2\2\u00d6\u00fe"+
		"\7{\2\2\u00d7\u00d8\7g\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\u00db\7e\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7t\2\2\u00dd\u00de\7k\2\2"+
		"\u00de\u00df\7e\2\2\u00df\u00e0\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2"+
		"\7\"\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7p\2\2\u00e4\u00e5\7g\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7i\2\2\u00e7\u00fe\7{\2\2\u00e8\u00e9\7o\2\2"+
		"\u00e9\u00ea\7g\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed"+
		"\7c\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7e\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7\"\2\2\u00f3\u00f4\7g\2"+
		"\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8"+
		"\7i\2\2\u00f8\u00fe\7{\2\2\u00f9\u00fa\7j\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u00fc\7c\2\2\u00fc\u00fe\7v\2\2\u00fd\u00c9\3\2\2\2\u00fd\u00d7\3\2\2"+
		"\2\u00fd\u00e8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\32\3\2\2\2\u00ff\u0100"+
		"\7i\2\2\u0100\u0101\7t\2\2\u0101\u0102\7q\2\2\u0102\u0103\7w\2\2\u0103"+
		"\u0104\7p\2\2\u0104\u0105\7f\2\2\u0105\u0106\7\"\2\2\u0106\u0107\7e\2"+
		"\2\u0107\u0108\7q\2\2\u0108\u0109\7h\2\2\u0109\u010a\7h\2\2\u010a\u010b"+
		"\7g\2\2\u010b\u010c\7g\2\2\u010c\34\3\2\2\2\u010d\u010e\7y\2\2\u010e\u010f"+
		"\7c\2\2\u010f\u0110\7v\2\2\u0110\u0111\7g\2\2\u0111\u0129\7t\2\2\u0112"+
		"\u0113\7n\2\2\u0113\u0114\7k\2\2\u0114\u0115\7s\2\2\u0115\u0116\7w\2\2"+
		"\u0116\u0117\7k\2\2\u0117\u0118\7f\2\2\u0118\u0119\7\"\2\2\u0119\u011a"+
		"\7e\2\2\u011a\u011b\7q\2\2\u011b\u011c\7h\2\2\u011c\u011d\7h\2\2\u011d"+
		"\u011e\7g\2\2\u011e\u0129\7g\2\2\u011f\u0120\7j\2\2\u0120\u0121\7q\2\2"+
		"\u0121\u0122\7v\2\2\u0122\u0123\7\"\2\2\u0123\u0124\7y\2\2\u0124\u0125"+
		"\7c\2\2\u0125\u0126\7v\2\2\u0126\u0127\7g\2\2\u0127\u0129\7t\2\2\u0128"+
		"\u010d\3\2\2\2\u0128\u0112\3\2\2\2\u0128\u011f\3\2\2\2\u0129\36\3\2\2"+
		"\2\u012a\u012b\7u\2\2\u012b\u012c\7v\2\2\u012c\u012d\7g\2\2\u012d\u012e"+
		"\7c\2\2\u012e\u014a\7o\2\2\u012f\u0130\7h\2\2\u0130\u0131\7n\2\2\u0131"+
		"\u0132\7q\2\2\u0132\u0133\7y\2\2\u0133\u0134\7k\2\2\u0134\u0135\7p\2\2"+
		"\u0135\u0136\7i\2\2\u0136\u0137\7\"\2\2\u0137\u0138\7c\2\2\u0138\u0139"+
		"\7k\2\2\u0139\u014a\7t\2\2\u013a\u013b\7j\2\2\u013b\u013c\7q\2\2\u013c"+
		"\u013d\7v\2\2\u013d\u013e\7\"\2\2\u013e\u013f\7h\2\2\u013f\u0140\7n\2"+
		"\2\u0140\u0141\7q\2\2\u0141\u0142\7y\2\2\u0142\u0143\7k\2\2\u0143\u0144"+
		"\7p\2\2\u0144\u0145\7i\2\2\u0145\u0146\7\"\2\2\u0146\u0147\7c\2\2\u0147"+
		"\u0148\7k\2\2\u0148\u014a\7t\2\2\u0149\u012a\3\2\2\2\u0149\u012f\3\2\2"+
		"\2\u0149\u013a\3\2\2\2\u014a \3\2\2\2\u014b\u014d\t\4\2\2\u014c\u014b"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0153\3\2\2\2\u0150\u0152\t\5\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2"+
		"\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\"\3\2\2\2\u0155\u0153"+
		"\3\2\2\2\u0156\u0158\t\6\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a$\3\2\2\2\f\2(-\u00c7\u00fd\u0128"+
		"\u0149\u014e\u0153\u0159\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
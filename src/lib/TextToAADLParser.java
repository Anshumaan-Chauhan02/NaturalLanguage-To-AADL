// Generated from TextToAADL.g4 by ANTLR 4.9.2

    package lib;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TextToAADLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Struct_noun=1, Connected_Verb=2, Comma=3, And=4, End=5, IT=6, TO=7, THEM=8, 
		FROM=9, Struct_verb=10, FUNC_VERB=11, ENERGY=12, SOLID=13, LIQUID=14, 
		GAS=15, SIGNAL=16, WS=17;
	public static final int
		RULE_nlparch = 0, RULE_sentences = 1, RULE_sentence = 2, RULE_functional_stmts = 3, 
		RULE_structural_stmts = 4, RULE_structural_stmt = 5, RULE_connection_stmt = 6, 
		RULE_functional_stmt = 7, RULE_energizing_stmt = 8, RULE_struct_multinoun = 9, 
		RULE_multi_flow = 10, RULE_flow = 11, RULE_material = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"nlparch", "sentences", "sentence", "functional_stmts", "structural_stmts", 
			"structural_stmt", "connection_stmt", "functional_stmt", "energizing_stmt", 
			"struct_multinoun", "multi_flow", "flow", "material"
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

	@Override
	public String getGrammarFileName() { return "TextToAADL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TextToAADLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class NlparchContext extends ParserRuleContext {
		public List<SentencesContext> sentences() {
			return getRuleContexts(SentencesContext.class);
		}
		public SentencesContext sentences(int i) {
			return getRuleContext(SentencesContext.class,i);
		}
		public NlparchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nlparch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterNlparch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitNlparch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitNlparch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NlparchContext nlparch() throws RecognitionException {
		NlparchContext _localctx = new NlparchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nlparch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				sentences();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Struct_noun );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentencesContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public SentencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterSentences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitSentences(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitSentences(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentencesContext sentences() throws RecognitionException {
		SentencesContext _localctx = new SentencesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentences);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(32); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(31);
					sentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public List<Structural_stmtsContext> structural_stmts() {
			return getRuleContexts(Structural_stmtsContext.class);
		}
		public Structural_stmtsContext structural_stmts(int i) {
			return getRuleContext(Structural_stmtsContext.class,i);
		}
		public List<Functional_stmtsContext> functional_stmts() {
			return getRuleContexts(Functional_stmtsContext.class);
		}
		public Functional_stmtsContext functional_stmts(int i) {
			return getRuleContext(Functional_stmtsContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sentence);
		try {
			int _alt;
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(37); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(36);
						structural_stmts();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(39); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(42); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(41);
						functional_stmts();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(44); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_stmtsContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TextToAADLParser.End, 0); }
		public TerminalNode WS() { return getToken(TextToAADLParser.WS, 0); }
		public Functional_stmtContext functional_stmt() {
			return getRuleContext(Functional_stmtContext.class,0);
		}
		public Energizing_stmtContext energizing_stmt() {
			return getRuleContext(Energizing_stmtContext.class,0);
		}
		public Functional_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterFunctional_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitFunctional_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitFunctional_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functional_stmtsContext functional_stmts() throws RecognitionException {
		Functional_stmtsContext _localctx = new Functional_stmtsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functional_stmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				{
				setState(48);
				functional_stmt();
				}
				}
				break;
			case 2:
				{
				{
				setState(49);
				energizing_stmt();
				}
				}
				break;
			}
			setState(52);
			match(End);
			setState(53);
			match(WS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Structural_stmtsContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(TextToAADLParser.End, 0); }
		public TerminalNode WS() { return getToken(TextToAADLParser.WS, 0); }
		public Structural_stmtContext structural_stmt() {
			return getRuleContext(Structural_stmtContext.class,0);
		}
		public Connection_stmtContext connection_stmt() {
			return getRuleContext(Connection_stmtContext.class,0);
		}
		public Structural_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structural_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterStructural_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitStructural_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitStructural_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structural_stmtsContext structural_stmts() throws RecognitionException {
		Structural_stmtsContext _localctx = new Structural_stmtsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structural_stmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				{
				setState(55);
				structural_stmt();
				}
				}
				break;
			case 2:
				{
				{
				setState(56);
				connection_stmt();
				}
				}
				break;
			}
			setState(59);
			match(End);
			setState(60);
			match(WS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Structural_stmtContext extends ParserRuleContext {
		public TerminalNode Struct_noun() { return getToken(TextToAADLParser.Struct_noun, 0); }
		public List<TerminalNode> WS() { return getTokens(TextToAADLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TextToAADLParser.WS, i);
		}
		public TerminalNode Struct_verb() { return getToken(TextToAADLParser.Struct_verb, 0); }
		public Struct_multinounContext struct_multinoun() {
			return getRuleContext(Struct_multinounContext.class,0);
		}
		public Structural_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structural_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterStructural_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitStructural_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitStructural_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Structural_stmtContext structural_stmt() throws RecognitionException {
		Structural_stmtContext _localctx = new Structural_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structural_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Struct_noun);
			setState(63);
			match(WS);
			setState(64);
			match(Struct_verb);
			setState(65);
			match(WS);
			setState(66);
			struct_multinoun();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Connection_stmtContext extends ParserRuleContext {
		public TerminalNode Struct_noun() { return getToken(TextToAADLParser.Struct_noun, 0); }
		public List<TerminalNode> WS() { return getTokens(TextToAADLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TextToAADLParser.WS, i);
		}
		public TerminalNode Connected_Verb() { return getToken(TextToAADLParser.Connected_Verb, 0); }
		public TerminalNode TO() { return getToken(TextToAADLParser.TO, 0); }
		public Struct_multinounContext struct_multinoun() {
			return getRuleContext(Struct_multinounContext.class,0);
		}
		public Connection_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterConnection_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitConnection_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitConnection_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Connection_stmtContext connection_stmt() throws RecognitionException {
		Connection_stmtContext _localctx = new Connection_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_connection_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(Struct_noun);
			setState(69);
			match(WS);
			setState(70);
			match(Connected_Verb);
			setState(71);
			match(WS);
			setState(72);
			match(TO);
			setState(73);
			match(WS);
			setState(74);
			struct_multinoun();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Functional_stmtContext extends ParserRuleContext {
		public List<TerminalNode> Struct_noun() { return getTokens(TextToAADLParser.Struct_noun); }
		public TerminalNode Struct_noun(int i) {
			return getToken(TextToAADLParser.Struct_noun, i);
		}
		public List<TerminalNode> WS() { return getTokens(TextToAADLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TextToAADLParser.WS, i);
		}
		public List<TerminalNode> FUNC_VERB() { return getTokens(TextToAADLParser.FUNC_VERB); }
		public TerminalNode FUNC_VERB(int i) {
			return getToken(TextToAADLParser.FUNC_VERB, i);
		}
		public Multi_flowContext multi_flow() {
			return getRuleContext(Multi_flowContext.class,0);
		}
		public TerminalNode FROM() { return getToken(TextToAADLParser.FROM, 0); }
		public TerminalNode TO() { return getToken(TextToAADLParser.TO, 0); }
		public TerminalNode And() { return getToken(TextToAADLParser.And, 0); }
		public TerminalNode IT() { return getToken(TextToAADLParser.IT, 0); }
		public FlowContext flow() {
			return getRuleContext(FlowContext.class,0);
		}
		public Functional_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functional_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterFunctional_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitFunctional_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitFunctional_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functional_stmtContext functional_stmt() throws RecognitionException {
		Functional_stmtContext _localctx = new Functional_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functional_stmt);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(76);
				match(Struct_noun);
				setState(77);
				match(WS);
				setState(78);
				match(FUNC_VERB);
				setState(79);
				match(WS);
				setState(80);
				multi_flow();
				setState(81);
				match(WS);
				setState(82);
				match(FROM);
				setState(83);
				match(WS);
				setState(84);
				match(Struct_noun);
				setState(85);
				match(WS);
				setState(86);
				match(TO);
				setState(87);
				match(WS);
				setState(88);
				match(Struct_noun);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(90);
				match(Struct_noun);
				setState(91);
				match(WS);
				setState(92);
				match(FUNC_VERB);
				setState(93);
				match(WS);
				setState(94);
				multi_flow();
				setState(95);
				match(WS);
				setState(96);
				match(TO);
				setState(97);
				match(WS);
				setState(98);
				match(Struct_noun);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(100);
				match(Struct_noun);
				setState(101);
				match(WS);
				setState(102);
				match(FUNC_VERB);
				setState(103);
				match(WS);
				setState(104);
				multi_flow();
				setState(105);
				match(WS);
				setState(106);
				match(FROM);
				setState(107);
				match(WS);
				setState(108);
				match(Struct_noun);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(110);
				match(Struct_noun);
				setState(111);
				match(WS);
				setState(112);
				match(FUNC_VERB);
				setState(113);
				match(WS);
				setState(114);
				multi_flow();
				setState(115);
				match(WS);
				setState(116);
				match(And);
				setState(117);
				match(WS);
				setState(118);
				match(FUNC_VERB);
				setState(119);
				match(WS);
				setState(120);
				match(IT);
				setState(121);
				match(WS);
				setState(122);
				match(TO);
				setState(123);
				match(WS);
				setState(124);
				flow();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(126);
				match(Struct_noun);
				setState(127);
				match(WS);
				setState(128);
				match(FUNC_VERB);
				setState(129);
				match(WS);
				setState(130);
				multi_flow();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Energizing_stmtContext extends ParserRuleContext {
		public TerminalNode Struct_noun() { return getToken(TextToAADLParser.Struct_noun, 0); }
		public List<TerminalNode> WS() { return getTokens(TextToAADLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TextToAADLParser.WS, i);
		}
		public List<TerminalNode> FUNC_VERB() { return getTokens(TextToAADLParser.FUNC_VERB); }
		public TerminalNode FUNC_VERB(int i) {
			return getToken(TextToAADLParser.FUNC_VERB, i);
		}
		public List<Multi_flowContext> multi_flow() {
			return getRuleContexts(Multi_flowContext.class);
		}
		public Multi_flowContext multi_flow(int i) {
			return getRuleContext(Multi_flowContext.class,i);
		}
		public TerminalNode And() { return getToken(TextToAADLParser.And, 0); }
		public TerminalNode TO() { return getToken(TextToAADLParser.TO, 0); }
		public Energizing_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_energizing_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterEnergizing_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitEnergizing_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitEnergizing_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Energizing_stmtContext energizing_stmt() throws RecognitionException {
		Energizing_stmtContext _localctx = new Energizing_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_energizing_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(Struct_noun);
			setState(134);
			match(WS);
			setState(135);
			match(FUNC_VERB);
			setState(136);
			match(WS);
			setState(137);
			multi_flow();
			setState(138);
			match(WS);
			setState(139);
			match(And);
			setState(140);
			match(WS);
			setState(141);
			match(FUNC_VERB);
			setState(142);
			match(WS);
			setState(143);
			match(TO);
			setState(144);
			match(WS);
			setState(145);
			multi_flow();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Struct_multinounContext extends ParserRuleContext {
		public List<TerminalNode> Struct_noun() { return getTokens(TextToAADLParser.Struct_noun); }
		public TerminalNode Struct_noun(int i) {
			return getToken(TextToAADLParser.Struct_noun, i);
		}
		public List<TerminalNode> WS() { return getTokens(TextToAADLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TextToAADLParser.WS, i);
		}
		public TerminalNode Comma() { return getToken(TextToAADLParser.Comma, 0); }
		public Struct_multinounContext struct_multinoun() {
			return getRuleContext(Struct_multinounContext.class,0);
		}
		public TerminalNode And() { return getToken(TextToAADLParser.And, 0); }
		public Struct_multinounContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_multinoun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterStruct_multinoun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitStruct_multinoun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitStruct_multinoun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_multinounContext struct_multinoun() throws RecognitionException {
		Struct_multinounContext _localctx = new Struct_multinounContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_struct_multinoun);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(147);
				match(Struct_noun);
				setState(148);
				match(WS);
				setState(149);
				match(Comma);
				setState(150);
				match(WS);
				setState(151);
				struct_multinoun();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(152);
				match(Struct_noun);
				setState(153);
				match(WS);
				setState(154);
				match(And);
				setState(155);
				match(WS);
				setState(156);
				match(Struct_noun);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(157);
				match(Struct_noun);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multi_flowContext extends ParserRuleContext {
		public List<FlowContext> flow() {
			return getRuleContexts(FlowContext.class);
		}
		public FlowContext flow(int i) {
			return getRuleContext(FlowContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(TextToAADLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TextToAADLParser.WS, i);
		}
		public TerminalNode And() { return getToken(TextToAADLParser.And, 0); }
		public TerminalNode Comma() { return getToken(TextToAADLParser.Comma, 0); }
		public Multi_flowContext multi_flow() {
			return getRuleContext(Multi_flowContext.class,0);
		}
		public Multi_flowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterMulti_flow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitMulti_flow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitMulti_flow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_flowContext multi_flow() throws RecognitionException {
		Multi_flowContext _localctx = new Multi_flowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_multi_flow);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				flow();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(161);
				flow();
				setState(162);
				match(WS);
				setState(163);
				match(And);
				setState(164);
				match(WS);
				setState(165);
				flow();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(167);
				flow();
				setState(168);
				match(WS);
				setState(169);
				match(Comma);
				setState(170);
				match(WS);
				setState(171);
				multi_flow();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlowContext extends ParserRuleContext {
		public MaterialContext material() {
			return getRuleContext(MaterialContext.class,0);
		}
		public TerminalNode ENERGY() { return getToken(TextToAADLParser.ENERGY, 0); }
		public TerminalNode SIGNAL() { return getToken(TextToAADLParser.SIGNAL, 0); }
		public FlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitFlow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitFlow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlowContext flow() throws RecognitionException {
		FlowContext _localctx = new FlowContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_flow);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOLID:
			case LIQUID:
			case GAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				material();
				}
				break;
			case ENERGY:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(ENERGY);
				}
				break;
			case SIGNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(SIGNAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MaterialContext extends ParserRuleContext {
		public TerminalNode SOLID() { return getToken(TextToAADLParser.SOLID, 0); }
		public TerminalNode LIQUID() { return getToken(TextToAADLParser.LIQUID, 0); }
		public TerminalNode GAS() { return getToken(TextToAADLParser.GAS, 0); }
		public MaterialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_material; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterMaterial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitMaterial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitMaterial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialContext material() throws RecognitionException {
		MaterialContext _localctx = new MaterialContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_material);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOLID) | (1L << LIQUID) | (1L << GAS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00b9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\6\2\36\n\2\r\2\16\2\37\3\3\6\3#\n"+
		"\3\r\3\16\3$\3\4\6\4(\n\4\r\4\16\4)\3\4\6\4-\n\4\r\4\16\4.\5\4\61\n\4"+
		"\3\5\3\5\5\5\65\n\5\3\5\3\5\3\5\3\6\3\6\5\6<\n\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a1\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\r\5\r\u00b5"+
		"\n\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\17"+
		"\21\2\u00bc\2\35\3\2\2\2\4\"\3\2\2\2\6\60\3\2\2\2\b\64\3\2\2\2\n;\3\2"+
		"\2\2\f@\3\2\2\2\16F\3\2\2\2\20\u0085\3\2\2\2\22\u0087\3\2\2\2\24\u00a0"+
		"\3\2\2\2\26\u00af\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\36\5\4"+
		"\3\2\35\34\3\2\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2"+
		"!#\5\6\4\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&(\5\n"+
		"\6\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\61\3\2\2\2+-\5\b\5\2,"+
		"+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60\'\3\2\2\2\60,\3"+
		"\2\2\2\61\7\3\2\2\2\62\65\5\20\t\2\63\65\5\22\n\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\67\7\7\2\2\678\7\23\2\28\t\3\2\2\29<\5\f\7\2"+
		":<\5\16\b\2;9\3\2\2\2;:\3\2\2\2<=\3\2\2\2=>\7\7\2\2>?\7\23\2\2?\13\3\2"+
		"\2\2@A\7\3\2\2AB\7\23\2\2BC\7\f\2\2CD\7\23\2\2DE\5\24\13\2E\r\3\2\2\2"+
		"FG\7\3\2\2GH\7\23\2\2HI\7\4\2\2IJ\7\23\2\2JK\7\t\2\2KL\7\23\2\2LM\5\24"+
		"\13\2M\17\3\2\2\2NO\7\3\2\2OP\7\23\2\2PQ\7\r\2\2QR\7\23\2\2RS\5\26\f\2"+
		"ST\7\23\2\2TU\7\13\2\2UV\7\23\2\2VW\7\3\2\2WX\7\23\2\2XY\7\t\2\2YZ\7\23"+
		"\2\2Z[\7\3\2\2[\u0086\3\2\2\2\\]\7\3\2\2]^\7\23\2\2^_\7\r\2\2_`\7\23\2"+
		"\2`a\5\26\f\2ab\7\23\2\2bc\7\t\2\2cd\7\23\2\2de\7\3\2\2e\u0086\3\2\2\2"+
		"fg\7\3\2\2gh\7\23\2\2hi\7\r\2\2ij\7\23\2\2jk\5\26\f\2kl\7\23\2\2lm\7\13"+
		"\2\2mn\7\23\2\2no\7\3\2\2o\u0086\3\2\2\2pq\7\3\2\2qr\7\23\2\2rs\7\r\2"+
		"\2st\7\23\2\2tu\5\26\f\2uv\7\23\2\2vw\7\6\2\2wx\7\23\2\2xy\7\r\2\2yz\7"+
		"\23\2\2z{\7\b\2\2{|\7\23\2\2|}\7\t\2\2}~\7\23\2\2~\177\5\30\r\2\177\u0086"+
		"\3\2\2\2\u0080\u0081\7\3\2\2\u0081\u0082\7\23\2\2\u0082\u0083\7\r\2\2"+
		"\u0083\u0084\7\23\2\2\u0084\u0086\5\26\f\2\u0085N\3\2\2\2\u0085\\\3\2"+
		"\2\2\u0085f\3\2\2\2\u0085p\3\2\2\2\u0085\u0080\3\2\2\2\u0086\21\3\2\2"+
		"\2\u0087\u0088\7\3\2\2\u0088\u0089\7\23\2\2\u0089\u008a\7\r\2\2\u008a"+
		"\u008b\7\23\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\23\2\2\u008d\u008e"+
		"\7\6\2\2\u008e\u008f\7\23\2\2\u008f\u0090\7\r\2\2\u0090\u0091\7\23\2\2"+
		"\u0091\u0092\7\t\2\2\u0092\u0093\7\23\2\2\u0093\u0094\5\26\f\2\u0094\23"+
		"\3\2\2\2\u0095\u0096\7\3\2\2\u0096\u0097\7\23\2\2\u0097\u0098\7\5\2\2"+
		"\u0098\u0099\7\23\2\2\u0099\u00a1\5\24\13\2\u009a\u009b\7\3\2\2\u009b"+
		"\u009c\7\23\2\2\u009c\u009d\7\6\2\2\u009d\u009e\7\23\2\2\u009e\u00a1\7"+
		"\3\2\2\u009f\u00a1\7\3\2\2\u00a0\u0095\3\2\2\2\u00a0\u009a\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00b0\5\30\r\2\u00a3\u00a4\5\30"+
		"\r\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7\23\2\2\u00a7"+
		"\u00a8\5\30\r\2\u00a8\u00b0\3\2\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7"+
		"\23\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\5\26\f\2"+
		"\u00ae\u00b0\3\2\2\2\u00af\u00a2\3\2\2\2\u00af\u00a3\3\2\2\2\u00af\u00a9"+
		"\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b5\5\32\16\2\u00b2\u00b5\7\16\2\2\u00b3"+
		"\u00b5\7\22\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3"+
		"\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\t\2\2\2\u00b7\33\3\2\2\2\r\37$).\60"+
		"\64;\u0085\u00a0\u00af\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
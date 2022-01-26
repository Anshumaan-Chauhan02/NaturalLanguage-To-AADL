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
		Struct_noun=1, Comma=2, And=3, End=4, IT=5, TO=6, THEM=7, FROM=8, Struct_verb=9, 
		FUNC_VERB=10, ENERGY=11, SOLID=12, LIQUID=13, GAS=14, SIGNAL=15, WS=16;
	public static final int
		RULE_nlparch = 0, RULE_sentences = 1, RULE_sentence = 2, RULE_functional_stmts = 3, 
		RULE_structural_stmt = 4, RULE_functional_stmt = 5, RULE_energizing_stmt = 6, 
		RULE_struct_multinoun = 7, RULE_multi_flow = 8, RULE_flow = 9, RULE_material = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"nlparch", "sentences", "sentence", "functional_stmts", "structural_stmt", 
			"functional_stmt", "energizing_stmt", "struct_multinoun", "multi_flow", 
			"flow", "material"
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
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				sentences();
				}
				}
				setState(25); 
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
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(27);
					sentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
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
		public List<Structural_stmtContext> structural_stmt() {
			return getRuleContexts(Structural_stmtContext.class);
		}
		public Structural_stmtContext structural_stmt(int i) {
			return getRuleContext(Structural_stmtContext.class,i);
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
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(33); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(32);
						structural_stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(35); 
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
				setState(38); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(37);
						functional_stmts();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(40); 
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				{
				setState(44);
				functional_stmt();
				}
				}
				break;
			case 2:
				{
				{
				setState(45);
				energizing_stmt();
				}
				}
				break;
			}
			setState(48);
			match(End);
			setState(49);
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
		public TerminalNode End() { return getToken(TextToAADLParser.End, 0); }
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
		enterRule(_localctx, 8, RULE_structural_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(Struct_noun);
			setState(52);
			match(WS);
			setState(53);
			match(Struct_verb);
			setState(54);
			match(WS);
			setState(55);
			struct_multinoun();
			setState(56);
			match(End);
			setState(57);
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
		enterRule(_localctx, 10, RULE_functional_stmt);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(59);
				match(Struct_noun);
				setState(60);
				match(WS);
				setState(61);
				match(FUNC_VERB);
				setState(62);
				match(WS);
				setState(63);
				multi_flow();
				setState(64);
				match(WS);
				setState(65);
				match(FROM);
				setState(66);
				match(WS);
				setState(67);
				match(Struct_noun);
				setState(68);
				match(WS);
				setState(69);
				match(TO);
				setState(70);
				match(WS);
				setState(71);
				match(Struct_noun);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(73);
				match(Struct_noun);
				setState(74);
				match(WS);
				setState(75);
				match(FUNC_VERB);
				setState(76);
				match(WS);
				setState(77);
				multi_flow();
				setState(78);
				match(WS);
				setState(79);
				match(TO);
				setState(80);
				match(WS);
				setState(81);
				match(Struct_noun);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(83);
				match(Struct_noun);
				setState(84);
				match(WS);
				setState(85);
				match(FUNC_VERB);
				setState(86);
				match(WS);
				setState(87);
				multi_flow();
				setState(88);
				match(WS);
				setState(89);
				match(FROM);
				setState(90);
				match(WS);
				setState(91);
				match(Struct_noun);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(93);
				match(Struct_noun);
				setState(94);
				match(WS);
				setState(95);
				match(FUNC_VERB);
				setState(96);
				match(WS);
				setState(97);
				multi_flow();
				setState(98);
				match(WS);
				setState(99);
				match(And);
				setState(100);
				match(WS);
				setState(101);
				match(FUNC_VERB);
				setState(102);
				match(WS);
				setState(103);
				match(IT);
				setState(104);
				match(WS);
				setState(105);
				match(TO);
				setState(106);
				match(WS);
				setState(107);
				flow();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(109);
				match(Struct_noun);
				setState(110);
				match(WS);
				setState(111);
				match(FUNC_VERB);
				setState(112);
				match(WS);
				setState(113);
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
		enterRule(_localctx, 12, RULE_energizing_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Struct_noun);
			setState(117);
			match(WS);
			setState(118);
			match(FUNC_VERB);
			setState(119);
			match(WS);
			setState(120);
			multi_flow();
			setState(121);
			match(WS);
			setState(122);
			match(And);
			setState(123);
			match(WS);
			setState(124);
			match(FUNC_VERB);
			setState(125);
			match(WS);
			setState(126);
			match(TO);
			setState(127);
			match(WS);
			setState(128);
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
		enterRule(_localctx, 14, RULE_struct_multinoun);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(130);
				match(Struct_noun);
				setState(131);
				match(WS);
				setState(132);
				match(Comma);
				setState(133);
				match(WS);
				setState(134);
				struct_multinoun();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(135);
				match(Struct_noun);
				setState(136);
				match(WS);
				setState(137);
				match(And);
				setState(138);
				match(WS);
				setState(139);
				match(Struct_noun);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(140);
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
		enterRule(_localctx, 16, RULE_multi_flow);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				flow();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(144);
				flow();
				setState(145);
				match(WS);
				setState(146);
				match(And);
				setState(147);
				match(WS);
				setState(148);
				flow();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(150);
				flow();
				setState(151);
				match(WS);
				setState(152);
				match(Comma);
				setState(153);
				match(WS);
				setState(154);
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
		enterRule(_localctx, 18, RULE_flow);
		try {
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SOLID:
			case LIQUID:
			case GAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				material();
				}
				break;
			case ENERGY:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(ENERGY);
				}
				break;
			case SIGNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
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
		enterRule(_localctx, 20, RULE_material);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\6\3\37\n\3\r\3\16\3 \3\4"+
		"\6\4$\n\4\r\4\16\4%\3\4\6\4)\n\4\r\4\16\4*\5\4-\n\4\3\5\3\5\5\5\61\n\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u009f\n\n\3\13\3\13\3\13\5\13\u00a4\n\13\3\f"+
		"\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\16\20\2\u00ac\2\31\3"+
		"\2\2\2\4\36\3\2\2\2\6,\3\2\2\2\b\60\3\2\2\2\n\65\3\2\2\2\ft\3\2\2\2\16"+
		"v\3\2\2\2\20\u008f\3\2\2\2\22\u009e\3\2\2\2\24\u00a3\3\2\2\2\26\u00a5"+
		"\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34"+
		"\3\2\2\2\34\3\3\2\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2"+
		"\2\2 !\3\2\2\2!\5\3\2\2\2\"$\5\n\6\2#\"\3\2\2\2$%\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&-\3\2\2\2\')\5\b\5\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2"+
		"+-\3\2\2\2,#\3\2\2\2,(\3\2\2\2-\7\3\2\2\2.\61\5\f\7\2/\61\5\16\b\2\60"+
		".\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\7\6\2\2\63\64\7\22\2\2\64\t"+
		"\3\2\2\2\65\66\7\3\2\2\66\67\7\22\2\2\678\7\13\2\289\7\22\2\29:\5\20\t"+
		"\2:;\7\6\2\2;<\7\22\2\2<\13\3\2\2\2=>\7\3\2\2>?\7\22\2\2?@\7\f\2\2@A\7"+
		"\22\2\2AB\5\22\n\2BC\7\22\2\2CD\7\n\2\2DE\7\22\2\2EF\7\3\2\2FG\7\22\2"+
		"\2GH\7\b\2\2HI\7\22\2\2IJ\7\3\2\2Ju\3\2\2\2KL\7\3\2\2LM\7\22\2\2MN\7\f"+
		"\2\2NO\7\22\2\2OP\5\22\n\2PQ\7\22\2\2QR\7\b\2\2RS\7\22\2\2ST\7\3\2\2T"+
		"u\3\2\2\2UV\7\3\2\2VW\7\22\2\2WX\7\f\2\2XY\7\22\2\2YZ\5\22\n\2Z[\7\22"+
		"\2\2[\\\7\n\2\2\\]\7\22\2\2]^\7\3\2\2^u\3\2\2\2_`\7\3\2\2`a\7\22\2\2a"+
		"b\7\f\2\2bc\7\22\2\2cd\5\22\n\2de\7\22\2\2ef\7\5\2\2fg\7\22\2\2gh\7\f"+
		"\2\2hi\7\22\2\2ij\7\7\2\2jk\7\22\2\2kl\7\b\2\2lm\7\22\2\2mn\5\24\13\2"+
		"nu\3\2\2\2op\7\3\2\2pq\7\22\2\2qr\7\f\2\2rs\7\22\2\2su\5\22\n\2t=\3\2"+
		"\2\2tK\3\2\2\2tU\3\2\2\2t_\3\2\2\2to\3\2\2\2u\r\3\2\2\2vw\7\3\2\2wx\7"+
		"\22\2\2xy\7\f\2\2yz\7\22\2\2z{\5\22\n\2{|\7\22\2\2|}\7\5\2\2}~\7\22\2"+
		"\2~\177\7\f\2\2\177\u0080\7\22\2\2\u0080\u0081\7\b\2\2\u0081\u0082\7\22"+
		"\2\2\u0082\u0083\5\22\n\2\u0083\17\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086"+
		"\7\22\2\2\u0086\u0087\7\4\2\2\u0087\u0088\7\22\2\2\u0088\u0090\5\20\t"+
		"\2\u0089\u008a\7\3\2\2\u008a\u008b\7\22\2\2\u008b\u008c\7\5\2\2\u008c"+
		"\u008d\7\22\2\2\u008d\u0090\7\3\2\2\u008e\u0090\7\3\2\2\u008f\u0084\3"+
		"\2\2\2\u008f\u0089\3\2\2\2\u008f\u008e\3\2\2\2\u0090\21\3\2\2\2\u0091"+
		"\u009f\5\24\13\2\u0092\u0093\5\24\13\2\u0093\u0094\7\22\2\2\u0094\u0095"+
		"\7\5\2\2\u0095\u0096\7\22\2\2\u0096\u0097\5\24\13\2\u0097\u009f\3\2\2"+
		"\2\u0098\u0099\5\24\13\2\u0099\u009a\7\22\2\2\u009a\u009b\7\4\2\2\u009b"+
		"\u009c\7\22\2\2\u009c\u009d\5\22\n\2\u009d\u009f\3\2\2\2\u009e\u0091\3"+
		"\2\2\2\u009e\u0092\3\2\2\2\u009e\u0098\3\2\2\2\u009f\23\3\2\2\2\u00a0"+
		"\u00a4\5\26\f\2\u00a1\u00a4\7\r\2\2\u00a2\u00a4\7\21\2\2\u00a3\u00a0\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\25\3\2\2\2\u00a5"+
		"\u00a6\t\2\2\2\u00a6\27\3\2\2\2\f\33 %*,\60t\u008f\u009e\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
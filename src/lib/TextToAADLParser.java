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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, Struct_noun=30, SIGNAL=31, 
		WS=32;
	public static final int
		RULE_nlparch = 0, RULE_sentences = 1, RULE_sentence = 2, RULE_functional_stmts = 3, 
		RULE_structural_stmt = 4, RULE_functional_stmt = 5, RULE_energizing_stmt = 6, 
		RULE_struct_multinoun = 7, RULE_multi_flow = 8, RULE_flow = 9, RULE_material = 10, 
		RULE_comma = 11, RULE_and = 12, RULE_end = 13, RULE_it = 14, RULE_to = 15, 
		RULE_them = 16, RULE_from = 17, RULE_struct_verb = 18, RULE_func_verb = 19, 
		RULE_energy = 20, RULE_solid = 21, RULE_liquid = 22, RULE_gas = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"nlparch", "sentences", "sentence", "functional_stmts", "structural_stmt", 
			"functional_stmt", "energizing_stmt", "struct_multinoun", "multi_flow", 
			"flow", "material", "comma", "and", "end", "it", "to", "them", "from", 
			"struct_verb", "func_verb", "energy", "solid", "liquid", "gas"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'and'", "'.'", "'it'", "'to'", "'them'", "'from'", "'consists'", 
			"'contains'", "'imports'", "'exports'", "'converts'", "'transfers'", 
			"'receives'", "'energizes'", "'deenergizes'", "'distributes'", "'separates'", 
			"'couples'", "'stores'", "'supplies'", "'thermal energy'", "'electrical energy'", 
			"'mechanical energy'", "'ground coffee'", "'water'", "'liquid coffee'", 
			"'hot water'", "'steam'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Struct_noun", "SIGNAL", "WS"
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				sentences();
				}
				}
				setState(51); 
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
			setState(54); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(53);
					sentence();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); 
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(59); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(58);
						structural_stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(61); 
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
				setState(64); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(63);
						functional_stmts();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(66); 
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
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				{
				setState(70);
				functional_stmt();
				}
				}
				break;
			case 2:
				{
				{
				setState(71);
				energizing_stmt();
				}
				}
				break;
			}
			setState(74);
			end();
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
		public Struct_verbContext struct_verb() {
			return getRuleContext(Struct_verbContext.class,0);
		}
		public Struct_multinounContext struct_multinoun() {
			return getRuleContext(Struct_multinounContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
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
		enterRule(_localctx, 8, RULE_structural_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(Struct_noun);
			setState(77);
			struct_verb();
			setState(78);
			struct_multinoun();
			setState(79);
			end();
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
		public List<Func_verbContext> func_verb() {
			return getRuleContexts(Func_verbContext.class);
		}
		public Func_verbContext func_verb(int i) {
			return getRuleContext(Func_verbContext.class,i);
		}
		public Multi_flowContext multi_flow() {
			return getRuleContext(Multi_flowContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ItContext it() {
			return getRuleContext(ItContext.class,0);
		}
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
				setState(81);
				match(Struct_noun);
				setState(82);
				func_verb();
				setState(83);
				multi_flow();
				setState(84);
				from();
				setState(85);
				match(Struct_noun);
				setState(86);
				to();
				setState(87);
				match(Struct_noun);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(89);
				match(Struct_noun);
				setState(90);
				func_verb();
				setState(91);
				multi_flow();
				setState(92);
				to();
				setState(93);
				match(Struct_noun);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(95);
				match(Struct_noun);
				setState(96);
				func_verb();
				setState(97);
				multi_flow();
				setState(98);
				from();
				setState(99);
				match(Struct_noun);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(101);
				match(Struct_noun);
				setState(102);
				func_verb();
				setState(103);
				multi_flow();
				setState(104);
				and();
				setState(105);
				func_verb();
				setState(106);
				it();
				setState(107);
				to();
				setState(108);
				flow();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(110);
				match(Struct_noun);
				setState(111);
				func_verb();
				setState(112);
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
		public List<Func_verbContext> func_verb() {
			return getRuleContexts(Func_verbContext.class);
		}
		public Func_verbContext func_verb(int i) {
			return getRuleContext(Func_verbContext.class,i);
		}
		public List<Multi_flowContext> multi_flow() {
			return getRuleContexts(Multi_flowContext.class);
		}
		public Multi_flowContext multi_flow(int i) {
			return getRuleContext(Multi_flowContext.class,i);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
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
			func_verb();
			setState(118);
			multi_flow();
			setState(119);
			and();
			setState(120);
			func_verb();
			setState(121);
			to();
			setState(122);
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
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public Struct_multinounContext struct_multinoun() {
			return getRuleContext(Struct_multinounContext.class,0);
		}
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
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
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(124);
				match(Struct_noun);
				setState(125);
				comma();
				setState(126);
				struct_multinoun();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(128);
				match(Struct_noun);
				setState(129);
				and();
				setState(130);
				match(Struct_noun);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(132);
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
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				flow();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(136);
				flow();
				setState(137);
				and();
				setState(138);
				flow();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(140);
				flow();
				setState(141);
				comma();
				setState(142);
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
		public EnergyContext energy() {
			return getRuleContext(EnergyContext.class,0);
		}
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
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				material();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				energy();
				}
				break;
			case SIGNAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
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
		public SolidContext solid() {
			return getRuleContext(SolidContext.class,0);
		}
		public LiquidContext liquid() {
			return getRuleContext(LiquidContext.class,0);
		}
		public GasContext gas() {
			return getRuleContext(GasContext.class,0);
		}
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
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				solid();
				}
				break;
			case T__25:
			case T__26:
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				liquid();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				gas();
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

	public static class CommaContext extends ParserRuleContext {
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__0);
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

	public static class AndContext extends ParserRuleContext {
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__1);
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

	public static class EndContext extends ParserRuleContext {
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__2);
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

	public static class ItContext extends ParserRuleContext {
		public ItContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_it; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterIt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitIt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitIt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItContext it() throws RecognitionException {
		ItContext _localctx = new ItContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_it);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__3);
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

	public static class ToContext extends ParserRuleContext {
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__4);
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

	public static class ThemContext extends ParserRuleContext {
		public ThemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_them; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterThem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitThem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitThem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThemContext them() throws RecognitionException {
		ThemContext _localctx = new ThemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_them);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__5);
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

	public static class FromContext extends ParserRuleContext {
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__6);
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

	public static class Struct_verbContext extends ParserRuleContext {
		public Struct_verbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterStruct_verb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitStruct_verb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitStruct_verb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_verbContext struct_verb() throws RecognitionException {
		Struct_verbContext _localctx = new Struct_verbContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_struct_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__7);
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

	public static class Func_verbContext extends ParserRuleContext {
		public Func_verbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterFunc_verb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitFunc_verb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitFunc_verb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_verbContext func_verb() throws RecognitionException {
		Func_verbContext _localctx = new Func_verbContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_func_verb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class EnergyContext extends ParserRuleContext {
		public EnergyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_energy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterEnergy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitEnergy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitEnergy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnergyContext energy() throws RecognitionException {
		EnergyContext _localctx = new EnergyContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_energy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class SolidContext extends ParserRuleContext {
		public SolidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterSolid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitSolid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitSolid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolidContext solid() throws RecognitionException {
		SolidContext _localctx = new SolidContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_solid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(T__24);
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

	public static class LiquidContext extends ParserRuleContext {
		public LiquidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liquid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterLiquid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitLiquid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitLiquid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiquidContext liquid() throws RecognitionException {
		LiquidContext _localctx = new LiquidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_liquid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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

	public static class GasContext extends ParserRuleContext {
		public GasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).enterGas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TextToAADLListener ) ((TextToAADLListener)listener).exitGas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TextToAADLVisitor ) return ((TextToAADLVisitor<? extends T>)visitor).visitGas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GasContext gas() throws RecognitionException {
		GasContext _localctx = new GasContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_gas);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__28);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\6\39\n\3\r\3\16\3:\3\4\6\4>\n\4\r\4\16"+
		"\4?\3\4\6\4C\n\4\r\4\16\4D\5\4G\n\4\3\5\3\5\5\5K\n\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7u\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0088\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0093"+
		"\n\n\3\13\3\13\3\13\5\13\u0098\n\13\3\f\3\f\3\f\5\f\u009d\n\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\5\3\2\13\27\3\2\30\32\3"+
		"\2\34\36\2\u00b2\2\63\3\2\2\2\48\3\2\2\2\6F\3\2\2\2\bJ\3\2\2\2\nN\3\2"+
		"\2\2\ft\3\2\2\2\16v\3\2\2\2\20\u0087\3\2\2\2\22\u0092\3\2\2\2\24\u0097"+
		"\3\2\2\2\26\u009c\3\2\2\2\30\u009e\3\2\2\2\32\u00a0\3\2\2\2\34\u00a2\3"+
		"\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\"\u00a8\3\2\2\2$\u00aa\3\2\2\2"+
		"&\u00ac\3\2\2\2(\u00ae\3\2\2\2*\u00b0\3\2\2\2,\u00b2\3\2\2\2.\u00b4\3"+
		"\2\2\2\60\u00b6\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\679\5\6\4\28\67\3\2\2\29:\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<>\5\n\6\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@G\3\2\2\2AC\5\b\5\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2EG\3\2\2\2F=\3\2\2\2FB\3\2\2\2G\7\3\2\2\2HK\5\f\7\2IK\5\16\b\2JH\3\2"+
		"\2\2JI\3\2\2\2KL\3\2\2\2LM\5\34\17\2M\t\3\2\2\2NO\7 \2\2OP\5&\24\2PQ\5"+
		"\20\t\2QR\5\34\17\2R\13\3\2\2\2ST\7 \2\2TU\5(\25\2UV\5\22\n\2VW\5$\23"+
		"\2WX\7 \2\2XY\5 \21\2YZ\7 \2\2Zu\3\2\2\2[\\\7 \2\2\\]\5(\25\2]^\5\22\n"+
		"\2^_\5 \21\2_`\7 \2\2`u\3\2\2\2ab\7 \2\2bc\5(\25\2cd\5\22\n\2de\5$\23"+
		"\2ef\7 \2\2fu\3\2\2\2gh\7 \2\2hi\5(\25\2ij\5\22\n\2jk\5\32\16\2kl\5(\25"+
		"\2lm\5\36\20\2mn\5 \21\2no\5\24\13\2ou\3\2\2\2pq\7 \2\2qr\5(\25\2rs\5"+
		"\22\n\2su\3\2\2\2tS\3\2\2\2t[\3\2\2\2ta\3\2\2\2tg\3\2\2\2tp\3\2\2\2u\r"+
		"\3\2\2\2vw\7 \2\2wx\5(\25\2xy\5\22\n\2yz\5\32\16\2z{\5(\25\2{|\5 \21\2"+
		"|}\5\22\n\2}\17\3\2\2\2~\177\7 \2\2\177\u0080\5\30\r\2\u0080\u0081\5\20"+
		"\t\2\u0081\u0088\3\2\2\2\u0082\u0083\7 \2\2\u0083\u0084\5\32\16\2\u0084"+
		"\u0085\7 \2\2\u0085\u0088\3\2\2\2\u0086\u0088\7 \2\2\u0087~\3\2\2\2\u0087"+
		"\u0082\3\2\2\2\u0087\u0086\3\2\2\2\u0088\21\3\2\2\2\u0089\u0093\5\24\13"+
		"\2\u008a\u008b\5\24\13\2\u008b\u008c\5\32\16\2\u008c\u008d\5\24\13\2\u008d"+
		"\u0093\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0090\5\30\r\2\u0090\u0091"+
		"\5\22\n\2\u0091\u0093\3\2\2\2\u0092\u0089\3\2\2\2\u0092\u008a\3\2\2\2"+
		"\u0092\u008e\3\2\2\2\u0093\23\3\2\2\2\u0094\u0098\5\26\f\2\u0095\u0098"+
		"\5*\26\2\u0096\u0098\7!\2\2\u0097\u0094\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0096\3\2\2\2\u0098\25\3\2\2\2\u0099\u009d\5,\27\2\u009a\u009d\5.\30"+
		"\2\u009b\u009d\5\60\31\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d\27\3\2\2\2\u009e\u009f\7\3\2\2\u009f\31\3\2\2\2\u00a0"+
		"\u00a1\7\4\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\35\3\2\2\2\u00a4"+
		"\u00a5\7\6\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7\7\2\2\u00a7!\3\2\2\2\u00a8"+
		"\u00a9\7\b\2\2\u00a9#\3\2\2\2\u00aa\u00ab\7\t\2\2\u00ab%\3\2\2\2\u00ac"+
		"\u00ad\7\n\2\2\u00ad\'\3\2\2\2\u00ae\u00af\t\2\2\2\u00af)\3\2\2\2\u00b0"+
		"\u00b1\t\3\2\2\u00b1+\3\2\2\2\u00b2\u00b3\7\33\2\2\u00b3-\3\2\2\2\u00b4"+
		"\u00b5\t\4\2\2\u00b5/\3\2\2\2\u00b6\u00b7\7\37\2\2\u00b7\61\3\2\2\2\r"+
		"\65:?DFJt\u0087\u0092\u0097\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
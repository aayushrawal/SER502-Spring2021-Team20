// Generated from C:/Users/dpatel81/Downloads/SER-516-assignment5-master/Antlr/src/a\yasl.g4 by ANTLR 4.9.1

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class yaslParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, ID=41, Special_char=42, Digit=43, WS=44;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_initialization = 2, RULE_integer = 3, 
		RULE_string = 4, RULE_bool = 5, RULE_declaration = 6, RULE_assignment = 7, 
		RULE_step_size = 8, RULE_unary_operator = 9, RULE_print = 10, RULE_if_conditional = 11, 
		RULE_condition = 12, RULE_while_loop = 13, RULE_for_loop = 14, RULE_option = 15, 
		RULE_range_loop = 16, RULE_ternary_conditional = 17, RULE_expression = 18, 
		RULE_term = 19, RULE_factor = 20, RULE_sentence = 21, RULE_sent_option = 22, 
		RULE_identifier = 23, RULE_special_char = 24, RULE_number = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "initialization", "integer", "string", "bool", "declaration", 
			"assignment", "step_size", "unary_operator", "print", "if_conditional", 
			"condition", "while_loop", "for_loop", "option", "range_loop", "ternary_conditional", 
			"expression", "term", "factor", "sentence", "sent_option", "identifier", 
			"special_char", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'int'", "'='", "'string'", "'\"'", "'bool'", "'true'", 
			"'false'", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'print'", 
			"'('", "')'", "'if'", "'then'", "'{'", "'}'", "'else'", "'=='", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'while'", "'for'", "'in'", "'range'", 
			"','", "'?'", "':'", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "ID", "Special_char", "Digit", "WS"
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
	public String getGrammarFileName() { return "yasl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public yaslParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			block();
			setState(53);
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

	public static class BlockContext extends ParserRuleContext {
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Step_sizeContext step_size() {
			return getRuleContext(Step_sizeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public Range_loopContext range_loop() {
			return getRuleContext(Range_loopContext.class,0);
		}
		public Ternary_conditionalContext ternary_conditional() {
			return getRuleContext(Ternary_conditionalContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				initialization();
				setState(56);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				initialization();
				setState(59);
				match(T__1);
				setState(60);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(62);
				declaration();
				setState(63);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				declaration();
				setState(66);
				match(T__1);
				setState(67);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				if_conditional();
				setState(70);
				match(T__1);
				setState(71);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				if_conditional();
				setState(74);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				while_loop();
				setState(77);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(80);
				unary_operator();
				setState(81);
				match(T__1);
				setState(82);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				unary_operator();
				setState(85);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(87);
				step_size();
				setState(88);
				match(T__1);
				setState(89);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(91);
				step_size();
				setState(92);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(94);
				assignment();
				setState(95);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(97);
				assignment();
				setState(98);
				match(T__1);
				setState(99);
				block();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(101);
				for_loop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(102);
				for_loop();
				setState(103);
				block();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(105);
				range_loop();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(106);
				range_loop();
				setState(107);
				block();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(109);
				ternary_conditional();
				setState(110);
				match(T__1);
				setState(111);
				block();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(113);
				ternary_conditional();
				setState(114);
				match(T__1);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(116);
				print();
				setState(117);
				match(T__1);
				setState(118);
				block();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(120);
				print();
				setState(121);
				match(T__1);
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

	public static class InitializationContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_initialization);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				integer();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				string();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				bool();
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

	public static class IntegerContext extends ParserRuleContext {
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
	 
		public IntegerContext() { }
		public void copyFrom(IntegerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntIdInitContext extends IntegerContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IntIdInitContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIntIdInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIntIdInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIntIdInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntExprInitContext extends IntegerContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntExprInitContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIntExprInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIntExprInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIntExprInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntNumInitContext extends IntegerContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IntNumInitContext(IntegerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIntNumInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIntNumInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIntNumInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_integer);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IntNumInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__2);
				setState(131);
				identifier();
				setState(132);
				match(T__3);
				setState(133);
				number();
				}
				break;
			case 2:
				_localctx = new IntIdInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(T__2);
				setState(136);
				identifier();
				setState(137);
				match(T__3);
				setState(138);
				identifier();
				}
				break;
			case 3:
				_localctx = new IntExprInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__2);
				setState(141);
				identifier();
				setState(142);
				match(T__3);
				setState(143);
				expression();
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrIdInitContext extends StringContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public StrIdInitContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterStrIdInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitStrIdInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitStrIdInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrSenInitContext extends StringContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public StrSenInitContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterStrSenInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitStrSenInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitStrSenInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StrIdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__4);
				setState(148);
				identifier();
				setState(149);
				match(T__3);
				setState(150);
				identifier();
				}
				break;
			case 2:
				_localctx = new StrSenInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(T__4);
				setState(153);
				identifier();
				setState(154);
				match(T__3);
				setState(155);
				match(T__5);
				setState(156);
				sentence();
				setState(157);
				match(T__5);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	 
		public BoolContext() { }
		public void copyFrom(BoolContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoolBInitContext extends BoolContext {
		public Token bop;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoolBInitContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterBoolBInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitBoolBInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitBoolBInit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolIdInitContext extends BoolContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BoolIdInitContext(BoolContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterBoolIdInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitBoolIdInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitBoolIdInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool);
		int _la;
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BoolIdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(T__6);
				setState(162);
				identifier();
				setState(163);
				match(T__3);
				setState(164);
				identifier();
				}
				break;
			case 2:
				_localctx = new BoolBInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__6);
				setState(167);
				identifier();
				setState(168);
				match(T__3);
				setState(169);
				((BoolBInitContext)_localctx).bop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((BoolBInitContext)_localctx).bop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StrDeclareContext extends DeclarationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StrDeclareContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterStrDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitStrDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitStrDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolDeclareContext extends DeclarationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BoolDeclareContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterBoolDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitBoolDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitBoolDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntDeclareContext extends DeclarationContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IntDeclareContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIntDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIntDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIntDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IntDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__2);
				setState(174);
				identifier();
				}
				break;
			case T__4:
				_localctx = new StrDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__4);
				setState(176);
				identifier();
				}
				break;
			case T__6:
				_localctx = new BoolDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(T__6);
				setState(178);
				identifier();
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignNumContext extends AssignmentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AssignNumContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAssignNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAssignNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAssignNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignStringContext extends AssignmentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public AssignStringContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAssignString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAssignString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAssignString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignBolContext extends AssignmentContext {
		public Token boolean_value;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignBolContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAssignBol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAssignBol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAssignBol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends AssignmentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignExprContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAssignExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		int _la;
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				identifier();
				setState(182);
				match(T__3);
				setState(183);
				number();
				}
				break;
			case 2:
				_localctx = new AssignBolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				identifier();
				setState(186);
				match(T__3);
				setState(187);
				((AssignBolContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((AssignBolContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new AssignStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				identifier();
				setState(190);
				match(T__3);
				setState(191);
				match(T__5);
				setState(192);
				sentence();
				setState(193);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				identifier();
				setState(196);
				match(T__3);
				setState(197);
				expression();
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

	public static class Step_sizeContext extends ParserRuleContext {
		public Step_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_size; }
	 
		public Step_sizeContext() { }
		public void copyFrom(Step_sizeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulNumStepContext extends Step_sizeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public MulNumStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterMulNumStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitMulNumStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitMulNumStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivNumStepContext extends Step_sizeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DivNumStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterDivNumStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitDivNumStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitDivNumStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideIdStepContext extends Step_sizeContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public DivideIdStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterDivideIdStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitDivideIdStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitDivideIdStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubIdStepContext extends Step_sizeContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public SubIdStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterSubIdStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitSubIdStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitSubIdStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulIdStepContext extends Step_sizeContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MulIdStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterMulIdStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitMulIdStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitMulIdStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddIdStepContext extends Step_sizeContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AddIdStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAddIdStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAddIdStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAddIdStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddNumStepContext extends Step_sizeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AddNumStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAddNumStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAddNumStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAddNumStep(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubNumStepContext extends Step_sizeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SubNumStepContext(Step_sizeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterSubNumStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitSubNumStep(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitSubNumStep(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_sizeContext step_size() throws RecognitionException {
		Step_sizeContext _localctx = new Step_sizeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_step_size);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AddIdStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				identifier();
				setState(202);
				match(T__9);
				setState(203);
				identifier();
				}
				break;
			case 2:
				_localctx = new SubIdStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				identifier();
				setState(206);
				match(T__10);
				setState(207);
				identifier();
				}
				break;
			case 3:
				_localctx = new MulIdStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				identifier();
				setState(210);
				match(T__11);
				setState(211);
				identifier();
				}
				break;
			case 4:
				_localctx = new DivideIdStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				identifier();
				setState(214);
				match(T__12);
				setState(215);
				identifier();
				}
				break;
			case 5:
				_localctx = new AddNumStepContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(217);
				identifier();
				setState(218);
				match(T__9);
				setState(219);
				number();
				}
				break;
			case 6:
				_localctx = new SubNumStepContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				identifier();
				setState(222);
				match(T__10);
				setState(223);
				number();
				}
				break;
			case 7:
				_localctx = new MulNumStepContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(225);
				identifier();
				setState(226);
				match(T__11);
				setState(227);
				number();
				}
				break;
			case 8:
				_localctx = new DivNumStepContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(229);
				identifier();
				setState(230);
				match(T__12);
				setState(231);
				number();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	 
		public Unary_operatorContext() { }
		public void copyFrom(Unary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PreDecrementContext extends Unary_operatorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PreDecrementContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterPreDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitPreDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitPreDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostDecrementContext extends Unary_operatorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PostDecrementContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterPostDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitPostDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitPostDecrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncrementContext extends Unary_operatorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PostIncrementContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterPostIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitPostIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitPostIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncrementContext extends Unary_operatorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PreIncrementContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterPreIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitPreIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitPreIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unary_operator);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PreIncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(T__13);
				setState(236);
				identifier();
				}
				break;
			case 2:
				_localctx = new PostIncrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				identifier();
				setState(238);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new PreDecrementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(T__14);
				setState(241);
				identifier();
				}
				break;
			case 4:
				_localctx = new PostDecrementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				identifier();
				setState(243);
				match(T__14);
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

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStrContext extends PrintContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public PrintStrContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterPrintStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitPrintStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitPrintStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintExprContext extends PrintContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintExprContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterPrintExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitPrintExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitPrintExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		try {
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__15);
				setState(248);
				match(T__16);
				setState(249);
				match(T__5);
				setState(250);
				sentence();
				setState(251);
				match(T__5);
				setState(252);
				match(T__17);
				}
				break;
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__15);
				setState(255);
				match(T__16);
				{
				setState(256);
				expression();
				}
				setState(257);
				match(T__17);
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

	public static class If_conditionalContext extends ParserRuleContext {
		public If_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_conditional; }
	 
		public If_conditionalContext() { }
		public void copyFrom(If_conditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfConditionContext extends If_conditionalContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfConditionContext(If_conditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseConditionContext extends If_conditionalContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfElseConditionContext(If_conditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIfElseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIfElseCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIfElseCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionalContext if_conditional() throws RecognitionException {
		If_conditionalContext _localctx = new If_conditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_conditional);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				match(T__18);
				setState(262);
				match(T__16);
				setState(263);
				condition();
				setState(264);
				match(T__17);
				setState(265);
				match(T__19);
				setState(266);
				match(T__20);
				setState(267);
				block();
				setState(268);
				match(T__21);
				}
				break;
			case 2:
				_localctx = new IfElseConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(T__18);
				setState(271);
				match(T__16);
				setState(272);
				condition();
				setState(273);
				match(T__17);
				setState(274);
				match(T__19);
				setState(275);
				match(T__20);
				setState(276);
				block();
				setState(277);
				match(T__21);
				setState(278);
				match(T__22);
				setState(279);
				match(T__20);
				setState(280);
				block();
				setState(281);
				match(T__21);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionBoolOpContext extends ConditionContext {
		public Token boolean_value;
		public ConditionBoolOpContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterConditionBoolOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitConditionBoolOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitConditionBoolOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionOpContext extends ConditionContext {
		public Token conditional_operator;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionOpContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterConditionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitConditionOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitConditionOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case Digit:
				_localctx = new ConditionOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				expression();
				setState(286);
				((ConditionOpContext)_localctx).conditional_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
					((ConditionOpContext)_localctx).conditional_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(287);
				expression();
				}
				break;
			case T__7:
			case T__8:
				_localctx = new ConditionBoolOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				((ConditionBoolOpContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((ConditionBoolOpContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class While_loopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__29);
			setState(293);
			match(T__16);
			setState(294);
			condition();
			setState(295);
			match(T__17);
			setState(296);
			match(T__20);
			setState(297);
			block();
			setState(298);
			match(T__21);
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

	public static class For_loopContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__30);
			setState(301);
			match(T__16);
			setState(302);
			integer();
			setState(303);
			match(T__1);
			setState(304);
			condition();
			setState(305);
			match(T__1);
			setState(306);
			option();
			setState(307);
			match(T__17);
			setState(308);
			match(T__20);
			setState(309);
			block();
			setState(310);
			match(T__21);
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

	public static class OptionContext extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Step_sizeContext step_size() {
			return getRuleContext(Step_sizeContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_option);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				unary_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				step_size();
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

	public static class Range_loopContext extends ParserRuleContext {
		public Range_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_loop; }
	 
		public Range_loopContext() { }
		public void copyFrom(Range_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleRangeContext extends Range_loopContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SimpleRangeContext(Range_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterSimpleRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitSimpleRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitSimpleRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StepRangeContext extends Range_loopContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StepRangeContext(Range_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterStepRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitStepRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitStepRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_loopContext range_loop() throws RecognitionException {
		Range_loopContext _localctx = new Range_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_range_loop);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new SimpleRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(T__30);
				setState(317);
				identifier();
				setState(318);
				match(T__31);
				setState(319);
				match(T__32);
				setState(320);
				match(T__16);
				setState(321);
				number();
				setState(322);
				match(T__33);
				setState(323);
				number();
				setState(324);
				match(T__17);
				setState(325);
				match(T__20);
				setState(326);
				block();
				setState(327);
				match(T__21);
				}
				break;
			case 2:
				_localctx = new StepRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__30);
				setState(330);
				identifier();
				setState(331);
				match(T__31);
				setState(332);
				match(T__32);
				setState(333);
				match(T__16);
				setState(334);
				number();
				setState(335);
				match(T__33);
				setState(336);
				number();
				setState(337);
				match(T__33);
				setState(338);
				number();
				setState(339);
				match(T__17);
				setState(340);
				match(T__20);
				setState(341);
				block();
				setState(342);
				match(T__21);
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

	public static class Ternary_conditionalContext extends ParserRuleContext {
		public Ternary_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_conditional; }
	 
		public Ternary_conditionalContext() { }
		public void copyFrom(Ternary_conditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntTernaryContext extends Ternary_conditionalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntTernaryContext(Ternary_conditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIntTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIntTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIntTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BolTernaryContext extends Ternary_conditionalContext {
		public Token boolean_value;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BolTernaryContext(Ternary_conditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterBolTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitBolTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitBolTernary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrTernaryContext extends Ternary_conditionalContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public StrTernaryContext(Ternary_conditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterStrTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitStrTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitStrTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_conditionalContext ternary_conditional() throws RecognitionException {
		Ternary_conditionalContext _localctx = new Ternary_conditionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ternary_conditional);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IntTernaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(T__2);
				setState(347);
				identifier();
				setState(348);
				match(T__3);
				setState(349);
				condition();
				setState(350);
				match(T__34);
				setState(351);
				expression();
				setState(352);
				match(T__35);
				setState(353);
				expression();
				}
				break;
			case T__4:
				_localctx = new StrTernaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				match(T__4);
				setState(356);
				identifier();
				setState(357);
				match(T__3);
				setState(358);
				condition();
				setState(359);
				match(T__34);
				setState(360);
				match(T__5);
				setState(361);
				sentence();
				setState(362);
				match(T__5);
				setState(363);
				match(T__35);
				setState(364);
				match(T__5);
				setState(365);
				sentence();
				setState(366);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new BolTernaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				match(T__6);
				setState(369);
				identifier();
				setState(370);
				match(T__3);
				setState(371);
				condition();
				setState(372);
				match(T__34);
				setState(373);
				((BolTernaryContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((BolTernaryContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(374);
				match(T__35);
				setState(375);
				((BolTernaryContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((BolTernaryContext)_localctx).boolean_value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubtractionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpPrecedenceContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpPrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterExpPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitExpPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitExpPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				term();
				setState(380);
				match(T__36);
				setState(381);
				expression();
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				term();
				setState(384);
				match(T__37);
				setState(385);
				expression();
				}
				break;
			case 3:
				_localctx = new ExpPrecedenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				term();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivisionContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DivisionContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FactContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public MultiplicationContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				factor();
				setState(391);
				match(T__38);
				setState(392);
				term();
				}
				break;
			case 2:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				factor();
				setState(395);
				match(T__39);
				setState(396);
				term();
				}
				break;
			case 3:
				_localctx = new FactContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(398);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberexpressionContext extends FactorContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumberexpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterNumberexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitNumberexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitNumberexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdexpressionContext extends FactorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdexpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIdexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIdexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIdexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdexpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				identifier();
				}
				break;
			case Digit:
				_localctx = new NumberexpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				number();
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

	public static class SentenceContext extends ParserRuleContext {
		public List<Sent_optionContext> sent_option() {
			return getRuleContexts(Sent_optionContext.class);
		}
		public Sent_optionContext sent_option(int i) {
			return getRuleContext(Sent_optionContext.class,i);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Special_char) | (1L << Digit))) != 0)) {
				{
				{
				setState(405);
				sent_option();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Sent_optionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Special_charContext special_char() {
			return getRuleContext(Special_charContext.class,0);
		}
		public Sent_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sent_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterSent_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitSent_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitSent_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sent_optionContext sent_option() throws RecognitionException {
		Sent_optionContext _localctx = new Sent_optionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_sent_option);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				identifier();
				}
				break;
			case Special_char:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
				special_char();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(yaslParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(ID);
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

	public static class Special_charContext extends ParserRuleContext {
		public TerminalNode Special_char() { return getToken(yaslParser.Special_char, 0); }
		public Special_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterSpecial_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitSpecial_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitSpecial_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Special_charContext special_char() throws RecognitionException {
		Special_charContext _localctx = new Special_charContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_special_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(Special_char);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Digit() { return getToken(yaslParser.Digit, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(Digit);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01a9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3~\n\3\3\4\3\4\3\4\5\4\u0083\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0094\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a2\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ae\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b6"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00ca\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00ec\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00f8\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0106\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011e\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0125\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u013d\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u015b\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u017c\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u0187\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u0192\n\25\3\26\3\26\5\26\u0196\n\26\3\27\7\27\u0199\n"+
		"\27\f\27\16\27\u019c\13\27\3\30\3\30\3\30\5\30\u01a1\n\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\2\4\3\2\n\13\3\2\32\37\2\u01c7\2\66\3\2\2\2\4}\3\2"+
		"\2\2\6\u0082\3\2\2\2\b\u0093\3\2\2\2\n\u00a1\3\2\2\2\f\u00ad\3\2\2\2\16"+
		"\u00b5\3\2\2\2\20\u00c9\3\2\2\2\22\u00eb\3\2\2\2\24\u00f7\3\2\2\2\26\u0105"+
		"\3\2\2\2\30\u011d\3\2\2\2\32\u0124\3\2\2\2\34\u0126\3\2\2\2\36\u012e\3"+
		"\2\2\2 \u013c\3\2\2\2\"\u015a\3\2\2\2$\u017b\3\2\2\2&\u0186\3\2\2\2(\u0191"+
		"\3\2\2\2*\u0195\3\2\2\2,\u019a\3\2\2\2.\u01a0\3\2\2\2\60\u01a2\3\2\2\2"+
		"\62\u01a4\3\2\2\2\64\u01a6\3\2\2\2\66\67\5\4\3\2\678\7\3\2\28\3\3\2\2"+
		"\29:\5\6\4\2:;\7\4\2\2;~\3\2\2\2<=\5\6\4\2=>\7\4\2\2>?\5\4\3\2?~\3\2\2"+
		"\2@A\5\16\b\2AB\7\4\2\2B~\3\2\2\2CD\5\16\b\2DE\7\4\2\2EF\5\4\3\2F~\3\2"+
		"\2\2GH\5\30\r\2HI\7\4\2\2IJ\5\4\3\2J~\3\2\2\2KL\5\30\r\2LM\7\4\2\2M~\3"+
		"\2\2\2NO\5\34\17\2OP\5\4\3\2P~\3\2\2\2Q~\5\34\17\2RS\5\24\13\2ST\7\4\2"+
		"\2TU\5\4\3\2U~\3\2\2\2VW\5\24\13\2WX\7\4\2\2X~\3\2\2\2YZ\5\22\n\2Z[\7"+
		"\4\2\2[\\\5\4\3\2\\~\3\2\2\2]^\5\22\n\2^_\7\4\2\2_~\3\2\2\2`a\5\20\t\2"+
		"ab\7\4\2\2b~\3\2\2\2cd\5\20\t\2de\7\4\2\2ef\5\4\3\2f~\3\2\2\2g~\5\36\20"+
		"\2hi\5\36\20\2ij\5\4\3\2j~\3\2\2\2k~\5\"\22\2lm\5\"\22\2mn\5\4\3\2n~\3"+
		"\2\2\2op\5$\23\2pq\7\4\2\2qr\5\4\3\2r~\3\2\2\2st\5$\23\2tu\7\4\2\2u~\3"+
		"\2\2\2vw\5\26\f\2wx\7\4\2\2xy\5\4\3\2y~\3\2\2\2z{\5\26\f\2{|\7\4\2\2|"+
		"~\3\2\2\2}9\3\2\2\2}<\3\2\2\2}@\3\2\2\2}C\3\2\2\2}G\3\2\2\2}K\3\2\2\2"+
		"}N\3\2\2\2}Q\3\2\2\2}R\3\2\2\2}V\3\2\2\2}Y\3\2\2\2}]\3\2\2\2}`\3\2\2\2"+
		"}c\3\2\2\2}g\3\2\2\2}h\3\2\2\2}k\3\2\2\2}l\3\2\2\2}o\3\2\2\2}s\3\2\2\2"+
		"}v\3\2\2\2}z\3\2\2\2~\5\3\2\2\2\177\u0083\5\b\5\2\u0080\u0083\5\n\6\2"+
		"\u0081\u0083\5\f\7\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\7\3\2\2\2\u0084\u0085\7\5\2\2\u0085\u0086\5\60\31\2\u0086"+
		"\u0087\7\6\2\2\u0087\u0088\5\64\33\2\u0088\u0094\3\2\2\2\u0089\u008a\7"+
		"\5\2\2\u008a\u008b\5\60\31\2\u008b\u008c\7\6\2\2\u008c\u008d\5\60\31\2"+
		"\u008d\u0094\3\2\2\2\u008e\u008f\7\5\2\2\u008f\u0090\5\60\31\2\u0090\u0091"+
		"\7\6\2\2\u0091\u0092\5&\24\2\u0092\u0094\3\2\2\2\u0093\u0084\3\2\2\2\u0093"+
		"\u0089\3\2\2\2\u0093\u008e\3\2\2\2\u0094\t\3\2\2\2\u0095\u0096\7\7\2\2"+
		"\u0096\u0097\5\60\31\2\u0097\u0098\7\6\2\2\u0098\u0099\5\60\31\2\u0099"+
		"\u00a2\3\2\2\2\u009a\u009b\7\7\2\2\u009b\u009c\5\60\31\2\u009c\u009d\7"+
		"\6\2\2\u009d\u009e\7\b\2\2\u009e\u009f\5,\27\2\u009f\u00a0\7\b\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1\u009a\3\2\2\2\u00a2\13\3\2\2"+
		"\2\u00a3\u00a4\7\t\2\2\u00a4\u00a5\5\60\31\2\u00a5\u00a6\7\6\2\2\u00a6"+
		"\u00a7\5\60\31\2\u00a7\u00ae\3\2\2\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\5"+
		"\60\31\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\t\2\2\2\u00ac\u00ae\3\2\2\2\u00ad"+
		"\u00a3\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\r\3\2\2\2\u00af\u00b0\7\5\2\2"+
		"\u00b0\u00b6\5\60\31\2\u00b1\u00b2\7\7\2\2\u00b2\u00b6\5\60\31\2\u00b3"+
		"\u00b4\7\t\2\2\u00b4\u00b6\5\60\31\2\u00b5\u00af\3\2\2\2\u00b5\u00b1\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\17\3\2\2\2\u00b7\u00b8\5\60\31\2\u00b8"+
		"\u00b9\7\6\2\2\u00b9\u00ba\5\64\33\2\u00ba\u00ca\3\2\2\2\u00bb\u00bc\5"+
		"\60\31\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\t\2\2\2\u00be\u00ca\3\2\2\2\u00bf"+
		"\u00c0\5\60\31\2\u00c0\u00c1\7\6\2\2\u00c1\u00c2\7\b\2\2\u00c2\u00c3\5"+
		",\27\2\u00c3\u00c4\7\b\2\2\u00c4\u00ca\3\2\2\2\u00c5\u00c6\5\60\31\2\u00c6"+
		"\u00c7\7\6\2\2\u00c7\u00c8\5&\24\2\u00c8\u00ca\3\2\2\2\u00c9\u00b7\3\2"+
		"\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c5\3\2\2\2\u00ca"+
		"\21\3\2\2\2\u00cb\u00cc\5\60\31\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\5\60"+
		"\31\2\u00ce\u00ec\3\2\2\2\u00cf\u00d0\5\60\31\2\u00d0\u00d1\7\r\2\2\u00d1"+
		"\u00d2\5\60\31\2\u00d2\u00ec\3\2\2\2\u00d3\u00d4\5\60\31\2\u00d4\u00d5"+
		"\7\16\2\2\u00d5\u00d6\5\60\31\2\u00d6\u00ec\3\2\2\2\u00d7\u00d8\5\60\31"+
		"\2\u00d8\u00d9\7\17\2\2\u00d9\u00da\5\60\31\2\u00da\u00ec\3\2\2\2\u00db"+
		"\u00dc\5\60\31\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\5\64\33\2\u00de\u00ec"+
		"\3\2\2\2\u00df\u00e0\5\60\31\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2\5\64\33"+
		"\2\u00e2\u00ec\3\2\2\2\u00e3\u00e4\5\60\31\2\u00e4\u00e5\7\16\2\2\u00e5"+
		"\u00e6\5\64\33\2\u00e6\u00ec\3\2\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9"+
		"\7\17\2\2\u00e9\u00ea\5\64\33\2\u00ea\u00ec\3\2\2\2\u00eb\u00cb\3\2\2"+
		"\2\u00eb\u00cf\3\2\2\2\u00eb\u00d3\3\2\2\2\u00eb\u00d7\3\2\2\2\u00eb\u00db"+
		"\3\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec"+
		"\23\3\2\2\2\u00ed\u00ee\7\20\2\2\u00ee\u00f8\5\60\31\2\u00ef\u00f0\5\60"+
		"\31\2\u00f0\u00f1\7\20\2\2\u00f1\u00f8\3\2\2\2\u00f2\u00f3\7\21\2\2\u00f3"+
		"\u00f8\5\60\31\2\u00f4\u00f5\5\60\31\2\u00f5\u00f6\7\21\2\2\u00f6\u00f8"+
		"\3\2\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f7"+
		"\u00f4\3\2\2\2\u00f8\25\3\2\2\2\u00f9\u00fa\7\22\2\2\u00fa\u00fb\7\23"+
		"\2\2\u00fb\u00fc\7\b\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\7\b\2\2\u00fe"+
		"\u00ff\7\24\2\2\u00ff\u0106\3\2\2\2\u0100\u0101\7\22\2\2\u0101\u0102\7"+
		"\23\2\2\u0102\u0103\5&\24\2\u0103\u0104\7\24\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0105\u0100\3\2\2\2\u0106\27\3\2\2\2\u0107\u0108\7\25\2"+
		"\2\u0108\u0109\7\23\2\2\u0109\u010a\5\32\16\2\u010a\u010b\7\24\2\2\u010b"+
		"\u010c\7\26\2\2\u010c\u010d\7\27\2\2\u010d\u010e\5\4\3\2\u010e\u010f\7"+
		"\30\2\2\u010f\u011e\3\2\2\2\u0110\u0111\7\25\2\2\u0111\u0112\7\23\2\2"+
		"\u0112\u0113\5\32\16\2\u0113\u0114\7\24\2\2\u0114\u0115\7\26\2\2\u0115"+
		"\u0116\7\27\2\2\u0116\u0117\5\4\3\2\u0117\u0118\7\30\2\2\u0118\u0119\7"+
		"\31\2\2\u0119\u011a\7\27\2\2\u011a\u011b\5\4\3\2\u011b\u011c\7\30\2\2"+
		"\u011c\u011e\3\2\2\2\u011d\u0107\3\2\2\2\u011d\u0110\3\2\2\2\u011e\31"+
		"\3\2\2\2\u011f\u0120\5&\24\2\u0120\u0121\t\3\2\2\u0121\u0122\5&\24\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0125\t\2\2\2\u0124\u011f\3\2\2\2\u0124\u0123\3\2"+
		"\2\2\u0125\33\3\2\2\2\u0126\u0127\7 \2\2\u0127\u0128\7\23\2\2\u0128\u0129"+
		"\5\32\16\2\u0129\u012a\7\24\2\2\u012a\u012b\7\27\2\2\u012b\u012c\5\4\3"+
		"\2\u012c\u012d\7\30\2\2\u012d\35\3\2\2\2\u012e\u012f\7!\2\2\u012f\u0130"+
		"\7\23\2\2\u0130\u0131\5\b\5\2\u0131\u0132\7\4\2\2\u0132\u0133\5\32\16"+
		"\2\u0133\u0134\7\4\2\2\u0134\u0135\5 \21\2\u0135\u0136\7\24\2\2\u0136"+
		"\u0137\7\27\2\2\u0137\u0138\5\4\3\2\u0138\u0139\7\30\2\2\u0139\37\3\2"+
		"\2\2\u013a\u013d\5\24\13\2\u013b\u013d\5\22\n\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d!\3\2\2\2\u013e\u013f\7!\2\2\u013f\u0140\5\60\31\2"+
		"\u0140\u0141\7\"\2\2\u0141\u0142\7#\2\2\u0142\u0143\7\23\2\2\u0143\u0144"+
		"\5\64\33\2\u0144\u0145\7$\2\2\u0145\u0146\5\64\33\2\u0146\u0147\7\24\2"+
		"\2\u0147\u0148\7\27\2\2\u0148\u0149\5\4\3\2\u0149\u014a\7\30\2\2\u014a"+
		"\u015b\3\2\2\2\u014b\u014c\7!\2\2\u014c\u014d\5\60\31\2\u014d\u014e\7"+
		"\"\2\2\u014e\u014f\7#\2\2\u014f\u0150\7\23\2\2\u0150\u0151\5\64\33\2\u0151"+
		"\u0152\7$\2\2\u0152\u0153\5\64\33\2\u0153\u0154\7$\2\2\u0154\u0155\5\64"+
		"\33\2\u0155\u0156\7\24\2\2\u0156\u0157\7\27\2\2\u0157\u0158\5\4\3\2\u0158"+
		"\u0159\7\30\2\2\u0159\u015b\3\2\2\2\u015a\u013e\3\2\2\2\u015a\u014b\3"+
		"\2\2\2\u015b#\3\2\2\2\u015c\u015d\7\5\2\2\u015d\u015e\5\60\31\2\u015e"+
		"\u015f\7\6\2\2\u015f\u0160\5\32\16\2\u0160\u0161\7%\2\2\u0161\u0162\5"+
		"&\24\2\u0162\u0163\7&\2\2\u0163\u0164\5&\24\2\u0164\u017c\3\2\2\2\u0165"+
		"\u0166\7\7\2\2\u0166\u0167\5\60\31\2\u0167\u0168\7\6\2\2\u0168\u0169\5"+
		"\32\16\2\u0169\u016a\7%\2\2\u016a\u016b\7\b\2\2\u016b\u016c\5,\27\2\u016c"+
		"\u016d\7\b\2\2\u016d\u016e\7&\2\2\u016e\u016f\7\b\2\2\u016f\u0170\5,\27"+
		"\2\u0170\u0171\7\b\2\2\u0171\u017c\3\2\2\2\u0172\u0173\7\t\2\2\u0173\u0174"+
		"\5\60\31\2\u0174\u0175\7\6\2\2\u0175\u0176\5\32\16\2\u0176\u0177\7%\2"+
		"\2\u0177\u0178\t\2\2\2\u0178\u0179\7&\2\2\u0179\u017a\t\2\2\2\u017a\u017c"+
		"\3\2\2\2\u017b\u015c\3\2\2\2\u017b\u0165\3\2\2\2\u017b\u0172\3\2\2\2\u017c"+
		"%\3\2\2\2\u017d\u017e\5(\25\2\u017e\u017f\7\'\2\2\u017f\u0180\5&\24\2"+
		"\u0180\u0187\3\2\2\2\u0181\u0182\5(\25\2\u0182\u0183\7(\2\2\u0183\u0184"+
		"\5&\24\2\u0184\u0187\3\2\2\2\u0185\u0187\5(\25\2\u0186\u017d\3\2\2\2\u0186"+
		"\u0181\3\2\2\2\u0186\u0185\3\2\2\2\u0187\'\3\2\2\2\u0188\u0189\5*\26\2"+
		"\u0189\u018a\7)\2\2\u018a\u018b\5(\25\2\u018b\u0192\3\2\2\2\u018c\u018d"+
		"\5*\26\2\u018d\u018e\7*\2\2\u018e\u018f\5(\25\2\u018f\u0192\3\2\2\2\u0190"+
		"\u0192\5*\26\2\u0191\u0188\3\2\2\2\u0191\u018c\3\2\2\2\u0191\u0190\3\2"+
		"\2\2\u0192)\3\2\2\2\u0193\u0196\5\60\31\2\u0194\u0196\5\64\33\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196+\3\2\2\2\u0197\u0199\5.\30\2"+
		"\u0198\u0197\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b-\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u01a1\5\64\33\2\u019e"+
		"\u01a1\5\60\31\2\u019f\u01a1\5\62\32\2\u01a0\u019d\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1/\3\2\2\2\u01a2\u01a3\7+\2\2\u01a3\61"+
		"\3\2\2\2\u01a4\u01a5\7,\2\2\u01a5\63\3\2\2\2\u01a6\u01a7\7-\2\2\u01a7"+
		"\65\3\2\2\2\26}\u0082\u0093\u00a1\u00ad\u00b5\u00c9\u00eb\u00f7\u0105"+
		"\u011d\u0124\u013c\u015a\u017b\u0186\u0191\u0195\u019a\u01a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
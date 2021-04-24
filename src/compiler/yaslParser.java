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
			setState(120);
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
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				if_conditional();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73);
				while_loop();
				setState(74);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				unary_operator();
				setState(78);
				match(T__1);
				setState(79);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(81);
				unary_operator();
				setState(82);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(84);
				step_size();
				setState(85);
				match(T__1);
				setState(86);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(88);
				step_size();
				setState(89);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(91);
				assignment();
				setState(92);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(94);
				assignment();
				setState(95);
				match(T__1);
				setState(96);
				block();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(98);
				for_loop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(99);
				for_loop();
				setState(100);
				block();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(102);
				range_loop();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(103);
				range_loop();
				setState(104);
				block();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(106);
				ternary_conditional();
				setState(107);
				match(T__1);
				setState(108);
				block();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(110);
				ternary_conditional();
				setState(111);
				match(T__1);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(113);
				print();
				setState(114);
				match(T__1);
				setState(115);
				block();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(117);
				print();
				setState(118);
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
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				integer();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				string();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IntNumInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__2);
				setState(128);
				identifier();
				setState(129);
				match(T__3);
				setState(130);
				number();
				}
				break;
			case 2:
				_localctx = new IntIdInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__2);
				setState(133);
				identifier();
				setState(134);
				match(T__3);
				setState(135);
				identifier();
				}
				break;
			case 3:
				_localctx = new IntExprInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__2);
				setState(138);
				identifier();
				setState(139);
				match(T__3);
				setState(140);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StrIdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__4);
				setState(145);
				identifier();
				setState(146);
				match(T__3);
				setState(147);
				identifier();
				}
				break;
			case 2:
				_localctx = new StrSenInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__4);
				setState(150);
				identifier();
				setState(151);
				match(T__3);
				setState(152);
				match(T__5);
				setState(153);
				sentence();
				setState(154);
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
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BoolIdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				match(T__6);
				setState(159);
				identifier();
				setState(160);
				match(T__3);
				setState(161);
				identifier();
				}
				break;
			case 2:
				_localctx = new BoolBInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__6);
				setState(164);
				identifier();
				setState(165);
				match(T__3);
				setState(166);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IntDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__2);
				setState(171);
				identifier();
				}
				break;
			case T__4:
				_localctx = new StrDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__4);
				setState(173);
				identifier();
				}
				break;
			case T__6:
				_localctx = new BoolDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(T__6);
				setState(175);
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
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				identifier();
				setState(179);
				match(T__3);
				setState(180);
				number();
				}
				break;
			case 2:
				_localctx = new AssignBolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				identifier();
				setState(183);
				match(T__3);
				setState(184);
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
				setState(186);
				identifier();
				setState(187);
				match(T__3);
				setState(188);
				match(T__5);
				setState(189);
				sentence();
				setState(190);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				identifier();
				setState(193);
				match(T__3);
				setState(194);
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
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AddIdStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				identifier();
				setState(199);
				match(T__9);
				setState(200);
				identifier();
				}
				break;
			case 2:
				_localctx = new SubIdStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				identifier();
				setState(203);
				match(T__10);
				setState(204);
				identifier();
				}
				break;
			case 3:
				_localctx = new MulIdStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				identifier();
				setState(207);
				match(T__11);
				setState(208);
				identifier();
				}
				break;
			case 4:
				_localctx = new DivideIdStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				identifier();
				setState(211);
				match(T__12);
				setState(212);
				identifier();
				}
				break;
			case 5:
				_localctx = new AddNumStepContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				identifier();
				setState(215);
				match(T__9);
				setState(216);
				number();
				}
				break;
			case 6:
				_localctx = new SubNumStepContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				identifier();
				setState(219);
				match(T__10);
				setState(220);
				number();
				}
				break;
			case 7:
				_localctx = new MulNumStepContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				identifier();
				setState(223);
				match(T__11);
				setState(224);
				number();
				}
				break;
			case 8:
				_localctx = new DivNumStepContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(226);
				identifier();
				setState(227);
				match(T__12);
				setState(228);
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
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PreIncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__13);
				setState(233);
				identifier();
				}
				break;
			case 2:
				_localctx = new PostIncrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(234);
				identifier();
				setState(235);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new PreDecrementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(T__14);
				setState(238);
				identifier();
				}
				break;
			case 4:
				_localctx = new PostDecrementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				identifier();
				setState(240);
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
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new PrintStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(T__15);
				setState(245);
				match(T__16);
				setState(246);
				match(T__5);
				setState(247);
				sentence();
				setState(248);
				match(T__5);
				setState(249);
				match(T__17);
				}
				break;
			case 2:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__15);
				setState(252);
				match(T__16);
				{
				setState(253);
				expression();
				}
				setState(254);
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
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__18);
				setState(259);
				match(T__16);
				setState(260);
				condition();
				setState(261);
				match(T__17);
				setState(262);
				match(T__19);
				setState(263);
				match(T__20);
				setState(264);
				block();
				setState(265);
				match(T__21);
				}
				break;
			case 2:
				_localctx = new IfElseConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(T__18);
				setState(268);
				match(T__16);
				setState(269);
				condition();
				setState(270);
				match(T__17);
				setState(271);
				match(T__19);
				setState(272);
				match(T__20);
				setState(273);
				block();
				setState(274);
				match(T__21);
				setState(275);
				match(T__22);
				setState(276);
				match(T__20);
				setState(277);
				block();
				setState(278);
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
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case Digit:
				_localctx = new ConditionOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				expression();
				setState(283);
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
				setState(284);
				expression();
				}
				break;
			case T__7:
			case T__8:
				_localctx = new ConditionBoolOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
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
			setState(289);
			match(T__29);
			setState(290);
			match(T__16);
			setState(291);
			condition();
			setState(292);
			match(T__17);
			setState(293);
			match(T__20);
			setState(294);
			block();
			setState(295);
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
			setState(297);
			match(T__30);
			setState(298);
			match(T__16);
			setState(299);
			integer();
			setState(300);
			match(T__1);
			setState(301);
			condition();
			setState(302);
			match(T__1);
			setState(303);
			option();
			setState(304);
			match(T__17);
			setState(305);
			match(T__20);
			setState(306);
			block();
			setState(307);
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
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				unary_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new SimpleRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				match(T__30);
				setState(314);
				identifier();
				setState(315);
				match(T__31);
				setState(316);
				match(T__32);
				setState(317);
				match(T__16);
				setState(318);
				number();
				setState(319);
				match(T__33);
				setState(320);
				number();
				setState(321);
				match(T__17);
				setState(322);
				match(T__20);
				setState(323);
				block();
				setState(324);
				match(T__21);
				}
				break;
			case 2:
				_localctx = new StepRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(T__30);
				setState(327);
				identifier();
				setState(328);
				match(T__31);
				setState(329);
				match(T__32);
				setState(330);
				match(T__16);
				setState(331);
				number();
				setState(332);
				match(T__33);
				setState(333);
				number();
				setState(334);
				match(T__33);
				setState(335);
				number();
				setState(336);
				match(T__17);
				setState(337);
				match(T__20);
				setState(338);
				block();
				setState(339);
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
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IntTernaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(T__2);
				setState(344);
				identifier();
				setState(345);
				match(T__3);
				setState(346);
				condition();
				setState(347);
				match(T__34);
				setState(348);
				expression();
				setState(349);
				match(T__35);
				setState(350);
				expression();
				}
				break;
			case T__4:
				_localctx = new StrTernaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				match(T__4);
				setState(353);
				identifier();
				setState(354);
				match(T__3);
				setState(355);
				condition();
				setState(356);
				match(T__34);
				setState(357);
				match(T__5);
				setState(358);
				sentence();
				setState(359);
				match(T__5);
				setState(360);
				match(T__35);
				setState(361);
				match(T__5);
				setState(362);
				sentence();
				setState(363);
				match(T__5);
				}
				break;
			case T__6:
				_localctx = new BolTernaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(T__6);
				setState(366);
				identifier();
				setState(367);
				match(T__3);
				setState(368);
				condition();
				setState(369);
				match(T__34);
				setState(370);
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
				setState(371);
				match(T__35);
				setState(372);
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
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				term();
				setState(377);
				match(T__36);
				setState(378);
				expression();
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				term();
				setState(381);
				match(T__37);
				setState(382);
				expression();
				}
				break;
			case 3:
				_localctx = new ExpPrecedenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
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
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				factor();
				setState(388);
				match(T__38);
				setState(389);
				term();
				}
				break;
			case 2:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				factor();
				setState(392);
				match(T__39);
				setState(393);
				term();
				}
				break;
			case 3:
				_localctx = new FactContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
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
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdexpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				identifier();
				}
				break;
			case Digit:
				_localctx = new NumberexpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
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
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Special_char) | (1L << Digit))) != 0)) {
				{
				{
				setState(402);
				sent_option();
				}
				}
				setState(407);
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
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(408);
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				identifier();
				}
				break;
			case Special_char:
				enterOuterAlt(_localctx, 3);
				{
				setState(410);
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
			setState(413);
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
			setState(415);
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
			setState(417);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u01a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3{\n\3\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0091\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00ab\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00c7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00e9\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00f5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0103"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\r\u011b\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u0122"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u013a\n\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0158"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0179\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0184\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u018f\n\25\3\26\3\26\5\26\u0193\n\26\3\27\7\27\u0196\n\27\f\27\16"+
		"\27\u0199\13\27\3\30\3\30\3\30\5\30\u019e\n\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\2\4\3\2\n\13\3\2\32\37\2\u01c4\2\66\3\2\2\2\4z\3\2\2\2\6\177\3\2\2"+
		"\2\b\u0090\3\2\2\2\n\u009e\3\2\2\2\f\u00aa\3\2\2\2\16\u00b2\3\2\2\2\20"+
		"\u00c6\3\2\2\2\22\u00e8\3\2\2\2\24\u00f4\3\2\2\2\26\u0102\3\2\2\2\30\u011a"+
		"\3\2\2\2\32\u0121\3\2\2\2\34\u0123\3\2\2\2\36\u012b\3\2\2\2 \u0139\3\2"+
		"\2\2\"\u0157\3\2\2\2$\u0178\3\2\2\2&\u0183\3\2\2\2(\u018e\3\2\2\2*\u0192"+
		"\3\2\2\2,\u0197\3\2\2\2.\u019d\3\2\2\2\60\u019f\3\2\2\2\62\u01a1\3\2\2"+
		"\2\64\u01a3\3\2\2\2\66\67\5\4\3\2\678\7\3\2\28\3\3\2\2\29:\5\6\4\2:;\7"+
		"\4\2\2;{\3\2\2\2<=\5\6\4\2=>\7\4\2\2>?\5\4\3\2?{\3\2\2\2@A\5\16\b\2AB"+
		"\7\4\2\2B{\3\2\2\2CD\5\16\b\2DE\7\4\2\2EF\5\4\3\2F{\3\2\2\2GH\5\30\r\2"+
		"HI\5\4\3\2I{\3\2\2\2J{\5\30\r\2KL\5\34\17\2LM\5\4\3\2M{\3\2\2\2N{\5\34"+
		"\17\2OP\5\24\13\2PQ\7\4\2\2QR\5\4\3\2R{\3\2\2\2ST\5\24\13\2TU\7\4\2\2"+
		"U{\3\2\2\2VW\5\22\n\2WX\7\4\2\2XY\5\4\3\2Y{\3\2\2\2Z[\5\22\n\2[\\\7\4"+
		"\2\2\\{\3\2\2\2]^\5\20\t\2^_\7\4\2\2_{\3\2\2\2`a\5\20\t\2ab\7\4\2\2bc"+
		"\5\4\3\2c{\3\2\2\2d{\5\36\20\2ef\5\36\20\2fg\5\4\3\2g{\3\2\2\2h{\5\"\22"+
		"\2ij\5\"\22\2jk\5\4\3\2k{\3\2\2\2lm\5$\23\2mn\7\4\2\2no\5\4\3\2o{\3\2"+
		"\2\2pq\5$\23\2qr\7\4\2\2r{\3\2\2\2st\5\26\f\2tu\7\4\2\2uv\5\4\3\2v{\3"+
		"\2\2\2wx\5\26\f\2xy\7\4\2\2y{\3\2\2\2z9\3\2\2\2z<\3\2\2\2z@\3\2\2\2zC"+
		"\3\2\2\2zG\3\2\2\2zJ\3\2\2\2zK\3\2\2\2zN\3\2\2\2zO\3\2\2\2zS\3\2\2\2z"+
		"V\3\2\2\2zZ\3\2\2\2z]\3\2\2\2z`\3\2\2\2zd\3\2\2\2ze\3\2\2\2zh\3\2\2\2"+
		"zi\3\2\2\2zl\3\2\2\2zp\3\2\2\2zs\3\2\2\2zw\3\2\2\2{\5\3\2\2\2|\u0080\5"+
		"\b\5\2}\u0080\5\n\6\2~\u0080\5\f\7\2\177|\3\2\2\2\177}\3\2\2\2\177~\3"+
		"\2\2\2\u0080\7\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u0083\5\60\31\2\u0083"+
		"\u0084\7\6\2\2\u0084\u0085\5\64\33\2\u0085\u0091\3\2\2\2\u0086\u0087\7"+
		"\5\2\2\u0087\u0088\5\60\31\2\u0088\u0089\7\6\2\2\u0089\u008a\5\60\31\2"+
		"\u008a\u0091\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u008d\5\60\31\2\u008d\u008e"+
		"\7\6\2\2\u008e\u008f\5&\24\2\u008f\u0091\3\2\2\2\u0090\u0081\3\2\2\2\u0090"+
		"\u0086\3\2\2\2\u0090\u008b\3\2\2\2\u0091\t\3\2\2\2\u0092\u0093\7\7\2\2"+
		"\u0093\u0094\5\60\31\2\u0094\u0095\7\6\2\2\u0095\u0096\5\60\31\2\u0096"+
		"\u009f\3\2\2\2\u0097\u0098\7\7\2\2\u0098\u0099\5\60\31\2\u0099\u009a\7"+
		"\6\2\2\u009a\u009b\7\b\2\2\u009b\u009c\5,\27\2\u009c\u009d\7\b\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u0092\3\2\2\2\u009e\u0097\3\2\2\2\u009f\13\3\2\2"+
		"\2\u00a0\u00a1\7\t\2\2\u00a1\u00a2\5\60\31\2\u00a2\u00a3\7\6\2\2\u00a3"+
		"\u00a4\5\60\31\2\u00a4\u00ab\3\2\2\2\u00a5\u00a6\7\t\2\2\u00a6\u00a7\5"+
		"\60\31\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\t\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a0\3\2\2\2\u00aa\u00a5\3\2\2\2\u00ab\r\3\2\2\2\u00ac\u00ad\7\5\2\2"+
		"\u00ad\u00b3\5\60\31\2\u00ae\u00af\7\7\2\2\u00af\u00b3\5\60\31\2\u00b0"+
		"\u00b1\7\t\2\2\u00b1\u00b3\5\60\31\2\u00b2\u00ac\3\2\2\2\u00b2\u00ae\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\17\3\2\2\2\u00b4\u00b5\5\60\31\2\u00b5"+
		"\u00b6\7\6\2\2\u00b6\u00b7\5\64\33\2\u00b7\u00c7\3\2\2\2\u00b8\u00b9\5"+
		"\60\31\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\t\2\2\2\u00bb\u00c7\3\2\2\2\u00bc"+
		"\u00bd\5\60\31\2\u00bd\u00be\7\6\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\5"+
		",\27\2\u00c0\u00c1\7\b\2\2\u00c1\u00c7\3\2\2\2\u00c2\u00c3\5\60\31\2\u00c3"+
		"\u00c4\7\6\2\2\u00c4\u00c5\5&\24\2\u00c5\u00c7\3\2\2\2\u00c6\u00b4\3\2"+
		"\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00bc\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7"+
		"\21\3\2\2\2\u00c8\u00c9\5\60\31\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\5\60"+
		"\31\2\u00cb\u00e9\3\2\2\2\u00cc\u00cd\5\60\31\2\u00cd\u00ce\7\r\2\2\u00ce"+
		"\u00cf\5\60\31\2\u00cf\u00e9\3\2\2\2\u00d0\u00d1\5\60\31\2\u00d1\u00d2"+
		"\7\16\2\2\u00d2\u00d3\5\60\31\2\u00d3\u00e9\3\2\2\2\u00d4\u00d5\5\60\31"+
		"\2\u00d5\u00d6\7\17\2\2\u00d6\u00d7\5\60\31\2\u00d7\u00e9\3\2\2\2\u00d8"+
		"\u00d9\5\60\31\2\u00d9\u00da\7\f\2\2\u00da\u00db\5\64\33\2\u00db\u00e9"+
		"\3\2\2\2\u00dc\u00dd\5\60\31\2\u00dd\u00de\7\r\2\2\u00de\u00df\5\64\33"+
		"\2\u00df\u00e9\3\2\2\2\u00e0\u00e1\5\60\31\2\u00e1\u00e2\7\16\2\2\u00e2"+
		"\u00e3\5\64\33\2\u00e3\u00e9\3\2\2\2\u00e4\u00e5\5\60\31\2\u00e5\u00e6"+
		"\7\17\2\2\u00e6\u00e7\5\64\33\2\u00e7\u00e9\3\2\2\2\u00e8\u00c8\3\2\2"+
		"\2\u00e8\u00cc\3\2\2\2\u00e8\u00d0\3\2\2\2\u00e8\u00d4\3\2\2\2\u00e8\u00d8"+
		"\3\2\2\2\u00e8\u00dc\3\2\2\2\u00e8\u00e0\3\2\2\2\u00e8\u00e4\3\2\2\2\u00e9"+
		"\23\3\2\2\2\u00ea\u00eb\7\20\2\2\u00eb\u00f5\5\60\31\2\u00ec\u00ed\5\60"+
		"\31\2\u00ed\u00ee\7\20\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f0\7\21\2\2\u00f0"+
		"\u00f5\5\60\31\2\u00f1\u00f2\5\60\31\2\u00f2\u00f3\7\21\2\2\u00f3\u00f5"+
		"\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f4\u00ec\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f5\25\3\2\2\2\u00f6\u00f7\7\22\2\2\u00f7\u00f8\7\23"+
		"\2\2\u00f8\u00f9\7\b\2\2\u00f9\u00fa\5,\27\2\u00fa\u00fb\7\b\2\2\u00fb"+
		"\u00fc\7\24\2\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\7\22\2\2\u00fe\u00ff\7"+
		"\23\2\2\u00ff\u0100\5&\24\2\u0100\u0101\7\24\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00f6\3\2\2\2\u0102\u00fd\3\2\2\2\u0103\27\3\2\2\2\u0104\u0105\7\25\2"+
		"\2\u0105\u0106\7\23\2\2\u0106\u0107\5\32\16\2\u0107\u0108\7\24\2\2\u0108"+
		"\u0109\7\26\2\2\u0109\u010a\7\27\2\2\u010a\u010b\5\4\3\2\u010b\u010c\7"+
		"\30\2\2\u010c\u011b\3\2\2\2\u010d\u010e\7\25\2\2\u010e\u010f\7\23\2\2"+
		"\u010f\u0110\5\32\16\2\u0110\u0111\7\24\2\2\u0111\u0112\7\26\2\2\u0112"+
		"\u0113\7\27\2\2\u0113\u0114\5\4\3\2\u0114\u0115\7\30\2\2\u0115\u0116\7"+
		"\31\2\2\u0116\u0117\7\27\2\2\u0117\u0118\5\4\3\2\u0118\u0119\7\30\2\2"+
		"\u0119\u011b\3\2\2\2\u011a\u0104\3\2\2\2\u011a\u010d\3\2\2\2\u011b\31"+
		"\3\2\2\2\u011c\u011d\5&\24\2\u011d\u011e\t\3\2\2\u011e\u011f\5&\24\2\u011f"+
		"\u0122\3\2\2\2\u0120\u0122\t\2\2\2\u0121\u011c\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122\33\3\2\2\2\u0123\u0124\7 \2\2\u0124\u0125\7\23\2\2\u0125\u0126"+
		"\5\32\16\2\u0126\u0127\7\24\2\2\u0127\u0128\7\27\2\2\u0128\u0129\5\4\3"+
		"\2\u0129\u012a\7\30\2\2\u012a\35\3\2\2\2\u012b\u012c\7!\2\2\u012c\u012d"+
		"\7\23\2\2\u012d\u012e\5\b\5\2\u012e\u012f\7\4\2\2\u012f\u0130\5\32\16"+
		"\2\u0130\u0131\7\4\2\2\u0131\u0132\5 \21\2\u0132\u0133\7\24\2\2\u0133"+
		"\u0134\7\27\2\2\u0134\u0135\5\4\3\2\u0135\u0136\7\30\2\2\u0136\37\3\2"+
		"\2\2\u0137\u013a\5\24\13\2\u0138\u013a\5\22\n\2\u0139\u0137\3\2\2\2\u0139"+
		"\u0138\3\2\2\2\u013a!\3\2\2\2\u013b\u013c\7!\2\2\u013c\u013d\5\60\31\2"+
		"\u013d\u013e\7\"\2\2\u013e\u013f\7#\2\2\u013f\u0140\7\23\2\2\u0140\u0141"+
		"\5\64\33\2\u0141\u0142\7$\2\2\u0142\u0143\5\64\33\2\u0143\u0144\7\24\2"+
		"\2\u0144\u0145\7\27\2\2\u0145\u0146\5\4\3\2\u0146\u0147\7\30\2\2\u0147"+
		"\u0158\3\2\2\2\u0148\u0149\7!\2\2\u0149\u014a\5\60\31\2\u014a\u014b\7"+
		"\"\2\2\u014b\u014c\7#\2\2\u014c\u014d\7\23\2\2\u014d\u014e\5\64\33\2\u014e"+
		"\u014f\7$\2\2\u014f\u0150\5\64\33\2\u0150\u0151\7$\2\2\u0151\u0152\5\64"+
		"\33\2\u0152\u0153\7\24\2\2\u0153\u0154\7\27\2\2\u0154\u0155\5\4\3\2\u0155"+
		"\u0156\7\30\2\2\u0156\u0158\3\2\2\2\u0157\u013b\3\2\2\2\u0157\u0148\3"+
		"\2\2\2\u0158#\3\2\2\2\u0159\u015a\7\5\2\2\u015a\u015b\5\60\31\2\u015b"+
		"\u015c\7\6\2\2\u015c\u015d\5\32\16\2\u015d\u015e\7%\2\2\u015e\u015f\5"+
		"&\24\2\u015f\u0160\7&\2\2\u0160\u0161\5&\24\2\u0161\u0179\3\2\2\2\u0162"+
		"\u0163\7\7\2\2\u0163\u0164\5\60\31\2\u0164\u0165\7\6\2\2\u0165\u0166\5"+
		"\32\16\2\u0166\u0167\7%\2\2\u0167\u0168\7\b\2\2\u0168\u0169\5,\27\2\u0169"+
		"\u016a\7\b\2\2\u016a\u016b\7&\2\2\u016b\u016c\7\b\2\2\u016c\u016d\5,\27"+
		"\2\u016d\u016e\7\b\2\2\u016e\u0179\3\2\2\2\u016f\u0170\7\t\2\2\u0170\u0171"+
		"\5\60\31\2\u0171\u0172\7\6\2\2\u0172\u0173\5\32\16\2\u0173\u0174\7%\2"+
		"\2\u0174\u0175\t\2\2\2\u0175\u0176\7&\2\2\u0176\u0177\t\2\2\2\u0177\u0179"+
		"\3\2\2\2\u0178\u0159\3\2\2\2\u0178\u0162\3\2\2\2\u0178\u016f\3\2\2\2\u0179"+
		"%\3\2\2\2\u017a\u017b\5(\25\2\u017b\u017c\7\'\2\2\u017c\u017d\5&\24\2"+
		"\u017d\u0184\3\2\2\2\u017e\u017f\5(\25\2\u017f\u0180\7(\2\2\u0180\u0181"+
		"\5&\24\2\u0181\u0184\3\2\2\2\u0182\u0184\5(\25\2\u0183\u017a\3\2\2\2\u0183"+
		"\u017e\3\2\2\2\u0183\u0182\3\2\2\2\u0184\'\3\2\2\2\u0185\u0186\5*\26\2"+
		"\u0186\u0187\7)\2\2\u0187\u0188\5(\25\2\u0188\u018f\3\2\2\2\u0189\u018a"+
		"\5*\26\2\u018a\u018b\7*\2\2\u018b\u018c\5(\25\2\u018c\u018f\3\2\2\2\u018d"+
		"\u018f\5*\26\2\u018e\u0185\3\2\2\2\u018e\u0189\3\2\2\2\u018e\u018d\3\2"+
		"\2\2\u018f)\3\2\2\2\u0190\u0193\5\60\31\2\u0191\u0193\5\64\33\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0191\3\2\2\2\u0193+\3\2\2\2\u0194\u0196\5.\30\2"+
		"\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198-\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019e\5\64\33\2\u019b"+
		"\u019e\5\60\31\2\u019c\u019e\5\62\32\2\u019d\u019a\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019c\3\2\2\2\u019e/\3\2\2\2\u019f\u01a0\7+\2\2\u01a0\61"+
		"\3\2\2\2\u01a1\u01a2\7,\2\2\u01a2\63\3\2\2\2\u01a3\u01a4\7-\2\2\u01a4"+
		"\65\3\2\2\2\26z\177\u0090\u009e\u00aa\u00b2\u00c6\u00e8\u00f4\u0102\u011a"+
		"\u0121\u0139\u0157\u0178\u0183\u018e\u0192\u0197\u019d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
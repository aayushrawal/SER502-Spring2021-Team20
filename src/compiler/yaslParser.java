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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, Special_char=39, 
		Digit=40, WS=41;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_initialization = 2, RULE_integer = 3, 
		RULE_string = 4, RULE_bool = 5, RULE_declaration = 6, RULE_assignment = 7, 
		RULE_step_size = 8, RULE_unary_operator = 9, RULE_if_conditional = 10, 
		RULE_condition = 11, RULE_while_loop = 12, RULE_for_loop = 13, RULE_option = 14, 
		RULE_range_loop = 15, RULE_expression = 16, RULE_term = 17, RULE_factor = 18, 
		RULE_sentence = 19, RULE_sent_option = 20, RULE_identifier = 21, RULE_special_char = 22, 
		RULE_number = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "initialization", "integer", "string", "bool", "declaration", 
			"assignment", "step_size", "unary_operator", "if_conditional", "condition", 
			"while_loop", "for_loop", "option", "range_loop", "expression", "term", 
			"factor", "sentence", "sent_option", "identifier", "special_char", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'int'", "'='", "'string'", "'\"'", "'bool'", "'true'", 
			"'false'", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'if'", "'('", 
			"')'", "'then'", "'{'", "'}'", "'else'", "'=='", "'<'", "'>'", "'<='", 
			"'>='", "'!='", "'while'", "'for'", "'in'", "'range'", "','", "'+'", 
			"'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "Special_char", "Digit", "WS"
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
			setState(48);
			block();
			setState(49);
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
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				initialization();
				setState(52);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				initialization();
				setState(55);
				match(T__1);
				setState(56);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				declaration();
				setState(59);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				declaration();
				setState(62);
				match(T__1);
				setState(63);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				if_conditional();
				setState(66);
				match(T__1);
				setState(67);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				if_conditional();
				setState(70);
				match(T__1);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(72);
				while_loop();
				setState(73);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				while_loop();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				unary_operator();
				setState(77);
				match(T__1);
				setState(78);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(80);
				unary_operator();
				setState(81);
				match(T__1);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(83);
				step_size();
				setState(84);
				match(T__1);
				setState(85);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(87);
				step_size();
				setState(88);
				match(T__1);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(90);
				assignment();
				setState(91);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(93);
				assignment();
				setState(94);
				match(T__1);
				setState(95);
				block();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(97);
				for_loop();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(98);
				for_loop();
				setState(99);
				block();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(101);
				range_loop();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(102);
				range_loop();
				setState(103);
				block();
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				integer();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				string();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IntNumInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__2);
				setState(113);
				identifier();
				setState(114);
				match(T__3);
				setState(115);
				number();
				}
				break;
			case 2:
				_localctx = new IntIdInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__2);
				setState(118);
				identifier();
				setState(119);
				match(T__3);
				setState(120);
				identifier();
				}
				break;
			case 3:
				_localctx = new IntExprInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				match(T__2);
				setState(123);
				identifier();
				setState(124);
				match(T__3);
				setState(125);
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new StrIdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(T__4);
				setState(130);
				identifier();
				setState(131);
				match(T__3);
				setState(132);
				identifier();
				}
				break;
			case 2:
				_localctx = new StrSenInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__4);
				setState(135);
				identifier();
				setState(136);
				match(T__3);
				setState(137);
				match(T__5);
				setState(138);
				sentence();
				setState(139);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new BoolIdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__6);
				setState(144);
				identifier();
				setState(145);
				match(T__3);
				setState(146);
				identifier();
				}
				break;
			case 2:
				_localctx = new BoolBInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__6);
				setState(149);
				identifier();
				setState(150);
				match(T__3);
				setState(151);
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
			setState(161);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IntDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__2);
				setState(156);
				identifier();
				}
				break;
			case T__4:
				_localctx = new StrDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(T__4);
				setState(158);
				identifier();
				}
				break;
			case T__6:
				_localctx = new BoolDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				match(T__6);
				setState(160);
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
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new AssignNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				identifier();
				setState(164);
				match(T__3);
				setState(165);
				number();
				}
				break;
			case 2:
				_localctx = new AssignBolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				identifier();
				setState(168);
				match(T__3);
				setState(169);
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
				setState(171);
				identifier();
				setState(172);
				match(T__3);
				setState(173);
				match(T__5);
				setState(174);
				sentence();
				setState(175);
				match(T__5);
				}
				break;
			case 4:
				_localctx = new AssignExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				identifier();
				setState(178);
				match(T__3);
				setState(179);
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
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AddIdStepContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				identifier();
				setState(184);
				match(T__9);
				setState(185);
				identifier();
				}
				break;
			case 2:
				_localctx = new SubIdStepContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				identifier();
				setState(188);
				match(T__10);
				setState(189);
				identifier();
				}
				break;
			case 3:
				_localctx = new MulIdStepContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				identifier();
				setState(192);
				match(T__11);
				setState(193);
				identifier();
				}
				break;
			case 4:
				_localctx = new DivideIdStepContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				identifier();
				setState(196);
				match(T__12);
				setState(197);
				identifier();
				}
				break;
			case 5:
				_localctx = new AddNumStepContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				identifier();
				setState(200);
				match(T__9);
				setState(201);
				number();
				}
				break;
			case 6:
				_localctx = new SubNumStepContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
				identifier();
				setState(204);
				match(T__10);
				setState(205);
				number();
				}
				break;
			case 7:
				_localctx = new MulNumStepContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(207);
				identifier();
				setState(208);
				match(T__11);
				setState(209);
				number();
				}
				break;
			case 8:
				_localctx = new DivNumStepContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(211);
				identifier();
				setState(212);
				match(T__12);
				setState(213);
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
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PreIncrementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__13);
				setState(218);
				identifier();
				}
				break;
			case 2:
				_localctx = new PostIncrementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				identifier();
				setState(220);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new PreDecrementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(222);
				match(T__14);
				setState(223);
				identifier();
				}
				break;
			case 4:
				_localctx = new PostDecrementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				identifier();
				setState(225);
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
		enterRule(_localctx, 20, RULE_if_conditional);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				match(T__15);
				setState(230);
				match(T__16);
				setState(231);
				condition();
				setState(232);
				match(T__17);
				setState(233);
				match(T__18);
				setState(234);
				match(T__19);
				setState(235);
				block();
				setState(236);
				match(T__20);
				}
				break;
			case 2:
				_localctx = new IfElseConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(T__15);
				setState(239);
				match(T__16);
				setState(240);
				condition();
				setState(241);
				match(T__17);
				setState(242);
				match(T__18);
				setState(243);
				match(T__19);
				setState(244);
				block();
				setState(245);
				match(T__20);
				setState(246);
				match(T__21);
				setState(247);
				match(T__19);
				setState(248);
				block();
				setState(249);
				match(T__20);
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
		enterRule(_localctx, 22, RULE_condition);
		int _la;
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case Digit:
				_localctx = new ConditionOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				expression();
				setState(254);
				((ConditionOpContext)_localctx).conditional_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
					((ConditionOpContext)_localctx).conditional_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				expression();
				}
				break;
			case T__7:
			case T__8:
				_localctx = new ConditionBoolOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
		enterRule(_localctx, 24, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__28);
			setState(261);
			match(T__16);
			setState(262);
			condition();
			setState(263);
			match(T__17);
			setState(264);
			match(T__19);
			setState(265);
			block();
			setState(266);
			match(T__20);
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
		enterRule(_localctx, 26, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__29);
			setState(269);
			match(T__16);
			setState(270);
			integer();
			setState(271);
			match(T__1);
			setState(272);
			condition();
			setState(273);
			match(T__1);
			setState(274);
			option();
			setState(275);
			match(T__17);
			setState(276);
			match(T__19);
			setState(277);
			block();
			setState(278);
			match(T__20);
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
		enterRule(_localctx, 28, RULE_option);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				unary_operator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
		enterRule(_localctx, 30, RULE_range_loop);
		try {
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SimpleRangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(T__29);
				setState(285);
				identifier();
				setState(286);
				match(T__30);
				setState(287);
				match(T__31);
				setState(288);
				match(T__16);
				setState(289);
				number();
				setState(290);
				match(T__32);
				setState(291);
				number();
				setState(292);
				match(T__17);
				setState(293);
				match(T__19);
				setState(294);
				block();
				setState(295);
				match(T__20);
				}
				break;
			case 2:
				_localctx = new StepRangeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(T__29);
				setState(298);
				identifier();
				setState(299);
				match(T__30);
				setState(300);
				match(T__31);
				setState(301);
				match(T__16);
				setState(302);
				number();
				setState(303);
				match(T__32);
				setState(304);
				number();
				setState(305);
				match(T__32);
				setState(306);
				number();
				setState(307);
				match(T__17);
				setState(308);
				match(T__19);
				setState(309);
				block();
				setState(310);
				match(T__20);
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
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				term();
				setState(315);
				match(T__33);
				setState(316);
				expression();
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				term();
				setState(319);
				match(T__34);
				setState(320);
				expression();
				}
				break;
			case 3:
				_localctx = new ExpPrecedenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
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
		enterRule(_localctx, 34, RULE_term);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				factor();
				setState(326);
				match(T__35);
				setState(327);
				term();
				}
				break;
			case 2:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				factor();
				setState(330);
				match(T__36);
				setState(331);
				term();
				}
				break;
			case 3:
				_localctx = new FactContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(333);
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
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdexpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				identifier();
				}
				break;
			case Digit:
				_localctx = new NumberexpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
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
		enterRule(_localctx, 38, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << Special_char) | (1L << Digit))) != 0)) {
				{
				{
				setState(340);
				sent_option();
				}
				}
				setState(345);
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
		enterRule(_localctx, 40, RULE_sent_option);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Digit:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				identifier();
				}
				break;
			case Special_char:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
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
		enterRule(_localctx, 42, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 44, RULE_special_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		enterRule(_localctx, 46, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0168\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3l\n\3\3\4\3\4\3\4\5\4q\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0082\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0090\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00b8\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\5\n\u00da\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00e6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fe\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u0105"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u011d\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u013b"+
		"\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0146\n\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0151\n\23\3\24\3\24\5\24"+
		"\u0155\n\24\3\25\7\25\u0158\n\25\f\25\16\25\u015b\13\25\3\26\3\26\3\26"+
		"\5\26\u0160\n\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\4\3\2\n\13\3\2\31\36\2\u0181"+
		"\2\62\3\2\2\2\4k\3\2\2\2\6p\3\2\2\2\b\u0081\3\2\2\2\n\u008f\3\2\2\2\f"+
		"\u009b\3\2\2\2\16\u00a3\3\2\2\2\20\u00b7\3\2\2\2\22\u00d9\3\2\2\2\24\u00e5"+
		"\3\2\2\2\26\u00fd\3\2\2\2\30\u0104\3\2\2\2\32\u0106\3\2\2\2\34\u010e\3"+
		"\2\2\2\36\u011c\3\2\2\2 \u013a\3\2\2\2\"\u0145\3\2\2\2$\u0150\3\2\2\2"+
		"&\u0154\3\2\2\2(\u0159\3\2\2\2*\u015f\3\2\2\2,\u0161\3\2\2\2.\u0163\3"+
		"\2\2\2\60\u0165\3\2\2\2\62\63\5\4\3\2\63\64\7\3\2\2\64\3\3\2\2\2\65\66"+
		"\5\6\4\2\66\67\7\4\2\2\67l\3\2\2\289\5\6\4\29:\7\4\2\2:;\5\4\3\2;l\3\2"+
		"\2\2<=\5\16\b\2=>\7\4\2\2>l\3\2\2\2?@\5\16\b\2@A\7\4\2\2AB\5\4\3\2Bl\3"+
		"\2\2\2CD\5\26\f\2DE\7\4\2\2EF\5\4\3\2Fl\3\2\2\2GH\5\26\f\2HI\7\4\2\2I"+
		"l\3\2\2\2JK\5\32\16\2KL\5\4\3\2Ll\3\2\2\2Ml\5\32\16\2NO\5\24\13\2OP\7"+
		"\4\2\2PQ\5\4\3\2Ql\3\2\2\2RS\5\24\13\2ST\7\4\2\2Tl\3\2\2\2UV\5\22\n\2"+
		"VW\7\4\2\2WX\5\4\3\2Xl\3\2\2\2YZ\5\22\n\2Z[\7\4\2\2[l\3\2\2\2\\]\5\20"+
		"\t\2]^\7\4\2\2^l\3\2\2\2_`\5\20\t\2`a\7\4\2\2ab\5\4\3\2bl\3\2\2\2cl\5"+
		"\34\17\2de\5\34\17\2ef\5\4\3\2fl\3\2\2\2gl\5 \21\2hi\5 \21\2ij\5\4\3\2"+
		"jl\3\2\2\2k\65\3\2\2\2k8\3\2\2\2k<\3\2\2\2k?\3\2\2\2kC\3\2\2\2kG\3\2\2"+
		"\2kJ\3\2\2\2kM\3\2\2\2kN\3\2\2\2kR\3\2\2\2kU\3\2\2\2kY\3\2\2\2k\\\3\2"+
		"\2\2k_\3\2\2\2kc\3\2\2\2kd\3\2\2\2kg\3\2\2\2kh\3\2\2\2l\5\3\2\2\2mq\5"+
		"\b\5\2nq\5\n\6\2oq\5\f\7\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\7\3\2\2\2rs"+
		"\7\5\2\2st\5,\27\2tu\7\6\2\2uv\5\60\31\2v\u0082\3\2\2\2wx\7\5\2\2xy\5"+
		",\27\2yz\7\6\2\2z{\5,\27\2{\u0082\3\2\2\2|}\7\5\2\2}~\5,\27\2~\177\7\6"+
		"\2\2\177\u0080\5\"\22\2\u0080\u0082\3\2\2\2\u0081r\3\2\2\2\u0081w\3\2"+
		"\2\2\u0081|\3\2\2\2\u0082\t\3\2\2\2\u0083\u0084\7\7\2\2\u0084\u0085\5"+
		",\27\2\u0085\u0086\7\6\2\2\u0086\u0087\5,\27\2\u0087\u0090\3\2\2\2\u0088"+
		"\u0089\7\7\2\2\u0089\u008a\5,\27\2\u008a\u008b\7\6\2\2\u008b\u008c\7\b"+
		"\2\2\u008c\u008d\5(\25\2\u008d\u008e\7\b\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u0083\3\2\2\2\u008f\u0088\3\2\2\2\u0090\13\3\2\2\2\u0091\u0092\7\t\2"+
		"\2\u0092\u0093\5,\27\2\u0093\u0094\7\6\2\2\u0094\u0095\5,\27\2\u0095\u009c"+
		"\3\2\2\2\u0096\u0097\7\t\2\2\u0097\u0098\5,\27\2\u0098\u0099\7\6\2\2\u0099"+
		"\u009a\t\2\2\2\u009a\u009c\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0096\3\2"+
		"\2\2\u009c\r\3\2\2\2\u009d\u009e\7\5\2\2\u009e\u00a4\5,\27\2\u009f\u00a0"+
		"\7\7\2\2\u00a0\u00a4\5,\27\2\u00a1\u00a2\7\t\2\2\u00a2\u00a4\5,\27\2\u00a3"+
		"\u009d\3\2\2\2\u00a3\u009f\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\17\3\2\2"+
		"\2\u00a5\u00a6\5,\27\2\u00a6\u00a7\7\6\2\2\u00a7\u00a8\5\60\31\2\u00a8"+
		"\u00b8\3\2\2\2\u00a9\u00aa\5,\27\2\u00aa\u00ab\7\6\2\2\u00ab\u00ac\t\2"+
		"\2\2\u00ac\u00b8\3\2\2\2\u00ad\u00ae\5,\27\2\u00ae\u00af\7\6\2\2\u00af"+
		"\u00b0\7\b\2\2\u00b0\u00b1\5(\25\2\u00b1\u00b2\7\b\2\2\u00b2\u00b8\3\2"+
		"\2\2\u00b3\u00b4\5,\27\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\5\"\22\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00a5\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00ad\3\2"+
		"\2\2\u00b7\u00b3\3\2\2\2\u00b8\21\3\2\2\2\u00b9\u00ba\5,\27\2\u00ba\u00bb"+
		"\7\f\2\2\u00bb\u00bc\5,\27\2\u00bc\u00da\3\2\2\2\u00bd\u00be\5,\27\2\u00be"+
		"\u00bf\7\r\2\2\u00bf\u00c0\5,\27\2\u00c0\u00da\3\2\2\2\u00c1\u00c2\5,"+
		"\27\2\u00c2\u00c3\7\16\2\2\u00c3\u00c4\5,\27\2\u00c4\u00da\3\2\2\2\u00c5"+
		"\u00c6\5,\27\2\u00c6\u00c7\7\17\2\2\u00c7\u00c8\5,\27\2\u00c8\u00da\3"+
		"\2\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb\7\f\2\2\u00cb\u00cc\5\60\31\2\u00cc"+
		"\u00da\3\2\2\2\u00cd\u00ce\5,\27\2\u00ce\u00cf\7\r\2\2\u00cf\u00d0\5\60"+
		"\31\2\u00d0\u00da\3\2\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\7\16\2\2\u00d3"+
		"\u00d4\5\60\31\2\u00d4\u00da\3\2\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7"+
		"\17\2\2\u00d7\u00d8\5\60\31\2\u00d8\u00da\3\2\2\2\u00d9\u00b9\3\2\2\2"+
		"\u00d9\u00bd\3\2\2\2\u00d9\u00c1\3\2\2\2\u00d9\u00c5\3\2\2\2\u00d9\u00c9"+
		"\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da"+
		"\23\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00e6\5,\27\2\u00dd\u00de\5,\27"+
		"\2\u00de\u00df\7\20\2\2\u00df\u00e6\3\2\2\2\u00e0\u00e1\7\21\2\2\u00e1"+
		"\u00e6\5,\27\2\u00e2\u00e3\5,\27\2\u00e3\u00e4\7\21\2\2\u00e4\u00e6\3"+
		"\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e0\3\2\2\2\u00e5"+
		"\u00e2\3\2\2\2\u00e6\25\3\2\2\2\u00e7\u00e8\7\22\2\2\u00e8\u00e9\7\23"+
		"\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00eb\7\24\2\2\u00eb\u00ec\7\25\2\2\u00ec"+
		"\u00ed\7\26\2\2\u00ed\u00ee\5\4\3\2\u00ee\u00ef\7\27\2\2\u00ef\u00fe\3"+
		"\2\2\2\u00f0\u00f1\7\22\2\2\u00f1\u00f2\7\23\2\2\u00f2\u00f3\5\30\r\2"+
		"\u00f3\u00f4\7\24\2\2\u00f4\u00f5\7\25\2\2\u00f5\u00f6\7\26\2\2\u00f6"+
		"\u00f7\5\4\3\2\u00f7\u00f8\7\27\2\2\u00f8\u00f9\7\30\2\2\u00f9\u00fa\7"+
		"\26\2\2\u00fa\u00fb\5\4\3\2\u00fb\u00fc\7\27\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00e7\3\2\2\2\u00fd\u00f0\3\2\2\2\u00fe\27\3\2\2\2\u00ff\u0100\5\"\22"+
		"\2\u0100\u0101\t\3\2\2\u0101\u0102\5\"\22\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0105\t\2\2\2\u0104\u00ff\3\2\2\2\u0104\u0103\3\2\2\2\u0105\31\3\2\2"+
		"\2\u0106\u0107\7\37\2\2\u0107\u0108\7\23\2\2\u0108\u0109\5\30\r\2\u0109"+
		"\u010a\7\24\2\2\u010a\u010b\7\26\2\2\u010b\u010c\5\4\3\2\u010c\u010d\7"+
		"\27\2\2\u010d\33\3\2\2\2\u010e\u010f\7 \2\2\u010f\u0110\7\23\2\2\u0110"+
		"\u0111\5\b\5\2\u0111\u0112\7\4\2\2\u0112\u0113\5\30\r\2\u0113\u0114\7"+
		"\4\2\2\u0114\u0115\5\36\20\2\u0115\u0116\7\24\2\2\u0116\u0117\7\26\2\2"+
		"\u0117\u0118\5\4\3\2\u0118\u0119\7\27\2\2\u0119\35\3\2\2\2\u011a\u011d"+
		"\5\24\13\2\u011b\u011d\5\22\n\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2"+
		"\2\u011d\37\3\2\2\2\u011e\u011f\7 \2\2\u011f\u0120\5,\27\2\u0120\u0121"+
		"\7!\2\2\u0121\u0122\7\"\2\2\u0122\u0123\7\23\2\2\u0123\u0124\5\60\31\2"+
		"\u0124\u0125\7#\2\2\u0125\u0126\5\60\31\2\u0126\u0127\7\24\2\2\u0127\u0128"+
		"\7\26\2\2\u0128\u0129\5\4\3\2\u0129\u012a\7\27\2\2\u012a\u013b\3\2\2\2"+
		"\u012b\u012c\7 \2\2\u012c\u012d\5,\27\2\u012d\u012e\7!\2\2\u012e\u012f"+
		"\7\"\2\2\u012f\u0130\7\23\2\2\u0130\u0131\5\60\31\2\u0131\u0132\7#\2\2"+
		"\u0132\u0133\5\60\31\2\u0133\u0134\7#\2\2\u0134\u0135\5\60\31\2\u0135"+
		"\u0136\7\24\2\2\u0136\u0137\7\26\2\2\u0137\u0138\5\4\3\2\u0138\u0139\7"+
		"\27\2\2\u0139\u013b\3\2\2\2\u013a\u011e\3\2\2\2\u013a\u012b\3\2\2\2\u013b"+
		"!\3\2\2\2\u013c\u013d\5$\23\2\u013d\u013e\7$\2\2\u013e\u013f\5\"\22\2"+
		"\u013f\u0146\3\2\2\2\u0140\u0141\5$\23\2\u0141\u0142\7%\2\2\u0142\u0143"+
		"\5\"\22\2\u0143\u0146\3\2\2\2\u0144\u0146\5$\23\2\u0145\u013c\3\2\2\2"+
		"\u0145\u0140\3\2\2\2\u0145\u0144\3\2\2\2\u0146#\3\2\2\2\u0147\u0148\5"+
		"&\24\2\u0148\u0149\7&\2\2\u0149\u014a\5$\23\2\u014a\u0151\3\2\2\2\u014b"+
		"\u014c\5&\24\2\u014c\u014d\7\'\2\2\u014d\u014e\5$\23\2\u014e\u0151\3\2"+
		"\2\2\u014f\u0151\5&\24\2\u0150\u0147\3\2\2\2\u0150\u014b\3\2\2\2\u0150"+
		"\u014f\3\2\2\2\u0151%\3\2\2\2\u0152\u0155\5,\27\2\u0153\u0155\5\60\31"+
		"\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\'\3\2\2\2\u0156\u0158"+
		"\5*\26\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a)\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u0160\5\60\31"+
		"\2\u015d\u0160\5,\27\2\u015e\u0160\5.\30\2\u015f\u015c\3\2\2\2\u015f\u015d"+
		"\3\2\2\2\u015f\u015e\3\2\2\2\u0160+\3\2\2\2\u0161\u0162\7(\2\2\u0162-"+
		"\3\2\2\2\u0163\u0164\7)\2\2\u0164/\3\2\2\2\u0165\u0166\7*\2\2\u0166\61"+
		"\3\2\2\2\24kp\u0081\u008f\u009b\u00a3\u00b7\u00d9\u00e5\u00fd\u0104\u011c"+
		"\u013a\u0145\u0150\u0154\u0159\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
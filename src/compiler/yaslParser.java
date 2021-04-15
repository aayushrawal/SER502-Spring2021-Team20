
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, Digit=56, Id=57, WS=58;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_initialization = 2, RULE_declaration = 3, 
		RULE_integer = 4, RULE_string = 5, RULE_bool = 6, RULE_boolean_value = 7, 
		RULE_assignment = 8, RULE_print = 9, RULE_sentence = 10, RULE_number = 11, 
		RULE_identifier = 12, RULE_special_char = 13, RULE_if_conditional = 14, 
		RULE_condition = 15, RULE_conditional_operator = 16, RULE_unary_operator = 17, 
		RULE_step_size = 18, RULE_ternary_conditional = 19, RULE_while_loop = 20, 
		RULE_for_loop = 21, RULE_range_loop = 22, RULE_expression = 23, RULE_term = 24, 
		RULE_factor = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "initialization", "declaration", "integer", "string", 
			"bool", "boolean_value", "assignment", "print", "sentence", "number", 
			"identifier", "special_char", "if_conditional", "condition", "conditional_operator", 
			"unary_operator", "step_size", "ternary_conditional", "while_loop", "for_loop", 
			"range_loop", "expression", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'break'", "'int'", "'string'", "'bool'", "'='", 
			"'\"'", "'true'", "'false'", "'print'", "'('", "')'", "'-'", "'?'", "'!'", 
			"'@'", "'#'", "'$'", "'%'", "'^'", "'&'", "'*'", "'_'", "'+'", "'{'", 
			"'}'", "'['", "']'", "'|'", "':'", "','", "'<'", "'>'", "'/'", "'`'", 
			"'~'", "'\\'", "'=='", "'<='", "'>='", "'!='", "'++'", "'--'", "'+='", 
			"'-='", "'*='", "'/='", "'if'", "'then'", "'else'", "'while'", "'for'", 
			"'in'", "'range'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "Digit", "Id", "WS"
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Step_sizeContext step_size() {
			return getRuleContext(Step_sizeContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
		}
		public Ternary_conditionalContext ternary_conditional() {
			return getRuleContext(Ternary_conditionalContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				initialization();
				setState(56);
				match(T__1);
				setState(57);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				declaration();
				setState(60);
				match(T__1);
				setState(61);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				assignment();
				setState(64);
				match(T__1);
				setState(65);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				print();
				setState(68);
				match(T__1);
				setState(69);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				step_size();
				setState(72);
				match(T__1);
				setState(73);
				block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				unary_operator();
				setState(76);
				match(T__1);
				setState(77);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(79);
				if_conditional();
				setState(80);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				ternary_conditional();
				setState(83);
				match(T__1);
				setState(84);
				block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(86);
				match(T__2);
				setState(87);
				match(T__1);
				setState(88);
				block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(89);
				for_loop();
				setState(90);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(92);
				while_loop();
				setState(93);
				block();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(95);
				range_loop();
				setState(96);
				block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(98);
				declaration();
				setState(99);
				match(T__1);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(101);
				assignment();
				setState(102);
				match(T__1);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(104);
				print();
				setState(105);
				match(T__1);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(107);
				if_conditional();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(108);
				ternary_conditional();
				setState(109);
				match(T__1);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(111);
				step_size();
				setState(112);
				match(T__1);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(114);
				for_loop();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(115);
				while_loop();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(116);
				range_loop();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(117);
				unary_operator();
				setState(118);
				match(T__1);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(120);
				match(T__2);
				setState(121);
				match(T__1);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(122);
				initialization();
				setState(123);
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
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				integer();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				string();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
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

	public static class DeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(T__3);
				setState(133);
				identifier();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__4);
				setState(135);
				identifier();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(T__5);
				setState(137);
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

	public static class IntegerContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_integer);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__3);
				setState(141);
				identifier();
				setState(142);
				match(T__6);
				setState(143);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__3);
				setState(146);
				identifier();
				setState(147);
				match(T__6);
				setState(148);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(T__3);
				setState(151);
				identifier();
				setState(152);
				match(T__6);
				setState(153);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_string);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__4);
				setState(158);
				identifier();
				setState(159);
				match(T__6);
				setState(160);
				match(T__7);
				setState(161);
				sentence();
				setState(162);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__4);
				setState(165);
				identifier();
				setState(166);
				match(T__6);
				setState(167);
				identifier();
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bool);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__5);
				setState(172);
				identifier();
				setState(173);
				match(T__6);
				setState(174);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(T__5);
				setState(177);
				identifier();
				setState(178);
				match(T__6);
				setState(179);
				boolean_value();
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

	public static class Boolean_valueContext extends ParserRuleContext {
		public Boolean_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterBoolean_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitBoolean_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitBoolean_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_valueContext boolean_value() throws RecognitionException {
		Boolean_valueContext _localctx = new Boolean_valueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolean_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__9) ) {
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				identifier();
				setState(186);
				match(T__6);
				setState(187);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				identifier();
				setState(190);
				match(T__6);
				setState(191);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				identifier();
				setState(194);
				match(T__6);
				setState(195);
				match(T__7);
				setState(196);
				sentence();
				setState(197);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				identifier();
				setState(200);
				match(T__6);
				setState(201);
				boolean_value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				identifier();
				setState(204);
				match(T__6);
				setState(205);
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

	public static class PrintContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_print);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(T__10);
				setState(210);
				match(T__11);
				setState(211);
				match(T__7);
				setState(212);
				sentence();
				setState(213);
				match(T__7);
				setState(214);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(T__10);
				setState(217);
				match(T__11);
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(218);
					identifier();
					}
					break;
				case 2:
					{
					setState(219);
					number();
					}
					break;
				case 3:
					{
					setState(220);
					boolean_value();
					}
					break;
				case 4:
					{
					setState(221);
					expression();
					}
					break;
				}
				setState(224);
				match(T__12);
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

	public static class SentenceContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<Special_charContext> special_char() {
			return getRuleContexts(Special_charContext.class);
		}
		public Special_charContext special_char(int i) {
			return getRuleContext(Special_charContext.class,i);
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
		enterRule(_localctx, 20, RULE_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << Digit) | (1L << Id))) != 0)) {
				{
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(228);
					number();
					}
					break;
				case 2:
					{
					setState(229);
					identifier();
					}
					break;
				case 3:
					{
					setState(230);
					special_char();
					}
					break;
				}
				}
				setState(235);
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
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(236);
				match(T__13);
				}
			}

			setState(239);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(yaslParser.Id, 0); }
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
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(Id);
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
		enterRule(_localctx, 26, RULE_special_char);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__6) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47))) != 0)) ) {
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

	public static class If_conditionalContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public If_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterIf_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitIf_conditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitIf_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionalContext if_conditional() throws RecognitionException {
		If_conditionalContext _localctx = new If_conditionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_conditional);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				match(T__48);
				setState(246);
				match(T__11);
				setState(247);
				condition();
				setState(248);
				match(T__12);
				setState(249);
				match(T__49);
				setState(250);
				match(T__25);
				setState(251);
				block();
				setState(252);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				match(T__48);
				setState(255);
				match(T__11);
				setState(256);
				condition();
				setState(257);
				match(T__12);
				setState(258);
				match(T__49);
				setState(259);
				match(T__25);
				setState(260);
				block();
				setState(261);
				match(T__26);
				setState(262);
				match(T__50);
				setState(263);
				match(T__25);
				setState(264);
				block();
				setState(265);
				match(T__26);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public Boolean_valueContext boolean_value() {
			return getRuleContext(Boolean_valueContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case Digit:
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				expression();
				setState(270);
				conditional_operator();
				setState(271);
				expression();
				}
				break;
			case T__8:
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				boolean_value();
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

	public static class Conditional_operatorContext extends ParserRuleContext {
		public Conditional_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterConditional_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitConditional_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitConditional_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_operatorContext conditional_operator() throws RecognitionException {
		Conditional_operatorContext _localctx = new Conditional_operatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_unary_operator);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__42);
				setState(279);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				identifier();
				setState(281);
				match(T__42);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(T__43);
				setState(284);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(285);
				identifier();
				setState(286);
				match(T__43);
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Step_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_step_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterStep_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitStep_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitStep_size(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Step_sizeContext step_size() throws RecognitionException {
		Step_sizeContext _localctx = new Step_sizeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_step_size);
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				identifier();
				setState(291);
				match(T__44);
				setState(292);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				identifier();
				setState(295);
				match(T__45);
				setState(296);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				identifier();
				setState(299);
				match(T__46);
				setState(300);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				identifier();
				setState(303);
				match(T__47);
				setState(304);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(306);
				identifier();
				setState(307);
				match(T__44);
				setState(308);
				number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(310);
				identifier();
				setState(311);
				match(T__45);
				setState(312);
				number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(314);
				identifier();
				setState(315);
				match(T__46);
				setState(316);
				number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(318);
				identifier();
				setState(319);
				match(T__47);
				setState(320);
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

	public static class Ternary_conditionalContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Conditional_operatorContext conditional_operator() {
			return getRuleContext(Conditional_operatorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public List<Boolean_valueContext> boolean_value() {
			return getRuleContexts(Boolean_valueContext.class);
		}
		public Boolean_valueContext boolean_value(int i) {
			return getRuleContext(Boolean_valueContext.class,i);
		}
		public List<Ternary_conditionalContext> ternary_conditional() {
			return getRuleContexts(Ternary_conditionalContext.class);
		}
		public Ternary_conditionalContext ternary_conditional(int i) {
			return getRuleContext(Ternary_conditionalContext.class,i);
		}
		public Ternary_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterTernary_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitTernary_conditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitTernary_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ternary_conditionalContext ternary_conditional() throws RecognitionException {
		Ternary_conditionalContext _localctx = new Ternary_conditionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ternary_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				{
				setState(324);
				identifier();
				}
				break;
			case T__3:
			case T__4:
			case T__5:
				{
				setState(325);
				declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(328);
			match(T__6);
			setState(329);
			expression();
			setState(330);
			conditional_operator();
			setState(331);
			expression();
			setState(332);
			match(T__14);
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(333);
				expression();
				}
				break;
			case 2:
				{
				setState(334);
				match(T__7);
				setState(335);
				sentence();
				setState(336);
				match(T__7);
				}
				break;
			case 3:
				{
				setState(338);
				boolean_value();
				}
				break;
			case 4:
				{
				setState(339);
				ternary_conditional();
				}
				break;
			}
			setState(342);
			match(T__30);
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(343);
				expression();
				}
				break;
			case 2:
				{
				setState(344);
				match(T__7);
				setState(345);
				sentence();
				setState(346);
				match(T__7);
				}
				break;
			case 3:
				{
				setState(348);
				boolean_value();
				}
				break;
			case 4:
				{
				setState(349);
				ternary_conditional();
				}
				break;
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
		enterRule(_localctx, 40, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__51);
			setState(353);
			match(T__11);
			setState(354);
			condition();
			setState(355);
			match(T__12);
			setState(356);
			match(T__25);
			setState(357);
			block();
			setState(358);
			match(T__26);
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Step_sizeContext step_size() {
			return getRuleContext(Step_sizeContext.class,0);
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
		enterRule(_localctx, 42, RULE_for_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__52);
			setState(361);
			match(T__11);
			setState(362);
			integer();
			setState(363);
			match(T__1);
			setState(364);
			condition();
			setState(365);
			match(T__1);
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(366);
				unary_operator();
				}
				break;
			case 2:
				{
				setState(367);
				step_size();
				}
				break;
			}
			setState(370);
			match(T__12);
			setState(371);
			match(T__25);
			setState(372);
			block();
			setState(373);
			match(T__26);
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
		public Range_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterRange_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitRange_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitRange_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_loopContext range_loop() throws RecognitionException {
		Range_loopContext _localctx = new Range_loopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_range_loop);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(T__52);
				setState(376);
				identifier();
				setState(377);
				match(T__53);
				setState(378);
				match(T__54);
				setState(379);
				match(T__11);
				setState(380);
				number();
				setState(381);
				match(T__31);
				setState(382);
				number();
				setState(383);
				match(T__12);
				setState(384);
				match(T__25);
				setState(385);
				block();
				setState(386);
				match(T__26);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(T__52);
				setState(389);
				identifier();
				setState(390);
				match(T__53);
				setState(391);
				match(T__54);
				setState(392);
				match(T__11);
				setState(393);
				number();
				setState(394);
				match(T__31);
				setState(395);
				number();
				setState(396);
				match(T__31);
				setState(397);
				number();
				setState(398);
				match(T__12);
				setState(399);
				match(T__25);
				setState(400);
				block();
				setState(401);
				match(T__26);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				term();
				setState(406);
				match(T__24);
				setState(407);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				term();
				setState(410);
				match(T__13);
				setState(411);
				expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(413);
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
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(416);
				factor();
				setState(417);
				match(T__22);
				setState(418);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				factor();
				setState(421);
				match(T__34);
				setState(422);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Id:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				identifier();
				}
				break;
			case T__13:
			case Digit:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3<\u01b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0080\n\3\3\4\3\4\3\4\5\4\u0085\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ac\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\b\u00b8\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d2\n\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00e1\n\13"+
		"\3\13\3\13\5\13\u00e5\n\13\3\f\3\f\3\f\7\f\u00ea\n\f\f\f\16\f\u00ed\13"+
		"\f\3\r\5\r\u00f0\n\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\5\20\u010e\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u0115"+
		"\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0123\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0145\n\24\3\25\3\25\5\25\u0149\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0157"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0161\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0173\n\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0196\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u01a1\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\5\32\u01ac\n\32\3\33\3\33\5\33\u01b0\n\33\3\33\2"+
		"\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\5\3\2"+
		"\13\f\5\2\3\4\t\t\16\62\4\2#$),\2\u01dc\2\66\3\2\2\2\4\177\3\2\2\2\6\u0084"+
		"\3\2\2\2\b\u008c\3\2\2\2\n\u009d\3\2\2\2\f\u00ab\3\2\2\2\16\u00b7\3\2"+
		"\2\2\20\u00b9\3\2\2\2\22\u00d1\3\2\2\2\24\u00e4\3\2\2\2\26\u00eb\3\2\2"+
		"\2\30\u00ef\3\2\2\2\32\u00f3\3\2\2\2\34\u00f5\3\2\2\2\36\u010d\3\2\2\2"+
		" \u0114\3\2\2\2\"\u0116\3\2\2\2$\u0122\3\2\2\2&\u0144\3\2\2\2(\u0148\3"+
		"\2\2\2*\u0162\3\2\2\2,\u016a\3\2\2\2.\u0195\3\2\2\2\60\u01a0\3\2\2\2\62"+
		"\u01ab\3\2\2\2\64\u01af\3\2\2\2\66\67\5\4\3\2\678\7\3\2\28\3\3\2\2\29"+
		":\5\6\4\2:;\7\4\2\2;<\5\4\3\2<\u0080\3\2\2\2=>\5\b\5\2>?\7\4\2\2?@\5\4"+
		"\3\2@\u0080\3\2\2\2AB\5\22\n\2BC\7\4\2\2CD\5\4\3\2D\u0080\3\2\2\2EF\5"+
		"\24\13\2FG\7\4\2\2GH\5\4\3\2H\u0080\3\2\2\2IJ\5&\24\2JK\7\4\2\2KL\5\4"+
		"\3\2L\u0080\3\2\2\2MN\5$\23\2NO\7\4\2\2OP\5\4\3\2P\u0080\3\2\2\2QR\5\36"+
		"\20\2RS\5\4\3\2S\u0080\3\2\2\2TU\5(\25\2UV\7\4\2\2VW\5\4\3\2W\u0080\3"+
		"\2\2\2XY\7\5\2\2YZ\7\4\2\2Z\u0080\5\4\3\2[\\\5,\27\2\\]\5\4\3\2]\u0080"+
		"\3\2\2\2^_\5*\26\2_`\5\4\3\2`\u0080\3\2\2\2ab\5.\30\2bc\5\4\3\2c\u0080"+
		"\3\2\2\2de\5\b\5\2ef\7\4\2\2f\u0080\3\2\2\2gh\5\22\n\2hi\7\4\2\2i\u0080"+
		"\3\2\2\2jk\5\24\13\2kl\7\4\2\2l\u0080\3\2\2\2m\u0080\5\36\20\2no\5(\25"+
		"\2op\7\4\2\2p\u0080\3\2\2\2qr\5&\24\2rs\7\4\2\2s\u0080\3\2\2\2t\u0080"+
		"\5,\27\2u\u0080\5*\26\2v\u0080\5.\30\2wx\5$\23\2xy\7\4\2\2y\u0080\3\2"+
		"\2\2z{\7\5\2\2{\u0080\7\4\2\2|}\5\6\4\2}~\7\4\2\2~\u0080\3\2\2\2\1779"+
		"\3\2\2\2\177=\3\2\2\2\177A\3\2\2\2\177E\3\2\2\2\177I\3\2\2\2\177M\3\2"+
		"\2\2\177Q\3\2\2\2\177T\3\2\2\2\177X\3\2\2\2\177[\3\2\2\2\177^\3\2\2\2"+
		"\177a\3\2\2\2\177d\3\2\2\2\177g\3\2\2\2\177j\3\2\2\2\177m\3\2\2\2\177"+
		"n\3\2\2\2\177q\3\2\2\2\177t\3\2\2\2\177u\3\2\2\2\177v\3\2\2\2\177w\3\2"+
		"\2\2\177z\3\2\2\2\177|\3\2\2\2\u0080\5\3\2\2\2\u0081\u0085\5\n\6\2\u0082"+
		"\u0085\5\f\7\2\u0083\u0085\5\16\b\2\u0084\u0081\3\2\2\2\u0084\u0082\3"+
		"\2\2\2\u0084\u0083\3\2\2\2\u0085\7\3\2\2\2\u0086\u0087\7\6\2\2\u0087\u008d"+
		"\5\32\16\2\u0088\u0089\7\7\2\2\u0089\u008d\5\32\16\2\u008a\u008b\7\b\2"+
		"\2\u008b\u008d\5\32\16\2\u008c\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\t\3\2\2\2\u008e\u008f\7\6\2\2\u008f\u0090\5\32\16"+
		"\2\u0090\u0091\7\t\2\2\u0091\u0092\5\30\r\2\u0092\u009e\3\2\2\2\u0093"+
		"\u0094\7\6\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7\t\2\2\u0096\u0097\5"+
		"\32\16\2\u0097\u009e\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009a\5\32\16\2"+
		"\u009a\u009b\7\t\2\2\u009b\u009c\5\60\31\2\u009c\u009e\3\2\2\2\u009d\u008e"+
		"\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0098\3\2\2\2\u009e\13\3\2\2\2\u009f"+
		"\u00a0\7\7\2\2\u00a0\u00a1\5\32\16\2\u00a1\u00a2\7\t\2\2\u00a2\u00a3\7"+
		"\n\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\n\2\2\u00a5\u00ac\3\2\2\2\u00a6"+
		"\u00a7\7\7\2\2\u00a7\u00a8\5\32\16\2\u00a8\u00a9\7\t\2\2\u00a9\u00aa\5"+
		"\32\16\2\u00aa\u00ac\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a6\3\2\2\2\u00ac"+
		"\r\3\2\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00af\5\32\16\2\u00af\u00b0\7\t\2"+
		"\2\u00b0\u00b1\5\32\16\2\u00b1\u00b8\3\2\2\2\u00b2\u00b3\7\b\2\2\u00b3"+
		"\u00b4\5\32\16\2\u00b4\u00b5\7\t\2\2\u00b5\u00b6\5\20\t\2\u00b6\u00b8"+
		"\3\2\2\2\u00b7\u00ad\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\17\3\2\2\2\u00b9"+
		"\u00ba\t\2\2\2\u00ba\21\3\2\2\2\u00bb\u00bc\5\32\16\2\u00bc\u00bd\7\t"+
		"\2\2\u00bd\u00be\5\60\31\2\u00be\u00d2\3\2\2\2\u00bf\u00c0\5\32\16\2\u00c0"+
		"\u00c1\7\t\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00d2\3\2\2\2\u00c3\u00c4\5"+
		"\32\16\2\u00c4\u00c5\7\t\2\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7\5\26\f\2"+
		"\u00c7\u00c8\7\n\2\2\u00c8\u00d2\3\2\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb"+
		"\7\t\2\2\u00cb\u00cc\5\20\t\2\u00cc\u00d2\3\2\2\2\u00cd\u00ce\5\32\16"+
		"\2\u00ce\u00cf\7\t\2\2\u00cf\u00d0\5\30\r\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00bb\3\2\2\2\u00d1\u00bf\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00c9\3\2"+
		"\2\2\u00d1\u00cd\3\2\2\2\u00d2\23\3\2\2\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5"+
		"\7\16\2\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\5\26\f\2\u00d7\u00d8\7\n\2\2"+
		"\u00d8\u00d9\7\17\2\2\u00d9\u00e5\3\2\2\2\u00da\u00db\7\r\2\2\u00db\u00e0"+
		"\7\16\2\2\u00dc\u00e1\5\32\16\2\u00dd\u00e1\5\30\r\2\u00de\u00e1\5\20"+
		"\t\2\u00df\u00e1\5\60\31\2\u00e0\u00dc\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\17"+
		"\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00d3\3\2\2\2\u00e4\u00da\3\2\2\2\u00e5"+
		"\25\3\2\2\2\u00e6\u00ea\5\30\r\2\u00e7\u00ea\5\32\16\2\u00e8\u00ea\5\34"+
		"\17\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\27\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\7\20\2\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7:\2\2\u00f2\31\3\2\2\2"+
		"\u00f3\u00f4\7;\2\2\u00f4\33\3\2\2\2\u00f5\u00f6\t\3\2\2\u00f6\35\3\2"+
		"\2\2\u00f7\u00f8\7\63\2\2\u00f8\u00f9\7\16\2\2\u00f9\u00fa\5 \21\2\u00fa"+
		"\u00fb\7\17\2\2\u00fb\u00fc\7\64\2\2\u00fc\u00fd\7\34\2\2\u00fd\u00fe"+
		"\5\4\3\2\u00fe\u00ff\7\35\2\2\u00ff\u010e\3\2\2\2\u0100\u0101\7\63\2\2"+
		"\u0101\u0102\7\16\2\2\u0102\u0103\5 \21\2\u0103\u0104\7\17\2\2\u0104\u0105"+
		"\7\64\2\2\u0105\u0106\7\34\2\2\u0106\u0107\5\4\3\2\u0107\u0108\7\35\2"+
		"\2\u0108\u0109\7\65\2\2\u0109\u010a\7\34\2\2\u010a\u010b\5\4\3\2\u010b"+
		"\u010c\7\35\2\2\u010c\u010e\3\2\2\2\u010d\u00f7\3\2\2\2\u010d\u0100\3"+
		"\2\2\2\u010e\37\3\2\2\2\u010f\u0110\5\60\31\2\u0110\u0111\5\"\22\2\u0111"+
		"\u0112\5\60\31\2\u0112\u0115\3\2\2\2\u0113\u0115\5\20\t\2\u0114\u010f"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115!\3\2\2\2\u0116\u0117\t\4\2\2\u0117"+
		"#\3\2\2\2\u0118\u0119\7-\2\2\u0119\u0123\5\32\16\2\u011a\u011b\5\32\16"+
		"\2\u011b\u011c\7-\2\2\u011c\u0123\3\2\2\2\u011d\u011e\7.\2\2\u011e\u0123"+
		"\5\32\16\2\u011f\u0120\5\32\16\2\u0120\u0121\7.\2\2\u0121\u0123\3\2\2"+
		"\2\u0122\u0118\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u011f"+
		"\3\2\2\2\u0123%\3\2\2\2\u0124\u0125\5\32\16\2\u0125\u0126\7/\2\2\u0126"+
		"\u0127\5\32\16\2\u0127\u0145\3\2\2\2\u0128\u0129\5\32\16\2\u0129\u012a"+
		"\7\60\2\2\u012a\u012b\5\32\16\2\u012b\u0145\3\2\2\2\u012c\u012d\5\32\16"+
		"\2\u012d\u012e\7\61\2\2\u012e\u012f\5\32\16\2\u012f\u0145\3\2\2\2\u0130"+
		"\u0131\5\32\16\2\u0131\u0132\7\62\2\2\u0132\u0133\5\32\16\2\u0133\u0145"+
		"\3\2\2\2\u0134\u0135\5\32\16\2\u0135\u0136\7/\2\2\u0136\u0137\5\30\r\2"+
		"\u0137\u0145\3\2\2\2\u0138\u0139\5\32\16\2\u0139\u013a\7\60\2\2\u013a"+
		"\u013b\5\30\r\2\u013b\u0145\3\2\2\2\u013c\u013d\5\32\16\2\u013d\u013e"+
		"\7\61\2\2\u013e\u013f\5\30\r\2\u013f\u0145\3\2\2\2\u0140\u0141\5\32\16"+
		"\2\u0141\u0142\7\62\2\2\u0142\u0143\5\30\r\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0124\3\2\2\2\u0144\u0128\3\2\2\2\u0144\u012c\3\2\2\2\u0144\u0130\3\2"+
		"\2\2\u0144\u0134\3\2\2\2\u0144\u0138\3\2\2\2\u0144\u013c\3\2\2\2\u0144"+
		"\u0140\3\2\2\2\u0145\'\3\2\2\2\u0146\u0149\5\32\16\2\u0147\u0149\5\b\5"+
		"\2\u0148\u0146\3\2\2\2\u0148\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\7\t\2\2\u014b\u014c\5\60\31\2\u014c\u014d\5\"\22\2\u014d\u014e\5\60\31"+
		"\2\u014e\u0156\7\21\2\2\u014f\u0157\5\60\31\2\u0150\u0151\7\n\2\2\u0151"+
		"\u0152\5\26\f\2\u0152\u0153\7\n\2\2\u0153\u0157\3\2\2\2\u0154\u0157\5"+
		"\20\t\2\u0155\u0157\5(\25\2\u0156\u014f\3\2\2\2\u0156\u0150\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0160\7!"+
		"\2\2\u0159\u0161\5\60\31\2\u015a\u015b\7\n\2\2\u015b\u015c\5\26\f\2\u015c"+
		"\u015d\7\n\2\2\u015d\u0161\3\2\2\2\u015e\u0161\5\20\t\2\u015f\u0161\5"+
		"(\25\2\u0160\u0159\3\2\2\2\u0160\u015a\3\2\2\2\u0160\u015e\3\2\2\2\u0160"+
		"\u015f\3\2\2\2\u0161)\3\2\2\2\u0162\u0163\7\66\2\2\u0163\u0164\7\16\2"+
		"\2\u0164\u0165\5 \21\2\u0165\u0166\7\17\2\2\u0166\u0167\7\34\2\2\u0167"+
		"\u0168\5\4\3\2\u0168\u0169\7\35\2\2\u0169+\3\2\2\2\u016a\u016b\7\67\2"+
		"\2\u016b\u016c\7\16\2\2\u016c\u016d\5\n\6\2\u016d\u016e\7\4\2\2\u016e"+
		"\u016f\5 \21\2\u016f\u0172\7\4\2\2\u0170\u0173\5$\23\2\u0171\u0173\5&"+
		"\24\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174"+
		"\u0175\7\17\2\2\u0175\u0176\7\34\2\2\u0176\u0177\5\4\3\2\u0177\u0178\7"+
		"\35\2\2\u0178-\3\2\2\2\u0179\u017a\7\67\2\2\u017a\u017b\5\32\16\2\u017b"+
		"\u017c\78\2\2\u017c\u017d\79\2\2\u017d\u017e\7\16\2\2\u017e\u017f\5\30"+
		"\r\2\u017f\u0180\7\"\2\2\u0180\u0181\5\30\r\2\u0181\u0182\7\17\2\2\u0182"+
		"\u0183\7\34\2\2\u0183\u0184\5\4\3\2\u0184\u0185\7\35\2\2\u0185\u0196\3"+
		"\2\2\2\u0186\u0187\7\67\2\2\u0187\u0188\5\32\16\2\u0188\u0189\78\2\2\u0189"+
		"\u018a\79\2\2\u018a\u018b\7\16\2\2\u018b\u018c\5\30\r\2\u018c\u018d\7"+
		"\"\2\2\u018d\u018e\5\30\r\2\u018e\u018f\7\"\2\2\u018f\u0190\5\30\r\2\u0190"+
		"\u0191\7\17\2\2\u0191\u0192\7\34\2\2\u0192\u0193\5\4\3\2\u0193\u0194\7"+
		"\35\2\2\u0194\u0196\3\2\2\2\u0195\u0179\3\2\2\2\u0195\u0186\3\2\2\2\u0196"+
		"/\3\2\2\2\u0197\u0198\5\62\32\2\u0198\u0199\7\33\2\2\u0199\u019a\5\60"+
		"\31\2\u019a\u01a1\3\2\2\2\u019b\u019c\5\62\32\2\u019c\u019d\7\20\2\2\u019d"+
		"\u019e\5\60\31\2\u019e\u01a1\3\2\2\2\u019f\u01a1\5\62\32\2\u01a0\u0197"+
		"\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0\u019f\3\2\2\2\u01a1\61\3\2\2\2\u01a2"+
		"\u01a3\5\64\33\2\u01a3\u01a4\7\31\2\2\u01a4\u01a5\5\62\32\2\u01a5\u01ac"+
		"\3\2\2\2\u01a6\u01a7\5\64\33\2\u01a7\u01a8\7%\2\2\u01a8\u01a9\5\62\32"+
		"\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\5\64\33\2\u01ab\u01a2\3\2\2\2\u01ab"+
		"\u01a6\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\63\3\2\2\2\u01ad\u01b0\5\32\16"+
		"\2\u01ae\u01b0\5\30\r\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2\u01b0"+
		"\65\3\2\2\2\32\177\u0084\u008c\u009d\u00ab\u00b7\u00d1\u00e0\u00e4\u00e9"+
		"\u00eb\u00ef\u010d\u0114\u0122\u0144\u0148\u0156\u0160\u0172\u0195\u01a0"+
		"\u01ab\u01af";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
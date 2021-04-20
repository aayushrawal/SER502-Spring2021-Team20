// Generated from /home/emina/java-projects/yasl/data/yasl.g4 by ANTLR 4.9.1
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
		T__24=25, ID=26, Digit=27, WS=28;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_initialization = 2, RULE_integer = 3, 
		RULE_string = 4, RULE_bool = 5, RULE_declaration = 6, RULE_if_conditional = 7, 
		RULE_condition = 8, RULE_expression = 9, RULE_term = 10, RULE_factor = 11, 
		RULE_identifier = 12, RULE_number = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "initialization", "integer", "string", "bool", "declaration", 
			"if_conditional", "condition", "expression", "term", "factor", "identifier", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "';'", "'int'", "'='", "'string'", "'bool'", "'true'", "'false'", 
			"'if'", "'('", "')'", "'then'", "'{'", "'}'", "'else'", "'=='", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "Digit", "WS"
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
			setState(28);
			block();
			setState(29);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public If_conditionalContext if_conditional() {
			return getRuleContext(If_conditionalContext.class,0);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				initialization();
				setState(32);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				initialization();
				setState(35);
				match(T__1);
				setState(36);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				declaration();
				setState(39);
				match(T__1);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				declaration();
				setState(42);
				match(T__1);
				setState(43);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				condition();
				setState(46);
				match(T__1);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				condition();
				setState(49);
				match(T__1);
				setState(50);
				block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(52);
				if_conditional();
				setState(53);
				match(T__1);
				setState(54);
				block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				if_conditional();
				setState(57);
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				integer();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				string();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IntNumInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__2);
				setState(67);
				identifier();
				setState(68);
				match(T__3);
				setState(69);
				number();
				}
				break;
			case 2:
				_localctx = new IntIdInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__2);
				setState(72);
				identifier();
				setState(73);
				match(T__3);
				setState(74);
				identifier();
				}
				break;
			case 3:
				_localctx = new IntExprInitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__2);
				setState(77);
				identifier();
				setState(78);
				match(T__3);
				setState(79);
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
	public static class StrNumInitContext extends StringContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public StrNumInitContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).enterStrNumInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof yaslListener ) ((yaslListener)listener).exitStrNumInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof yaslVisitor ) return ((yaslVisitor<? extends T>)visitor).visitStrNumInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_string);
		try {
			_localctx = new StrNumInitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__4);
			setState(84);
			identifier();
			setState(85);
			match(T__3);
			setState(86);
			identifier();
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new BoolIdInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__5);
				setState(89);
				identifier();
				setState(90);
				match(T__3);
				setState(91);
				identifier();
				}
				break;
			case 2:
				_localctx = new BoolBInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__5);
				setState(94);
				identifier();
				setState(95);
				match(T__3);
				setState(96);
				((BoolBInitContext)_localctx).bop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IntDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(T__2);
				setState(101);
				identifier();
				}
				break;
			case T__4:
				_localctx = new StrDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__4);
				setState(103);
				identifier();
				}
				break;
			case T__5:
				_localctx = new BoolDeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__5);
				setState(105);
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
		enterRule(_localctx, 14, RULE_if_conditional);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__8);
				setState(109);
				match(T__9);
				setState(110);
				condition();
				setState(111);
				match(T__10);
				setState(112);
				match(T__11);
				setState(113);
				match(T__12);
				setState(114);
				block();
				setState(115);
				match(T__13);
				}
				break;
			case 2:
				_localctx = new IfElseConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__8);
				setState(118);
				match(T__9);
				setState(119);
				condition();
				setState(120);
				match(T__10);
				setState(121);
				match(T__11);
				setState(122);
				match(T__12);
				setState(123);
				block();
				setState(124);
				match(T__13);
				setState(125);
				match(T__14);
				setState(126);
				match(T__12);
				setState(127);
				block();
				setState(128);
				match(T__13);
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
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case Digit:
				_localctx = new ConditionOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				expression();
				setState(133);
				((ConditionOpContext)_localctx).conditional_operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
					((ConditionOpContext)_localctx).conditional_operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(134);
				expression();
				}
				break;
			case T__6:
			case T__7:
				_localctx = new ConditionBoolOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((ConditionBoolOpContext)_localctx).boolean_value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
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
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AdditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				term();
				setState(140);
				match(T__21);
				setState(141);
				expression();
				}
				break;
			case 2:
				_localctx = new SubtractionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				term();
				setState(144);
				match(T__22);
				setState(145);
				expression();
				}
				break;
			case 3:
				_localctx = new ExpPrecedenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
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
		enterRule(_localctx, 20, RULE_term);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new MultiplicationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				factor();
				setState(151);
				match(T__23);
				setState(152);
				term();
				}
				break;
			case 2:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				factor();
				setState(155);
				match(T__24);
				setState(156);
				term();
				}
				break;
			case 3:
				_localctx = new FactContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
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
		enterRule(_localctx, 22, RULE_factor);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new IdexpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				identifier();
				}
				break;
			case Digit:
				_localctx = new NumberexpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
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
		enterRule(_localctx, 24, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 26, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00ac\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3>\n\3\3\4\3\4\3\4\5\4C\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5T\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7e\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bm\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0085\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0097"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\r\3\r\5\r\u00a6"+
		"\n\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\4\3\2\t\n\3\2\22\27\2\u00b2\2\36\3\2\2\2\4=\3\2\2\2\6B\3\2\2\2\b"+
		"S\3\2\2\2\nU\3\2\2\2\fd\3\2\2\2\16l\3\2\2\2\20\u0084\3\2\2\2\22\u008b"+
		"\3\2\2\2\24\u0096\3\2\2\2\26\u00a1\3\2\2\2\30\u00a5\3\2\2\2\32\u00a7\3"+
		"\2\2\2\34\u00a9\3\2\2\2\36\37\5\4\3\2\37 \7\3\2\2 \3\3\2\2\2!\"\5\6\4"+
		"\2\"#\7\4\2\2#>\3\2\2\2$%\5\6\4\2%&\7\4\2\2&\'\5\4\3\2\'>\3\2\2\2()\5"+
		"\16\b\2)*\7\4\2\2*>\3\2\2\2+,\5\16\b\2,-\7\4\2\2-.\5\4\3\2.>\3\2\2\2/"+
		"\60\5\22\n\2\60\61\7\4\2\2\61>\3\2\2\2\62\63\5\22\n\2\63\64\7\4\2\2\64"+
		"\65\5\4\3\2\65>\3\2\2\2\66\67\5\20\t\2\678\7\4\2\289\5\4\3\29>\3\2\2\2"+
		":;\5\20\t\2;<\7\4\2\2<>\3\2\2\2=!\3\2\2\2=$\3\2\2\2=(\3\2\2\2=+\3\2\2"+
		"\2=/\3\2\2\2=\62\3\2\2\2=\66\3\2\2\2=:\3\2\2\2>\5\3\2\2\2?C\5\b\5\2@C"+
		"\5\n\6\2AC\5\f\7\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\7\3\2\2\2DE\7\5\2\2"+
		"EF\5\32\16\2FG\7\6\2\2GH\5\34\17\2HT\3\2\2\2IJ\7\5\2\2JK\5\32\16\2KL\7"+
		"\6\2\2LM\5\32\16\2MT\3\2\2\2NO\7\5\2\2OP\5\32\16\2PQ\7\6\2\2QR\5\24\13"+
		"\2RT\3\2\2\2SD\3\2\2\2SI\3\2\2\2SN\3\2\2\2T\t\3\2\2\2UV\7\7\2\2VW\5\32"+
		"\16\2WX\7\6\2\2XY\5\32\16\2Y\13\3\2\2\2Z[\7\b\2\2[\\\5\32\16\2\\]\7\6"+
		"\2\2]^\5\32\16\2^e\3\2\2\2_`\7\b\2\2`a\5\32\16\2ab\7\6\2\2bc\t\2\2\2c"+
		"e\3\2\2\2dZ\3\2\2\2d_\3\2\2\2e\r\3\2\2\2fg\7\5\2\2gm\5\32\16\2hi\7\7\2"+
		"\2im\5\32\16\2jk\7\b\2\2km\5\32\16\2lf\3\2\2\2lh\3\2\2\2lj\3\2\2\2m\17"+
		"\3\2\2\2no\7\13\2\2op\7\f\2\2pq\5\22\n\2qr\7\r\2\2rs\7\16\2\2st\7\17\2"+
		"\2tu\5\4\3\2uv\7\20\2\2v\u0085\3\2\2\2wx\7\13\2\2xy\7\f\2\2yz\5\22\n\2"+
		"z{\7\r\2\2{|\7\16\2\2|}\7\17\2\2}~\5\4\3\2~\177\7\20\2\2\177\u0080\7\21"+
		"\2\2\u0080\u0081\7\17\2\2\u0081\u0082\5\4\3\2\u0082\u0083\7\20\2\2\u0083"+
		"\u0085\3\2\2\2\u0084n\3\2\2\2\u0084w\3\2\2\2\u0085\21\3\2\2\2\u0086\u0087"+
		"\5\24\13\2\u0087\u0088\t\3\2\2\u0088\u0089\5\24\13\2\u0089\u008c\3\2\2"+
		"\2\u008a\u008c\t\2\2\2\u008b\u0086\3\2\2\2\u008b\u008a\3\2\2\2\u008c\23"+
		"\3\2\2\2\u008d\u008e\5\26\f\2\u008e\u008f\7\30\2\2\u008f\u0090\5\24\13"+
		"\2\u0090\u0097\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\7\31\2\2\u0093"+
		"\u0094\5\24\13\2\u0094\u0097\3\2\2\2\u0095\u0097\5\26\f\2\u0096\u008d"+
		"\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0095\3\2\2\2\u0097\25\3\2\2\2\u0098"+
		"\u0099\5\30\r\2\u0099\u009a\7\32\2\2\u009a\u009b\5\26\f\2\u009b\u00a2"+
		"\3\2\2\2\u009c\u009d\5\30\r\2\u009d\u009e\7\33\2\2\u009e\u009f\5\26\f"+
		"\2\u009f\u00a2\3\2\2\2\u00a0\u00a2\5\30\r\2\u00a1\u0098\3\2\2\2\u00a1"+
		"\u009c\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a6\5\32\16"+
		"\2\u00a4\u00a6\5\34\17\2\u00a5\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6"+
		"\31\3\2\2\2\u00a7\u00a8\7\34\2\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\35\2\2"+
		"\u00aa\35\3\2\2\2\f=BSdl\u0084\u008b\u0096\u00a1\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
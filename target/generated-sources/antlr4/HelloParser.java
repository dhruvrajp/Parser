// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, WS=20, BOOLEAN=21, INTEGER=22, IDENT=23, COMMENT=24, 
		ADD=25, MULT=26, SUBT=27, DIV=28, OR=29, AND=30, LTEQ=31, NE=32, EQ=33, 
		LT=34, GT=35, MOD=36, GTEQ=37, NOT=38, ASSIGNMENT=39, LPARE=40, RPARE=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'var'", "'const'", "'return'", "'end while'", "'while'", 
		"'{'", "';'", "'Integer'", "'}'", "'if'", "'when'", "'break'", "'program'", 
		"'else'", "'begin'", "'function'", "'end'", "'then'", "','", "WS", "BOOLEAN", 
		"INTEGER", "IDENT", "COMMENT", "'+'", "'*'", "'-'", "'/'", "'|'", "'&'", 
		"'<='", "'!='", "'='", "'<'", "'>'", "'%'", "'>='", "'!'", "':='", "'('", 
		"')'"
	};
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_declaration = 3, 
		RULE_functionCall = 4, RULE_callParameters = 5, RULE_parameters = 6, RULE_parameter = 7, 
		RULE_function = 8, RULE_constant = 9, RULE_variable = 10, RULE_type = 11, 
		RULE_ifStatement = 12, RULE_loopStatement = 13, RULE_returnStatement = 14, 
		RULE_breakStatement = 15, RULE_assignment = 16, RULE_expression = 17;
	public static final String[] ruleNames = {
		"program", "block", "statement", "declaration", "functionCall", "callParameters", 
		"parameters", "parameter", "function", "constant", "variable", "type", 
		"ifStatement", "loopStatement", "returnStatement", "breakStatement", "assignment", 
		"expression"
	};

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgramLabelContext extends ProgramContext {
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ProgramLabelContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterProgramLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitProgramLabel(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new ProgramLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36); match(T__6);
			setState(37); match(IDENT);
			setState(38); match(T__12);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__3))) != 0)) {
				{
				setState(41);
				switch (_input.LA(1)) {
				case T__18:
				case T__17:
					{
					setState(39); declaration();
					}
					break;
				case T__3:
					{
					setState(40); function();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46); match(T__4);
			setState(47); block();
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockLabelContext extends BlockContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockLabelContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlockLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlockLabel(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			_localctx = new BlockLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(49); match(T__13);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__14) | (1L << T__9) | (1L << T__7) | (1L << IDENT))) != 0)) {
				{
				{
				setState(50); statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56); match(T__10);
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

	public static class StatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(60); ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(61); loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(62); functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63); breakStatement();
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
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(68);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); variable();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); constant();
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctCallLabelContext extends FunctionCallContext {
		public Token funName;
		public CallParametersContext callParam;
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public FunctCallLabelContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFunctCallLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFunctCallLabel(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionCall);
		int _la;
		try {
			_localctx = new FunctCallLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70); ((FunctCallLabelContext)_localctx).funName = match(IDENT);
			setState(71); match(LPARE);
			setState(73);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << IDENT))) != 0)) {
				{
				setState(72); ((FunctCallLabelContext)_localctx).callParam = callParameters();
				}
			}

			setState(75); match(RPARE);
			setState(76); match(T__12);
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

	public static class CallParametersContext extends ParserRuleContext {
		public CallParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callParameters; }
	 
		public CallParametersContext() { }
		public void copyFrom(CallParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallParamLabelContext extends CallParametersContext {
		public ExpressionContext first;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public CallParamLabelContext(CallParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterCallParamLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitCallParamLabel(this);
		}
	}

	public final CallParametersContext callParameters() throws RecognitionException {
		CallParametersContext _localctx = new CallParametersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_callParameters);
		int _la;
		try {
			_localctx = new CallParamLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78); ((CallParamLabelContext)_localctx).first = expression(0);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(79); match(T__0);
				setState(80); expression(0);
				}
				}
				setState(85);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PassParametersContext extends ParametersContext {
		public ParameterContext first;
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public PassParametersContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterPassParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitPassParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameters);
		int _la;
		try {
			_localctx = new PassParametersContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86); ((PassParametersContext)_localctx).first = parameter();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(87); match(T__0);
				setState(88); parameter();
				}
				}
				setState(93);
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

	public static class ParameterContext extends ParserRuleContext {
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParameterLabelContext extends ParameterContext {
		public Token name;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public ParameterLabelContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterParameterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitParameterLabel(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		int _la;
		try {
			_localctx = new ParameterLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(94); match(T__18);
				}
			}

			setState(97); type();
			setState(98); ((ParameterLabelContext)_localctx).name = match(IDENT);
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

	public static class FunctionContext extends ParserRuleContext {
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	 
		public FunctionContext() { }
		public void copyFrom(FunctionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctDefLabelContext extends FunctionContext {
		public TypeContext ret;
		public Token name;
		public ParametersContext parm;
		public StatementContext funcstat;
		public ReturnStatementContext funcret;
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ReturnStatementContext returnStatement(int i) {
			return getRuleContext(ReturnStatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ReturnStatementContext> returnStatement() {
			return getRuleContexts(ReturnStatementContext.class);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public FunctDefLabelContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFunctDefLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFunctDefLabel(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			_localctx = new FunctDefLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100); match(T__3);
			setState(102);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(101); ((FunctDefLabelContext)_localctx).ret = type();
				}
			}

			setState(104); ((FunctDefLabelContext)_localctx).name = match(IDENT);
			setState(105); match(LPARE);
			setState(107);
			_la = _input.LA(1);
			if (_la==T__18 || _la==T__11) {
				{
				setState(106); ((FunctDefLabelContext)_localctx).parm = parameters();
				}
			}

			setState(109); match(RPARE);
			setState(110); match(T__13);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__16) | (1L << T__14) | (1L << T__9) | (1L << T__7) | (1L << IDENT))) != 0)) {
				{
				setState(113);
				switch (_input.LA(1)) {
				case T__18:
				case T__17:
				case T__14:
				case T__9:
				case T__7:
				case IDENT:
					{
					setState(111); ((FunctDefLabelContext)_localctx).funcstat = statement();
					}
					break;
				case T__16:
					{
					setState(112); ((FunctDefLabelContext)_localctx).funcret = returnStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(T__10);
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

	public static class ConstantContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(T__17);
			setState(121); type();
			setState(122); match(IDENT);
			setState(123); match(ASSIGNMENT);
			setState(124); expression(0);
			setState(125); match(T__12);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclarationLabelContext extends VariableContext {
		public Token variableName;
		public Token value;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public DeclarationLabelContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclarationLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclarationLabel(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable);
		int _la;
		try {
			_localctx = new DeclarationLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(T__18);
			setState(128); type();
			setState(129); ((DeclarationLabelContext)_localctx).variableName = match(IDENT);
			setState(132);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(130); ((DeclarationLabelContext)_localctx).value = match(ASSIGNMENT);
				setState(131); expression(0);
				}
			}

			setState(134); match(T__12);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(T__11);
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

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	 
		public IfStatementContext() { }
		public void copyFrom(IfStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IFStatementLabel1Context extends IfStatementContext {
		public ExpressionContext express1;
		public StatementContext stat1;
		public StatementContext stat2;
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IFStatementLabel1Context(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIFStatementLabel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIFStatementLabel1(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			_localctx = new IFStatementLabel1Context(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(T__9);
			setState(139); ((IFStatementLabel1Context)_localctx).express1 = expression(0);
			setState(140); match(T__1);
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141); ((IFStatementLabel1Context)_localctx).stat1 = statement();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__14) | (1L << T__9) | (1L << T__7) | (1L << IDENT))) != 0) );
			setState(152);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(146); match(T__5);
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147); ((IFStatementLabel1Context)_localctx).stat2 = statement();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__14) | (1L << T__9) | (1L << T__7) | (1L << IDENT))) != 0) );
				}
			}

			setState(154); match(T__2);
			setState(155); match(T__9);
			setState(156); match(T__12);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	 
		public LoopStatementContext() { }
		public void copyFrom(LoopStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LoopStatLabelContext extends LoopStatementContext {
		public ExpressionContext expr;
		public StatementContext stat;
		public Token end;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopStatLabelContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterLoopStatLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitLoopStatLabel(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopStatement);
		int _la;
		try {
			_localctx = new LoopStatLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(T__14);
			setState(159); ((LoopStatLabelContext)_localctx).expr = expression(0);
			setState(161);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__17) | (1L << T__14) | (1L << T__9) | (1L << T__7) | (1L << IDENT))) != 0)) {
				{
				setState(160); ((LoopStatLabelContext)_localctx).stat = statement();
				}
			}

			setState(163); ((LoopStatLabelContext)_localctx).end = match(T__15);
			setState(164); match(T__12);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	 
		public ReturnStatementContext() { }
		public void copyFrom(ReturnStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReturnLabelContext extends ReturnStatementContext {
		public ExpressionContext value;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnLabelContext(ReturnStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterReturnLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitReturnLabel(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		int _la;
		try {
			_localctx = new ReturnLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__16);
			setState(168);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << IDENT))) != 0)) {
				{
				setState(167); ((ReturnLabelContext)_localctx).value = expression(0);
				}
			}

			setState(170); match(T__12);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	 
		public BreakStatementContext() { }
		public void copyFrom(BreakStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakLabelContext extends BreakStatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BreakLabelContext(BreakStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBreakLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBreakLabel(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakStatement);
		try {
			_localctx = new BreakLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(T__7);
			setState(173); match(T__8);
			setState(174); expression(0);
			setState(175); match(T__12);
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
	public static class AssignmentLabelContext extends AssignmentContext {
		public Token var;
		public ExpressionContext expr;
		public TerminalNode ASSIGNMENT() { return getToken(HelloParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public AssignmentLabelContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssignmentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssignmentLabel(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			_localctx = new AssignmentLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((AssignmentLabelContext)_localctx).var = match(IDENT);
			setState(178); match(ASSIGNMENT);
			setState(179); ((AssignmentLabelContext)_localctx).expr = expression(0);
			setState(180); match(T__12);
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
	public static class IntegerLabelContext extends ExpressionContext {
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public IntegerLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIntegerLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIntegerLabel(this);
		}
	}
	public static class DivLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(HelloParser.DIV, 0); }
		public DivLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDivLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDivLabel(this);
		}
	}
	public static class AndORNotLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndORNotLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAndORNotLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAndORNotLabel(this);
		}
	}
	public static class MultLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public TerminalNode MULT() { return getToken(HelloParser.MULT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MultLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMultLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMultLabel(this);
		}
	}
	public static class SubtLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public TerminalNode SUBT() { return getToken(HelloParser.SUBT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public SubtLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSubtLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSubtLabel(this);
		}
	}
	public static class IdentLabelContext extends ExpressionContext {
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public IdentLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIdentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIdentLabel(this);
		}
	}
	public static class FunctCallExprLabelContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctCallExprLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterFunctCallExprLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitFunctCallExprLabel(this);
		}
	}
	public static class BooleanLabelContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public BooleanLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBooleanLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBooleanLabel(this);
		}
	}
	public static class GTLTEQLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public TerminalNode LT() { return getToken(HelloParser.LT, 0); }
		public TerminalNode GT() { return getToken(HelloParser.GT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public TerminalNode NE() { return getToken(HelloParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public GTLTEQLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterGTLTEQLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitGTLTEQLabel(this);
		}
	}
	public static class AddLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAddLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAddLabel(this);
		}
	}
	public static class GTEQLTEQLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public TerminalNode LTEQ() { return getToken(HelloParser.LTEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GTEQ() { return getToken(HelloParser.GTEQ, 0); }
		public GTEQLTEQLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterGTEQLTEQLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitGTEQLTEQLabel(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new IntegerLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183); match(INTEGER);
				}
				break;
			case 2:
				{
				_localctx = new IdentLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184); match(IDENT);
				}
				break;
			case 3:
				{
				_localctx = new FunctCallExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185); functionCall();
				}
				break;
			case 4:
				{
				_localctx = new BooleanLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new DivLabelContext(new ExpressionContext(_parentctx, _parentState));
						((DivLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(190); ((DivLabelContext)_localctx).op = match(DIV);
						setState(191); ((DivLabelContext)_localctx).rightexpr = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new MultLabelContext(new ExpressionContext(_parentctx, _parentState));
						((MultLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(192);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(193); ((MultLabelContext)_localctx).op = match(MULT);
						setState(194); ((MultLabelContext)_localctx).rightexpr = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new SubtLabelContext(new ExpressionContext(_parentctx, _parentState));
						((SubtLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(196); ((SubtLabelContext)_localctx).op = match(SUBT);
						setState(197); ((SubtLabelContext)_localctx).rightexpr = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new AddLabelContext(new ExpressionContext(_parentctx, _parentState));
						((AddLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(199); ((AddLabelContext)_localctx).op = match(ADD);
						setState(200); ((AddLabelContext)_localctx).rightexpr = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new GTLTEQLabelContext(new ExpressionContext(_parentctx, _parentState));
						((GTLTEQLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(202);
						((GTLTEQLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NE) | (1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
							((GTLTEQLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(203); ((GTLTEQLabelContext)_localctx).rightexpr = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new GTEQLTEQLabelContext(new ExpressionContext(_parentctx, _parentState));
						((GTEQLTEQLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(205);
						((GTEQLTEQLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LTEQ || _la==GTEQ) ) {
							((GTEQLTEQLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(206); ((GTEQLTEQLabelContext)_localctx).rightexpr = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new AndORNotLabelContext(new ExpressionContext(_parentctx, _parentState));
						((AndORNotLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(208);
						((AndORNotLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << NOT))) != 0)) ) {
							((AndORNotLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(209); ((AndORNotLabelContext)_localctx).rightexpr = expression(6);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 11);
		case 1: return precpred(_ctx, 10);
		case 2: return precpred(_ctx, 9);
		case 3: return precpred(_ctx, 8);
		case 4: return precpred(_ctx, 7);
		case 5: return precpred(_ctx, 6);
		case 6: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\3\3"+
		"\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n"+
		"\4\3\5\3\5\5\5G\n\5\3\6\3\6\3\6\5\6L\n\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7T"+
		"\n\7\f\7\16\7W\13\7\3\b\3\b\3\b\7\b\\\n\b\f\b\16\b_\13\b\3\t\5\tb\n\t"+
		"\3\t\3\t\3\t\3\n\3\n\5\ni\n\n\3\n\3\n\3\n\5\nn\n\n\3\n\3\n\3\n\3\n\7\n"+
		"t\n\n\f\n\16\nw\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0087\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\6\16"+
		"\u0091\n\16\r\16\16\16\u0092\3\16\3\16\6\16\u0097\n\16\r\16\16\16\u0098"+
		"\5\16\u009b\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a4\n\17\3"+
		"\17\3\17\3\17\3\20\3\20\5\20\u00ab\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00be\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d5\n\23\f\23\16\23\u00d8\13"+
		"\23\3\23\2\3$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\""+
		"%\4\2!!\'\'\4\2\37 ((\u00e8\2&\3\2\2\2\4\63\3\2\2\2\6B\3\2\2\2\bF\3\2"+
		"\2\2\nH\3\2\2\2\fP\3\2\2\2\16X\3\2\2\2\20a\3\2\2\2\22f\3\2\2\2\24z\3\2"+
		"\2\2\26\u0081\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2\2\2\34\u00a0\3\2\2"+
		"\2\36\u00a8\3\2\2\2 \u00ae\3\2\2\2\"\u00b3\3\2\2\2$\u00bd\3\2\2\2&\'\7"+
		"\17\2\2\'(\7\31\2\2(-\7\t\2\2),\5\b\5\2*,\5\22\n\2+)\3\2\2\2+*\3\2\2\2"+
		",/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\21\2\2\61"+
		"\62\5\4\3\2\62\3\3\2\2\2\63\67\7\b\2\2\64\66\5\6\4\2\65\64\3\2\2\2\66"+
		"9\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\13\2\2;"+
		"\5\3\2\2\2<C\5\"\22\2=C\5\b\5\2>C\5\32\16\2?C\5\34\17\2@C\5\n\6\2AC\5"+
		" \21\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\7"+
		"\3\2\2\2DG\5\26\f\2EG\5\24\13\2FD\3\2\2\2FE\3\2\2\2G\t\3\2\2\2HI\7\31"+
		"\2\2IK\7*\2\2JL\5\f\7\2KJ\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7+\2\2NO\7\t\2"+
		"\2O\13\3\2\2\2PU\5$\23\2QR\7\25\2\2RT\5$\23\2SQ\3\2\2\2TW\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2V\r\3\2\2\2WU\3\2\2\2X]\5\20\t\2YZ\7\25\2\2Z\\\5\20\t"+
		"\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\17\3\2\2\2_]\3\2\2\2`b\7"+
		"\3\2\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\5\30\r\2de\7\31\2\2e\21\3\2\2\2"+
		"fh\7\22\2\2gi\5\30\r\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\31\2\2km\7*\2"+
		"\2ln\5\16\b\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7+\2\2pu\7\b\2\2qt\5\6\4"+
		"\2rt\5\36\20\2sq\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2"+
		"\2\2wu\3\2\2\2xy\7\13\2\2y\23\3\2\2\2z{\7\4\2\2{|\5\30\r\2|}\7\31\2\2"+
		"}~\7)\2\2~\177\5$\23\2\177\u0080\7\t\2\2\u0080\25\3\2\2\2\u0081\u0082"+
		"\7\3\2\2\u0082\u0083\5\30\r\2\u0083\u0086\7\31\2\2\u0084\u0085\7)\2\2"+
		"\u0085\u0087\5$\23\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\7\t\2\2\u0089\27\3\2\2\2\u008a\u008b\7\n\2\2\u008b"+
		"\31\3\2\2\2\u008c\u008d\7\f\2\2\u008d\u008e\5$\23\2\u008e\u0090\7\24\2"+
		"\2\u008f\u0091\5\6\4\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u009a\3\2\2\2\u0094\u0096\7\20\2\2"+
		"\u0095\u0097\5\6\4\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0094\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\23\2\2\u009d\u009e\7"+
		"\f\2\2\u009e\u009f\7\t\2\2\u009f\33\3\2\2\2\u00a0\u00a1\7\7\2\2\u00a1"+
		"\u00a3\5$\23\2\u00a2\u00a4\5\6\4\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\7\6\2\2\u00a6\u00a7\7\t\2\2\u00a7"+
		"\35\3\2\2\2\u00a8\u00aa\7\5\2\2\u00a9\u00ab\5$\23\2\u00aa\u00a9\3\2\2"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\t\2\2\u00ad\37"+
		"\3\2\2\2\u00ae\u00af\7\16\2\2\u00af\u00b0\7\r\2\2\u00b0\u00b1\5$\23\2"+
		"\u00b1\u00b2\7\t\2\2\u00b2!\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5\7"+
		")\2\2\u00b5\u00b6\5$\23\2\u00b6\u00b7\7\t\2\2\u00b7#\3\2\2\2\u00b8\u00b9"+
		"\b\23\1\2\u00b9\u00be\7\30\2\2\u00ba\u00be\7\31\2\2\u00bb\u00be\5\n\6"+
		"\2\u00bc\u00be\7\27\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00ba\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00d6\3\2\2\2\u00bf\u00c0\f\r"+
		"\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00d5\5$\23\16\u00c2\u00c3\f\f\2\2\u00c3"+
		"\u00c4\7\34\2\2\u00c4\u00d5\5$\23\r\u00c5\u00c6\f\13\2\2\u00c6\u00c7\7"+
		"\35\2\2\u00c7\u00d5\5$\23\f\u00c8\u00c9\f\n\2\2\u00c9\u00ca\7\33\2\2\u00ca"+
		"\u00d5\5$\23\13\u00cb\u00cc\f\t\2\2\u00cc\u00cd\t\2\2\2\u00cd\u00d5\5"+
		"$\23\n\u00ce\u00cf\f\b\2\2\u00cf\u00d0\t\3\2\2\u00d0\u00d5\5$\23\t\u00d1"+
		"\u00d2\f\7\2\2\u00d2\u00d3\t\4\2\2\u00d3\u00d5\5$\23\b\u00d4\u00bf\3\2"+
		"\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00c5\3\2\2\2\u00d4\u00c8\3\2\2\2\u00d4"+
		"\u00cb\3\2\2\2\u00d4\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7%\3\2\2\2\u00d8\u00d6"+
		"\3\2\2\2\30+-\67BFKU]ahmsu\u0086\u0092\u0098\u009a\u00a3\u00aa\u00bd\u00d4"+
		"\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
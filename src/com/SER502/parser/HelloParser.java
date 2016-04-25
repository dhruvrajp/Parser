// Generated from Hello.g4 by ANTLR 4.5.3
package com.SER502.parser;
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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, WS=20, BOOLEAN=21, INTEGER=22, IDENT=23, COMMENT=24, 
		ADD=25, MULT=26, SUBT=27, DIV=28, OR=29, AND=30, LTEQ=31, NE=32, EQ=33, 
		LT=34, GT=35, MOD=36, GTEQ=37, NOT=38, ASSIGNMENT=39, LPARE=40, RPARE=41;
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

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "';'", "'begin'", "'{'", "'}'", "','", "'var'", "'function'", 
		"'const'", "'Integer'", "'if'", "'then'", "'else'", "'end'", "'while'", 
		"'end while'", "'return'", "'break'", "'when'", null, null, null, null, 
		null, "'+'", "'*'", "'-'", "'/'", "'|'", "'&'", "'<='", "'!='", "'='", 
		"'<'", "'>'", "'%'", "'>='", "'!'", "':='", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "WS", "BOOLEAN", "INTEGER", 
		"IDENT", "COMMENT", "ADD", "MULT", "SUBT", "DIV", "OR", "AND", "LTEQ", 
		"NE", "EQ", "LT", "GT", "MOD", "GTEQ", "NOT", "ASSIGNMENT", "LPARE", "RPARE"
	};
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
	public String getGrammarFileName() { return "Hello.g4"; }

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
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgramLabelContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitProgramLabel(this);
			else return visitor.visitChildren(this);
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
			setState(36);
			match(T__0);
			setState(37);
			match(IDENT);
			setState(38);
			match(T__1);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) {
				{
				setState(41);
				switch (_input.LA(1)) {
				case T__6:
				case T__8:
					{
					setState(39);
					declaration();
					}
					break;
				case T__7:
					{
					setState(40);
					function();
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
			setState(46);
			match(T__2);
			setState(47);
			block();
			setState(48);
			match(EOF);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockLabelContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBlockLabel(this);
			else return visitor.visitChildren(this);
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
			setState(50);
			match(T__3);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__17) | (1L << IDENT))) != 0)) {
				{
				{
				setState(51);
				statement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				loopStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				functionCall();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				breakStatement();
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		try {
			setState(69);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				variable();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				constant();
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
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public CallParametersContext callParameters() {
			return getRuleContext(CallParametersContext.class,0);
		}
		public FunctCallLabelContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFunctCallLabel(this);
			else return visitor.visitChildren(this);
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
			setState(71);
			((FunctCallLabelContext)_localctx).funName = match(IDENT);
			setState(72);
			match(LPARE);
			setState(74);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << IDENT))) != 0)) {
				{
				setState(73);
				((FunctCallLabelContext)_localctx).callParam = callParameters();
				}
			}

			setState(76);
			match(RPARE);
			setState(77);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CallParamLabelContext(CallParametersContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCallParamLabel(this);
			else return visitor.visitChildren(this);
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
			setState(79);
			((CallParamLabelContext)_localctx).first = expression(0);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(80);
				match(T__5);
				setState(81);
				expression(0);
				}
				}
				setState(86);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPassParameters(this);
			else return visitor.visitChildren(this);
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
			setState(87);
			((PassParametersContext)_localctx).first = parameter();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(88);
				match(T__5);
				setState(89);
				parameter();
				}
				}
				setState(94);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitParameterLabel(this);
			else return visitor.visitChildren(this);
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
			setState(96);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(95);
				match(T__6);
				}
			}

			setState(98);
			type();
			setState(99);
			((ParameterLabelContext)_localctx).name = match(IDENT);
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
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ReturnStatementContext> returnStatement() {
			return getRuleContexts(ReturnStatementContext.class);
		}
		public ReturnStatementContext returnStatement(int i) {
			return getRuleContext(ReturnStatementContext.class,i);
		}
		public FunctDefLabelContext(FunctionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFunctDefLabel(this);
			else return visitor.visitChildren(this);
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
			setState(101);
			match(T__7);
			setState(103);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(102);
				((FunctDefLabelContext)_localctx).ret = type();
				}
			}

			setState(105);
			((FunctDefLabelContext)_localctx).name = match(IDENT);
			setState(106);
			match(LPARE);
			setState(108);
			_la = _input.LA(1);
			if (_la==T__6 || _la==T__9) {
				{
				setState(107);
				((FunctDefLabelContext)_localctx).parm = parameters();
				}
			}

			setState(110);
			match(RPARE);
			setState(111);
			match(T__3);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__16) | (1L << T__17) | (1L << IDENT))) != 0)) {
				{
				setState(114);
				switch (_input.LA(1)) {
				case T__6:
				case T__8:
				case T__10:
				case T__14:
				case T__17:
				case IDENT:
					{
					setState(112);
					((FunctDefLabelContext)_localctx).funcstat = statement();
					}
					break;
				case T__16:
					{
					setState(113);
					((FunctDefLabelContext)_localctx).funcret = returnStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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

	public static class ConstantContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__8);
			setState(122);
			type();
			setState(123);
			match(IDENT);
			setState(124);
			match(ASSIGNMENT);
			setState(125);
			expression(0);
			setState(126);
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationLabelContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclarationLabel(this);
			else return visitor.visitChildren(this);
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
			setState(128);
			match(T__6);
			setState(129);
			type();
			setState(130);
			((DeclarationLabelContext)_localctx).variableName = match(IDENT);
			setState(133);
			_la = _input.LA(1);
			if (_la==ASSIGNMENT) {
				{
				setState(131);
				match(ASSIGNMENT);
				setState(132);
				expression(0);
				}
			}

			setState(135);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__9);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IFStatementLabel1Context(IfStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIFStatementLabel1(this);
			else return visitor.visitChildren(this);
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
			setState(139);
			match(T__10);
			setState(140);
			((IFStatementLabel1Context)_localctx).express1 = expression(0);
			setState(141);
			match(T__11);
			setState(143); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(142);
				((IFStatementLabel1Context)_localctx).stat1 = statement();
				}
				}
				setState(145); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__17) | (1L << IDENT))) != 0) );
			setState(153);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(147);
				match(T__12);
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(148);
					((IFStatementLabel1Context)_localctx).stat2 = statement();
					}
					}
					setState(151); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__17) | (1L << IDENT))) != 0) );
				}
			}

			setState(155);
			match(T__13);
			setState(156);
			match(T__10);
			setState(157);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopStatLabelContext(LoopStatementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLoopStatLabel(this);
			else return visitor.visitChildren(this);
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
			setState(159);
			match(T__14);
			setState(160);
			((LoopStatLabelContext)_localctx).expr = expression(0);
			setState(162);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__14) | (1L << T__17) | (1L << IDENT))) != 0)) {
				{
				setState(161);
				((LoopStatLabelContext)_localctx).stat = statement();
				}
			}

			setState(164);
			((LoopStatLabelContext)_localctx).end = match(T__15);
			setState(165);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitReturnLabel(this);
			else return visitor.visitChildren(this);
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
			setState(167);
			match(T__16);
			setState(169);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INTEGER) | (1L << IDENT))) != 0)) {
				{
				setState(168);
				((ReturnLabelContext)_localctx).value = expression(0);
				}
			}

			setState(171);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBreakLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_breakStatement);
		try {
			_localctx = new BreakLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__17);
			setState(174);
			match(T__18);
			setState(175);
			expression(0);
			setState(176);
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
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentLabelContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAssignmentLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment);
		try {
			_localctx = new AssignmentLabelContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			((AssignmentLabelContext)_localctx).var = match(IDENT);
			setState(179);
			match(ASSIGNMENT);
			setState(180);
			((AssignmentLabelContext)_localctx).expr = expression(0);
			setState(181);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIntegerLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(HelloParser.DIV, 0); }
		public DivLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDivLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndORNotLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(HelloParser.AND, 0); }
		public TerminalNode OR() { return getToken(HelloParser.OR, 0); }
		public TerminalNode NOT() { return getToken(HelloParser.NOT, 0); }
		public AndORNotLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAndORNotLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(HelloParser.MULT, 0); }
		public MultLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMultLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SUBT() { return getToken(HelloParser.SUBT, 0); }
		public SubtLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSubtLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentLabelContext extends ExpressionContext {
		public TerminalNode IDENT() { return getToken(HelloParser.IDENT, 0); }
		public IdentLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIdentLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctCallExprLabelContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctCallExprLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFunctCallExprLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLabelContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(HelloParser.BOOLEAN, 0); }
		public BooleanLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBooleanLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GTLTEQLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(HelloParser.GT, 0); }
		public TerminalNode LT() { return getToken(HelloParser.LT, 0); }
		public TerminalNode EQ() { return getToken(HelloParser.EQ, 0); }
		public TerminalNode NE() { return getToken(HelloParser.NE, 0); }
		public GTLTEQLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitGTLTEQLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
		public AddLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAddLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GTEQLTEQLabelContext extends ExpressionContext {
		public ExpressionContext leftexpr;
		public Token op;
		public ExpressionContext rightexpr;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GTEQ() { return getToken(HelloParser.GTEQ, 0); }
		public TerminalNode LTEQ() { return getToken(HelloParser.LTEQ, 0); }
		public GTEQLTEQLabelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitGTEQLTEQLabel(this);
			else return visitor.visitChildren(this);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new IntegerLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				match(INTEGER);
				}
				break;
			case 2:
				{
				_localctx = new IdentLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(IDENT);
				}
				break;
			case 3:
				{
				_localctx = new FunctCallExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				functionCall();
				}
				break;
			case 4:
				{
				_localctx = new BooleanLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(BOOLEAN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new DivLabelContext(new ExpressionContext(_parentctx, _parentState));
						((DivLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(191);
						((DivLabelContext)_localctx).op = match(DIV);
						setState(192);
						((DivLabelContext)_localctx).rightexpr = expression(12);
						}
						break;
					case 2:
						{
						_localctx = new MultLabelContext(new ExpressionContext(_parentctx, _parentState));
						((MultLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(194);
						((MultLabelContext)_localctx).op = match(MULT);
						setState(195);
						((MultLabelContext)_localctx).rightexpr = expression(11);
						}
						break;
					case 3:
						{
						_localctx = new SubtLabelContext(new ExpressionContext(_parentctx, _parentState));
						((SubtLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						((SubtLabelContext)_localctx).op = match(SUBT);
						setState(198);
						((SubtLabelContext)_localctx).rightexpr = expression(10);
						}
						break;
					case 4:
						{
						_localctx = new AddLabelContext(new ExpressionContext(_parentctx, _parentState));
						((AddLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						((AddLabelContext)_localctx).op = match(ADD);
						setState(201);
						((AddLabelContext)_localctx).rightexpr = expression(9);
						}
						break;
					case 5:
						{
						_localctx = new GTLTEQLabelContext(new ExpressionContext(_parentctx, _parentState));
						((GTLTEQLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						((GTLTEQLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NE) | (1L << EQ) | (1L << LT) | (1L << GT))) != 0)) ) {
							((GTLTEQLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(204);
						((GTLTEQLabelContext)_localctx).rightexpr = expression(8);
						}
						break;
					case 6:
						{
						_localctx = new GTEQLTEQLabelContext(new ExpressionContext(_parentctx, _parentState));
						((GTEQLTEQLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(206);
						((GTEQLTEQLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LTEQ || _la==GTEQ) ) {
							((GTEQLTEQLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(207);
						((GTEQLTEQLabelContext)_localctx).rightexpr = expression(7);
						}
						break;
					case 7:
						{
						_localctx = new AndORNotLabelContext(new ExpressionContext(_parentctx, _parentState));
						((AndORNotLabelContext)_localctx).leftexpr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						((AndORNotLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << AND) | (1L << NOT))) != 0)) ) {
							((AndORNotLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(210);
						((AndORNotLabelContext)_localctx).rightexpr = expression(6);
						}
						break;
					}
					} 
				}
				setState(215);
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
		case 17:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\7\3\67\n\3\f\3\16\3:\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"D\n\4\3\5\3\5\5\5H\n\5\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\6\3\7\3\7\3\7\7"+
		"\7U\n\7\f\7\16\7X\13\7\3\b\3\b\3\b\7\b]\n\b\f\b\16\b`\13\b\3\t\5\tc\n"+
		"\t\3\t\3\t\3\t\3\n\3\n\5\nj\n\n\3\n\3\n\3\n\5\no\n\n\3\n\3\n\3\n\3\n\7"+
		"\nu\n\n\f\n\16\nx\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u0088\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\6\16"+
		"\u0092\n\16\r\16\16\16\u0093\3\16\3\16\6\16\u0098\n\16\r\16\16\16\u0099"+
		"\5\16\u009c\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a5\n\17\3"+
		"\17\3\17\3\17\3\20\3\20\5\20\u00ac\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00bf\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00d6\n\23\f\23\16\23\u00d9\13"+
		"\23\3\23\2\3$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5\3\2\""+
		"%\4\2!!\'\'\4\2\37 ((\u00e9\2&\3\2\2\2\4\64\3\2\2\2\6C\3\2\2\2\bG\3\2"+
		"\2\2\nI\3\2\2\2\fQ\3\2\2\2\16Y\3\2\2\2\20b\3\2\2\2\22g\3\2\2\2\24{\3\2"+
		"\2\2\26\u0082\3\2\2\2\30\u008b\3\2\2\2\32\u008d\3\2\2\2\34\u00a1\3\2\2"+
		"\2\36\u00a9\3\2\2\2 \u00af\3\2\2\2\"\u00b4\3\2\2\2$\u00be\3\2\2\2&\'\7"+
		"\3\2\2\'(\7\31\2\2(-\7\4\2\2),\5\b\5\2*,\5\22\n\2+)\3\2\2\2+*\3\2\2\2"+
		",/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\5\2\2\61"+
		"\62\5\4\3\2\62\63\7\2\2\3\63\3\3\2\2\2\648\7\6\2\2\65\67\5\6\4\2\66\65"+
		"\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\7\2"+
		"\2<\5\3\2\2\2=D\5\"\22\2>D\5\b\5\2?D\5\32\16\2@D\5\34\17\2AD\5\n\6\2B"+
		"D\5 \21\2C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2"+
		"D\7\3\2\2\2EH\5\26\f\2FH\5\24\13\2GE\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IJ\7"+
		"\31\2\2JL\7*\2\2KM\5\f\7\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7+\2\2OP\7"+
		"\4\2\2P\13\3\2\2\2QV\5$\23\2RS\7\b\2\2SU\5$\23\2TR\3\2\2\2UX\3\2\2\2V"+
		"T\3\2\2\2VW\3\2\2\2W\r\3\2\2\2XV\3\2\2\2Y^\5\20\t\2Z[\7\b\2\2[]\5\20\t"+
		"\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\17\3\2\2\2`^\3\2\2\2ac\7"+
		"\t\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\5\30\r\2ef\7\31\2\2f\21\3\2\2\2"+
		"gi\7\n\2\2hj\5\30\r\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\31\2\2ln\7*\2"+
		"\2mo\5\16\b\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7+\2\2qv\7\6\2\2ru\5\6\4"+
		"\2su\5\36\20\2tr\3\2\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2"+
		"\2\2xv\3\2\2\2yz\7\7\2\2z\23\3\2\2\2{|\7\13\2\2|}\5\30\r\2}~\7\31\2\2"+
		"~\177\7)\2\2\177\u0080\5$\23\2\u0080\u0081\7\4\2\2\u0081\25\3\2\2\2\u0082"+
		"\u0083\7\t\2\2\u0083\u0084\5\30\r\2\u0084\u0087\7\31\2\2\u0085\u0086\7"+
		")\2\2\u0086\u0088\5$\23\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\7\4\2\2\u008a\27\3\2\2\2\u008b\u008c\7\f\2"+
		"\2\u008c\31\3\2\2\2\u008d\u008e\7\r\2\2\u008e\u008f\5$\23\2\u008f\u0091"+
		"\7\16\2\2\u0090\u0092\5\6\4\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u009b\3\2\2\2\u0095\u0097"+
		"\7\17\2\2\u0096\u0098\5\6\4\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0095"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\20\2\2"+
		"\u009e\u009f\7\r\2\2\u009f\u00a0\7\4\2\2\u00a0\33\3\2\2\2\u00a1\u00a2"+
		"\7\21\2\2\u00a2\u00a4\5$\23\2\u00a3\u00a5\5\6\4\2\u00a4\u00a3\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8"+
		"\7\4\2\2\u00a8\35\3\2\2\2\u00a9\u00ab\7\23\2\2\u00aa\u00ac\5$\23\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\4"+
		"\2\2\u00ae\37\3\2\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\7\25\2\2\u00b1"+
		"\u00b2\5$\23\2\u00b2\u00b3\7\4\2\2\u00b3!\3\2\2\2\u00b4\u00b5\7\31\2\2"+
		"\u00b5\u00b6\7)\2\2\u00b6\u00b7\5$\23\2\u00b7\u00b8\7\4\2\2\u00b8#\3\2"+
		"\2\2\u00b9\u00ba\b\23\1\2\u00ba\u00bf\7\30\2\2\u00bb\u00bf\7\31\2\2\u00bc"+
		"\u00bf\5\n\6\2\u00bd\u00bf\7\27\2\2\u00be\u00b9\3\2\2\2\u00be\u00bb\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00d7\3\2\2\2\u00c0"+
		"\u00c1\f\r\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00d6\5$\23\16\u00c3\u00c4\f"+
		"\f\2\2\u00c4\u00c5\7\34\2\2\u00c5\u00d6\5$\23\r\u00c6\u00c7\f\13\2\2\u00c7"+
		"\u00c8\7\35\2\2\u00c8\u00d6\5$\23\f\u00c9\u00ca\f\n\2\2\u00ca\u00cb\7"+
		"\33\2\2\u00cb\u00d6\5$\23\13\u00cc\u00cd\f\t\2\2\u00cd\u00ce\t\2\2\2\u00ce"+
		"\u00d6\5$\23\n\u00cf\u00d0\f\b\2\2\u00d0\u00d1\t\3\2\2\u00d1\u00d6\5$"+
		"\23\t\u00d2\u00d3\f\7\2\2\u00d3\u00d4\t\4\2\2\u00d4\u00d6\5$\23\b\u00d5"+
		"\u00c0\3\2\2\2\u00d5\u00c3\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00c9\3\2"+
		"\2\2\u00d5\u00cc\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8%\3\2\2\2"+
		"\u00d9\u00d7\3\2\2\2\30+-8CGLV^bintv\u0087\u0093\u0099\u009b\u00a4\u00ab"+
		"\u00be\u00d5\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
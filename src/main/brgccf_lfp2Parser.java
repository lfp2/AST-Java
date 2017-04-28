// Generated from brgccf_lfp2.g4 by ANTLR 4.4
package main;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class brgccf_lfp2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, WS=36, INTEGER_LITERAL=37, Identifier=38, 
		Comment_line=39, Comment_ext=40;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'new'", "'true'", "'return'", "'class'", 
		"'while'", "';'", "'void'", "'{'", "'&&'", "'='", "'extends'", "'}'", 
		"'if'", "'int'", "'('", "'*'", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'<'", "'String'", "']'", "'public'", "'!'", 
		"'static'", "'else'", "')'", "'+'", "'-'", "WS", "INTEGER_LITERAL", "Identifier", 
		"Comment_line", "Comment_ext"
	};
	public static final int
		RULE_goal = 0, RULE_formal = 1, RULE_mainClass = 2, RULE_classDeclaration = 3, 
		RULE_varDeclaration = 4, RULE_methodDeclaration = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_expression = 8;
	public static final String[] ruleNames = {
		"goal", "formal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "statement", "expression"
	};

	@Override
	public String getGrammarFileName() { return "brgccf_lfp2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public brgccf_lfp2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(brgccf_lfp2Parser.EOF, 0); }
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); mainClass();
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(19); classDeclaration();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25); match(EOF);
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

	public static class FormalContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); type();
			setState(28); match(Identifier);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(brgccf_lfp2Parser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(brgccf_lfp2Parser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(T__29);
			setState(31); match(Identifier);
			setState(32); match(T__25);
			setState(33); match(T__6);
			setState(34); match(T__4);
			setState(35); match(T__26);
			setState(36); match(T__34);
			setState(37); match(T__18);
			setState(38); match(T__8);
			setState(39); match(T__10);
			setState(40); match(T__7);
			setState(41); match(Identifier);
			setState(42); match(T__2);
			setState(43); match(T__25);
			setState(44); statement();
			setState(45); match(T__21);
			setState(46); match(T__21);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(brgccf_lfp2Parser.Identifier); }
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public TerminalNode Identifier(int i) {
			return getToken(brgccf_lfp2Parser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(T__29);
			setState(49); match(Identifier);
			setState(52);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(50); match(T__22);
				setState(51); match(Identifier);
				}
			}

			setState(54); match(T__25);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				{
				setState(55); varDeclaration();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(61); methodDeclaration();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67); match(T__21);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); formal();
			setState(70); match(T__27);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(T__6);
			setState(73); formal();
			setState(74); match(T__18);
			setState(83);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << Identifier))) != 0)) {
				{
				setState(75); formal();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(76); match(T__15);
					setState(77); formal();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85); match(T__2);
			setState(86); match(T__25);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87); varDeclaration();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << Identifier))) != 0)) {
				{
				{
				setState(93); statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99); match(T__30);
			setState(100); expression(0);
			setState(101); match(T__27);
			setState(102); match(T__21);
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
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104); match(T__19);
				setState(105); match(T__10);
				setState(106); match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108); match(T__19);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(T__25);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__28) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << Identifier))) != 0)) {
					{
					{
					setState(113); statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119); match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(T__20);
				setState(121); match(T__18);
				setState(122); expression(0);
				setState(123); match(T__2);
				setState(124); statement();
				setState(125); match(T__3);
				setState(126); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(T__28);
				setState(129); match(T__18);
				setState(130); expression(0);
				setState(131); match(T__2);
				setState(132); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); match(T__11);
				setState(135); match(T__18);
				setState(136); expression(0);
				setState(137); match(T__2);
				setState(138); match(T__27);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140); match(Identifier);
				setState(141); match(T__23);
				setState(142); expression(0);
				setState(143); match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(145); match(Identifier);
				setState(146); match(T__10);
				setState(147); expression(0);
				setState(148); match(T__7);
				setState(149); match(T__23);
				setState(150); expression(0);
				setState(151); match(T__27);
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
		public TerminalNode Identifier() { return getToken(brgccf_lfp2Parser.Identifier, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(brgccf_lfp2Parser.INTEGER_LITERAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof brgccf_lfp2Listener ) ((brgccf_lfp2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof brgccf_lfp2Visitor ) return ((brgccf_lfp2Visitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(156); match(T__5);
				setState(157); expression(2);
				}
				break;
			case 2:
				{
				setState(158); match(T__10);
				setState(159); expression(0);
				setState(160); match(T__7);
				}
				break;
			case 3:
				{
				setState(162); match(T__13);
				setState(163); match(T__33);
				}
				break;
			case 4:
				{
				setState(164); match(T__13);
				setState(165); match(Identifier);
				setState(166); match(T__18);
				setState(175);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__31) | (1L << T__18) | (1L << T__16) | (1L << T__14) | (1L << T__13) | (1L << T__10) | (1L << T__5) | (1L << INTEGER_LITERAL) | (1L << Identifier))) != 0)) {
					{
					setState(167); expression(0);
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__15) {
						{
						{
						setState(168); match(T__15);
						setState(169); expression(0);
						}
						}
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(177); match(T__2);
				}
				break;
			case 5:
				{
				setState(178); match(INTEGER_LITERAL);
				}
				break;
			case 6:
				{
				setState(179); match(T__31);
				}
				break;
			case 7:
				{
				setState(180); match(T__14);
				}
				break;
			case 8:
				{
				setState(181); match(Identifier);
				}
				break;
			case 9:
				{
				setState(182); match(T__16);
				}
				break;
			case 10:
				{
				setState(183); match(T__32);
				setState(184); match(T__19);
				setState(185); match(T__10);
				setState(186); expression(0);
				setState(187); match(T__7);
				}
				break;
			case 11:
				{
				setState(189); match(T__32);
				setState(190); match(Identifier);
				setState(191); match(T__18);
				setState(192); match(T__2);
				}
				break;
			case 12:
				{
				setState(193); match(T__18);
				setState(194); expression(0);
				setState(195); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(199);
					if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
					setState(200);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__17) | (1L << T__9) | (1L << T__1) | (1L << T__0))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(201); expression(14);
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		case 8: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5"+
		"\67\n\5\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\7\5A\n\5\f\5\16\5D\13\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16\7T\13\7\5\7"+
		"V\n\7\3\7\3\7\3\7\7\7[\n\7\f\7\16\7^\13\7\3\7\7\7a\n\7\f\7\16\7d\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3\t\3\t\7\tu\n\t"+
		"\f\t\16\tx\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00ad\n\n\f\n\16\n\u00b0\13\n\5\n\u00b2\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u00c8\n\n\3\n\3\n\3\n\7\n\u00cd\n\n\f\n\16\n\u00d0\13\n\3\n\2"+
		"\3\22\13\2\4\6\b\n\f\16\20\22\2\3\6\2\r\r\24\24\34\34$%\u00e7\2\24\3\2"+
		"\2\2\4\35\3\2\2\2\6 \3\2\2\2\b\62\3\2\2\2\nG\3\2\2\2\fJ\3\2\2\2\16p\3"+
		"\2\2\2\20\u009b\3\2\2\2\22\u00c7\3\2\2\2\24\30\5\6\4\2\25\27\5\b\5\2\26"+
		"\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32"+
		"\30\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\5\16\b\2\36\37\7(\2\2\37"+
		"\5\3\2\2\2 !\7\b\2\2!\"\7(\2\2\"#\7\f\2\2#$\7\37\2\2$%\7!\2\2%&\7\13\2"+
		"\2&\'\7\3\2\2\'(\7\23\2\2()\7\35\2\2)*\7\33\2\2*+\7\36\2\2+,\7(\2\2,-"+
		"\7#\2\2-.\7\f\2\2./\5\20\t\2/\60\7\20\2\2\60\61\7\20\2\2\61\7\3\2\2\2"+
		"\62\63\7\b\2\2\63\66\7(\2\2\64\65\7\17\2\2\65\67\7(\2\2\66\64\3\2\2\2"+
		"\66\67\3\2\2\2\678\3\2\2\28<\7\f\2\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2<:\3"+
		"\2\2\2<=\3\2\2\2=B\3\2\2\2><\3\2\2\2?A\5\f\7\2@?\3\2\2\2AD\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\20\2\2F\t\3\2\2\2GH\5\4\3\2H"+
		"I\7\n\2\2I\13\3\2\2\2JK\7\37\2\2KL\5\4\3\2LU\7\23\2\2MR\5\4\3\2NO\7\26"+
		"\2\2OQ\5\4\3\2PN\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2\2\2TR\3\2"+
		"\2\2UM\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7#\2\2X\\\7\f\2\2Y[\5\n\6\2ZY\3\2"+
		"\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3\2\2\2_a\5\20\t\2`"+
		"_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7\7\2\2"+
		"fg\5\22\n\2gh\7\n\2\2hi\7\20\2\2i\r\3\2\2\2jk\7\22\2\2kl\7\33\2\2lq\7"+
		"\36\2\2mq\7\31\2\2nq\7\22\2\2oq\7(\2\2pj\3\2\2\2pm\3\2\2\2pn\3\2\2\2p"+
		"o\3\2\2\2q\17\3\2\2\2rv\7\f\2\2su\5\20\t\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2"+
		"\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u009c\7\20\2\2z{\7\21\2\2{|\7\23\2\2"+
		"|}\5\22\n\2}~\7#\2\2~\177\5\20\t\2\177\u0080\7\"\2\2\u0080\u0081\5\20"+
		"\t\2\u0081\u009c\3\2\2\2\u0082\u0083\7\t\2\2\u0083\u0084\7\23\2\2\u0084"+
		"\u0085\5\22\n\2\u0085\u0086\7#\2\2\u0086\u0087\5\20\t\2\u0087\u009c\3"+
		"\2\2\2\u0088\u0089\7\32\2\2\u0089\u008a\7\23\2\2\u008a\u008b\5\22\n\2"+
		"\u008b\u008c\7#\2\2\u008c\u008d\7\n\2\2\u008d\u009c\3\2\2\2\u008e\u008f"+
		"\7(\2\2\u008f\u0090\7\16\2\2\u0090\u0091\5\22\n\2\u0091\u0092\7\n\2\2"+
		"\u0092\u009c\3\2\2\2\u0093\u0094\7(\2\2\u0094\u0095\7\33\2\2\u0095\u0096"+
		"\5\22\n\2\u0096\u0097\7\36\2\2\u0097\u0098\7\16\2\2\u0098\u0099\5\22\n"+
		"\2\u0099\u009a\7\n\2\2\u009a\u009c\3\2\2\2\u009br\3\2\2\2\u009bz\3\2\2"+
		"\2\u009b\u0082\3\2\2\2\u009b\u0088\3\2\2\2\u009b\u008e\3\2\2\2\u009b\u0093"+
		"\3\2\2\2\u009c\21\3\2\2\2\u009d\u009e\b\n\1\2\u009e\u009f\7 \2\2\u009f"+
		"\u00c8\5\22\n\4\u00a0\u00a1\7\33\2\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3"+
		"\7\36\2\2\u00a3\u00c8\3\2\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00c8\7\4\2\2"+
		"\u00a6\u00a7\7\30\2\2\u00a7\u00a8\7(\2\2\u00a8\u00b1\7\23\2\2\u00a9\u00ae"+
		"\5\22\n\2\u00aa\u00ab\7\26\2\2\u00ab\u00ad\5\22\n\2\u00ac\u00aa\3\2\2"+
		"\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00c8\7#\2\2\u00b4\u00c8\7\'\2\2\u00b5\u00c8\7\6"+
		"\2\2\u00b6\u00c8\7\27\2\2\u00b7\u00c8\7(\2\2\u00b8\u00c8\7\25\2\2\u00b9"+
		"\u00ba\7\5\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7\33\2\2\u00bc\u00bd\5"+
		"\22\n\2\u00bd\u00be\7\36\2\2\u00be\u00c8\3\2\2\2\u00bf\u00c0\7\5\2\2\u00c0"+
		"\u00c1\7(\2\2\u00c1\u00c2\7\23\2\2\u00c2\u00c8\7#\2\2\u00c3\u00c4\7\23"+
		"\2\2\u00c4\u00c5\5\22\n\2\u00c5\u00c6\7#\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u009d\3\2\2\2\u00c7\u00a0\3\2\2\2\u00c7\u00a4\3\2\2\2\u00c7\u00a6\3\2"+
		"\2\2\u00c7\u00b4\3\2\2\2\u00c7\u00b5\3\2\2\2\u00c7\u00b6\3\2\2\2\u00c7"+
		"\u00b7\3\2\2\2\u00c7\u00b8\3\2\2\2\u00c7\u00b9\3\2\2\2\u00c7\u00bf\3\2"+
		"\2\2\u00c7\u00c3\3\2\2\2\u00c8\u00ce\3\2\2\2\u00c9\u00ca\f\17\2\2\u00ca"+
		"\u00cb\t\2\2\2\u00cb\u00cd\5\22\n\20\u00cc\u00c9\3\2\2\2\u00cd\u00d0\3"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\23\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\21\30\66<BRU\\bpv\u009b\u00ae\u00b1\u00c7\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
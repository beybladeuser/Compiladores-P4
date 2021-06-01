// Generated from E:/escola/universidade_boi/3_ano/2_semestre/Compiladores/Praticas/Compiladores-P3/P3-SemanticsForALG/src\alg.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alg extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, BOOL=2, FLOAT=3, STRING=4, VOID=5, SIZEOF=6, NULL=7, ALG=8, TRUE=9, 
		FALSE=10, WHILE=11, DO=12, FINALLY=13, LEAVE=14, RESTART=15, RETURN=16, 
		IF=17, THEN=18, ELSE=19, WRITE=20, WRITELN=21, BLANK=22, COMMENT=23, COMMA=24, 
		SEMMI_COLON=25, LPARENT=26, RPARENT=27, IDENT=28, LITERAL_INTEGER=29, 
		LITERAL_REAL=30, CHAR_CHAIN=31, LBRACKET=32, RBRACKET=33, LCURLY=34, RCURLY=35, 
		PLUS_OP=36, MINUS_OP=37, POINTER_EXTRATION_OP=38, MULTIPLICATION_OP=39, 
		DIVISION_OP=40, REMAINDER_OP=41, LTRIANG=42, RTRIANG=43, COMPARISON_OP=44, 
		EQUALITY_OP=45, NEGATION_OP=46, LOGICAL_AND_OP=47, LOGICAL_OR_OP=48, ATTRIBUTION_OP=49, 
		DOUBLE_ARROW_OP=50, AT_OP=51;
	public static final int
		RULE_alg_file = 0, RULE_alg_program = 1, RULE_alg_declaration = 2, RULE_alg_var_declaration = 3, 
		RULE_alg_simple_var_declaration = 4, RULE_alg_type = 5, RULE_alg_primitive_type = 6, 
		RULE_alg_pointer_type = 7, RULE_alg_init_var_declaration = 8, RULE_alg_simple_expression = 9, 
		RULE_alg_simple_expression_aux = 10, RULE_alg_expression = 11, RULE_alg_func_type = 12, 
		RULE_alg_func_declaration = 13, RULE_alg_alg_function_args = 14, RULE_alg_func_declaration_arg = 15, 
		RULE_alg_func_body = 16, RULE_alg_func_prologue = 17, RULE_alg_func_epilogue = 18, 
		RULE_alg_block = 19, RULE_alg_funtion_call = 20, RULE_alg_funtion_call_args = 21, 
		RULE_alg_funtion_call_args_aux = 22, RULE_alg_instruction = 23, RULE_alg_instruction_controle = 24, 
		RULE_alg_instruction_controle_next = 25, RULE_lado_esquerdo = 26, RULE_alg_atrib = 27, 
		RULE_alg_instruction_cond = 28, RULE_alg_instruction_cond_next = 29, RULE_alg_cicle = 30, 
		RULE_alg_cicle_next = 31, RULE_alg_subblock = 32, RULE_alg_instr_repeat = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"alg_file", "alg_program", "alg_declaration", "alg_var_declaration", 
			"alg_simple_var_declaration", "alg_type", "alg_primitive_type", "alg_pointer_type", 
			"alg_init_var_declaration", "alg_simple_expression", "alg_simple_expression_aux", 
			"alg_expression", "alg_func_type", "alg_func_declaration", "alg_alg_function_args", 
			"alg_func_declaration_arg", "alg_func_body", "alg_func_prologue", "alg_func_epilogue", 
			"alg_block", "alg_funtion_call", "alg_funtion_call_args", "alg_funtion_call_args_aux", 
			"alg_instruction", "alg_instruction_controle", "alg_instruction_controle_next", 
			"lado_esquerdo", "alg_atrib", "alg_instruction_cond", "alg_instruction_cond_next", 
			"alg_cicle", "alg_cicle_next", "alg_subblock", "alg_instr_repeat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'bool'", "'float'", "'string'", "'void'", "'sizeof'", 
			"'null'", "'alg'", "'true'", "'false'", "'while'", "'do'", "'finally'", 
			"'leave'", "'restart'", "'return'", "'if'", "'then'", "'else'", "'write'", 
			"'writeln'", null, null, "','", "';'", "'('", "')'", null, null, null, 
			null, "'['", "']'", "'{'", "'}'", "'+'", "'-'", "'?'", "'*'", "'/'", 
			"'%'", "'<'", "'>'", null, null, "'~'", "'&&'", "'||'", "'='", "'>>'", 
			"'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", 
			"TRUE", "FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", 
			"IF", "THEN", "ELSE", "WRITE", "WRITELN", "BLANK", "COMMENT", "COMMA", 
			"SEMMI_COLON", "LPARENT", "RPARENT", "IDENT", "LITERAL_INTEGER", "LITERAL_REAL", 
			"CHAR_CHAIN", "LBRACKET", "RBRACKET", "LCURLY", "RCURLY", "PLUS_OP", 
			"MINUS_OP", "POINTER_EXTRATION_OP", "MULTIPLICATION_OP", "DIVISION_OP", 
			"REMAINDER_OP", "LTRIANG", "RTRIANG", "COMPARISON_OP", "EQUALITY_OP", 
			"NEGATION_OP", "LOGICAL_AND_OP", "LOGICAL_OR_OP", "ATTRIBUTION_OP", "DOUBLE_ARROW_OP", 
			"AT_OP"
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
	public String getGrammarFileName() { return "alg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alg(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Alg_fileContext extends ParserRuleContext {
		public Alg_programContext alg_program() {
			return getRuleContext(Alg_programContext.class,0);
		}
		public TerminalNode EOF() { return getToken(alg.EOF, 0); }
		public Alg_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_fileContext alg_file() throws RecognitionException {
		Alg_fileContext _localctx = new Alg_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_alg_file);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case VOID:
			case LTRIANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				alg_program();
				setState(69);
				match(EOF);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(EOF);
				notifyErrorListeners("Valid ALG program requires at least one declaration, but only <EOF> was found");
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

	public static class Alg_programContext extends ParserRuleContext {
		public List<Alg_declarationContext> alg_declaration() {
			return getRuleContexts(Alg_declarationContext.class);
		}
		public Alg_declarationContext alg_declaration(int i) {
			return getRuleContext(Alg_declarationContext.class,i);
		}
		public Alg_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_programContext alg_program() throws RecognitionException {
		Alg_programContext _localctx = new Alg_programContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_alg_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(75);
				alg_declaration();
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << VOID) | (1L << LTRIANG))) != 0) );
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

	public static class Alg_declarationContext extends ParserRuleContext {
		public Alg_var_declarationContext alg_var_declaration() {
			return getRuleContext(Alg_var_declarationContext.class,0);
		}
		public TerminalNode SEMMI_COLON() { return getToken(alg.SEMMI_COLON, 0); }
		public Alg_func_declarationContext alg_func_declaration() {
			return getRuleContext(Alg_func_declarationContext.class,0);
		}
		public Alg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_declarationContext alg_declaration() throws RecognitionException {
		Alg_declarationContext _localctx = new Alg_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alg_declaration);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				alg_var_declaration();
				setState(81);
				match(SEMMI_COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				alg_func_declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				alg_var_declaration();
				notifyErrorListeners("Missing closing ;");
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

	public static class Alg_var_declarationContext extends ParserRuleContext {
		public Alg_simple_var_declarationContext alg_simple_var_declaration() {
			return getRuleContext(Alg_simple_var_declarationContext.class,0);
		}
		public Alg_init_var_declarationContext alg_init_var_declaration() {
			return getRuleContext(Alg_init_var_declarationContext.class,0);
		}
		public Alg_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_var_declarationContext alg_var_declaration() throws RecognitionException {
		Alg_var_declarationContext _localctx = new Alg_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alg_var_declaration);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				alg_simple_var_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				alg_init_var_declaration();
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

	public static class Alg_simple_var_declarationContext extends ParserRuleContext {
		public Alg_typeContext alg_type() {
			return getRuleContext(Alg_typeContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alg.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alg.COMMA, i);
		}
		public Alg_simple_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_simple_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_simple_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_simple_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_simple_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_simple_var_declarationContext alg_simple_var_declaration() throws RecognitionException {
		Alg_simple_var_declarationContext _localctx = new Alg_simple_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alg_simple_var_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			alg_type();
			setState(94);
			match(IDENT);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(95);
				match(COMMA);
				setState(96);
				match(IDENT);
				}
				}
				setState(101);
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

	public static class Alg_typeContext extends ParserRuleContext {
		public Alg_primitive_typeContext alg_primitive_type() {
			return getRuleContext(Alg_primitive_typeContext.class,0);
		}
		public Alg_pointer_typeContext alg_pointer_type() {
			return getRuleContext(Alg_pointer_typeContext.class,0);
		}
		public Alg_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_typeContext alg_type() throws RecognitionException {
		Alg_typeContext _localctx = new Alg_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alg_type);
		try {
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				alg_primitive_type();
				}
				break;
			case LTRIANG:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				alg_pointer_type();
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

	public static class Alg_primitive_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public TerminalNode BOOL() { return getToken(alg.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(alg.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public Alg_primitive_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_primitive_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_primitive_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_primitive_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_primitive_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_primitive_typeContext alg_primitive_type() throws RecognitionException {
		Alg_primitive_typeContext _localctx = new Alg_primitive_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alg_primitive_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
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

	public static class Alg_pointer_typeContext extends ParserRuleContext {
		public TerminalNode LTRIANG() { return getToken(alg.LTRIANG, 0); }
		public Alg_primitive_typeContext alg_primitive_type() {
			return getRuleContext(Alg_primitive_typeContext.class,0);
		}
		public TerminalNode RTRIANG() { return getToken(alg.RTRIANG, 0); }
		public Alg_pointer_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_pointer_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_pointer_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_pointer_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_pointer_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_pointer_typeContext alg_pointer_type() throws RecognitionException {
		Alg_pointer_typeContext _localctx = new Alg_pointer_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alg_pointer_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LTRIANG);
			setState(109);
			alg_primitive_type();
			setState(110);
			match(RTRIANG);
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

	public static class Alg_init_var_declarationContext extends ParserRuleContext {
		public Alg_typeContext alg_type() {
			return getRuleContext(Alg_typeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode ATTRIBUTION_OP() { return getToken(alg.ATTRIBUTION_OP, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(alg.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(alg.RBRACKET, 0); }
		public Alg_init_var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_init_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_init_var_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_init_var_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_init_var_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_init_var_declarationContext alg_init_var_declaration() throws RecognitionException {
		Alg_init_var_declarationContext _localctx = new Alg_init_var_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alg_init_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			alg_type();
			setState(113);
			match(IDENT);
			setState(114);
			match(ATTRIBUTION_OP);
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case LPARENT:
			case IDENT:
			case LITERAL_INTEGER:
			case LITERAL_REAL:
			case CHAR_CHAIN:
			case PLUS_OP:
			case MINUS_OP:
			case POINTER_EXTRATION_OP:
			case NEGATION_OP:
			case AT_OP:
				{
				setState(115);
				alg_expression(0);
				}
				break;
			case LBRACKET:
				{
				setState(116);
				match(LBRACKET);
				setState(117);
				alg_expression(0);
				setState(118);
				match(RBRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Alg_simple_expressionContext extends ParserRuleContext {
		public Alg_simple_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_simple_expression; }
	 
		public Alg_simple_expressionContext() { }
		public void copyFrom(Alg_simple_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallContext extends Alg_simple_expressionContext {
		public Alg_funtion_callContext alg_funtion_call() {
			return getRuleContext(Alg_funtion_callContext.class,0);
		}
		public CallContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends Alg_simple_expressionContext {
		public TerminalNode NULL() { return getToken(alg.NULL, 0); }
		public NullContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends Alg_simple_expressionContext {
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public VarContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealContext extends Alg_simple_expressionContext {
		public TerminalNode LITERAL_REAL() { return getToken(alg.LITERAL_REAL, 0); }
		public RealContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_TrueContext extends Alg_simple_expressionContext {
		public TerminalNode TRUE() { return getToken(alg.TRUE, 0); }
		public Bool_TrueContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBool_True(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBool_True(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBool_True(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends Alg_simple_expressionContext {
		public TerminalNode CHAR_CHAIN() { return getToken(alg.CHAR_CHAIN, 0); }
		public StringContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Bool_FalseContext extends Alg_simple_expressionContext {
		public TerminalNode FALSE() { return getToken(alg.FALSE, 0); }
		public Bool_FalseContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterBool_False(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitBool_False(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitBool_False(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends Alg_simple_expressionContext {
		public TerminalNode LITERAL_INTEGER() { return getToken(alg.LITERAL_INTEGER, 0); }
		public IntContext(Alg_simple_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_simple_expressionContext alg_simple_expression() throws RecognitionException {
		Alg_simple_expressionContext _localctx = new Alg_simple_expressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alg_simple_expression);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(LITERAL_INTEGER);
				}
				break;
			case 2:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(NULL);
				}
				break;
			case 3:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				match(LITERAL_REAL);
				}
				break;
			case 4:
				_localctx = new Bool_TrueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				match(TRUE);
				}
				break;
			case 5:
				_localctx = new Bool_FalseContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(FALSE);
				}
				break;
			case 6:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				match(CHAR_CHAIN);
				}
				break;
			case 7:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				match(IDENT);
				}
				break;
			case 8:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				alg_funtion_call();
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

	public static class Alg_simple_expression_auxContext extends ParserRuleContext {
		public Alg_simple_expression_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_simple_expression_aux; }
	 
		public Alg_simple_expression_auxContext() { }
		public void copyFrom(Alg_simple_expression_auxContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Paren_fail_2Context extends Alg_simple_expression_auxContext {
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public Paren_fail_2Context(Alg_simple_expression_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterParen_fail_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitParen_fail_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitParen_fail_2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Paren_fail_1Context extends Alg_simple_expression_auxContext {
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public List<TerminalNode> RPARENT() { return getTokens(alg.RPARENT); }
		public TerminalNode RPARENT(int i) {
			return getToken(alg.RPARENT, i);
		}
		public Paren_fail_1Context(Alg_simple_expression_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterParen_fail_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitParen_fail_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitParen_fail_1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Simple_exprContext extends Alg_simple_expression_auxContext {
		public Alg_simple_expressionContext alg_simple_expression() {
			return getRuleContext(Alg_simple_expressionContext.class,0);
		}
		public Simple_exprContext(Alg_simple_expression_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSimple_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends Alg_simple_expression_auxContext {
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public ParenContext(Alg_simple_expression_auxContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_simple_expression_auxContext alg_simple_expression_aux() throws RecognitionException {
		Alg_simple_expression_auxContext _localctx = new Alg_simple_expression_auxContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alg_simple_expression_aux);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new Simple_exprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				alg_simple_expression();
				}
				break;
			case 2:
				_localctx = new ParenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(LPARENT);
				setState(134);
				alg_expression(0);
				setState(135);
				match(RPARENT);
				}
				break;
			case 3:
				_localctx = new Paren_fail_1Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(LPARENT);
				setState(138);
				alg_expression(0);
				setState(139);
				match(RPARENT);
				setState(140);
				match(RPARENT);
				notifyErrorListeners("Didn't expect closing ')'");
				}
				break;
			case 4:
				_localctx = new Paren_fail_2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(LPARENT);
				setState(144);
				alg_expression(0);
				notifyErrorListeners("Missing closing ')'");
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

	public static class Alg_expressionContext extends ParserRuleContext {
		public Alg_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_expression; }
	 
		public Alg_expressionContext() { }
		public void copyFrom(Alg_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class And_opContext extends Alg_expressionContext {
		public List<Alg_expressionContext> alg_expression() {
			return getRuleContexts(Alg_expressionContext.class);
		}
		public Alg_expressionContext alg_expression(int i) {
			return getRuleContext(Alg_expressionContext.class,i);
		}
		public TerminalNode LOGICAL_AND_OP() { return getToken(alg.LOGICAL_AND_OP, 0); }
		public And_opContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAnd_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAnd_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAnd_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends Alg_expressionContext {
		public List<Alg_expressionContext> alg_expression() {
			return getRuleContexts(Alg_expressionContext.class);
		}
		public Alg_expressionContext alg_expression(int i) {
			return getRuleContext(Alg_expressionContext.class,i);
		}
		public TerminalNode MULTIPLICATION_OP() { return getToken(alg.MULTIPLICATION_OP, 0); }
		public TerminalNode DIVISION_OP() { return getToken(alg.DIVISION_OP, 0); }
		public TerminalNode REMAINDER_OP() { return getToken(alg.REMAINDER_OP, 0); }
		public MultiplicationContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends Alg_expressionContext {
		public List<Alg_expressionContext> alg_expression() {
			return getRuleContexts(Alg_expressionContext.class);
		}
		public Alg_expressionContext alg_expression(int i) {
			return getRuleContext(Alg_expressionContext.class,i);
		}
		public TerminalNode PLUS_OP() { return getToken(alg.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(alg.MINUS_OP, 0); }
		public AdditionContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_opContext extends Alg_expressionContext {
		public List<Alg_expressionContext> alg_expression() {
			return getRuleContexts(Alg_expressionContext.class);
		}
		public Alg_expressionContext alg_expression(int i) {
			return getRuleContext(Alg_expressionContext.class,i);
		}
		public TerminalNode LOGICAL_OR_OP() { return getToken(alg.LOGICAL_OR_OP, 0); }
		public Or_opContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterOr_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitOr_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitOr_op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparissonContext extends Alg_expressionContext {
		public List<Alg_expressionContext> alg_expression() {
			return getRuleContexts(Alg_expressionContext.class);
		}
		public Alg_expressionContext alg_expression(int i) {
			return getRuleContext(Alg_expressionContext.class,i);
		}
		public TerminalNode LTRIANG() { return getToken(alg.LTRIANG, 0); }
		public TerminalNode RTRIANG() { return getToken(alg.RTRIANG, 0); }
		public TerminalNode COMPARISON_OP() { return getToken(alg.COMPARISON_OP, 0); }
		public TerminalNode EQUALITY_OP() { return getToken(alg.EQUALITY_OP, 0); }
		public ComparissonContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterComparisson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitComparisson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitComparisson(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Simple_expressionContext extends Alg_expressionContext {
		public Alg_simple_expression_auxContext alg_simple_expression_aux() {
			return getRuleContext(Alg_simple_expression_auxContext.class,0);
		}
		public Simple_expressionContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSimple_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSimple_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSimple_expression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Unary_OpContext extends Alg_expressionContext {
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public TerminalNode PLUS_OP() { return getToken(alg.PLUS_OP, 0); }
		public TerminalNode MINUS_OP() { return getToken(alg.MINUS_OP, 0); }
		public TerminalNode NEGATION_OP() { return getToken(alg.NEGATION_OP, 0); }
		public TerminalNode POINTER_EXTRATION_OP() { return getToken(alg.POINTER_EXTRATION_OP, 0); }
		public Unary_OpContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterUnary_Op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitUnary_Op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitUnary_Op(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pointer_IndexingContext extends Alg_expressionContext {
		public List<Alg_expressionContext> alg_expression() {
			return getRuleContexts(Alg_expressionContext.class);
		}
		public Alg_expressionContext alg_expression(int i) {
			return getRuleContext(Alg_expressionContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(alg.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(alg.RBRACKET, 0); }
		public Pointer_IndexingContext(Alg_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterPointer_Indexing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitPointer_Indexing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitPointer_Indexing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_expressionContext alg_expression() throws RecognitionException {
		return alg_expression(0);
	}

	private Alg_expressionContext alg_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Alg_expressionContext _localctx = new Alg_expressionContext(_ctx, _parentState);
		Alg_expressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_alg_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case LPARENT:
			case IDENT:
			case LITERAL_INTEGER:
			case LITERAL_REAL:
			case CHAR_CHAIN:
			case AT_OP:
				{
				_localctx = new Simple_expressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(150);
				alg_simple_expression_aux();
				}
				break;
			case PLUS_OP:
			case MINUS_OP:
			case POINTER_EXTRATION_OP:
			case NEGATION_OP:
				{
				_localctx = new Unary_OpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS_OP) | (1L << MINUS_OP) | (1L << POINTER_EXTRATION_OP) | (1L << NEGATION_OP))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(152);
				alg_expression(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(175);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new Alg_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_alg_expression);
						setState(155);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(156);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLICATION_OP) | (1L << DIVISION_OP) | (1L << REMAINDER_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						alg_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new Alg_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_alg_expression);
						setState(158);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(159);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OP || _la==MINUS_OP) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(160);
						alg_expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ComparissonContext(new Alg_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_alg_expression);
						setState(161);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(162);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LTRIANG) | (1L << RTRIANG) | (1L << COMPARISON_OP) | (1L << EQUALITY_OP))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(163);
						alg_expression(4);
						}
						break;
					case 4:
						{
						_localctx = new And_opContext(new Alg_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_alg_expression);
						setState(164);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(165);
						match(LOGICAL_AND_OP);
						setState(166);
						alg_expression(3);
						}
						break;
					case 5:
						{
						_localctx = new Or_opContext(new Alg_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_alg_expression);
						setState(167);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(168);
						match(LOGICAL_OR_OP);
						setState(169);
						alg_expression(2);
						}
						break;
					case 6:
						{
						_localctx = new Pointer_IndexingContext(new Alg_expressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_alg_expression);
						setState(170);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(171);
						match(LBRACKET);
						setState(172);
						alg_expression(0);
						setState(173);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(179);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Alg_func_typeContext extends ParserRuleContext {
		public Alg_typeContext alg_type() {
			return getRuleContext(Alg_typeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(alg.VOID, 0); }
		public Alg_func_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_func_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_func_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_func_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_func_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_func_typeContext alg_func_type() throws RecognitionException {
		Alg_func_typeContext _localctx = new Alg_func_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_alg_func_type);
		try {
			setState(182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case LTRIANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				alg_type();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(VOID);
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

	public static class Alg_func_declarationContext extends ParserRuleContext {
		public Alg_func_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_func_declaration; }
	 
		public Alg_func_declarationContext() { }
		public void copyFrom(Alg_func_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Normal_FuncContext extends Alg_func_declarationContext {
		public Alg_func_typeContext alg_func_type() {
			return getRuleContext(Alg_func_typeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_func_declaration_argContext alg_func_declaration_arg() {
			return getRuleContext(Alg_func_declaration_argContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public Alg_func_bodyContext alg_func_body() {
			return getRuleContext(Alg_func_bodyContext.class,0);
		}
		public Normal_FuncContext(Alg_func_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterNormal_Func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitNormal_Func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitNormal_Func(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ALG_FuncContext extends Alg_func_declarationContext {
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public TerminalNode ALG() { return getToken(alg.ALG, 0); }
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_alg_function_argsContext alg_alg_function_args() {
			return getRuleContext(Alg_alg_function_argsContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public Alg_func_bodyContext alg_func_body() {
			return getRuleContext(Alg_func_bodyContext.class,0);
		}
		public ALG_FuncContext(Alg_func_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterALG_Func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitALG_Func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitALG_Func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_func_declarationContext alg_func_declaration() throws RecognitionException {
		Alg_func_declarationContext _localctx = new Alg_func_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alg_func_declaration);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new Normal_FuncContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				alg_func_type();
				setState(185);
				match(IDENT);
				setState(186);
				match(LPARENT);
				setState(187);
				alg_func_declaration_arg();
				setState(188);
				match(RPARENT);
				setState(189);
				alg_func_body();
				}
				break;
			case 2:
				_localctx = new ALG_FuncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(INT);
				setState(192);
				match(ALG);
				setState(193);
				match(LPARENT);
				setState(194);
				alg_alg_function_args();
				setState(195);
				match(RPARENT);
				setState(196);
				alg_func_body();
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

	public static class Alg_alg_function_argsContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(alg.INT, 0); }
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public TerminalNode COMMA() { return getToken(alg.COMMA, 0); }
		public TerminalNode LTRIANG() { return getToken(alg.LTRIANG, 0); }
		public TerminalNode STRING() { return getToken(alg.STRING, 0); }
		public TerminalNode RTRIANG() { return getToken(alg.RTRIANG, 0); }
		public Alg_alg_function_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_alg_function_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_alg_function_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_alg_function_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_alg_function_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_alg_function_argsContext alg_alg_function_args() throws RecognitionException {
		Alg_alg_function_argsContext _localctx = new Alg_alg_function_argsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alg_alg_function_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(INT);
			setState(201);
			match(IDENT);
			setState(202);
			match(COMMA);
			setState(203);
			match(LTRIANG);
			setState(204);
			match(STRING);
			setState(205);
			match(RTRIANG);
			setState(206);
			match(IDENT);
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

	public static class Alg_func_declaration_argContext extends ParserRuleContext {
		public List<Alg_typeContext> alg_type() {
			return getRuleContexts(Alg_typeContext.class);
		}
		public Alg_typeContext alg_type(int i) {
			return getRuleContext(Alg_typeContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(alg.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(alg.IDENT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(alg.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(alg.COMMA, i);
		}
		public Alg_func_declaration_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_func_declaration_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_func_declaration_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_func_declaration_arg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_func_declaration_arg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_func_declaration_argContext alg_func_declaration_arg() throws RecognitionException {
		Alg_func_declaration_argContext _localctx = new Alg_func_declaration_argContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alg_func_declaration_arg);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case LTRIANG:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				alg_type();
				setState(209);
				match(IDENT);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(210);
					match(COMMA);
					setState(211);
					alg_type();
					setState(212);
					match(IDENT);
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPARENT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Alg_func_bodyContext extends ParserRuleContext {
		public Alg_func_prologueContext alg_func_prologue() {
			return getRuleContext(Alg_func_prologueContext.class,0);
		}
		public Alg_blockContext alg_block() {
			return getRuleContext(Alg_blockContext.class,0);
		}
		public Alg_func_epilogueContext alg_func_epilogue() {
			return getRuleContext(Alg_func_epilogueContext.class,0);
		}
		public Alg_func_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_func_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_func_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_func_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_func_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_func_bodyContext alg_func_body() throws RecognitionException {
		Alg_func_bodyContext _localctx = new Alg_func_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alg_func_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			alg_func_prologue();
			setState(223);
			alg_block();
			setState(224);
			alg_func_epilogue();
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

	public static class Alg_func_prologueContext extends ParserRuleContext {
		public TerminalNode AT_OP() { return getToken(alg.AT_OP, 0); }
		public Alg_blockContext alg_block() {
			return getRuleContext(Alg_blockContext.class,0);
		}
		public Alg_func_prologueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_func_prologue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_func_prologue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_func_prologue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_func_prologue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_func_prologueContext alg_func_prologue() throws RecognitionException {
		Alg_func_prologueContext _localctx = new Alg_func_prologueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alg_func_prologue);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(AT_OP);
				setState(227);
				alg_block();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Alg_func_epilogueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_ARROW_OP() { return getToken(alg.DOUBLE_ARROW_OP, 0); }
		public Alg_blockContext alg_block() {
			return getRuleContext(Alg_blockContext.class,0);
		}
		public Alg_func_epilogueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_func_epilogue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_func_epilogue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_func_epilogue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_func_epilogue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_func_epilogueContext alg_func_epilogue() throws RecognitionException {
		Alg_func_epilogueContext _localctx = new Alg_func_epilogueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alg_func_epilogue);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_ARROW_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(DOUBLE_ARROW_OP);
				setState(232);
				alg_block();
				}
				break;
			case EOF:
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case VOID:
			case LTRIANG:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Alg_blockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(alg.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(alg.RCURLY, 0); }
		public List<Alg_var_declarationContext> alg_var_declaration() {
			return getRuleContexts(Alg_var_declarationContext.class);
		}
		public Alg_var_declarationContext alg_var_declaration(int i) {
			return getRuleContext(Alg_var_declarationContext.class,i);
		}
		public List<TerminalNode> SEMMI_COLON() { return getTokens(alg.SEMMI_COLON); }
		public TerminalNode SEMMI_COLON(int i) {
			return getToken(alg.SEMMI_COLON, i);
		}
		public List<Alg_instructionContext> alg_instruction() {
			return getRuleContexts(Alg_instructionContext.class);
		}
		public Alg_instructionContext alg_instruction(int i) {
			return getRuleContext(Alg_instructionContext.class,i);
		}
		public Alg_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_blockContext alg_block() throws RecognitionException {
		Alg_blockContext _localctx = new Alg_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alg_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(LCURLY);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << FLOAT) | (1L << STRING) | (1L << LTRIANG))) != 0)) {
				{
				{
				setState(237);
				alg_var_declaration();
				setState(238);
				match(SEMMI_COLON);
				}
				}
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				alg_instruction();
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZEOF) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << WHILE) | (1L << LEAVE) | (1L << RESTART) | (1L << RETURN) | (1L << IF) | (1L << WRITE) | (1L << WRITELN) | (1L << LPARENT) | (1L << IDENT) | (1L << LITERAL_INTEGER) | (1L << LITERAL_REAL) | (1L << CHAR_CHAIN) | (1L << LCURLY) | (1L << PLUS_OP) | (1L << MINUS_OP) | (1L << POINTER_EXTRATION_OP) | (1L << NEGATION_OP) | (1L << AT_OP))) != 0) );
			setState(250);
			match(RCURLY);
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

	public static class Alg_funtion_callContext extends ParserRuleContext {
		public Alg_funtion_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_funtion_call; }
	 
		public Alg_funtion_callContext() { }
		public void copyFrom(Alg_funtion_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sizeof_Function_CallContext extends Alg_funtion_callContext {
		public TerminalNode SIZEOF() { return getToken(alg.SIZEOF, 0); }
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public Sizeof_Function_CallContext(Alg_funtion_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterSizeof_Function_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitSizeof_Function_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitSizeof_Function_Call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Normal_Function_CallContext extends Alg_funtion_callContext {
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_funtion_call_argsContext alg_funtion_call_args() {
			return getRuleContext(Alg_funtion_call_argsContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public Normal_Function_CallContext(Alg_funtion_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterNormal_Function_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitNormal_Function_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitNormal_Function_Call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteLn_Function_CallContext extends Alg_funtion_callContext {
		public TerminalNode WRITELN() { return getToken(alg.WRITELN, 0); }
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_funtion_call_argsContext alg_funtion_call_args() {
			return getRuleContext(Alg_funtion_call_argsContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public WriteLn_Function_CallContext(Alg_funtion_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterWriteLn_Function_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitWriteLn_Function_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitWriteLn_Function_Call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Write_Function_CallContext extends Alg_funtion_callContext {
		public TerminalNode WRITE() { return getToken(alg.WRITE, 0); }
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public Alg_funtion_call_argsContext alg_funtion_call_args() {
			return getRuleContext(Alg_funtion_call_argsContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public Write_Function_CallContext(Alg_funtion_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterWrite_Function_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitWrite_Function_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitWrite_Function_Call(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AT_Function_CallContext extends Alg_funtion_callContext {
		public TerminalNode AT_OP() { return getToken(alg.AT_OP, 0); }
		public TerminalNode LPARENT() { return getToken(alg.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(alg.RPARENT, 0); }
		public AT_Function_CallContext(Alg_funtion_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAT_Function_Call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAT_Function_Call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAT_Function_Call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_funtion_callContext alg_funtion_call() throws RecognitionException {
		Alg_funtion_callContext _localctx = new Alg_funtion_callContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alg_funtion_call);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				_localctx = new Normal_Function_CallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				match(IDENT);
				setState(253);
				match(LPARENT);
				setState(254);
				alg_funtion_call_args();
				setState(255);
				match(RPARENT);
				}
				break;
			case AT_OP:
				_localctx = new AT_Function_CallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(AT_OP);
				setState(258);
				match(LPARENT);
				setState(259);
				match(RPARENT);
				}
				break;
			case SIZEOF:
				_localctx = new Sizeof_Function_CallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(SIZEOF);
				setState(261);
				match(LPARENT);
				setState(262);
				alg_expression(0);
				setState(263);
				match(RPARENT);
				}
				break;
			case WRITE:
				_localctx = new Write_Function_CallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				match(WRITE);
				setState(266);
				match(LPARENT);
				setState(267);
				alg_funtion_call_args();
				setState(268);
				match(RPARENT);
				}
				break;
			case WRITELN:
				_localctx = new WriteLn_Function_CallContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(WRITELN);
				setState(271);
				match(LPARENT);
				setState(272);
				alg_funtion_call_args();
				setState(273);
				match(RPARENT);
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

	public static class Alg_funtion_call_argsContext extends ParserRuleContext {
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public Alg_funtion_call_args_auxContext alg_funtion_call_args_aux() {
			return getRuleContext(Alg_funtion_call_args_auxContext.class,0);
		}
		public Alg_funtion_call_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_funtion_call_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_funtion_call_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_funtion_call_args(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_funtion_call_args(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_funtion_call_argsContext alg_funtion_call_args() throws RecognitionException {
		Alg_funtion_call_argsContext _localctx = new Alg_funtion_call_argsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alg_funtion_call_args);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case LPARENT:
			case IDENT:
			case LITERAL_INTEGER:
			case LITERAL_REAL:
			case CHAR_CHAIN:
			case PLUS_OP:
			case MINUS_OP:
			case POINTER_EXTRATION_OP:
			case NEGATION_OP:
			case AT_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				alg_expression(0);
				setState(278);
				alg_funtion_call_args_aux();
				}
				break;
			case RPARENT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Alg_funtion_call_args_auxContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(alg.COMMA, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public Alg_funtion_call_args_auxContext alg_funtion_call_args_aux() {
			return getRuleContext(Alg_funtion_call_args_auxContext.class,0);
		}
		public Alg_funtion_call_args_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_funtion_call_args_aux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_funtion_call_args_aux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_funtion_call_args_aux(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_funtion_call_args_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_funtion_call_args_auxContext alg_funtion_call_args_aux() throws RecognitionException {
		Alg_funtion_call_args_auxContext _localctx = new Alg_funtion_call_args_auxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alg_funtion_call_args_aux);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(COMMA);
				setState(284);
				alg_expression(0);
				setState(285);
				alg_funtion_call_args_aux();
				}
				break;
			case RPARENT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Alg_instructionContext extends ParserRuleContext {
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public TerminalNode SEMMI_COLON() { return getToken(alg.SEMMI_COLON, 0); }
		public Alg_instruction_controleContext alg_instruction_controle() {
			return getRuleContext(Alg_instruction_controleContext.class,0);
		}
		public Alg_atribContext alg_atrib() {
			return getRuleContext(Alg_atribContext.class,0);
		}
		public Alg_instruction_condContext alg_instruction_cond() {
			return getRuleContext(Alg_instruction_condContext.class,0);
		}
		public Alg_cicleContext alg_cicle() {
			return getRuleContext(Alg_cicleContext.class,0);
		}
		public Alg_subblockContext alg_subblock() {
			return getRuleContext(Alg_subblockContext.class,0);
		}
		public Alg_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_instructionContext alg_instruction() throws RecognitionException {
		Alg_instructionContext _localctx = new Alg_instructionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alg_instruction);
		try {
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				alg_expression(0);
				setState(291);
				match(SEMMI_COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				alg_instruction_controle();
				setState(294);
				match(SEMMI_COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				alg_atrib();
				setState(297);
				match(SEMMI_COLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				alg_instruction_cond();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				alg_cicle();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				alg_subblock();
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

	public static class Alg_instruction_controleContext extends ParserRuleContext {
		public Alg_instruction_controleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_instruction_controle; }
	 
		public Alg_instruction_controleContext() { }
		public void copyFrom(Alg_instruction_controleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Restart_control_instrContext extends Alg_instruction_controleContext {
		public TerminalNode RESTART() { return getToken(alg.RESTART, 0); }
		public Restart_control_instrContext(Alg_instruction_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterRestart_control_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitRestart_control_instr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitRestart_control_instr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Return_control_instrContext extends Alg_instruction_controleContext {
		public TerminalNode RETURN() { return getToken(alg.RETURN, 0); }
		public Alg_instruction_controle_nextContext alg_instruction_controle_next() {
			return getRuleContext(Alg_instruction_controle_nextContext.class,0);
		}
		public Return_control_instrContext(Alg_instruction_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterReturn_control_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitReturn_control_instr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitReturn_control_instr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Leave_control_instrContext extends Alg_instruction_controleContext {
		public TerminalNode LEAVE() { return getToken(alg.LEAVE, 0); }
		public Leave_control_instrContext(Alg_instruction_controleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterLeave_control_instr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitLeave_control_instr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitLeave_control_instr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_instruction_controleContext alg_instruction_controle() throws RecognitionException {
		Alg_instruction_controleContext _localctx = new Alg_instruction_controleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alg_instruction_controle);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEAVE:
				_localctx = new Leave_control_instrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				match(LEAVE);
				}
				break;
			case RESTART:
				_localctx = new Restart_control_instrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(RESTART);
				}
				break;
			case RETURN:
				_localctx = new Return_control_instrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(RETURN);
				setState(307);
				alg_instruction_controle_next();
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

	public static class Alg_instruction_controle_nextContext extends ParserRuleContext {
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public Alg_instruction_controle_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_instruction_controle_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_instruction_controle_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_instruction_controle_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_instruction_controle_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_instruction_controle_nextContext alg_instruction_controle_next() throws RecognitionException {
		Alg_instruction_controle_nextContext _localctx = new Alg_instruction_controle_nextContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alg_instruction_controle_next);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WRITE:
			case WRITELN:
			case LPARENT:
			case IDENT:
			case LITERAL_INTEGER:
			case LITERAL_REAL:
			case CHAR_CHAIN:
			case PLUS_OP:
			case MINUS_OP:
			case POINTER_EXTRATION_OP:
			case NEGATION_OP:
			case AT_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				alg_expression(0);
				}
				break;
			case SEMMI_COLON:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Lado_esquerdoContext extends ParserRuleContext {
		public Lado_esquerdoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lado_esquerdo; }
	 
		public Lado_esquerdoContext() { }
		public void copyFrom(Lado_esquerdoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Lado_esquerdo_pointer_indexContext extends Lado_esquerdoContext {
		public List<Alg_expressionContext> alg_expression() {
			return getRuleContexts(Alg_expressionContext.class);
		}
		public Alg_expressionContext alg_expression(int i) {
			return getRuleContext(Alg_expressionContext.class,i);
		}
		public TerminalNode LBRACKET() { return getToken(alg.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(alg.RBRACKET, 0); }
		public Lado_esquerdo_pointer_indexContext(Lado_esquerdoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterLado_esquerdo_pointer_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitLado_esquerdo_pointer_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitLado_esquerdo_pointer_index(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Lado_esquerdo_identContext extends Lado_esquerdoContext {
		public TerminalNode IDENT() { return getToken(alg.IDENT, 0); }
		public Lado_esquerdo_identContext(Lado_esquerdoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterLado_esquerdo_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitLado_esquerdo_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitLado_esquerdo_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lado_esquerdoContext lado_esquerdo() throws RecognitionException {
		Lado_esquerdoContext _localctx = new Lado_esquerdoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lado_esquerdo);
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new Lado_esquerdo_identContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(IDENT);
				}
				break;
			case 2:
				_localctx = new Lado_esquerdo_pointer_indexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				alg_expression(0);
				setState(316);
				match(LBRACKET);
				setState(317);
				alg_expression(0);
				setState(318);
				match(RBRACKET);
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

	public static class Alg_atribContext extends ParserRuleContext {
		public Lado_esquerdoContext lado_esquerdo() {
			return getRuleContext(Lado_esquerdoContext.class,0);
		}
		public TerminalNode ATTRIBUTION_OP() { return getToken(alg.ATTRIBUTION_OP, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public Alg_atribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_atrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_atrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_atrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_atribContext alg_atrib() throws RecognitionException {
		Alg_atribContext _localctx = new Alg_atribContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alg_atrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			lado_esquerdo();
			setState(323);
			match(ATTRIBUTION_OP);
			setState(324);
			alg_expression(0);
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

	public static class Alg_instruction_condContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(alg.IF, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(alg.THEN, 0); }
		public Alg_instructionContext alg_instruction() {
			return getRuleContext(Alg_instructionContext.class,0);
		}
		public Alg_instruction_cond_nextContext alg_instruction_cond_next() {
			return getRuleContext(Alg_instruction_cond_nextContext.class,0);
		}
		public Alg_instruction_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_instruction_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_instruction_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_instruction_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_instruction_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_instruction_condContext alg_instruction_cond() throws RecognitionException {
		Alg_instruction_condContext _localctx = new Alg_instruction_condContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alg_instruction_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(IF);
			setState(327);
			alg_expression(0);
			setState(328);
			match(THEN);
			setState(329);
			alg_instruction();
			setState(330);
			alg_instruction_cond_next();
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

	public static class Alg_instruction_cond_nextContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(alg.ELSE, 0); }
		public Alg_instructionContext alg_instruction() {
			return getRuleContext(Alg_instructionContext.class,0);
		}
		public Alg_instruction_cond_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_instruction_cond_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_instruction_cond_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_instruction_cond_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_instruction_cond_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_instruction_cond_nextContext alg_instruction_cond_next() throws RecognitionException {
		Alg_instruction_cond_nextContext _localctx = new Alg_instruction_cond_nextContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alg_instruction_cond_next);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(ELSE);
				setState(333);
				alg_instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Alg_cicleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(alg.WHILE, 0); }
		public Alg_expressionContext alg_expression() {
			return getRuleContext(Alg_expressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(alg.DO, 0); }
		public Alg_instructionContext alg_instruction() {
			return getRuleContext(Alg_instructionContext.class,0);
		}
		public Alg_cicle_nextContext alg_cicle_next() {
			return getRuleContext(Alg_cicle_nextContext.class,0);
		}
		public Alg_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_cicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_cicle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_cicleContext alg_cicle() throws RecognitionException {
		Alg_cicleContext _localctx = new Alg_cicleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_alg_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(WHILE);
			setState(338);
			alg_expression(0);
			setState(339);
			match(DO);
			setState(340);
			alg_instruction();
			setState(341);
			alg_cicle_next();
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

	public static class Alg_cicle_nextContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(alg.FINALLY, 0); }
		public Alg_instructionContext alg_instruction() {
			return getRuleContext(Alg_instructionContext.class,0);
		}
		public Alg_cicle_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_cicle_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_cicle_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_cicle_next(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_cicle_next(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_cicle_nextContext alg_cicle_next() throws RecognitionException {
		Alg_cicle_nextContext _localctx = new Alg_cicle_nextContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_alg_cicle_next);
		try {
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(FINALLY);
				setState(344);
				alg_instruction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Alg_subblockContext extends ParserRuleContext {
		public TerminalNode LCURLY() { return getToken(alg.LCURLY, 0); }
		public Alg_instr_repeatContext alg_instr_repeat() {
			return getRuleContext(Alg_instr_repeatContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(alg.RCURLY, 0); }
		public Alg_subblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_subblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_subblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_subblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_subblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_subblockContext alg_subblock() throws RecognitionException {
		Alg_subblockContext _localctx = new Alg_subblockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alg_subblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(LCURLY);
			setState(349);
			alg_instr_repeat();
			setState(350);
			match(RCURLY);
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

	public static class Alg_instr_repeatContext extends ParserRuleContext {
		public Alg_instructionContext alg_instruction() {
			return getRuleContext(Alg_instructionContext.class,0);
		}
		public Alg_instr_repeatContext alg_instr_repeat() {
			return getRuleContext(Alg_instr_repeatContext.class,0);
		}
		public Alg_instr_repeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alg_instr_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).enterAlg_instr_repeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof algListener ) ((algListener)listener).exitAlg_instr_repeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof algVisitor ) return ((algVisitor<? extends T>)visitor).visitAlg_instr_repeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alg_instr_repeatContext alg_instr_repeat() throws RecognitionException {
		Alg_instr_repeatContext _localctx = new Alg_instr_repeatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_alg_instr_repeat);
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIZEOF:
			case NULL:
			case TRUE:
			case FALSE:
			case WHILE:
			case LEAVE:
			case RESTART:
			case RETURN:
			case IF:
			case WRITE:
			case WRITELN:
			case LPARENT:
			case IDENT:
			case LITERAL_INTEGER:
			case LITERAL_REAL:
			case CHAR_CHAIN:
			case LCURLY:
			case PLUS_OP:
			case MINUS_OP:
			case POINTER_EXTRATION_OP:
			case NEGATION_OP:
			case AT_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				alg_instruction();
				setState(353);
				alg_instr_repeat();
				}
				break;
			case RCURLY:
				enterOuterAlt(_localctx, 2);
				{
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return alg_expression_sempred((Alg_expressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean alg_expression_sempred(Alg_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u0169\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\3\6\3O\n\3\r\3\16\3P"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Z\n\4\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6"+
		"\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\5\7k\n\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n{\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u0085\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\r\5\r\u009c\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00b2\n\r\f\r\16\r\u00b5\13\r\3\16\3\16\5\16\u00b9\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c9"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u00d9\n\21\f\21\16\21\u00dc\13\21\3\21\5\21\u00df\n\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00e8\n\23\3\24\3\24\3\24\5\24\u00ed"+
		"\n\24\3\25\3\25\3\25\3\25\7\25\u00f3\n\25\f\25\16\25\u00f6\13\25\3\25"+
		"\6\25\u00f9\n\25\r\25\16\25\u00fa\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\5\26\u0116\n\26\3\27\3\27\3\27\3\27\5\27\u011c\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u0123\n\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0131\n\31\3\32\3\32\3\32\3\32\5\32"+
		"\u0137\n\32\3\33\3\33\5\33\u013b\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0143\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\5\37\u0152\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\5!\u015d\n!\3\""+
		"\3\"\3\"\3\"\3#\3#\3#\3#\5#\u0167\n#\3#\2\3\30$\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\7\3\2\3\6\4\2&(\60\60\3"+
		"\2)+\3\2&\'\3\2,/\2\u0179\2K\3\2\2\2\4N\3\2\2\2\6Y\3\2\2\2\b]\3\2\2\2"+
		"\n_\3\2\2\2\fj\3\2\2\2\16l\3\2\2\2\20n\3\2\2\2\22r\3\2\2\2\24\u0084\3"+
		"\2\2\2\26\u0095\3\2\2\2\30\u009b\3\2\2\2\32\u00b8\3\2\2\2\34\u00c8\3\2"+
		"\2\2\36\u00ca\3\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e7\3\2\2\2&\u00ec"+
		"\3\2\2\2(\u00ee\3\2\2\2*\u0115\3\2\2\2,\u011b\3\2\2\2.\u0122\3\2\2\2\60"+
		"\u0130\3\2\2\2\62\u0136\3\2\2\2\64\u013a\3\2\2\2\66\u0142\3\2\2\28\u0144"+
		"\3\2\2\2:\u0148\3\2\2\2<\u0151\3\2\2\2>\u0153\3\2\2\2@\u015c\3\2\2\2B"+
		"\u015e\3\2\2\2D\u0166\3\2\2\2FG\5\4\3\2GH\7\2\2\3HL\3\2\2\2IJ\7\2\2\3"+
		"JL\b\2\1\2KF\3\2\2\2KI\3\2\2\2L\3\3\2\2\2MO\5\6\4\2NM\3\2\2\2OP\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2Q\5\3\2\2\2RS\5\b\5\2ST\7\33\2\2TZ\3\2\2\2UZ\5\34"+
		"\17\2VW\5\b\5\2WX\b\4\1\2XZ\3\2\2\2YR\3\2\2\2YU\3\2\2\2YV\3\2\2\2Z\7\3"+
		"\2\2\2[^\5\n\6\2\\^\5\22\n\2][\3\2\2\2]\\\3\2\2\2^\t\3\2\2\2_`\5\f\7\2"+
		"`e\7\36\2\2ab\7\32\2\2bd\7\36\2\2ca\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2"+
		"\2\2f\13\3\2\2\2ge\3\2\2\2hk\5\16\b\2ik\5\20\t\2jh\3\2\2\2ji\3\2\2\2k"+
		"\r\3\2\2\2lm\t\2\2\2m\17\3\2\2\2no\7,\2\2op\5\16\b\2pq\7-\2\2q\21\3\2"+
		"\2\2rs\5\f\7\2st\7\36\2\2tz\7\63\2\2u{\5\30\r\2vw\7\"\2\2wx\5\30\r\2x"+
		"y\7#\2\2y{\3\2\2\2zu\3\2\2\2zv\3\2\2\2{\23\3\2\2\2|\u0085\7\37\2\2}\u0085"+
		"\7\t\2\2~\u0085\7 \2\2\177\u0085\7\13\2\2\u0080\u0085\7\f\2\2\u0081\u0085"+
		"\7!\2\2\u0082\u0085\7\36\2\2\u0083\u0085\5*\26\2\u0084|\3\2\2\2\u0084"+
		"}\3\2\2\2\u0084~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3\2\2\2\u0084\u0081"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\25\3\2\2\2\u0086"+
		"\u0096\5\24\13\2\u0087\u0088\7\34\2\2\u0088\u0089\5\30\r\2\u0089\u008a"+
		"\7\35\2\2\u008a\u0096\3\2\2\2\u008b\u008c\7\34\2\2\u008c\u008d\5\30\r"+
		"\2\u008d\u008e\7\35\2\2\u008e\u008f\7\35\2\2\u008f\u0090\b\f\1\2\u0090"+
		"\u0096\3\2\2\2\u0091\u0092\7\34\2\2\u0092\u0093\5\30\r\2\u0093\u0094\b"+
		"\f\1\2\u0094\u0096\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0087\3\2\2\2\u0095"+
		"\u008b\3\2\2\2\u0095\u0091\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098\b\r\1"+
		"\2\u0098\u009c\5\26\f\2\u0099\u009a\t\3\2\2\u009a\u009c\5\30\r\b\u009b"+
		"\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00b3\3\2\2\2\u009d\u009e\f\7"+
		"\2\2\u009e\u009f\t\4\2\2\u009f\u00b2\5\30\r\b\u00a0\u00a1\f\6\2\2\u00a1"+
		"\u00a2\t\5\2\2\u00a2\u00b2\5\30\r\7\u00a3\u00a4\f\5\2\2\u00a4\u00a5\t"+
		"\6\2\2\u00a5\u00b2\5\30\r\6\u00a6\u00a7\f\4\2\2\u00a7\u00a8\7\61\2\2\u00a8"+
		"\u00b2\5\30\r\5\u00a9\u00aa\f\3\2\2\u00aa\u00ab\7\62\2\2\u00ab\u00b2\5"+
		"\30\r\4\u00ac\u00ad\f\t\2\2\u00ad\u00ae\7\"\2\2\u00ae\u00af\5\30\r\2\u00af"+
		"\u00b0\7#\2\2\u00b0\u00b2\3\2\2\2\u00b1\u009d\3\2\2\2\u00b1\u00a0\3\2"+
		"\2\2\u00b1\u00a3\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ac\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\31\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\5\f\7\2\u00b7\u00b9"+
		"\7\7\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\33\3\2\2\2\u00ba"+
		"\u00bb\5\32\16\2\u00bb\u00bc\7\36\2\2\u00bc\u00bd\7\34\2\2\u00bd\u00be"+
		"\5 \21\2\u00be\u00bf\7\35\2\2\u00bf\u00c0\5\"\22\2\u00c0\u00c9\3\2\2\2"+
		"\u00c1\u00c2\7\3\2\2\u00c2\u00c3\7\n\2\2\u00c3\u00c4\7\34\2\2\u00c4\u00c5"+
		"\5\36\20\2\u00c5\u00c6\7\35\2\2\u00c6\u00c7\5\"\22\2\u00c7\u00c9\3\2\2"+
		"\2\u00c8\u00ba\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c9\35\3\2\2\2\u00ca\u00cb"+
		"\7\3\2\2\u00cb\u00cc\7\36\2\2\u00cc\u00cd\7\32\2\2\u00cd\u00ce\7,\2\2"+
		"\u00ce\u00cf\7\6\2\2\u00cf\u00d0\7-\2\2\u00d0\u00d1\7\36\2\2\u00d1\37"+
		"\3\2\2\2\u00d2\u00d3\5\f\7\2\u00d3\u00da\7\36\2\2\u00d4\u00d5\7\32\2\2"+
		"\u00d5\u00d6\5\f\7\2\u00d6\u00d7\7\36\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d4"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00df\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d2\3\2"+
		"\2\2\u00de\u00dd\3\2\2\2\u00df!\3\2\2\2\u00e0\u00e1\5$\23\2\u00e1\u00e2"+
		"\5(\25\2\u00e2\u00e3\5&\24\2\u00e3#\3\2\2\2\u00e4\u00e5\7\65\2\2\u00e5"+
		"\u00e8\5(\25\2\u00e6\u00e8\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e6\3\2"+
		"\2\2\u00e8%\3\2\2\2\u00e9\u00ea\7\64\2\2\u00ea\u00ed\5(\25\2\u00eb\u00ed"+
		"\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\'\3\2\2\2\u00ee"+
		"\u00f4\7$\2\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1\7\33\2\2\u00f1\u00f3\3\2"+
		"\2\2\u00f2\u00ef\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\5\60"+
		"\31\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\7%\2\2\u00fd)\3\2\2\2\u00fe"+
		"\u00ff\7\36\2\2\u00ff\u0100\7\34\2\2\u0100\u0101\5,\27\2\u0101\u0102\7"+
		"\35\2\2\u0102\u0116\3\2\2\2\u0103\u0104\7\65\2\2\u0104\u0105\7\34\2\2"+
		"\u0105\u0116\7\35\2\2\u0106\u0107\7\b\2\2\u0107\u0108\7\34\2\2\u0108\u0109"+
		"\5\30\r\2\u0109\u010a\7\35\2\2\u010a\u0116\3\2\2\2\u010b\u010c\7\26\2"+
		"\2\u010c\u010d\7\34\2\2\u010d\u010e\5,\27\2\u010e\u010f\7\35\2\2\u010f"+
		"\u0116\3\2\2\2\u0110\u0111\7\27\2\2\u0111\u0112\7\34\2\2\u0112\u0113\5"+
		",\27\2\u0113\u0114\7\35\2\2\u0114\u0116\3\2\2\2\u0115\u00fe\3\2\2\2\u0115"+
		"\u0103\3\2\2\2\u0115\u0106\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u0110\3\2"+
		"\2\2\u0116+\3\2\2\2\u0117\u0118\5\30\r\2\u0118\u0119\5.\30\2\u0119\u011c"+
		"\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"-\3\2\2\2\u011d\u011e\7\32\2\2\u011e\u011f\5\30\r\2\u011f\u0120\5.\30"+
		"\2\u0120\u0123\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0121"+
		"\3\2\2\2\u0123/\3\2\2\2\u0124\u0125\5\30\r\2\u0125\u0126\7\33\2\2\u0126"+
		"\u0131\3\2\2\2\u0127\u0128\5\62\32\2\u0128\u0129\7\33\2\2\u0129\u0131"+
		"\3\2\2\2\u012a\u012b\58\35\2\u012b\u012c\7\33\2\2\u012c\u0131\3\2\2\2"+
		"\u012d\u0131\5:\36\2\u012e\u0131\5> \2\u012f\u0131\5B\"\2\u0130\u0124"+
		"\3\2\2\2\u0130\u0127\3\2\2\2\u0130\u012a\3\2\2\2\u0130\u012d\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u012f\3\2\2\2\u0131\61\3\2\2\2\u0132\u0137\7\20\2"+
		"\2\u0133\u0137\7\21\2\2\u0134\u0135\7\22\2\2\u0135\u0137\5\64\33\2\u0136"+
		"\u0132\3\2\2\2\u0136\u0133\3\2\2\2\u0136\u0134\3\2\2\2\u0137\63\3\2\2"+
		"\2\u0138\u013b\5\30\r\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013a"+
		"\u0139\3\2\2\2\u013b\65\3\2\2\2\u013c\u0143\7\36\2\2\u013d\u013e\5\30"+
		"\r\2\u013e\u013f\7\"\2\2\u013f\u0140\5\30\r\2\u0140\u0141\7#\2\2\u0141"+
		"\u0143\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2\2\2\u0143\67\3\2\2"+
		"\2\u0144\u0145\5\66\34\2\u0145\u0146\7\63\2\2\u0146\u0147\5\30\r\2\u0147"+
		"9\3\2\2\2\u0148\u0149\7\23\2\2\u0149\u014a\5\30\r\2\u014a\u014b\7\24\2"+
		"\2\u014b\u014c\5\60\31\2\u014c\u014d\5<\37\2\u014d;\3\2\2\2\u014e\u014f"+
		"\7\25\2\2\u014f\u0152\5\60\31\2\u0150\u0152\3\2\2\2\u0151\u014e\3\2\2"+
		"\2\u0151\u0150\3\2\2\2\u0152=\3\2\2\2\u0153\u0154\7\r\2\2\u0154\u0155"+
		"\5\30\r\2\u0155\u0156\7\16\2\2\u0156\u0157\5\60\31\2\u0157\u0158\5@!\2"+
		"\u0158?\3\2\2\2\u0159\u015a\7\17\2\2\u015a\u015d\5\60\31\2\u015b\u015d"+
		"\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015b\3\2\2\2\u015dA\3\2\2\2\u015e"+
		"\u015f\7$\2\2\u015f\u0160\5D#\2\u0160\u0161\7%\2\2\u0161C\3\2\2\2\u0162"+
		"\u0163\5\60\31\2\u0163\u0164\5D#\2\u0164\u0167\3\2\2\2\u0165\u0167\3\2"+
		"\2\2\u0166\u0162\3\2\2\2\u0166\u0165\3\2\2\2\u0167E\3\2\2\2 KPY]ejz\u0084"+
		"\u0095\u009b\u00b1\u00b3\u00b8\u00c8\u00da\u00de\u00e7\u00ec\u00f4\u00fa"+
		"\u0115\u011b\u0122\u0130\u0136\u013a\u0142\u0151\u015c\u0166";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
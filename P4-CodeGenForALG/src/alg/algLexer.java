// Generated from E:\escola\u005Cuniversidade_boi\3_ano\2_semestre\Compiladores\Praticas\Compiladores-P4\P4-CodeGenForALG\src\algLexer.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class algLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"INT", "BOOL", "FLOAT", "STRING", "VOID", "SIZEOF", "NULL", "ALG", "TRUE", 
			"FALSE", "WHILE", "DO", "FINALLY", "LEAVE", "RESTART", "RETURN", "IF", 
			"THEN", "ELSE", "WRITE", "WRITELN", "BLANK", "BLOCK_COMMENT_BODY", "COMMENT", 
			"COMMA", "SEMMI_COLON", "LPARENT", "RPARENT", "LETTER", "IDENT", "DIGIT", 
			"LITERAL_INTEGER", "EXPONENT", "LITERAL_REAL", "CHAR_CHAIN", "LBRACKET", 
			"RBRACKET", "LCURLY", "RCURLY", "PLUS_OP", "MINUS_OP", "POINTER_EXTRATION_OP", 
			"MULTIPLICATION_OP", "DIVISION_OP", "REMAINDER_OP", "LTRIANG", "RTRIANG", 
			"COMPARISON_OP", "EQUALITY_OP", "NEGATION_OP", "LOGICAL_AND_OP", "LOGICAL_OR_OP", 
			"ATTRIBUTION_OP", "DOUBLE_ARROW_OP", "AT_OP"
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


	public algLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "algLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u0187\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u00f4\n\30\f\30\16\30\u00f7\13\30\3\31\3\31\3\31\3\31\7\31"+
		"\u00fd\n\31\f\31\16\31\u0100\13\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0109\n\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\7\37\u011b\n\37\f\37\16\37\u011e\13\37\3 \3"+
		" \3!\3!\7!\u0124\n!\f!\16!\u0127\13!\3!\5!\u012a\n!\3\"\3\"\3\"\3\"\5"+
		"\"\u0130\n\"\3\"\3\"\3#\3#\3#\6#\u0137\n#\r#\16#\u0138\3#\3#\5#\u013d"+
		"\n#\3#\5#\u0140\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u014e\n$\f$"+
		"\16$\u0151\13$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3"+
		",\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u0171\n\61\3\62"+
		"\3\62\3\62\3\62\5\62\u0177\n\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\3\67\38\38\2\29\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\2\61\31\63\32\65\33\67\349\35;\2=\36?\2A\37C\2E G!I\"K#M$O%Q&S\'U(W"+
		")Y*[+],_-a.c/e\60g\61i\62k\63m\64o\65\3\2\r\5\2\13\f\17\17\"\"\3\2+,\3"+
		"\2++\3\2,,\4\2\f\f\17\17\5\2C\\c|\u0082\u0101\3\2\62;\3\2\63;\3\2\62\62"+
		"\4\2GGgg\5\2\2\2))\u0080\u0080\2\u019a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2=\3\2\2\2\2A\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\3q\3\2\2\2\5u\3\2\2\2\7z\3\2\2\2\t\u0080\3\2\2\2\13\u0087\3\2"+
		"\2\2\r\u008c\3\2\2\2\17\u0093\3\2\2\2\21\u0098\3\2\2\2\23\u009c\3\2\2"+
		"\2\25\u00a1\3\2\2\2\27\u00a7\3\2\2\2\31\u00ad\3\2\2\2\33\u00b0\3\2\2\2"+
		"\35\u00b8\3\2\2\2\37\u00be\3\2\2\2!\u00c6\3\2\2\2#\u00cd\3\2\2\2%\u00d0"+
		"\3\2\2\2\'\u00d5\3\2\2\2)\u00da\3\2\2\2+\u00e0\3\2\2\2-\u00e8\3\2\2\2"+
		"/\u00f5\3\2\2\2\61\u0108\3\2\2\2\63\u010c\3\2\2\2\65\u010e\3\2\2\2\67"+
		"\u0110\3\2\2\29\u0112\3\2\2\2;\u0114\3\2\2\2=\u0116\3\2\2\2?\u011f\3\2"+
		"\2\2A\u0129\3\2\2\2C\u012b\3\2\2\2E\u0133\3\2\2\2G\u0141\3\2\2\2I\u0154"+
		"\3\2\2\2K\u0156\3\2\2\2M\u0158\3\2\2\2O\u015a\3\2\2\2Q\u015c\3\2\2\2S"+
		"\u015e\3\2\2\2U\u0160\3\2\2\2W\u0162\3\2\2\2Y\u0164\3\2\2\2[\u0166\3\2"+
		"\2\2]\u0168\3\2\2\2_\u016a\3\2\2\2a\u0170\3\2\2\2c\u0176\3\2\2\2e\u0178"+
		"\3\2\2\2g\u017a\3\2\2\2i\u017d\3\2\2\2k\u0180\3\2\2\2m\u0182\3\2\2\2o"+
		"\u0185\3\2\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\4\3\2\2\2uv\7d\2\2vw\7q\2\2"+
		"wx\7q\2\2xy\7n\2\2y\6\3\2\2\2z{\7h\2\2{|\7n\2\2|}\7q\2\2}~\7c\2\2~\177"+
		"\7v\2\2\177\b\3\2\2\2\u0080\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085\u0086\7i\2\2\u0086"+
		"\n\3\2\2\2\u0087\u0088\7x\2\2\u0088\u0089\7q\2\2\u0089\u008a\7k\2\2\u008a"+
		"\u008b\7f\2\2\u008b\f\3\2\2\2\u008c\u008d\7u\2\2\u008d\u008e\7k\2\2\u008e"+
		"\u008f\7|\2\2\u008f\u0090\7g\2\2\u0090\u0091\7q\2\2\u0091\u0092\7h\2\2"+
		"\u0092\16\3\2\2\2\u0093\u0094\7p\2\2\u0094\u0095\7w\2\2\u0095\u0096\7"+
		"n\2\2\u0096\u0097\7n\2\2\u0097\20\3\2\2\2\u0098\u0099\7c\2\2\u0099\u009a"+
		"\7n\2\2\u009a\u009b\7i\2\2\u009b\22\3\2\2\2\u009c\u009d\7v\2\2\u009d\u009e"+
		"\7t\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7g\2\2\u00a0\24\3\2\2\2\u00a1\u00a2"+
		"\7h\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7u\2\2\u00a5"+
		"\u00a6\7g\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7j\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7g\2\2\u00ac\30\3\2\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae\u00af\7q\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7n\2\2"+
		"\u00b5\u00b6\7n\2\2\u00b6\u00b7\7{\2\2\u00b7\34\3\2\2\2\u00b8\u00b9\7"+
		"n\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd\36\3\2\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1"+
		"\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5 \3\2\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7g\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7w\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7p\2\2"+
		"\u00cc\"\3\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7h\2\2\u00cf$\3\2\2\2"+
		"\u00d0\u00d1\7v\2\2\u00d1\u00d2\7j\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4"+
		"\7p\2\2\u00d4&\3\2\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8"+
		"\7u\2\2\u00d8\u00d9\7g\2\2\u00d9(\3\2\2\2\u00da\u00db\7y\2\2\u00db\u00dc"+
		"\7t\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df"+
		"*\3\2\2\2\u00e0\u00e1\7y\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7n\2\2\u00e6\u00e7\7p\2\2"+
		"\u00e7,\3\2\2\2\u00e8\u00e9\t\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b"+
		"\27\2\2\u00eb.\3\2\2\2\u00ec\u00f4\n\3\2\2\u00ed\u00ee\7*\2\2\u00ee\u00f4"+
		"\7,\2\2\u00ef\u00f0\7,\2\2\u00f0\u00f4\n\4\2\2\u00f1\u00f2\n\5\2\2\u00f2"+
		"\u00f4\7+\2\2\u00f3\u00ec\3\2\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ef\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\60\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7%\2\2"+
		"\u00f9\u00fa\7%\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\n\6\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0109\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7*\2\2\u0102\u0103\7,\2"+
		"\2\u0103\u0104\3\2\2\2\u0104\u0105\5/\30\2\u0105\u0106\7,\2\2\u0106\u0107"+
		"\7+\2\2\u0107\u0109\3\2\2\2\u0108\u00f8\3\2\2\2\u0108\u0101\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\b\31\2\2\u010b\62\3\2\2\2\u010c\u010d\7.\2"+
		"\2\u010d\64\3\2\2\2\u010e\u010f\7=\2\2\u010f\66\3\2\2\2\u0110\u0111\7"+
		"*\2\2\u01118\3\2\2\2\u0112\u0113\7+\2\2\u0113:\3\2\2\2\u0114\u0115\t\7"+
		"\2\2\u0115<\3\2\2\2\u0116\u011c\5;\36\2\u0117\u011b\5;\36\2\u0118\u011b"+
		"\5? \2\u0119\u011b\7a\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d>\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\t\b\2\2\u0120@\3\2"+
		"\2\2\u0121\u0125\t\t\2\2\u0122\u0124\5? \2\u0123\u0122\3\2\2\2\u0124\u0127"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012a\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0128\u012a\t\n\2\2\u0129\u0121\3\2\2\2\u0129\u0128\3\2"+
		"\2\2\u012aB\3\2\2\2\u012b\u012f\t\13\2\2\u012c\u0130\5Q)\2\u012d\u0130"+
		"\5S*\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u012f\u012d\3\2\2\2\u012f"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\5A!\2\u0132D\3\2\2\2\u0133"+
		"\u013f\5A!\2\u0134\u0136\7\60\2\2\u0135\u0137\5? \2\u0136\u0135\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u013d\5C\"\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u0140\5C\"\2\u013f\u0134\3\2"+
		"\2\2\u013f\u013e\3\2\2\2\u0140F\3\2\2\2\u0141\u014f\7)\2\2\u0142\u014e"+
		"\n\f\2\2\u0143\u0144\7\u0080\2\2\u0144\u014e\7)\2\2\u0145\u0146\7\u0080"+
		"\2\2\u0146\u014e\7\u0080\2\2\u0147\u0148\7\u0080\2\2\u0148\u014e\7p\2"+
		"\2\u0149\u014a\7\u0080\2\2\u014a\u014e\7t\2\2\u014b\u014c\7\u0080\2\2"+
		"\u014c\u014e\7v\2\2\u014d\u0142\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0145"+
		"\3\2\2\2\u014d\u0147\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2"+
		"\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7)\2\2\u0153H\3\2\2\2\u0154\u0155"+
		"\7]\2\2\u0155J\3\2\2\2\u0156\u0157\7_\2\2\u0157L\3\2\2\2\u0158\u0159\7"+
		"}\2\2\u0159N\3\2\2\2\u015a\u015b\7\177\2\2\u015bP\3\2\2\2\u015c\u015d"+
		"\7-\2\2\u015dR\3\2\2\2\u015e\u015f\7/\2\2\u015fT\3\2\2\2\u0160\u0161\7"+
		"A\2\2\u0161V\3\2\2\2\u0162\u0163\7,\2\2\u0163X\3\2\2\2\u0164\u0165\7\61"+
		"\2\2\u0165Z\3\2\2\2\u0166\u0167\7\'\2\2\u0167\\\3\2\2\2\u0168\u0169\7"+
		">\2\2\u0169^\3\2\2\2\u016a\u016b\7@\2\2\u016b`\3\2\2\2\u016c\u016d\7@"+
		"\2\2\u016d\u0171\7?\2\2\u016e\u016f\7>\2\2\u016f\u0171\7?\2\2\u0170\u016c"+
		"\3\2\2\2\u0170\u016e\3\2\2\2\u0171b\3\2\2\2\u0172\u0173\7?\2\2\u0173\u0177"+
		"\7?\2\2\u0174\u0175\7#\2\2\u0175\u0177\7?\2\2\u0176\u0172\3\2\2\2\u0176"+
		"\u0174\3\2\2\2\u0177d\3\2\2\2\u0178\u0179\7\u0080\2\2\u0179f\3\2\2\2\u017a"+
		"\u017b\7(\2\2\u017b\u017c\7(\2\2\u017ch\3\2\2\2\u017d\u017e\7~\2\2\u017e"+
		"\u017f\7~\2\2\u017fj\3\2\2\2\u0180\u0181\7?\2\2\u0181l\3\2\2\2\u0182\u0183"+
		"\7@\2\2\u0183\u0184\7@\2\2\u0184n\3\2\2\2\u0185\u0186\7B\2\2\u0186p\3"+
		"\2\2\2\23\2\u00f3\u00f5\u00fe\u0108\u011a\u011c\u0125\u0129\u012f\u0138"+
		"\u013c\u013f\u014d\u014f\u0170\u0176\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
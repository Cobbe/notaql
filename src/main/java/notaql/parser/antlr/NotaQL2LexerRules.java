// Generated from notaql\parser\antlr\NotaQL2LexerRules.g4 by ANTLR 4.2.1
package notaql.parser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NotaQL2LexerRules extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SL_COMMENT=1, OPTWS=2, OPTNL=3, IN=4, OUT=5, ARROW=6, EQ=7, NEQ=8, LT=9, 
		LTEQ=10, GT=11, GTEQ=12, AND=13, OR=14, PLUS=15, MINUS=16, DIV=17, TRUE=18, 
		FALSE=19, Int=20, Float=21, String=22, AVG=23, COUNT=24, MAX=25, MIN=26, 
		SUM=27, IMPLODE=28, LIST=29, OBJECT=30, Name=31, OPEN=32, CLOSE=33, ARRAYOPEN=34, 
		ARRAYCLOSE=35, RESOLVE=36, PREDICATE=37, STAR=38, AT=39, DOT=40, COLON=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"SL_COMMENT", "OPTWS", "OPTNL", "'IN'", "'OUT'", "'<-'", "'='", "'!='", 
		"'<'", "'<='", "'>'", "'>='", "'&&'", "'||'", "'+'", "'-'", "'/'", "'true'", 
		"'false'", "Int", "Float", "String", "'AVG'", "'COUNT'", "'MAX'", "'MIN'", 
		"'SUM'", "'IMPLODE'", "'LIST'", "'OBJECT'", "Name", "'('", "')'", "'['", 
		"']'", "'$'", "'?'", "'*'", "'@'", "'.'", "':'"
	};
	public static final String[] ruleNames = {
		"SL_COMMENT", "OPTWS", "OPTNL", "IN", "OUT", "ARROW", "EQ", "NEQ", "LT", 
		"LTEQ", "GT", "GTEQ", "AND", "OR", "PLUS", "MINUS", "DIV", "TRUE", "FALSE", 
		"Int", "Float", "String", "AVG", "COUNT", "MAX", "MIN", "SUM", "IMPLODE", 
		"LIST", "OBJECT", "Name", "OPEN", "CLOSE", "ARRAYOPEN", "ARRAYCLOSE", 
		"RESOLVE", "PREDICATE", "STAR", "AT", "DOT", "COLON"
	};


	public NotaQL2LexerRules(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "NotaQL2LexerRules.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4f\n\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u009d\n\25\r\25\16\25\u009e\3\26\6"+
		"\26\u00a2\n\26\r\26\16\26\u00a3\3\26\3\26\6\26\u00a8\n\26\r\26\16\26\u00a9"+
		"\3\27\3\27\7\27\u00ae\n\27\f\27\16\27\u00b1\13\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \6 \u00e0"+
		"\n \r \16 \u00e1\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3Y\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\4\2\13\13\"\"\3\2\62"+
		";\5\2\f\f\17\17))\6\2\62;C\\aac|\u00fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5`\3\2\2\2\7e\3\2\2\2\t"+
		"k\3\2\2\2\13n\3\2\2\2\rr\3\2\2\2\17u\3\2\2\2\21w\3\2\2\2\23z\3\2\2\2\25"+
		"|\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0084\3\2\2\2\35\u0087\3"+
		"\2\2\2\37\u008a\3\2\2\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'"+
		"\u0095\3\2\2\2)\u009c\3\2\2\2+\u00a1\3\2\2\2-\u00ab\3\2\2\2/\u00b4\3\2"+
		"\2\2\61\u00b8\3\2\2\2\63\u00be\3\2\2\2\65\u00c2\3\2\2\2\67\u00c6\3\2\2"+
		"\29\u00ca\3\2\2\2;\u00d2\3\2\2\2=\u00d7\3\2\2\2?\u00df\3\2\2\2A\u00e3"+
		"\3\2\2\2C\u00e5\3\2\2\2E\u00e7\3\2\2\2G\u00e9\3\2\2\2I\u00eb\3\2\2\2K"+
		"\u00ed\3\2\2\2M\u00ef\3\2\2\2O\u00f1\3\2\2\2Q\u00f3\3\2\2\2S\u00f5\3\2"+
		"\2\2UY\7%\2\2VX\13\2\2\2WV\3\2\2\2X[\3\2\2\2YZ\3\2\2\2YW\3\2\2\2Z\\\3"+
		"\2\2\2[Y\3\2\2\2\\]\7\f\2\2]^\3\2\2\2^_\b\2\2\2_\4\3\2\2\2`a\t\2\2\2a"+
		"b\3\2\2\2bc\b\3\2\2c\6\3\2\2\2df\7\17\2\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2"+
		"\2gh\7\f\2\2hi\3\2\2\2ij\b\4\2\2j\b\3\2\2\2kl\7K\2\2lm\7P\2\2m\n\3\2\2"+
		"\2no\7Q\2\2op\7W\2\2pq\7V\2\2q\f\3\2\2\2rs\7>\2\2st\7/\2\2t\16\3\2\2\2"+
		"uv\7?\2\2v\20\3\2\2\2wx\7#\2\2xy\7?\2\2y\22\3\2\2\2z{\7>\2\2{\24\3\2\2"+
		"\2|}\7>\2\2}~\7?\2\2~\26\3\2\2\2\177\u0080\7@\2\2\u0080\30\3\2\2\2\u0081"+
		"\u0082\7@\2\2\u0082\u0083\7?\2\2\u0083\32\3\2\2\2\u0084\u0085\7(\2\2\u0085"+
		"\u0086\7(\2\2\u0086\34\3\2\2\2\u0087\u0088\7~\2\2\u0088\u0089\7~\2\2\u0089"+
		"\36\3\2\2\2\u008a\u008b\7-\2\2\u008b \3\2\2\2\u008c\u008d\7/\2\2\u008d"+
		"\"\3\2\2\2\u008e\u008f\7\61\2\2\u008f$\3\2\2\2\u0090\u0091\7v\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094&\3\2\2\2\u0095"+
		"\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2"+
		"\u0099\u009a\7g\2\2\u009a(\3\2\2\2\u009b\u009d\t\3\2\2\u009c\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"*\3\2\2\2\u00a0\u00a2\t\3\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7"+
		"\7\60\2\2\u00a6\u00a8\t\3\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2"+
		"\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa,\3\2\2\2\u00ab\u00af\7"+
		")\2\2\u00ac\u00ae\n\4\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\u00b3\7)\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7C\2\2\u00b5\u00b6"+
		"\7X\2\2\u00b6\u00b7\7I\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\7E\2\2\u00b9\u00ba"+
		"\7Q\2\2\u00ba\u00bb\7W\2\2\u00bb\u00bc\7P\2\2\u00bc\u00bd\7V\2\2\u00bd"+
		"\62\3\2\2\2\u00be\u00bf\7O\2\2\u00bf\u00c0\7C\2\2\u00c0\u00c1\7Z\2\2\u00c1"+
		"\64\3\2\2\2\u00c2\u00c3\7O\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7P\2\2\u00c5"+
		"\66\3\2\2\2\u00c6\u00c7\7U\2\2\u00c7\u00c8\7W\2\2\u00c8\u00c9\7O\2\2\u00c9"+
		"8\3\2\2\2\u00ca\u00cb\7K\2\2\u00cb\u00cc\7O\2\2\u00cc\u00cd\7R\2\2\u00cd"+
		"\u00ce\7N\2\2\u00ce\u00cf\7Q\2\2\u00cf\u00d0\7F\2\2\u00d0\u00d1\7G\2\2"+
		"\u00d1:\3\2\2\2\u00d2\u00d3\7N\2\2\u00d3\u00d4\7K\2\2\u00d4\u00d5\7U\2"+
		"\2\u00d5\u00d6\7V\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00d9\7"+
		"D\2\2\u00d9\u00da\7L\2\2\u00da\u00db\7G\2\2\u00db\u00dc\7E\2\2\u00dc\u00dd"+
		"\7V\2\2\u00dd>\3\2\2\2\u00de\u00e0\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2@\3\2\2\2\u00e3"+
		"\u00e4\7*\2\2\u00e4B\3\2\2\2\u00e5\u00e6\7+\2\2\u00e6D\3\2\2\2\u00e7\u00e8"+
		"\7]\2\2\u00e8F\3\2\2\2\u00e9\u00ea\7_\2\2\u00eaH\3\2\2\2\u00eb\u00ec\7"+
		"&\2\2\u00ecJ\3\2\2\2\u00ed\u00ee\7A\2\2\u00eeL\3\2\2\2\u00ef\u00f0\7,"+
		"\2\2\u00f0N\3\2\2\2\u00f1\u00f2\7B\2\2\u00f2P\3\2\2\2\u00f3\u00f4\7\60"+
		"\2\2\u00f4R\3\2\2\2\u00f5\u00f6\7<\2\2\u00f6T\3\2\2\2\n\2Ye\u009e\u00a3"+
		"\u00a9\u00af\u00e1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /home/xuldir/Desktop/CompilationsProjectations/quiz-comp-05/src/quiz.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class quizLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		OPCOESPOSSIVEIS=18, NAME=19, NUMBER=20, QUIZ=21, ADD_GROUP=22, ADD=23, 
		ALL=24, REMOVE=25, DEFINEANSWER=26, DEFINEMARK=27, EVALUATION=28, MULTICHOICE=29, 
		SHORTANSWER=30, NUMERICANSWER=31, ESSAY=32, OPTION=33, IMPORT=34, FROM=35, 
		GET=36, TO=37, ANSWER=38, SHOW=39, SHUFFLE=40, AND=41, WITH=42, GROUP=43, 
		CHOICE=44, MATCH=45, MATCHING=46, QUESTION=47, NEWLINE=48, COMMENT=49, 
		MULTICOMM=50, WS=51;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"OPCOESPOSSIVEIS", "NAME", "NUMBER", "QUIZ", "ADD_GROUP", "ADD", "ALL", 
			"REMOVE", "DEFINEANSWER", "DEFINEMARK", "EVALUATION", "MULTICHOICE", 
			"SHORTANSWER", "NUMERICANSWER", "ESSAY", "OPTION", "IMPORT", "FROM", 
			"GET", "TO", "ANSWER", "SHOW", "SHUFFLE", "AND", "WITH", "GROUP", "CHOICE", 
			"MATCH", "MATCHING", "QUESTION", "NEWLINE", "COMMENT", "MULTICOMM", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'auto-corrective'", "','", "'load \"'", "'\" as'", "'id='", "' text=\"'", 
			"'\"'", "'group='", "'{'", "' id='", "'}'", "' side='", "' match='", 
			"'as'", "'id = '", "'text = \"'", "'\" answer = \"'", null, null, null, 
			"'quiz'", "'add group'", "'add'", "'all'", "'remove'", "'define-answer'", 
			"'define-mark'", "'evaluation'", "'multi-choice'", "'short-answer'", 
			"'numeric-answer'", "'essay-answer'", "'option'", null, "'from'", "'get'", 
			"'to'", "'answer'", "'show'", "'shuffle'", "'and'", "'with'", "'group'", 
			"'choice'", "'match'", "'matching'", "'question'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "OPCOESPOSSIVEIS", "NAME", "NUMBER", 
			"QUIZ", "ADD_GROUP", "ADD", "ALL", "REMOVE", "DEFINEANSWER", "DEFINEMARK", 
			"EVALUATION", "MULTICHOICE", "SHORTANSWER", "NUMERICANSWER", "ESSAY", 
			"OPTION", "IMPORT", "FROM", "GET", "TO", "ANSWER", "SHOW", "SHUFFLE", 
			"AND", "WITH", "GROUP", "CHOICE", "MATCH", "MATCHING", "QUESTION", "NEWLINE", 
			"COMMENT", "MULTICOMM", "WS"
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


	public quizLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "quiz.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u01d7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\6\24\u00d7\n\24\r\24\16\24\u00d8\3\25\6\25\u00dc\n\25\r\25\16\25\u00dd"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\61\5\61\u01b8\n\61\3\61\3\61\3\62\3\62"+
		"\7\62\u01be\n\62\f\62\16\62\u01c1\13\62\3\62\3\62\3\63\3\63\3\63\3\63"+
		"\7\63\u01c9\n\63\f\63\16\63\u01cc\13\63\3\63\3\63\3\63\3\64\6\64\u01d2"+
		"\n\64\r\64\16\64\u01d3\3\64\3\64\4\u01bf\u01ca\2\65\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65\3\2\6\3\2\63\64\7\3\2\"\62;C"+
		"\\aac|\3\2\62;\4\2\13\13\"\"\2\u01dc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\3i\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t\u0082\3\2\2\2\13\u0087\3\2\2\2"+
		"\r\u008b\3\2\2\2\17\u0093\3\2\2\2\21\u0095\3\2\2\2\23\u009c\3\2\2\2\25"+
		"\u009e\3\2\2\2\27\u00a3\3\2\2\2\31\u00a5\3\2\2\2\33\u00ac\3\2\2\2\35\u00b4"+
		"\3\2\2\2\37\u00b7\3\2\2\2!\u00bd\3\2\2\2#\u00c6\3\2\2\2%\u00d3\3\2\2\2"+
		"\'\u00d6\3\2\2\2)\u00db\3\2\2\2+\u00df\3\2\2\2-\u00e4\3\2\2\2/\u00ee\3"+
		"\2\2\2\61\u00f2\3\2\2\2\63\u00f6\3\2\2\2\65\u00fd\3\2\2\2\67\u010b\3\2"+
		"\2\29\u0117\3\2\2\2;\u0122\3\2\2\2=\u012f\3\2\2\2?\u013c\3\2\2\2A\u014b"+
		"\3\2\2\2C\u0158\3\2\2\2E\u015f\3\2\2\2G\u0168\3\2\2\2I\u016d\3\2\2\2K"+
		"\u0171\3\2\2\2M\u0174\3\2\2\2O\u017b\3\2\2\2Q\u0180\3\2\2\2S\u0188\3\2"+
		"\2\2U\u018c\3\2\2\2W\u0191\3\2\2\2Y\u0197\3\2\2\2[\u019e\3\2\2\2]\u01a4"+
		"\3\2\2\2_\u01ad\3\2\2\2a\u01b7\3\2\2\2c\u01bb\3\2\2\2e\u01c4\3\2\2\2g"+
		"\u01d1\3\2\2\2ij\7c\2\2jk\7w\2\2kl\7v\2\2lm\7q\2\2mn\7/\2\2no\7e\2\2o"+
		"p\7q\2\2pq\7t\2\2qr\7t\2\2rs\7g\2\2st\7e\2\2tu\7v\2\2uv\7k\2\2vw\7x\2"+
		"\2wx\7g\2\2x\4\3\2\2\2yz\7.\2\2z\6\3\2\2\2{|\7n\2\2|}\7q\2\2}~\7c\2\2"+
		"~\177\7f\2\2\177\u0080\7\"\2\2\u0080\u0081\7$\2\2\u0081\b\3\2\2\2\u0082"+
		"\u0083\7$\2\2\u0083\u0084\7\"\2\2\u0084\u0085\7c\2\2\u0085\u0086\7u\2"+
		"\2\u0086\n\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7f\2\2\u0089\u008a\7"+
		"?\2\2\u008a\f\3\2\2\2\u008b\u008c\7\"\2\2\u008c\u008d\7v\2\2\u008d\u008e"+
		"\7g\2\2\u008e\u008f\7z\2\2\u008f\u0090\7v\2\2\u0090\u0091\7?\2\2\u0091"+
		"\u0092\7$\2\2\u0092\16\3\2\2\2\u0093\u0094\7$\2\2\u0094\20\3\2\2\2\u0095"+
		"\u0096\7i\2\2\u0096\u0097\7t\2\2\u0097\u0098\7q\2\2\u0098\u0099\7w\2\2"+
		"\u0099\u009a\7r\2\2\u009a\u009b\7?\2\2\u009b\22\3\2\2\2\u009c\u009d\7"+
		"}\2\2\u009d\24\3\2\2\2\u009e\u009f\7\"\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7f\2\2\u00a1\u00a2\7?\2\2\u00a2\26\3\2\2\2\u00a3\u00a4\7\177\2\2\u00a4"+
		"\30\3\2\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7k\2\2"+
		"\u00a8\u00a9\7f\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7?\2\2\u00ab\32\3\2"+
		"\2\2\u00ac\u00ad\7\"\2\2\u00ad\u00ae\7o\2\2\u00ae\u00af\7c\2\2\u00af\u00b0"+
		"\7v\2\2\u00b0\u00b1\7e\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7?\2\2\u00b3"+
		"\34\3\2\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7u\2\2\u00b6\36\3\2\2\2\u00b7"+
		"\u00b8\7k\2\2\u00b8\u00b9\7f\2\2\u00b9\u00ba\7\"\2\2\u00ba\u00bb\7?\2"+
		"\2\u00bb\u00bc\7\"\2\2\u00bc \3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7"+
		"g\2\2\u00bf\u00c0\7z\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7\"\2\2\u00c2"+
		"\u00c3\7?\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7$\2\2\u00c5\"\3\2\2\2\u00c6"+
		"\u00c7\7$\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7p\2"+
		"\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7y\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7\"\2\2\u00d1"+
		"\u00d2\7$\2\2\u00d2$\3\2\2\2\u00d3\u00d4\t\2\2\2\u00d4&\3\2\2\2\u00d5"+
		"\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d8\u00d9\3\2\2\2\u00d9(\3\2\2\2\u00da\u00dc\t\4\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"*\3\2\2\2\u00df\u00e0\7s\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7k\2\2\u00e2"+
		"\u00e3\7|\2\2\u00e3,\3\2\2\2\u00e4\u00e5\7c\2\2\u00e5\u00e6\7f\2\2\u00e6"+
		"\u00e7\7f\2\2\u00e7\u00e8\7\"\2\2\u00e8\u00e9\7i\2\2\u00e9\u00ea\7t\2"+
		"\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7r\2\2\u00ed.\3\2"+
		"\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7f\2\2\u00f0\u00f1\7f\2\2\u00f1\60"+
		"\3\2\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\62\3\2\2\2\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7o\2\2\u00f9"+
		"\u00fa\7q\2\2\u00fa\u00fb\7x\2\2\u00fb\u00fc\7g\2\2\u00fc\64\3\2\2\2\u00fd"+
		"\u00fe\7f\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7h\2\2\u0100\u0101\7k\2\2"+
		"\u0101\u0102\7p\2\2\u0102\u0103\7g\2\2\u0103\u0104\7/\2\2\u0104\u0105"+
		"\7c\2\2\u0105\u0106\7p\2\2\u0106\u0107\7u\2\2\u0107\u0108\7y\2\2\u0108"+
		"\u0109\7g\2\2\u0109\u010a\7t\2\2\u010a\66\3\2\2\2\u010b\u010c\7f\2\2\u010c"+
		"\u010d\7g\2\2\u010d\u010e\7h\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2"+
		"\u0110\u0111\7g\2\2\u0111\u0112\7/\2\2\u0112\u0113\7o\2\2\u0113\u0114"+
		"\7c\2\2\u0114\u0115\7t\2\2\u0115\u0116\7m\2\2\u01168\3\2\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7x\2\2\u0119\u011a\7c\2\2\u011a\u011b\7n\2\2\u011b"+
		"\u011c\7w\2\2\u011c\u011d\7c\2\2\u011d\u011e\7v\2\2\u011e\u011f\7k\2\2"+
		"\u011f\u0120\7q\2\2\u0120\u0121\7p\2\2\u0121:\3\2\2\2\u0122\u0123\7o\2"+
		"\2\u0123\u0124\7w\2\2\u0124\u0125\7n\2\2\u0125\u0126\7v\2\2\u0126\u0127"+
		"\7k\2\2\u0127\u0128\7/\2\2\u0128\u0129\7e\2\2\u0129\u012a\7j\2\2\u012a"+
		"\u012b\7q\2\2\u012b\u012c\7k\2\2\u012c\u012d\7e\2\2\u012d\u012e\7g\2\2"+
		"\u012e<\3\2\2\2\u012f\u0130\7u\2\2\u0130\u0131\7j\2\2\u0131\u0132\7q\2"+
		"\2\u0132\u0133\7t\2\2\u0133\u0134\7v\2\2\u0134\u0135\7/\2\2\u0135\u0136"+
		"\7c\2\2\u0136\u0137\7p\2\2\u0137\u0138\7u\2\2\u0138\u0139\7y\2\2\u0139"+
		"\u013a\7g\2\2\u013a\u013b\7t\2\2\u013b>\3\2\2\2\u013c\u013d\7p\2\2\u013d"+
		"\u013e\7w\2\2\u013e\u013f\7o\2\2\u013f\u0140\7g\2\2\u0140\u0141\7t\2\2"+
		"\u0141\u0142\7k\2\2\u0142\u0143\7e\2\2\u0143\u0144\7/\2\2\u0144\u0145"+
		"\7c\2\2\u0145\u0146\7p\2\2\u0146\u0147\7u\2\2\u0147\u0148\7y\2\2\u0148"+
		"\u0149\7g\2\2\u0149\u014a\7t\2\2\u014a@\3\2\2\2\u014b\u014c\7g\2\2\u014c"+
		"\u014d\7u\2\2\u014d\u014e\7u\2\2\u014e\u014f\7c\2\2\u014f\u0150\7{\2\2"+
		"\u0150\u0151\7/\2\2\u0151\u0152\7c\2\2\u0152\u0153\7p\2\2\u0153\u0154"+
		"\7u\2\2\u0154\u0155\7y\2\2\u0155\u0156\7g\2\2\u0156\u0157\7t\2\2\u0157"+
		"B\3\2\2\2\u0158\u0159\7q\2\2\u0159\u015a\7r\2\2\u015a\u015b\7v\2\2\u015b"+
		"\u015c\7k\2\2\u015c\u015d\7q\2\2\u015d\u015e\7p\2\2\u015eD\3\2\2\2\u015f"+
		"\u0160\5G$\2\u0160\u0161\5\'\24\2\u0161\u0162\7k\2\2\u0162\u0163\7o\2"+
		"\2\u0163\u0164\7r\2\2\u0164\u0165\7q\2\2\u0165\u0166\7t\2\2\u0166\u0167"+
		"\7v\2\2\u0167F\3\2\2\2\u0168\u0169\7h\2\2\u0169\u016a\7t\2\2\u016a\u016b"+
		"\7q\2\2\u016b\u016c\7o\2\2\u016cH\3\2\2\2\u016d\u016e\7i\2\2\u016e\u016f"+
		"\7g\2\2\u016f\u0170\7v\2\2\u0170J\3\2\2\2\u0171\u0172\7v\2\2\u0172\u0173"+
		"\7q\2\2\u0173L\3\2\2\2\u0174\u0175\7c\2\2\u0175\u0176\7p\2\2\u0176\u0177"+
		"\7u\2\2\u0177\u0178\7y\2\2\u0178\u0179\7g\2\2\u0179\u017a\7t\2\2\u017a"+
		"N\3\2\2\2\u017b\u017c\7u\2\2\u017c\u017d\7j\2\2\u017d\u017e\7q\2\2\u017e"+
		"\u017f\7y\2\2\u017fP\3\2\2\2\u0180\u0181\7u\2\2\u0181\u0182\7j\2\2\u0182"+
		"\u0183\7w\2\2\u0183\u0184\7h\2\2\u0184\u0185\7h\2\2\u0185\u0186\7n\2\2"+
		"\u0186\u0187\7g\2\2\u0187R\3\2\2\2\u0188\u0189\7c\2\2\u0189\u018a\7p\2"+
		"\2\u018a\u018b\7f\2\2\u018bT\3\2\2\2\u018c\u018d\7y\2\2\u018d\u018e\7"+
		"k\2\2\u018e\u018f\7v\2\2\u018f\u0190\7j\2\2\u0190V\3\2\2\2\u0191\u0192"+
		"\7i\2\2\u0192\u0193\7t\2\2\u0193\u0194\7q\2\2\u0194\u0195\7w\2\2\u0195"+
		"\u0196\7r\2\2\u0196X\3\2\2\2\u0197\u0198\7e\2\2\u0198\u0199\7j\2\2\u0199"+
		"\u019a\7q\2\2\u019a\u019b\7k\2\2\u019b\u019c\7e\2\2\u019c\u019d\7g\2\2"+
		"\u019dZ\3\2\2\2\u019e\u019f\7o\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7v\2"+
		"\2\u01a1\u01a2\7e\2\2\u01a2\u01a3\7j\2\2\u01a3\\\3\2\2\2\u01a4\u01a5\7"+
		"o\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7e\2\2\u01a8\u01a9"+
		"\7j\2\2\u01a9\u01aa\7k\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7i\2\2\u01ac"+
		"^\3\2\2\2\u01ad\u01ae\7s\2\2\u01ae\u01af\7w\2\2\u01af\u01b0\7g\2\2\u01b0"+
		"\u01b1\7u\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7q\2\2"+
		"\u01b4\u01b5\7p\2\2\u01b5`\3\2\2\2\u01b6\u01b8\7\17\2\2\u01b7\u01b6\3"+
		"\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\7\f\2\2\u01ba"+
		"b\3\2\2\2\u01bb\u01bf\7%\2\2\u01bc\u01be\13\2\2\2\u01bd\u01bc\3\2\2\2"+
		"\u01be\u01c1\3\2\2\2\u01bf\u01c0\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c2"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\5a\61\2\u01c3d\3\2\2\2\u01c4"+
		"\u01c5\7%\2\2\u01c5\u01c6\7%\2\2\u01c6\u01ca\3\2\2\2\u01c7\u01c9\13\2"+
		"\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01cb\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01ce\7%"+
		"\2\2\u01ce\u01cf\7%\2\2\u01cff\3\2\2\2\u01d0\u01d2\t\5\2\2\u01d1\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5\u01d6\b\64\2\2\u01d6h\3\2\2\2\t\2\u00d8\u00dd\u01b7"+
		"\u01bf\u01ca\u01d3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
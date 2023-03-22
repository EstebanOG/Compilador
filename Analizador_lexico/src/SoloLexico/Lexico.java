/* The following code was generated by JFlex 1.4.3 on 21/03/23, 7:54 p. m. */

package SoloLexico;
import static SoloLexico.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 21/03/23, 7:54 p. m. from the specification file
 * <tt>../Analizador_lexico/src/SoloLexico/Lexico.flex</tt>
 */
class Lexico {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\16\2\0\1\3\22\0\1\3\1\0\1\17\1\37"+
    "\4\0\1\30\1\31\1\0\1\24\1\0\1\25\1\51\1\15\12\2"+
    "\1\0\1\36\1\26\1\23\1\27\2\0\22\1\1\20\7\1\4\0"+
    "\1\1\1\0\1\35\1\12\1\40\1\7\1\14\1\41\1\22\1\44"+
    "\1\4\1\1\1\42\1\13\1\34\1\5\1\10\1\47\1\1\1\21"+
    "\1\43\1\6\1\11\1\50\1\45\1\1\1\46\1\1\1\32\1\0"+
    "\1\33\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\10\2\1\1\1\5"+
    "\1\6\2\2\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\2\1\20\1\21\6\2\1\0"+
    "\1\2\1\22\2\2\1\23\6\2\1\4\2\2\1\0"+
    "\16\2\1\3\1\24\15\2\1\0\1\2\1\25\4\2"+
    "\1\26\1\2\1\27\20\2\1\30\1\31\3\2\1\3"+
    "\1\32\2\2\1\33\1\34\1\35\10\2\1\36\7\2"+
    "\1\37\1\40\4\2\1\41\1\42\2\2\1\43\1\44"+
    "\1\2\1\45\4\2\1\46\1\47\2\2\1\50\1\51"+
    "\2\2\1\52\1\53\1\54\1\55\1\56\1\2\1\57"+
    "\1\60\4\2\1\61\1\62\1\63\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\374\0\u0126"+
    "\0\u0150\0\u017a\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\52\0\52"+
    "\0\u024c\0\u0276\0\52\0\52\0\u02a0\0\52\0\52\0\u02ca"+
    "\0\52\0\52\0\52\0\u02f4\0\52\0\52\0\u031e\0\u0348"+
    "\0\u0372\0\u039c\0\u03c6\0\u03f0\0\u041a\0\u0444\0\124\0\u046e"+
    "\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\u05be"+
    "\0\u05e8\0\u0612\0\u063c\0\u0666\0\u0690\0\u06ba\0\u06e4\0\u070e"+
    "\0\u0738\0\u0762\0\u078c\0\u07b6\0\u07e0\0\u080a\0\u0834\0\u085e"+
    "\0\u0888\0\u08b2\0\u041a\0\124\0\u08dc\0\u0906\0\u0930\0\u095a"+
    "\0\u0984\0\u09ae\0\u09d8\0\u0a02\0\u0a2c\0\u0a56\0\u0a80\0\u0aaa"+
    "\0\u0ad4\0\u0afe\0\u0b28\0\124\0\u0b52\0\u0b7c\0\u0ba6\0\u0bd0"+
    "\0\124\0\u0bfa\0\124\0\u0c24\0\u0c4e\0\u0c78\0\u0ca2\0\u0ccc"+
    "\0\u0cf6\0\u0d20\0\u0d4a\0\u0d74\0\u0d9e\0\u0dc8\0\u0df2\0\u0e1c"+
    "\0\u0e46\0\u0e70\0\u0e9a\0\124\0\124\0\u0ec4\0\u0eee\0\u0f18"+
    "\0\52\0\124\0\u0f42\0\u0f6c\0\124\0\124\0\124\0\u0f96"+
    "\0\u0fc0\0\u0fea\0\u1014\0\u103e\0\u1068\0\u1092\0\u10bc\0\124"+
    "\0\u10e6\0\u1110\0\u113a\0\u1164\0\u118e\0\u11b8\0\u11e2\0\124"+
    "\0\124\0\u120c\0\u1236\0\u1260\0\u128a\0\124\0\124\0\u12b4"+
    "\0\u12de\0\124\0\124\0\u1308\0\124\0\u1332\0\u135c\0\u1386"+
    "\0\u13b0\0\124\0\124\0\u13da\0\u1404\0\124\0\124\0\u142e"+
    "\0\u1458\0\124\0\124\0\124\0\124\0\124\0\u1482\0\124"+
    "\0\124\0\u14ac\0\u14d6\0\u1500\0\u152a\0\124\0\124\0\124"+
    "\0\124";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\3\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\3\1\35\1\36"+
    "\1\37\1\40\1\3\1\41\1\3\1\42\1\3\1\43"+
    "\1\44\1\2\53\0\2\3\1\0\11\3\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\3\0\1\4\46\0\1\45"+
    "\3\0\1\5\47\0\2\3\1\0\1\3\1\46\7\3"+
    "\3\0\3\3\11\0\2\3\2\0\1\3\1\47\7\3"+
    "\2\0\2\3\1\0\11\3\3\0\3\3\11\0\1\3"+
    "\1\50\2\0\11\3\2\0\2\3\1\0\11\3\3\0"+
    "\3\3\11\0\2\3\2\0\6\3\1\51\2\3\2\0"+
    "\2\3\1\0\4\3\1\52\3\3\1\53\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\1\3"+
    "\1\54\7\3\3\0\3\3\11\0\2\3\2\0\3\3"+
    "\1\55\5\3\2\0\2\3\1\0\11\3\3\0\1\3"+
    "\1\56\1\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\4\3\1\57\4\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\7\3\1\60\1\3"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\16\0\1\61"+
    "\35\0\2\3\1\0\2\3\1\62\6\3\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\10\3"+
    "\1\63\3\0\3\3\11\0\2\3\2\0\11\3\3\0"+
    "\1\4\73\0\2\64\25\0\2\3\1\0\11\3\3\0"+
    "\3\3\11\0\1\3\1\65\2\0\11\3\2\0\2\3"+
    "\1\0\1\66\3\3\1\67\4\3\3\0\3\3\11\0"+
    "\1\3\1\70\2\0\4\3\1\71\4\3\2\0\2\3"+
    "\1\0\4\3\1\72\2\3\1\73\1\3\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\2\3"+
    "\1\74\6\3\3\0\3\3\11\0\2\3\2\0\1\75"+
    "\3\3\1\76\1\77\3\3\2\0\2\3\1\0\11\3"+
    "\3\0\3\3\11\0\2\3\2\0\4\3\1\100\4\3"+
    "\2\0\2\3\1\0\11\3\3\0\1\3\1\101\1\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\4\3"+
    "\1\102\4\3\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\3\0\1\103\50\0\2\3\1\0\2\3\1\104\6\3"+
    "\3\0\3\3\11\0\2\3\2\0\1\105\10\3\2\0"+
    "\2\3\1\0\11\3\3\0\3\3\11\0\1\106\1\3"+
    "\2\0\11\3\2\0\2\3\1\0\11\3\3\0\3\3"+
    "\11\0\2\3\2\0\7\3\1\107\1\3\2\0\2\3"+
    "\1\0\5\3\1\110\3\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\11\3\3\0\3\3"+
    "\11\0\2\3\2\0\1\3\1\111\7\3\2\0\2\3"+
    "\1\0\11\3\3\0\3\3\11\0\2\3\2\0\3\3"+
    "\1\112\5\3\2\0\2\3\1\0\1\113\10\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\10\3\1\114\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\1\3\1\115\7\3\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\11\3"+
    "\3\0\3\3\11\0\2\3\2\0\3\3\1\116\5\3"+
    "\1\0\16\61\1\0\33\61\1\0\2\3\1\0\11\3"+
    "\3\0\1\3\1\117\1\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\2\3\1\120\6\3\3\0\2\3"+
    "\1\121\11\0\2\3\2\0\11\3\3\0\1\122\50\0"+
    "\2\3\1\0\1\123\10\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\1\3\1\124\7\3"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\1\3\1\125\3\3\1\126\3\3\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\11\3"+
    "\3\0\3\3\11\0\2\3\2\0\3\3\1\127\5\3"+
    "\2\0\2\3\1\0\11\3\3\0\3\3\11\0\1\3"+
    "\1\130\2\0\11\3\2\0\2\3\1\0\11\3\3\0"+
    "\1\3\1\131\1\3\11\0\2\3\2\0\11\3\2\0"+
    "\2\3\1\0\4\3\1\132\4\3\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\3\3\1\133"+
    "\5\3\3\0\1\3\1\134\1\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\11\3\3\0\3\3\11\0"+
    "\1\3\1\135\2\0\11\3\2\0\2\3\1\0\4\3"+
    "\1\136\4\3\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\1\137\10\3\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\1\140\10\3"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\1\141\10\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\1\142\10\3\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\7\3"+
    "\1\143\1\3\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\10\3\1\144\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\10\3\1\145"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\6\3\1\146\2\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\1\147\10\3\3\0"+
    "\3\3\11\0\1\3\1\150\2\0\11\3\2\0\2\3"+
    "\1\0\1\151\10\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\1\3\1\152\7\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\11\3\3\0\3\3\11\0\1\3\1\153\2\0\11\3"+
    "\2\0\2\3\1\0\11\3\3\0\2\3\1\154\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\10\3\1\155"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\1\156\10\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\5\3\1\157\3\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\1\160\10\3\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\3\0\1\122\26\0\1\161\21\0\2\3\1\0\1\3"+
    "\1\162\7\3\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\2\3\1\163\6\3\3\0\3\3"+
    "\11\0\2\3\2\0\3\3\1\164\5\3\2\0\2\3"+
    "\1\0\2\3\1\165\6\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\10\3\1\166\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\11\3\3\0\1\3\1\167\1\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\11\3\3\0\3\3\11\0"+
    "\1\3\1\170\2\0\11\3\2\0\2\3\1\0\1\171"+
    "\4\3\1\172\3\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\1\3\1\173\7\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\11\3\3\0\1\3\1\174\1\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\2\3\1\175\6\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\7\3\1\176\1\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\1\3\1\177\7\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\3\3\1\200\5\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\5\3\1\201\3\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\11\3\3\0\3\3\11\0\2\3\2\0\3\3\1\202"+
    "\5\3\2\0\2\3\1\0\3\3\1\203\5\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\7\3\1\204\1\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\1\3\1\205\7\3\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\5\3\1\206\3\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\11\3\3\0\2\3\1\207"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\11\3"+
    "\3\0\2\3\1\210\11\0\2\3\2\0\11\3\2\0"+
    "\2\3\1\0\11\3\3\0\3\3\11\0\2\3\2\0"+
    "\2\3\1\211\6\3\2\0\2\3\1\0\1\3\1\212"+
    "\7\3\3\0\3\3\11\0\2\3\2\0\11\3\2\0"+
    "\2\3\1\0\11\3\3\0\1\3\1\213\1\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\11\3\3\0"+
    "\3\3\11\0\2\3\2\0\3\3\1\214\5\3\2\0"+
    "\2\3\1\0\1\215\10\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\2\3\1\216\6\3"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\2\3\1\217\6\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\1\3\1\220\7\3"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\11\3\3\0\3\3\11\0\2\3\2\0\1\221"+
    "\10\3\2\0\2\3\1\0\11\3\3\0\3\3\11\0"+
    "\2\3\2\0\1\3\1\222\7\3\2\0\2\3\1\0"+
    "\2\3\1\223\6\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\11\3\3\0\3\3\11\0"+
    "\2\3\2\0\1\224\10\3\2\0\2\3\1\0\10\3"+
    "\1\225\3\0\3\3\11\0\2\3\2\0\11\3\2\0"+
    "\2\3\1\0\2\3\1\226\6\3\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\3\3\1\227"+
    "\5\3\3\0\3\3\11\0\2\3\2\0\11\3\2\0"+
    "\2\3\1\0\11\3\3\0\3\3\11\0\2\3\2\0"+
    "\7\3\1\230\1\3\2\0\2\3\1\0\10\3\1\231"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\10\3\1\232\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\10\3\1\233\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\7\3"+
    "\1\234\1\3\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\1\3\1\235\7\3\3\0\3\3"+
    "\11\0\2\3\2\0\11\3\2\0\2\3\1\0\11\3"+
    "\3\0\2\3\1\236\11\0\2\3\2\0\11\3\2\0"+
    "\2\3\1\0\1\3\1\237\7\3\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\2\3\1\240"+
    "\6\3\3\0\3\3\11\0\2\3\2\0\11\3\2\0"+
    "\2\3\1\0\1\3\1\241\7\3\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\11\3\3\0"+
    "\2\3\1\242\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\2\3\1\243\6\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\11\3\3\0\3\3"+
    "\11\0\2\3\2\0\4\3\1\244\4\3\2\0\2\3"+
    "\1\0\11\3\3\0\3\3\11\0\2\3\2\0\1\3"+
    "\1\245\7\3\2\0\2\3\1\0\10\3\1\246\3\0"+
    "\3\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\11\3\3\0\3\3\11\0\1\3\1\247\2\0\11\3"+
    "\2\0\2\3\1\0\11\3\3\0\3\3\11\0\2\3"+
    "\2\0\1\3\1\250\7\3\2\0\2\3\1\0\2\3"+
    "\1\251\6\3\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\10\3\1\252\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\2\0\2\3\1\0\10\3\1\253"+
    "\3\0\3\3\11\0\2\3\2\0\11\3\2\0\2\3"+
    "\1\0\5\3\1\254\3\3\3\0\3\3\11\0\2\3"+
    "\2\0\11\3\2\0\2\3\1\0\11\3\3\0\3\3"+
    "\11\0\2\3\2\0\1\255\10\3\2\0\2\3\1\0"+
    "\3\3\1\256\5\3\3\0\3\3\11\0\2\3\2\0"+
    "\11\3\2\0\2\3\1\0\11\3\3\0\1\3\1\257"+
    "\1\3\11\0\2\3\2\0\11\3\2\0\2\3\1\0"+
    "\10\3\1\260\3\0\3\3\11\0\2\3\2\0\11\3"+
    "\2\0\2\3\1\0\10\3\1\261\3\0\3\3\11\0"+
    "\2\3\2\0\11\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5460];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\14\1\2\11\2\1\2\11\1\1\2\11"+
    "\1\1\3\11\1\1\2\11\6\1\1\0\16\1\1\0"+
    "\35\1\1\0\36\1\1\11\100\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[177];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 124) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 15: 
          { lexemas=yytext(); return Llave_c;
          }
        case 53: break;
        case 22: 
          { lexemas=yytext(); return For;
          }
        case 54: break;
        case 6: 
          { lexemas=yytext(); return Comillas;
          }
        case 55: break;
        case 32: 
          { lexemas=yytext(); return Break;
          }
        case 56: break;
        case 31: 
          { lexemas=yytext(); return Using;
          }
        case 57: break;
        case 33: 
          { lexemas=yytext(); return Const;
          }
        case 58: break;
        case 8: 
          { lexemas=yytext(); return Suma;
          }
        case 59: break;
        case 10: 
          { lexemas=yytext(); return MenorQue;
          }
        case 60: break;
        case 19: 
          { lexemas=yytext(); return Do;
          }
        case 61: break;
        case 44: 
          { lexemas=yytext(); return Switch;
          }
        case 62: break;
        case 5: 
          { return Linea;
          }
        case 63: break;
        case 48: 
          { lexemas=yytext(); return Default;
          }
        case 64: break;
        case 25: 
          { lexemas=yytext(); return Else;
          }
        case 65: break;
        case 49: 
          { lexemas=yytext(); return Unsigned;
          }
        case 66: break;
        case 38: 
          { lexemas=yytext(); return Double;
          }
        case 67: break;
        case 28: 
          { lexemas=yytext(); return Case;
          }
        case 68: break;
        case 12: 
          { lexemas=yytext(); return Parent_a;
          }
        case 69: break;
        case 30: 
          { lexemas=yytext(); return Void;
          }
        case 70: break;
        case 23: 
          { lexemas=yytext(); return Std;
          }
        case 71: break;
        case 35: 
          { lexemas=yytext(); return Scanf;
          }
        case 72: break;
        case 24: 
          { lexemas=yytext(); return Long;
          }
        case 73: break;
        case 16: 
          { lexemas=yytext(); return P_coma;
          }
        case 74: break;
        case 18: 
          { lexemas=yytext(); return If;
          }
        case 75: break;
        case 41: 
          { lexemas=yytext(); return Return;
          }
        case 76: break;
        case 51: 
          { lexemas=yytext(); return Continue;
          }
        case 77: break;
        case 52: 
          { lexemas=yytext(); return Namespace;
          }
        case 78: break;
        case 13: 
          { lexemas=yytext(); return Parent_c;
          }
        case 79: break;
        case 43: 
          { lexemas=yytext(); return Struct;
          }
        case 80: break;
        case 17: 
          { lexemas=yytext(); return Almohadilla;
          }
        case 81: break;
        case 14: 
          { lexemas=yytext(); return Llave_a;
          }
        case 82: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 83: break;
        case 42: 
          { lexemas=yytext(); return String;
          }
        case 84: break;
        case 9: 
          { lexemas=yytext(); return Resta;
          }
        case 85: break;
        case 20: 
          { lexemas=yytext(); return Int;
          }
        case 86: break;
        case 26: 
          { lexemas=yytext(); return Main;
          }
        case 87: break;
        case 36: 
          { lexemas=yytext(); return Short;
          }
        case 88: break;
        case 21: 
          { lexemas=yytext(); return Cin;
          }
        case 89: break;
        case 45: 
          { lexemas=yytext(); return Printf;
          }
        case 90: break;
        case 1: 
          { return ERROR;
          }
        case 91: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 92: break;
        case 39: 
          { lexemas=yytext(); return Define;
          }
        case 93: break;
        case 11: 
          { lexemas=yytext(); return MayorQue;
          }
        case 94: break;
        case 50: 
          { lexemas=yytext(); return Register;
          }
        case 95: break;
        case 27: 
          { lexemas=yytext(); return Cout;
          }
        case 96: break;
        case 4: 
          { /*Ignore*/
          }
        case 97: break;
        case 46: 
          { lexemas=yytext(); return Include;
          }
        case 98: break;
        case 7: 
          { lexemas=yytext(); return Igual;
          }
        case 99: break;
        case 37: 
          { lexemas=yytext(); return C_while;
          }
        case 100: break;
        case 34: 
          { lexemas=yytext(); return Float;
          }
        case 101: break;
        case 47: 
          { lexemas=yytext(); return Typedef;
          }
        case 102: break;
        case 40: 
          { lexemas=yytext(); return Cadena;
          }
        case 103: break;
        case 29: 
          { lexemas=yytext(); return Char;
          }
        case 104: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

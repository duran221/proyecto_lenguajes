/* The following code was generated by JFlex 1.4.3 on 11/07/19 01:35 PM */

package codigo;
import static codigo.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 11/07/19 01:35 PM from the specification file
 * <tt>C:/Users/crist/OneDrive/Documentos/Universidad/EstructuraLenguajes/Proyecto/ProyectoLenguajes/src/codigo/lexer.flex</tt>
 */
class Lexer {

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
    "\11\0\1\3\1\30\2\0\1\3\22\0\1\55\2\0\1\40\1\41"+
    "\1\42\1\43\1\35\1\44\1\45\1\34\1\32\1\5\1\33\1\50"+
    "\1\27\1\54\1\54\1\54\1\53\6\2\1\0\1\51\1\36\1\31"+
    "\1\37\1\46\1\0\1\6\1\62\1\22\1\12\1\10\1\21\1\25"+
    "\1\56\1\13\2\1\1\24\1\23\1\11\1\17\1\7\1\57\1\16"+
    "\1\15\1\14\1\60\1\26\2\1\1\20\1\1\4\0\1\52\1\0"+
    "\6\1\1\4\1\1\2\4\5\1\1\4\12\1\104\0\1\47\21\0"+
    "\1\61\uff2e\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\13\2\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\3\2\0\1\27\1\30\1\0\1\31\5\2\1\32"+
    "\2\2\1\33\7\2\1\4\1\34\1\3\1\0\1\35"+
    "\1\0\2\2\1\0\5\2\1\0\1\2\1\36\3\2"+
    "\1\0\1\37\2\0\2\2\1\40\1\2\1\41\3\2"+
    "\1\41\1\42\1\2\1\0\2\2\1\43\1\0\13\2"+
    "\2\0\7\2\3\0\1\2\1\41\2\2\1\0\1\44"+
    "\2\0\7\2\2\0\7\2\2\0\4\2\2\0\3\2"+
    "\2\0\1\2\7\0\1\45\12\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[176];
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
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\u0132\0\u0165"+
    "\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd"+
    "\0\u0330\0\63\0\63\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\u0363\0\63\0\63\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\u0396\0\u03c9\0\u03fc\0\63\0\63\0\u042f"+
    "\0\63\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594"+
    "\0\u05c7\0\u05fa\0\u062d\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c"+
    "\0\u075f\0\u0792\0\u0363\0\u07c5\0\u07f8\0\63\0\u082b\0\u085e"+
    "\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6"+
    "\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u07c5\0\u0b5b"+
    "\0\u0b8e\0\u0bc1\0\u0bf4\0\u08c4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0"+
    "\0\u0cf3\0\146\0\u09f6\0\u0d26\0\u0a5c\0\u0d59\0\u0d8c\0\u0b28"+
    "\0\u0dbf\0\u0df2\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24"+
    "\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023\0\u1056\0\u1089\0\u10bc"+
    "\0\u10ef\0\u1122\0\u1155\0\u1188\0\u11bb\0\u11ee\0\u1221\0\u1254"+
    "\0\u1287\0\u12ba\0\u12ed\0\u1320\0\u1353\0\u1221\0\u1386\0\u13b9"+
    "\0\u13ec\0\u141f\0\u1452\0\u1485\0\u14b8\0\u14eb\0\u151e\0\u1551"+
    "\0\u1584\0\u15b7\0\u15ea\0\u161d\0\u1650\0\u1683\0\u16b6\0\u16e9"+
    "\0\u171c\0\u174f\0\u1782\0\u17b5\0\u17e8\0\u181b\0\u184e\0\u1881"+
    "\0\u18b4\0\u18e7\0\u191a\0\u194d\0\u1980\0\u19b3\0\u19e6\0\u1a19"+
    "\0\u1a4c\0\u1a7f\0\u1ab2\0\u1ae5\0\u1b18\0\63\0\u1b4b\0\u1b7e"+
    "\0\u1bb1\0\u1be4\0\u1c17\0\u1c4a\0\u1c7d\0\u1cb0\0\u1ce3\0\u1d16";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[176];
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
    "\1\2\1\3\1\4\1\5\1\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\3\1\13\4\3\1\14\1\15"+
    "\1\3\1\16\1\17\1\20\1\21\1\5\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\3"+
    "\1\43\1\4\1\5\3\3\1\2\1\3\64\0\1\3"+
    "\1\0\1\44\1\3\1\44\21\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\2\0\1\4\23\0\1\46\13\0\1\47\5\0\1\50"+
    "\2\0\2\4\1\0\1\51\7\0\1\5\1\0\1\5"+
    "\22\0\1\5\24\0\1\5\6\0\1\3\1\0\1\44"+
    "\1\3\1\44\1\3\1\52\17\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\2\3\1\53"+
    "\16\3\1\0\1\44\17\0\1\45\1\0\1\54\2\0"+
    "\1\44\2\3\1\55\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\4\3\1\56\14\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\1\0\1\3\1\57\1\44\1\3\1\44\21\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\57\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\0\1\44\1\3"+
    "\1\44\2\3\1\60\16\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\3\1\0"+
    "\1\3\1\0\1\44\1\3\1\44\11\3\1\61\7\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\62\1\44\1\3"+
    "\1\44\1\63\20\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\64\2\62\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\11\3\1\65\4\3\1\66"+
    "\2\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\11\3\1\67\7\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\10\3\1\70"+
    "\10\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\21\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\71\2\0\1\44\3\3\1\0\1\3\27\0\1\72"+
    "\35\0\1\73\50\0\2\73\10\0\1\4\23\0\1\46"+
    "\13\0\1\47\5\0\1\50\2\0\1\4\1\74\1\0"+
    "\1\51\6\0\1\75\1\44\1\0\1\44\22\0\1\44"+
    "\22\0\2\75\1\44\11\0\2\76\57\0\1\77\50\0"+
    "\2\77\7\0\1\3\1\0\1\44\1\3\1\44\1\3"+
    "\1\100\17\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\21\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\1\3\1\101\1\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\44\1\3\1\44\21\3"+
    "\1\0\1\44\7\0\1\102\7\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\21\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\103\1\0"+
    "\1\3\1\0\1\44\1\3\1\44\5\3\1\104\13\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\2\0\1\57\50\0\2\57\7\0"+
    "\1\3\1\0\1\44\1\3\1\44\7\3\1\105\11\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\0\1\44\1\3"+
    "\1\44\16\3\1\106\2\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\3\2\0"+
    "\1\62\50\0\2\62\7\0\1\3\1\0\1\44\1\3"+
    "\1\44\14\3\1\107\4\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\3\1\0"+
    "\1\3\1\0\1\44\1\3\1\44\21\3\1\0\1\44"+
    "\7\0\1\110\7\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\0\1\44\1\3"+
    "\1\44\15\3\1\111\3\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\3\1\0"+
    "\1\3\1\112\1\44\1\3\1\44\21\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\113\2\112\1\44\3\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\44\1\3\1\44\14\3"+
    "\1\114\4\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\1\115\20\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\21\3\1\0"+
    "\1\44\7\0\1\116\7\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\30\72\1\0\32\72\2\0"+
    "\1\117\23\0\1\46\13\0\1\47\5\0\1\50\2\0"+
    "\2\117\1\0\1\51\5\0\1\120\1\75\1\0\1\120"+
    "\1\0\21\120\23\0\1\120\2\75\1\121\3\120\1\0"+
    "\1\120\2\0\1\77\37\0\1\47\10\0\2\77\7\0"+
    "\1\3\1\0\1\44\1\3\1\44\2\3\1\122\16\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\0\1\44\1\3"+
    "\1\44\21\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\2\3\1\123\1\0\1\3\2\0\1\124"+
    "\50\0\2\124\7\0\1\3\1\0\1\44\1\3\1\44"+
    "\16\3\1\125\2\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\6\3\1\126\12\3\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\44\1\3\1\44"+
    "\6\3\1\127\12\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\1\3\1\130\11\3\1\131"+
    "\5\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\6\3\1\132\12\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\2\0\1\133\50\0\2\133\7\0\1\3\1\0\1\44"+
    "\1\3\1\44\2\3\1\134\16\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\2\0\1\112\50\0\2\112\7\0\1\3\1\0\1\44"+
    "\1\3\1\44\21\3\1\0\1\44\7\0\1\135\7\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\1\136\20\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\0\1\44\1\3"+
    "\1\44\3\3\1\137\15\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\3\2\0"+
    "\1\140\50\0\2\140\7\0\1\120\2\0\1\120\1\0"+
    "\21\120\23\0\1\120\2\0\1\121\3\120\1\0\1\120"+
    "\40\0\1\141\23\0\1\3\1\0\1\44\1\3\1\44"+
    "\3\3\1\142\15\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\2\3\1\143\16\3\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\44\1\3\1\44"+
    "\5\3\1\144\13\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\3\3\1\145\2\3\1\146"+
    "\5\3\1\147\4\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\10\3\1\150\10\3\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\44\1\3\1\44"+
    "\10\3\1\151\10\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\1\63\20\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\44\1\3\1\44\10\3"+
    "\1\152\10\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\6\3\1\153\12\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\44\1\3\1\44\4\3"+
    "\1\154\14\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\2\0\1\155\50\0"+
    "\2\155\7\0\1\3\1\0\1\44\1\3\1\44\4\3"+
    "\1\132\14\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\21\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\156\1\3\1\0"+
    "\1\3\1\0\1\44\1\3\1\44\14\3\1\157\4\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\0\1\44\1\3"+
    "\1\44\1\160\20\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\2\3\1\161\16\3\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\44\1\3\1\44"+
    "\2\3\1\142\16\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\11\3\1\162\7\3\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\44\1\3\1\44"+
    "\2\3\1\132\16\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\14\3\1\163\4\3\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\44\1\3\1\44"+
    "\5\3\1\164\13\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\2\3\1\165\16\3\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\166\1\155\1\0\1\166\1\0"+
    "\21\166\4\0\1\167\16\0\1\166\2\155\1\0\3\166"+
    "\1\0\1\166\6\0\1\170\55\0\1\3\1\0\1\44"+
    "\1\3\1\44\11\3\1\171\7\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\15\3\1\151"+
    "\3\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\16\3\1\132\2\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\12\3\1\172"+
    "\6\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\5\3\1\173\13\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\11\3\1\174"+
    "\7\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\21\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\175\3\3\1\0\1\3\1\0\1\166"+
    "\2\0\1\166\1\0\21\166\4\0\1\167\16\0\1\166"+
    "\3\0\3\166\1\0\1\166\2\0\1\176\50\0\2\176"+
    "\63\0\1\177\6\0\1\3\1\0\1\44\1\3\1\44"+
    "\21\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\200\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\1\3\1\201\1\3\1\202\1\203\1\204"+
    "\1\146\5\3\1\205\1\3\1\206\2\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\44\1\3\1\44\1\207"+
    "\20\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\3\3\1\132\15\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\2\0\1\75\1\44\1\0\1\44\2\0\1\210\17\0"+
    "\1\44\22\0\2\75\1\44\15\0\1\210\54\0\1\75"+
    "\1\44\1\0\1\44\17\0\1\211\2\0\1\44\22\0"+
    "\2\75\1\44\6\0\1\3\1\0\1\44\1\3\1\44"+
    "\10\3\1\212\10\3\1\0\1\44\17\0\1\45\1\0"+
    "\1\3\2\0\1\44\3\3\1\0\1\3\1\0\1\3"+
    "\1\0\1\44\1\3\1\44\1\160\4\3\1\107\13\3"+
    "\1\0\1\44\17\0\1\45\1\0\1\3\2\0\1\44"+
    "\3\3\1\0\1\3\1\0\1\3\1\0\1\44\1\3"+
    "\1\44\5\3\1\213\13\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\3\1\0"+
    "\1\3\1\0\1\44\1\3\1\44\20\3\1\214\1\0"+
    "\1\44\17\0\1\45\1\0\1\3\2\0\1\44\3\3"+
    "\1\0\1\3\1\0\1\3\1\0\1\44\1\3\1\44"+
    "\1\215\1\3\1\142\6\3\1\216\7\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\44\1\3\1\44\11\3"+
    "\1\217\7\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\3\3\1\220\15\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\23\0\1\221\47\0\1\222\53\0\1\3\1\0"+
    "\1\44\1\3\1\44\2\3\1\223\16\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\44\1\3\1\44\10\3"+
    "\1\132\10\3\1\0\1\44\17\0\1\45\1\0\1\3"+
    "\2\0\1\44\3\3\1\0\1\3\1\0\1\3\1\0"+
    "\1\44\1\3\1\44\1\132\20\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\3\3\1\107"+
    "\15\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\4\3\1\224\14\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\17\3\1\225"+
    "\1\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\6\3\1\226\12\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\7\0\1\227\64\0\1\230\52\0\1\3\1\0\1\44"+
    "\1\3\1\44\14\3\1\231\4\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\13\3\1\232"+
    "\5\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\11\3\1\132\7\3\1\0\1\44\17\0"+
    "\1\45\1\0\1\3\2\0\1\44\3\3\1\0\1\3"+
    "\1\0\1\3\1\0\1\44\1\3\1\44\2\3\1\233"+
    "\16\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\16\0\1\234\54\0\1\235"+
    "\53\0\1\3\1\0\1\44\1\3\1\44\5\3\1\225"+
    "\13\3\1\0\1\44\17\0\1\45\1\0\1\3\2\0"+
    "\1\44\3\3\1\0\1\3\1\0\1\3\1\0\1\44"+
    "\1\3\1\44\1\236\20\3\1\0\1\44\17\0\1\45"+
    "\1\0\1\3\2\0\1\44\3\3\1\0\1\3\1\0"+
    "\1\3\1\0\1\44\1\3\1\44\21\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\237\3\3\1\0"+
    "\1\3\10\0\1\240\70\0\1\241\45\0\1\3\1\0"+
    "\1\44\1\3\1\44\14\3\1\132\4\3\1\0\1\44"+
    "\17\0\1\45\1\0\1\3\2\0\1\44\3\3\1\0"+
    "\1\3\2\0\1\75\1\44\1\0\1\44\5\0\1\242"+
    "\14\0\1\44\22\0\2\75\1\44\22\0\1\243\53\0"+
    "\1\244\65\0\1\245\57\0\1\246\100\0\1\246\50\0"+
    "\1\247\60\0\1\250\61\0\1\251\63\0\1\252\63\0"+
    "\1\253\63\0\1\254\63\0\1\255\57\0\1\256\63\0"+
    "\1\257\65\0\1\260\56\0\1\246\52\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7497];
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
    "\1\0\1\11\17\1\10\11\1\1\10\11\1\1\2\0"+
    "\2\11\1\0\1\11\23\1\1\0\1\11\1\0\2\1"+
    "\1\0\5\1\1\0\5\1\1\0\1\1\2\0\13\1"+
    "\1\0\3\1\1\0\13\1\2\0\7\1\3\0\4\1"+
    "\1\0\1\1\2\0\7\1\2\0\7\1\2\0\4\1"+
    "\2\0\3\1\2\0\1\1\7\0\1\11\12\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[176];
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
    public String Analizador;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
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
    while (i < 144) {
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
        case 29: 
          { Analizador=yytext(); return LOGO;
          }
        case 38: break;
        case 34: 
          { Analizador=yytext(); return IDENTIFICADORFACTURA;
          }
        case 39: break;
        case 26: 
          { Analizador=yytext(); return NIT;
          }
        case 40: break;
        case 23: 
          { Analizador=yytext(); return COORDENADA_Y;
          }
        case 41: break;
        case 11: 
          { return Menor;
          }
        case 42: break;
        case 17: 
          { return ParentesisAbierto;
          }
        case 43: break;
        case 32: 
          { Analizador=yytext(); return IDENTIFICADORPRODUCTO;
          }
        case 44: break;
        case 36: 
          { Analizador=yytext(); return DIRECCION;
          }
        case 45: break;
        case 18: 
          { return ParentesisCerrado;
          }
        case 46: break;
        case 37: 
          { Analizador=yytext(); return ENTE;
          }
        case 47: break;
        case 22: 
          { return PuntoComa;
          }
        case 48: break;
        case 20: 
          { return InterrogacionC;
          }
        case 49: break;
        case 10: 
          { return Apostrofe;
          }
        case 50: break;
        case 25: 
          { Analizador=yytext(); return COORDENADA_X;
          }
        case 51: break;
        case 33: 
          { Analizador=yytext(); return PALABRA_RESERVADA;
          }
        case 52: break;
        case 35: 
          { Analizador=yytext(); return IDENTIFICADORVENTA;
          }
        case 53: break;
        case 14: 
          { return Dolar;
          }
        case 54: break;
        case 7: 
          { return Suma;
          }
        case 55: break;
        case 15: 
          { return Porcentaje;
          }
        case 56: break;
        case 3: 
          { Analizador=yytext(); return Numero;
          }
        case 57: break;
        case 31: 
          { Analizador=yytext(); return TELEFONO;
          }
        case 58: break;
        case 21: 
          { return Punto;
          }
        case 59: break;
        case 19: 
          { return Interrogacion;
          }
        case 60: break;
        case 27: 
          { Analizador=yytext(); return CODIGOFACTURA;
          }
        case 61: break;
        case 8: 
          { return Resta;
          }
        case 62: break;
        case 12: 
          { return Mayor;
          }
        case 63: break;
        case 13: 
          { return Numeral;
          }
        case 64: break;
        case 24: 
          { Analizador=yytext(); return IVA;
          }
        case 65: break;
        case 28: 
          { Analizador=yytext(); return PRECIO;
          }
        case 66: break;
        case 2: 
          { Analizador=yytext(); return NOMBRE;
          }
        case 67: break;
        case 1: 
          { return ERROR;
          }
        case 68: break;
        case 9: 
          { return Multiplicacion;
          }
        case 69: break;
        case 4: 
          { /*Ignore*/
          }
        case 70: break;
        case 16: 
          { return Anpersand;
          }
        case 71: break;
        case 30: 
          { Analizador=yytext(); return IDCLIENTE;
          }
        case 72: break;
        case 6: 
          { return Igual;
          }
        case 73: break;
        case 5: 
          { return Division;
          }
        case 74: break;
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
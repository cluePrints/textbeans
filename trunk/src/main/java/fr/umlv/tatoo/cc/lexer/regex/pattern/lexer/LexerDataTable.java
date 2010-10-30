package fr.umlv.tatoo.cc.lexer.regex.pattern.lexer;

import fr.umlv.tatoo.cc.lexer.regex.pattern.lexer.RuleEnum;
import fr.umlv.tatoo.runtime.lexer.LexerTable;
import fr.umlv.tatoo.runtime.lexer.rules.RuleData;
import fr.umlv.tatoo.runtime.regex.CharRegexTable;
import java.util.EnumMap;
/** 
 *  This class is generated - please do not edit it 
 */
public class LexerDataTable {

  public static LexerTable<RuleEnum> createTable() {
    return new LexerDataTable().table;
  }

  private LexerDataTable() {
    initdotMainAccepts();
    initdotMainTransitions();
    CharRegexTable dotMain = new CharRegexTable(1, dotMainTransitions, dotMainAccepts);
    RuleData dot = new RuleData(dotMain, null, 0, false);
    inithatMainAccepts();
    inithatMainTransitions();
    CharRegexTable hatMain = new CharRegexTable(1, hatMainTransitions, hatMainAccepts);
    RuleData hat = new RuleData(hatMain, null, 1, false);
    initquoteMainAccepts();
    initquoteMainTransitions();
    CharRegexTable quoteMain = new CharRegexTable(1, quoteMainTransitions, quoteMainAccepts);
    RuleData quote = new RuleData(quoteMain, null, 2, false);
    initcommaMainAccepts();
    initcommaMainTransitions();
    CharRegexTable commaMain = new CharRegexTable(1, commaMainTransitions, commaMainAccepts);
    RuleData comma = new RuleData(commaMain, null, 3, false);
    initstarMainAccepts();
    initstarMainTransitions();
    CharRegexTable starMain = new CharRegexTable(1, starMainTransitions, starMainAccepts);
    RuleData star = new RuleData(starMain, null, 4, false);
    initplusMainAccepts();
    initplusMainTransitions();
    CharRegexTable plusMain = new CharRegexTable(1, plusMainTransitions, plusMainAccepts);
    RuleData plus = new RuleData(plusMain, null, 5, false);
    initminusMainAccepts();
    initminusMainTransitions();
    CharRegexTable minusMain = new CharRegexTable(1, minusMainTransitions, minusMainAccepts);
    RuleData minus = new RuleData(minusMain, null, 6, false);
    initslashMainAccepts();
    initslashMainTransitions();
    CharRegexTable slashMain = new CharRegexTable(1, slashMainTransitions, slashMainAccepts);
    RuleData slash = new RuleData(slashMain, null, 7, false);
    initdollarMainAccepts();
    initdollarMainTransitions();
    CharRegexTable dollarMain = new CharRegexTable(1, dollarMainTransitions, dollarMainAccepts);
    RuleData dollar = new RuleData(dollarMain, null, 8, false);
    initquestionMainAccepts();
    initquestionMainTransitions();
    CharRegexTable questionMain = new CharRegexTable(1, questionMainTransitions, questionMainAccepts);
    RuleData question = new RuleData(questionMain, null, 9, false);
    initlbrakMainAccepts();
    initlbrakMainTransitions();
    CharRegexTable lbrakMain = new CharRegexTable(1, lbrakMainTransitions, lbrakMainAccepts);
    RuleData lbrak = new RuleData(lbrakMain, null, 10, false);
    initrbrakMainAccepts();
    initrbrakMainTransitions();
    CharRegexTable rbrakMain = new CharRegexTable(1, rbrakMainTransitions, rbrakMainAccepts);
    RuleData rbrak = new RuleData(rbrakMain, null, 11, false);
    initlbracMainAccepts();
    initlbracMainTransitions();
    CharRegexTable lbracMain = new CharRegexTable(1, lbracMainTransitions, lbracMainAccepts);
    RuleData lbrac = new RuleData(lbracMain, null, 12, false);
    initrbracMainAccepts();
    initrbracMainTransitions();
    CharRegexTable rbracMain = new CharRegexTable(1, rbracMainTransitions, rbracMainAccepts);
    RuleData rbrac = new RuleData(rbracMain, null, 13, false);
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 14, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(1, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 15, false);
    initpipeMainAccepts();
    initpipeMainTransitions();
    CharRegexTable pipeMain = new CharRegexTable(1, pipeMainTransitions, pipeMainAccepts);
    RuleData pipe = new RuleData(pipeMain, null, 16, false);
    initeolnMainAccepts();
    initeolnMainTransitions();
    CharRegexTable eolnMain = new CharRegexTable(2, eolnMainTransitions, eolnMainAccepts);
    RuleData eoln = new RuleData(eolnMain, null, 17, false);
    initcrMainAccepts();
    initcrMainTransitions();
    CharRegexTable crMain = new CharRegexTable(2, crMainTransitions, crMainAccepts);
    RuleData cr = new RuleData(crMain, null, 18, false);
    initformfeedMainAccepts();
    initformfeedMainTransitions();
    CharRegexTable formfeedMain = new CharRegexTable(2, formfeedMainTransitions, formfeedMainAccepts);
    RuleData formfeed = new RuleData(formfeedMain, null, 19, false);
    inittabMainAccepts();
    inittabMainTransitions();
    CharRegexTable tabMain = new CharRegexTable(2, tabMainTransitions, tabMainAccepts);
    RuleData tab = new RuleData(tabMain, null, 20, false);
    initbackspaceMainAccepts();
    initbackspaceMainTransitions();
    CharRegexTable backspaceMain = new CharRegexTable(2, backspaceMainTransitions, backspaceMainAccepts);
    RuleData backspace = new RuleData(backspaceMain, null, 21, false);
    initunicodeCharMainAccepts();
    initunicodeCharMainTransitions();
    CharRegexTable unicodeCharMain = new CharRegexTable(6, unicodeCharMainTransitions, unicodeCharMainAccepts);
    RuleData unicodeChar = new RuleData(unicodeCharMain, null, 22, false);
    initescapedCharMainAccepts();
    initescapedCharMainTransitions();
    CharRegexTable escapedCharMain = new CharRegexTable(2, escapedCharMainTransitions, escapedCharMainAccepts);
    RuleData escapedChar = new RuleData(escapedCharMain, null, 23, false);
    initstringEscapedCharMainAccepts();
    initstringEscapedCharMainTransitions();
    CharRegexTable stringEscapedCharMain = new CharRegexTable(2, stringEscapedCharMainTransitions, stringEscapedCharMainAccepts);
    RuleData stringEscapedChar = new RuleData(stringEscapedCharMain, null, 24, false);
    initintervalEscapedCharMainAccepts();
    initintervalEscapedCharMainTransitions();
    CharRegexTable intervalEscapedCharMain = new CharRegexTable(2, intervalEscapedCharMainTransitions, intervalEscapedCharMainAccepts);
    RuleData intervalEscapedChar = new RuleData(intervalEscapedCharMain, null, 25, false);
    initnormalCharMainAccepts();
    initnormalCharMainTransitions();
    CharRegexTable normalCharMain = new CharRegexTable(1, normalCharMainTransitions, normalCharMainAccepts);
    RuleData normalChar = new RuleData(normalCharMain, null, 26, false);
    initstringCharMainAccepts();
    initstringCharMainTransitions();
    CharRegexTable stringCharMain = new CharRegexTable(1, stringCharMainTransitions, stringCharMainAccepts);
    RuleData stringChar = new RuleData(stringCharMain, null, 27, false);
    initintervalCharMainAccepts();
    initintervalCharMainTransitions();
    CharRegexTable intervalCharMain = new CharRegexTable(1, intervalCharMainTransitions, intervalCharMainAccepts);
    RuleData intervalChar = new RuleData(intervalCharMain, null, 28, false);
    initintegerMainAccepts();
    initintegerMainTransitions();
    CharRegexTable integerMain = new CharRegexTable(1, integerMainTransitions, integerMainAccepts);
    RuleData integer = new RuleData(integerMain, null, 29, false);
    initmacroMainAccepts();
    initmacroMainTransitions();
    CharRegexTable macroMain = new CharRegexTable(1, macroMainTransitions, macroMainAccepts);
    RuleData macro = new RuleData(macroMain, null, 30, false);

    EnumMap<RuleEnum,RuleData> datas = new EnumMap<RuleEnum,RuleData>(RuleEnum.class);
    datas.put(RuleEnum.dot, dot);
    datas.put(RuleEnum.hat, hat);
    datas.put(RuleEnum.quote, quote);
    datas.put(RuleEnum.comma, comma);
    datas.put(RuleEnum.star, star);
    datas.put(RuleEnum.plus, plus);
    datas.put(RuleEnum.minus, minus);
    datas.put(RuleEnum.slash, slash);
    datas.put(RuleEnum.dollar, dollar);
    datas.put(RuleEnum.question, question);
    datas.put(RuleEnum.lbrak, lbrak);
    datas.put(RuleEnum.rbrak, rbrak);
    datas.put(RuleEnum.lbrac, lbrac);
    datas.put(RuleEnum.rbrac, rbrac);
    datas.put(RuleEnum.lpar, lpar);
    datas.put(RuleEnum.rpar, rpar);
    datas.put(RuleEnum.pipe, pipe);
    datas.put(RuleEnum.eoln, eoln);
    datas.put(RuleEnum.cr, cr);
    datas.put(RuleEnum.formfeed, formfeed);
    datas.put(RuleEnum.tab, tab);
    datas.put(RuleEnum.backspace, backspace);
    datas.put(RuleEnum.unicodeChar, unicodeChar);
    datas.put(RuleEnum.escapedChar, escapedChar);
    datas.put(RuleEnum.stringEscapedChar, stringEscapedChar);
    datas.put(RuleEnum.intervalEscapedChar, intervalEscapedChar);
    datas.put(RuleEnum.normalChar, normalChar);
    datas.put(RuleEnum.stringChar, stringChar);
    datas.put(RuleEnum.intervalChar, intervalChar);
    datas.put(RuleEnum.integer, integer);
    datas.put(RuleEnum.macro, macro);
    table = new LexerTable<RuleEnum>(datas);
  }

  
  private boolean[] dotMainAccepts;
  private void initdotMainAccepts() {
    dotMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] dotMainTransitions;
  private void initdotMainTransitions() {
    dotMainTransitions = new int[][] {{0,-1},{0,-1,46,0,47,-1}};
  }
  
  private boolean[] hatMainAccepts;
  private void inithatMainAccepts() {
    hatMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] hatMainTransitions;
  private void inithatMainTransitions() {
    hatMainTransitions = new int[][] {{0,-1},{0,-1,94,0,95,-1}};
  }
  
  private boolean[] quoteMainAccepts;
  private void initquoteMainAccepts() {
    quoteMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] quoteMainTransitions;
  private void initquoteMainTransitions() {
    quoteMainTransitions = new int[][] {{0,-1},{0,-1,34,0,35,-1}};
  }
  
  private boolean[] commaMainAccepts;
  private void initcommaMainAccepts() {
    commaMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] commaMainTransitions;
  private void initcommaMainTransitions() {
    commaMainTransitions = new int[][] {{0,-1},{0,-1,44,0,45,-1}};
  }
  
  private boolean[] starMainAccepts;
  private void initstarMainAccepts() {
    starMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] starMainTransitions;
  private void initstarMainTransitions() {
    starMainTransitions = new int[][] {{0,-1},{0,-1,42,0,43,-1}};
  }
  
  private boolean[] plusMainAccepts;
  private void initplusMainAccepts() {
    plusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] plusMainTransitions;
  private void initplusMainTransitions() {
    plusMainTransitions = new int[][] {{0,-1},{0,-1,43,0,44,-1}};
  }
  
  private boolean[] minusMainAccepts;
  private void initminusMainAccepts() {
    minusMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] minusMainTransitions;
  private void initminusMainTransitions() {
    minusMainTransitions = new int[][] {{0,-1},{0,-1,45,0,46,-1}};
  }
  
  private boolean[] slashMainAccepts;
  private void initslashMainAccepts() {
    slashMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] slashMainTransitions;
  private void initslashMainTransitions() {
    slashMainTransitions = new int[][] {{0,-1},{0,-1,47,0,48,-1}};
  }
  
  private boolean[] dollarMainAccepts;
  private void initdollarMainAccepts() {
    dollarMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] dollarMainTransitions;
  private void initdollarMainTransitions() {
    dollarMainTransitions = new int[][] {{0,-1},{0,-1,36,0,37,-1}};
  }
  
  private boolean[] questionMainAccepts;
  private void initquestionMainAccepts() {
    questionMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] questionMainTransitions;
  private void initquestionMainTransitions() {
    questionMainTransitions = new int[][] {{0,-1},{0,-1,63,0,64,-1}};
  }
  
  private boolean[] lbrakMainAccepts;
  private void initlbrakMainAccepts() {
    lbrakMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lbrakMainTransitions;
  private void initlbrakMainTransitions() {
    lbrakMainTransitions = new int[][] {{0,-1},{0,-1,91,0,92,-1}};
  }
  
  private boolean[] rbrakMainAccepts;
  private void initrbrakMainAccepts() {
    rbrakMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rbrakMainTransitions;
  private void initrbrakMainTransitions() {
    rbrakMainTransitions = new int[][] {{0,-1},{0,-1,93,0,94,-1}};
  }
  
  private boolean[] lbracMainAccepts;
  private void initlbracMainAccepts() {
    lbracMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lbracMainTransitions;
  private void initlbracMainTransitions() {
    lbracMainTransitions = new int[][] {{0,-1},{0,-1,123,0,124,-1}};
  }
  
  private boolean[] rbracMainAccepts;
  private void initrbracMainAccepts() {
    rbracMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rbracMainTransitions;
  private void initrbracMainTransitions() {
    rbracMainTransitions = new int[][] {{0,-1},{0,-1,125,0,126,-1}};
  }
  
  private boolean[] lparMainAccepts;
  private void initlparMainAccepts() {
    lparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lparMainTransitions;
  private void initlparMainTransitions() {
    lparMainTransitions = new int[][] {{0,-1},{0,-1,40,0,41,-1}};
  }
  
  private boolean[] rparMainAccepts;
  private void initrparMainAccepts() {
    rparMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rparMainTransitions;
  private void initrparMainTransitions() {
    rparMainTransitions = new int[][] {{0,-1},{0,-1,41,0,42,-1}};
  }
  
  private boolean[] pipeMainAccepts;
  private void initpipeMainAccepts() {
    pipeMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] pipeMainTransitions;
  private void initpipeMainTransitions() {
    pipeMainTransitions = new int[][] {{0,-1},{0,-1,124,0,125,-1}};
  }
  
  private boolean[] eolnMainAccepts;
  private void initeolnMainAccepts() {
    eolnMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] eolnMainTransitions;
  private void initeolnMainTransitions() {
    eolnMainTransitions = new int[][] {{0,-1},{0,-1,110,0,111,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] crMainAccepts;
  private void initcrMainAccepts() {
    crMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] crMainTransitions;
  private void initcrMainTransitions() {
    crMainTransitions = new int[][] {{0,-1},{0,-1,114,0,115,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] formfeedMainAccepts;
  private void initformfeedMainAccepts() {
    formfeedMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] formfeedMainTransitions;
  private void initformfeedMainTransitions() {
    formfeedMainTransitions = new int[][] {{0,-1},{0,-1,102,0,103,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] tabMainAccepts;
  private void inittabMainAccepts() {
    tabMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] tabMainTransitions;
  private void inittabMainTransitions() {
    tabMainTransitions = new int[][] {{0,-1},{0,-1,116,0,117,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] backspaceMainAccepts;
  private void initbackspaceMainAccepts() {
    backspaceMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] backspaceMainTransitions;
  private void initbackspaceMainTransitions() {
    backspaceMainTransitions = new int[][] {{0,-1},{0,-1,98,0,99,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] unicodeCharMainAccepts;
  private void initunicodeCharMainAccepts() {
    unicodeCharMainAccepts = new boolean[] {true,true,true,true,false,false,false};
  }
    
  private int[][] unicodeCharMainTransitions;
  private void initunicodeCharMainTransitions() {
    unicodeCharMainTransitions = new int[][] {{0,-1},{0,-1,48,3,58,-1,65,3,71,-1,97,3,103,-1},{0,-1,48,1,58,-1,65,1,71,-1,97,1,103,-1},{0,-1,48,0,58,-1,65,0,71,-1,97,0,103,-1},{0,-1,117,5,118,-1},{0,-1,48,2,58,-1,65,2,71,-1,97,2,103,-1},{0,-1,92,4,93,-1}};
  }
  
  private boolean[] escapedCharMainAccepts;
  private void initescapedCharMainAccepts() {
    escapedCharMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] escapedCharMainTransitions;
  private void initescapedCharMainTransitions() {
    escapedCharMainTransitions = new int[][] {{0,-1},{0,-1,34,0,35,-1,36,0,37,-1,40,0,45,-1,46,0,48,-1,63,0,64,-1,91,0,95,-1,123,0,126,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] stringEscapedCharMainAccepts;
  private void initstringEscapedCharMainAccepts() {
    stringEscapedCharMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] stringEscapedCharMainTransitions;
  private void initstringEscapedCharMainTransitions() {
    stringEscapedCharMainTransitions = new int[][] {{0,-1},{0,-1,34,0,35,-1,92,0,93,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] intervalEscapedCharMainAccepts;
  private void initintervalEscapedCharMainAccepts() {
    intervalEscapedCharMainAccepts = new boolean[] {true,false,false};
  }
    
  private int[][] intervalEscapedCharMainTransitions;
  private void initintervalEscapedCharMainTransitions() {
    intervalEscapedCharMainTransitions = new int[][] {{0,-1},{0,-1,45,0,46,-1,92,0,95,-1},{0,-1,92,1,93,-1}};
  }
  
  private boolean[] normalCharMainAccepts;
  private void initnormalCharMainAccepts() {
    normalCharMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] normalCharMainTransitions;
  private void initnormalCharMainTransitions() {
    normalCharMainTransitions = new int[][] {{0,-1},{0,0,36,-1,37,0,41,-1,44,0,47,-1,48,0,63,-1,64,0,92,-1,95,0,123,-1,126,0}};
  }
  
  private boolean[] stringCharMainAccepts;
  private void initstringCharMainAccepts() {
    stringCharMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] stringCharMainTransitions;
  private void initstringCharMainTransitions() {
    stringCharMainTransitions = new int[][] {{0,-1},{0,0,34,-1,35,0,92,-1,93,0}};
  }
  
  private boolean[] intervalCharMainAccepts;
  private void initintervalCharMainAccepts() {
    intervalCharMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] intervalCharMainTransitions;
  private void initintervalCharMainTransitions() {
    intervalCharMainTransitions = new int[][] {{0,-1},{0,0,45,-1,46,0,92,-1,95,0}};
  }
  
  private boolean[] integerMainAccepts;
  private void initintegerMainAccepts() {
    integerMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] integerMainTransitions;
  private void initintegerMainTransitions() {
    integerMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,49,0,58,-1}};
  }
  
  private boolean[] macroMainAccepts;
  private void initmacroMainAccepts() {
    macroMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] macroMainTransitions;
  private void initmacroMainTransitions() {
    macroMainTransitions = new int[][] {{0,-1},{0,-1,123,2,124,-1},{0,-1,65,3,91,-1,95,3,96,-1,97,3,123,-1},{0,-1,48,3,58,-1,65,3,91,-1,95,3,96,-1,97,3,123,-1,125,0,126,-1}};
  }
  
  private final LexerTable<RuleEnum> table;
}

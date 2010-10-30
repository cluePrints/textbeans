package fr.umlv.tatoo.cc.lexer.ebnf.lexer;

import fr.umlv.tatoo.cc.lexer.ebnf.lexer.RuleEnum;
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
    initspaceMainAccepts();
    initspaceMainTransitions();
    CharRegexTable spaceMain = new CharRegexTable(1, spaceMainTransitions, spaceMainAccepts);
    RuleData space = new RuleData(spaceMain, null, 0, false);
    initdirectivesdeclMainAccepts();
    initdirectivesdeclMainTransitions();
    CharRegexTable directivesdeclMain = new CharRegexTable(9, directivesdeclMainTransitions, directivesdeclMainAccepts);
    RuleData directivesdecl = new RuleData(directivesdeclMain, null, 1, false);
    initimportsdeclMainAccepts();
    initimportsdeclMainTransitions();
    CharRegexTable importsdeclMain = new CharRegexTable(3, importsdeclMainTransitions, importsdeclMainAccepts);
    RuleData importsdecl = new RuleData(importsdeclMain, null, 2, false);
    initprioritiesdeclMainAccepts();
    initprioritiesdeclMainTransitions();
    CharRegexTable prioritiesdeclMain = new CharRegexTable(10, prioritiesdeclMainTransitions, prioritiesdeclMainAccepts);
    RuleData prioritiesdecl = new RuleData(prioritiesdeclMain, null, 3, false);
    inittokensdeclMainAccepts();
    inittokensdeclMainTransitions();
    CharRegexTable tokensdeclMain = new CharRegexTable(6, tokensdeclMainTransitions, tokensdeclMainAccepts);
    RuleData tokensdecl = new RuleData(tokensdeclMain, null, 4, false);
    initblanksdeclMainAccepts();
    initblanksdeclMainTransitions();
    CharRegexTable blanksdeclMain = new CharRegexTable(3, blanksdeclMainTransitions, blanksdeclMainAccepts);
    RuleData blanksdecl = new RuleData(blanksdeclMain, null, 5, false);
    initcommentsdeclMainAccepts();
    initcommentsdeclMainTransitions();
    CharRegexTable commentsdeclMain = new CharRegexTable(6, commentsdeclMainTransitions, commentsdeclMainAccepts);
    RuleData commentsdecl = new RuleData(commentsdeclMain, null, 6, false);
    initbranchesdeclMainAccepts();
    initbranchesdeclMainTransitions();
    CharRegexTable branchesdeclMain = new CharRegexTable(3, branchesdeclMainTransitions, branchesdeclMainAccepts);
    RuleData branchesdecl = new RuleData(branchesdeclMain, null, 7, false);
    initerrordeclMainAccepts();
    initerrordeclMainTransitions();
    CharRegexTable errordeclMain = new CharRegexTable(3, errordeclMainTransitions, errordeclMainAccepts);
    RuleData errordecl = new RuleData(errordeclMain, null, 8, false);
    inittypesdeclMainAccepts();
    inittypesdeclMainTransitions();
    CharRegexTable typesdeclMain = new CharRegexTable(4, typesdeclMainTransitions, typesdeclMainAccepts);
    RuleData typesdecl = new RuleData(typesdeclMain, null, 9, false);
    initattributesdeclMainAccepts();
    initattributesdeclMainTransitions();
    CharRegexTable attributesdeclMain = new CharRegexTable(5, attributesdeclMainTransitions, attributesdeclMainAccepts);
    RuleData attributesdecl = new RuleData(attributesdeclMain, null, 10, false);
    initstartsdeclMainAccepts();
    initstartsdeclMainTransitions();
    CharRegexTable startsdeclMain = new CharRegexTable(2, startsdeclMainTransitions, startsdeclMainAccepts);
    RuleData startsdecl = new RuleData(startsdeclMain, null, 11, false);
    initversionsdeclMainAccepts();
    initversionsdeclMainTransitions();
    CharRegexTable versionsdeclMain = new CharRegexTable(7, versionsdeclMainTransitions, versionsdeclMainAccepts);
    RuleData versionsdecl = new RuleData(versionsdeclMain, null, 12, false);
    initproductionsdeclMainAccepts();
    initproductionsdeclMainTransitions();
    CharRegexTable productionsdeclMain = new CharRegexTable(11, productionsdeclMainTransitions, productionsdeclMainAccepts);
    RuleData productionsdecl = new RuleData(productionsdeclMain, null, 13, false);
    initeofMainAccepts();
    initeofMainTransitions();
    CharRegexTable eofMain = new CharRegexTable(3, eofMainTransitions, eofMainAccepts);
    RuleData eof = new RuleData(eofMain, null, 14, false);
    initlbracketMainAccepts();
    initlbracketMainTransitions();
    CharRegexTable lbracketMain = new CharRegexTable(1, lbracketMainTransitions, lbracketMainAccepts);
    RuleData lbracket = new RuleData(lbracketMain, null, 15, false);
    initrbracketMainAccepts();
    initrbracketMainTransitions();
    CharRegexTable rbracketMain = new CharRegexTable(1, rbracketMainTransitions, rbracketMainAccepts);
    RuleData rbracket = new RuleData(rbracketMain, null, 16, false);
    initlsqbracketMainAccepts();
    initlsqbracketMainTransitions();
    CharRegexTable lsqbracketMain = new CharRegexTable(1, lsqbracketMainTransitions, lsqbracketMainAccepts);
    RuleData lsqbracket = new RuleData(lsqbracketMain, null, 17, false);
    initrsqbracketMainAccepts();
    initrsqbracketMainTransitions();
    CharRegexTable rsqbracketMain = new CharRegexTable(1, rsqbracketMainTransitions, rsqbracketMainAccepts);
    RuleData rsqbracket = new RuleData(rsqbracketMain, null, 18, false);
    initlparMainAccepts();
    initlparMainTransitions();
    CharRegexTable lparMain = new CharRegexTable(1, lparMainTransitions, lparMainAccepts);
    RuleData lpar = new RuleData(lparMain, null, 19, false);
    initrparMainAccepts();
    initrparMainTransitions();
    CharRegexTable rparMain = new CharRegexTable(1, rparMainTransitions, rparMainAccepts);
    RuleData rpar = new RuleData(rparMain, null, 20, false);
    initassignMainAccepts();
    initassignMainTransitions();
    CharRegexTable assignMain = new CharRegexTable(1, assignMainTransitions, assignMainAccepts);
    RuleData assign = new RuleData(assignMain, null, 21, false);
    initpipeMainAccepts();
    initpipeMainTransitions();
    CharRegexTable pipeMain = new CharRegexTable(1, pipeMainTransitions, pipeMainAccepts);
    RuleData pipe = new RuleData(pipeMain, null, 22, false);
    initdollarMainAccepts();
    initdollarMainTransitions();
    CharRegexTable dollarMain = new CharRegexTable(1, dollarMainTransitions, dollarMainAccepts);
    RuleData dollar = new RuleData(dollarMain, null, 23, false);
    initstarMainAccepts();
    initstarMainTransitions();
    CharRegexTable starMain = new CharRegexTable(1, starMainTransitions, starMainAccepts);
    RuleData star = new RuleData(starMain, null, 24, false);
    initplusMainAccepts();
    initplusMainTransitions();
    CharRegexTable plusMain = new CharRegexTable(1, plusMainTransitions, plusMainAccepts);
    RuleData plus = new RuleData(plusMain, null, 25, false);
    initslashMainAccepts();
    initslashMainTransitions();
    CharRegexTable slashMain = new CharRegexTable(1, slashMainTransitions, slashMainAccepts);
    RuleData slash = new RuleData(slashMain, null, 26, false);
    initqmarkMainAccepts();
    initqmarkMainTransitions();
    CharRegexTable qmarkMain = new CharRegexTable(1, qmarkMainTransitions, qmarkMainAccepts);
    RuleData qmark = new RuleData(qmarkMain, null, 27, false);
    initquoteMainAccepts();
    initquoteMainTransitions();
    CharRegexTable quoteMain = new CharRegexTable(1, quoteMainTransitions, quoteMainAccepts);
    RuleData quote = new RuleData(quoteMain, null, 28, false);
    initdoublequoteMainAccepts();
    initdoublequoteMainTransitions();
    CharRegexTable doublequoteMain = new CharRegexTable(1, doublequoteMainTransitions, doublequoteMainAccepts);
    RuleData doublequote = new RuleData(doublequoteMain, null, 29, false);
    initsemicolonMainAccepts();
    initsemicolonMainTransitions();
    CharRegexTable semicolonMain = new CharRegexTable(1, semicolonMainTransitions, semicolonMainAccepts);
    RuleData semicolon = new RuleData(semicolonMain, null, 30, false);
    initcolonMainAccepts();
    initcolonMainTransitions();
    CharRegexTable colonMain = new CharRegexTable(1, colonMainTransitions, colonMainAccepts);
    RuleData colon = new RuleData(colonMain, null, 31, false);
    initquoted_nameMainAccepts();
    initquoted_nameMainTransitions();
    CharRegexTable quoted_nameMain = new CharRegexTable(4, quoted_nameMainTransitions, quoted_nameMainAccepts);
    RuleData quoted_name = new RuleData(quoted_nameMain, null, 32, false);
    initassocMainAccepts();
    initassocMainTransitions();
    CharRegexTable assocMain = new CharRegexTable(13, assocMainTransitions, assocMainAccepts);
    RuleData assoc = new RuleData(assocMain, null, 33, false);
    initcommentMainAccepts();
    initcommentMainTransitions();
    CharRegexTable commentMain = new CharRegexTable(2, commentMainTransitions, commentMainAccepts);
    RuleData comment = new RuleData(commentMain, null, 34, false);
    initnumberMainAccepts();
    initnumberMainTransitions();
    CharRegexTable numberMain = new CharRegexTable(4, numberMainTransitions, numberMainAccepts);
    RuleData number = new RuleData(numberMain, null, 35, false);
    initidMainAccepts();
    initidMainTransitions();
    CharRegexTable idMain = new CharRegexTable(1, idMainTransitions, idMainAccepts);
    RuleData id = new RuleData(idMain, null, 36, false);
    initqualifiedidMainAccepts();
    initqualifiedidMainTransitions();
    CharRegexTable qualifiedidMain = new CharRegexTable(20, qualifiedidMainTransitions, qualifiedidMainAccepts);
    RuleData qualifiedid = new RuleData(qualifiedidMain, null, 37, false);
    initregexquoteMainAccepts();
    initregexquoteMainTransitions();
    CharRegexTable regexquoteMain = new CharRegexTable(1, regexquoteMainTransitions, regexquoteMainAccepts);
    RuleData regexquote = new RuleData(regexquoteMain, null, 38, false);
    initregexdoublequoteMainAccepts();
    initregexdoublequoteMainTransitions();
    CharRegexTable regexdoublequoteMain = new CharRegexTable(1, regexdoublequoteMainTransitions, regexdoublequoteMainAccepts);
    RuleData regexdoublequote = new RuleData(regexdoublequoteMain, null, 39, false);

    EnumMap<RuleEnum,RuleData> datas = new EnumMap<RuleEnum,RuleData>(RuleEnum.class);
    datas.put(RuleEnum.space, space);
    datas.put(RuleEnum.directivesdecl, directivesdecl);
    datas.put(RuleEnum.importsdecl, importsdecl);
    datas.put(RuleEnum.prioritiesdecl, prioritiesdecl);
    datas.put(RuleEnum.tokensdecl, tokensdecl);
    datas.put(RuleEnum.blanksdecl, blanksdecl);
    datas.put(RuleEnum.commentsdecl, commentsdecl);
    datas.put(RuleEnum.branchesdecl, branchesdecl);
    datas.put(RuleEnum.errordecl, errordecl);
    datas.put(RuleEnum.typesdecl, typesdecl);
    datas.put(RuleEnum.attributesdecl, attributesdecl);
    datas.put(RuleEnum.startsdecl, startsdecl);
    datas.put(RuleEnum.versionsdecl, versionsdecl);
    datas.put(RuleEnum.productionsdecl, productionsdecl);
    datas.put(RuleEnum.eof, eof);
    datas.put(RuleEnum.lbracket, lbracket);
    datas.put(RuleEnum.rbracket, rbracket);
    datas.put(RuleEnum.lsqbracket, lsqbracket);
    datas.put(RuleEnum.rsqbracket, rsqbracket);
    datas.put(RuleEnum.lpar, lpar);
    datas.put(RuleEnum.rpar, rpar);
    datas.put(RuleEnum.assign, assign);
    datas.put(RuleEnum.pipe, pipe);
    datas.put(RuleEnum.dollar, dollar);
    datas.put(RuleEnum.star, star);
    datas.put(RuleEnum.plus, plus);
    datas.put(RuleEnum.slash, slash);
    datas.put(RuleEnum.qmark, qmark);
    datas.put(RuleEnum.quote, quote);
    datas.put(RuleEnum.doublequote, doublequote);
    datas.put(RuleEnum.semicolon, semicolon);
    datas.put(RuleEnum.colon, colon);
    datas.put(RuleEnum.quoted_name, quoted_name);
    datas.put(RuleEnum.assoc, assoc);
    datas.put(RuleEnum.comment, comment);
    datas.put(RuleEnum.number, number);
    datas.put(RuleEnum.id, id);
    datas.put(RuleEnum.qualifiedid, qualifiedid);
    datas.put(RuleEnum.regexquote, regexquote);
    datas.put(RuleEnum.regexdoublequote, regexdoublequote);
    table = new LexerTable<RuleEnum>(datas);
  }

  
  private boolean[] spaceMainAccepts;
  private void initspaceMainAccepts() {
    spaceMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] spaceMainTransitions;
  private void initspaceMainTransitions() {
    spaceMainTransitions = new int[][] {{0,-1,9,0,11,-1,13,0,14,-1,32,0,33,-1},{0,-1,9,0,11,-1,13,0,14,-1,32,0,33,-1}};
  }
  
  private boolean[] directivesdeclMainAccepts;
  private void initdirectivesdeclMainAccepts() {
    directivesdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false,false,false};
  }
    
  private int[][] directivesdeclMainTransitions;
  private void initdirectivesdeclMainTransitions() {
    directivesdeclMainTransitions = new int[][] {{0,-1},{0,-1,115,0,116,-1},{0,-1,105,6,106,-1},{0,-1,105,5,106,-1},{0,-1,99,10,100,-1},{0,-1,118,8,119,-1},{0,-1,114,7,115,-1},{0,-1,101,4,102,-1},{0,-1,101,1,102,-1},{0,-1,100,2,101,-1},{0,-1,116,3,117,-1}};
  }
  
  private boolean[] importsdeclMainAccepts;
  private void initimportsdeclMainAccepts() {
    importsdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false};
  }
    
  private int[][] importsdeclMainTransitions;
  private void initimportsdeclMainTransitions() {
    importsdeclMainTransitions = new int[][] {{0,-1},{0,-1,115,0,116,-1},{0,-1,109,7,110,-1},{0,-1,105,2,106,-1},{0,-1,111,5,112,-1},{0,-1,114,6,115,-1},{0,-1,116,1,117,-1},{0,-1,112,4,113,-1}};
  }
  
  private boolean[] prioritiesdeclMainAccepts;
  private void initprioritiesdeclMainAccepts() {
    prioritiesdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false,false,false};
  }
    
  private int[][] prioritiesdeclMainTransitions;
  private void initprioritiesdeclMainTransitions() {
    prioritiesdeclMainTransitions = new int[][] {{0,-1},{0,-1,115,0,116,-1},{0,-1,111,8,112,-1},{0,-1,105,2,106,-1},{0,-1,105,9,106,-1},{0,-1,105,6,106,-1},{0,-1,101,1,102,-1},{0,-1,114,3,115,-1},{0,-1,114,4,115,-1},{0,-1,116,5,117,-1},{0,-1,112,7,113,-1}};
  }
  
  private boolean[] tokensdeclMainAccepts;
  private void inittokensdeclMainAccepts() {
    tokensdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] tokensdeclMainTransitions;
  private void inittokensdeclMainTransitions() {
    tokensdeclMainTransitions = new int[][] {{0,-1},{0,-1,115,0,116,-1},{0,-1,110,1,111,-1},{0,-1,107,5,108,-1},{0,-1,111,3,112,-1},{0,-1,101,2,102,-1},{0,-1,116,4,117,-1}};
  }
  
  private boolean[] blanksdeclMainAccepts;
  private void initblanksdeclMainAccepts() {
    blanksdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] blanksdeclMainTransitions;
  private void initblanksdeclMainTransitions() {
    blanksdeclMainTransitions = new int[][] {{0,-1},{0,-1,110,4,111,-1},{0,-1,115,0,116,-1},{0,-1,98,6,99,-1},{0,-1,107,2,108,-1},{0,-1,97,1,98,-1},{0,-1,108,5,109,-1}};
  }
  
  private boolean[] commentsdeclMainAccepts;
  private void initcommentsdeclMainAccepts() {
    commentsdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false};
  }
    
  private int[][] commentsdeclMainTransitions;
  private void initcommentsdeclMainTransitions() {
    commentsdeclMainTransitions = new int[][] {{0,-1},{0,-1,115,0,116,-1},{0,-1,110,8,111,-1},{0,-1,109,4,110,-1},{0,-1,109,7,110,-1},{0,-1,111,3,112,-1},{0,-1,99,5,100,-1},{0,-1,101,2,102,-1},{0,-1,116,1,117,-1}};
  }
  
  private boolean[] branchesdeclMainAccepts;
  private void initbranchesdeclMainAccepts() {
    branchesdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false};
  }
    
  private int[][] branchesdeclMainTransitions;
  private void initbranchesdeclMainTransitions() {
    branchesdeclMainTransitions = new int[][] {{0,-1},{0,-1,110,7,111,-1},{0,-1,115,0,116,-1},{0,-1,98,6,99,-1},{0,-1,101,2,102,-1},{0,-1,97,1,98,-1},{0,-1,114,5,115,-1},{0,-1,99,8,100,-1},{0,-1,104,4,105,-1}};
  }
  
  private boolean[] errordeclMainAccepts;
  private void initerrordeclMainAccepts() {
    errordeclMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] errordeclMainTransitions;
  private void initerrordeclMainTransitions() {
    errordeclMainTransitions = new int[][] {{0,-1},{0,-1,114,0,115,-1},{0,-1,111,1,112,-1},{0,-1,101,5,102,-1},{0,-1,114,2,115,-1},{0,-1,114,4,115,-1}};
  }
  
  private boolean[] typesdeclMainAccepts;
  private void inittypesdeclMainAccepts() {
    typesdeclMainAccepts = new boolean[] {true,false,false,false,false,false};
  }
    
  private int[][] typesdeclMainTransitions;
  private void inittypesdeclMainTransitions() {
    typesdeclMainTransitions = new int[][] {{0,-1},{0,-1,121,5,122,-1},{0,-1,115,0,116,-1},{0,-1,101,2,102,-1},{0,-1,116,1,117,-1},{0,-1,112,3,113,-1}};
  }
  
  private boolean[] attributesdeclMainAccepts;
  private void initattributesdeclMainAccepts() {
    attributesdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false,false,false};
  }
    
  private int[][] attributesdeclMainTransitions;
  private void initattributesdeclMainTransitions() {
    attributesdeclMainTransitions = new int[][] {{0,-1},{0,-1,115,0,116,-1},{0,-1,117,9,118,-1},{0,-1,98,2,99,-1},{0,-1,105,3,106,-1},{0,-1,97,10,98,-1},{0,-1,114,4,115,-1},{0,-1,101,1,102,-1},{0,-1,116,6,117,-1},{0,-1,116,7,117,-1},{0,-1,116,8,117,-1}};
  }
  
  private boolean[] startsdeclMainAccepts;
  private void initstartsdeclMainAccepts() {
    startsdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false};
  }
    
  private int[][] startsdeclMainTransitions;
  private void initstartsdeclMainTransitions() {
    startsdeclMainTransitions = new int[][] {{0,-1},{0,-1,115,0,116,-1},{0,-1,115,5,116,-1},{0,-1,97,4,98,-1},{0,-1,114,6,115,-1},{0,-1,116,3,117,-1},{0,-1,116,1,117,-1}};
  }
  
  private boolean[] versionsdeclMainAccepts;
  private void initversionsdeclMainAccepts() {
    versionsdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false};
  }
    
  private int[][] versionsdeclMainTransitions;
  private void initversionsdeclMainTransitions() {
    versionsdeclMainTransitions = new int[][] {{0,-1},{0,-1,110,2,111,-1},{0,-1,115,0,116,-1},{0,-1,115,5,116,-1},{0,-1,111,1,112,-1},{0,-1,105,4,106,-1},{0,-1,101,8,102,-1},{0,-1,118,6,119,-1},{0,-1,114,3,115,-1}};
  }
  
  private boolean[] productionsdeclMainAccepts;
  private void initproductionsdeclMainAccepts() {
    productionsdeclMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false,false,false,false};
  }
    
  private int[][] productionsdeclMainTransitions;
  private void initproductionsdeclMainTransitions() {
    productionsdeclMainTransitions = new int[][] {{0,-1},{0,-1,110,2,111,-1},{0,-1,115,0,116,-1},{0,-1,117,8,118,-1},{0,-1,111,1,112,-1},{0,-1,111,9,112,-1},{0,-1,105,4,106,-1},{0,-1,114,5,115,-1},{0,-1,99,10,100,-1},{0,-1,100,3,101,-1},{0,-1,116,6,117,-1},{0,-1,112,7,113,-1}};
  }
  
  private boolean[] eofMainAccepts;
  private void initeofMainAccepts() {
    eofMainAccepts = new boolean[] {true,false,false,false};
  }
    
  private int[][] eofMainTransitions;
  private void initeofMainTransitions() {
    eofMainTransitions = new int[][] {{0,-1},{0,-1,102,0,103,-1},{0,-1,111,1,112,-1},{0,-1,101,2,102,-1}};
  }
  
  private boolean[] lbracketMainAccepts;
  private void initlbracketMainAccepts() {
    lbracketMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lbracketMainTransitions;
  private void initlbracketMainTransitions() {
    lbracketMainTransitions = new int[][] {{0,-1},{0,-1,123,0,124,-1}};
  }
  
  private boolean[] rbracketMainAccepts;
  private void initrbracketMainAccepts() {
    rbracketMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rbracketMainTransitions;
  private void initrbracketMainTransitions() {
    rbracketMainTransitions = new int[][] {{0,-1},{0,-1,125,0,126,-1}};
  }
  
  private boolean[] lsqbracketMainAccepts;
  private void initlsqbracketMainAccepts() {
    lsqbracketMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] lsqbracketMainTransitions;
  private void initlsqbracketMainTransitions() {
    lsqbracketMainTransitions = new int[][] {{0,-1},{0,-1,91,0,92,-1}};
  }
  
  private boolean[] rsqbracketMainAccepts;
  private void initrsqbracketMainAccepts() {
    rsqbracketMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] rsqbracketMainTransitions;
  private void initrsqbracketMainTransitions() {
    rsqbracketMainTransitions = new int[][] {{0,-1},{0,-1,93,0,94,-1}};
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
  
  private boolean[] assignMainAccepts;
  private void initassignMainAccepts() {
    assignMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] assignMainTransitions;
  private void initassignMainTransitions() {
    assignMainTransitions = new int[][] {{0,-1},{0,-1,61,0,62,-1}};
  }
  
  private boolean[] pipeMainAccepts;
  private void initpipeMainAccepts() {
    pipeMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] pipeMainTransitions;
  private void initpipeMainTransitions() {
    pipeMainTransitions = new int[][] {{0,-1},{0,-1,124,0,125,-1}};
  }
  
  private boolean[] dollarMainAccepts;
  private void initdollarMainAccepts() {
    dollarMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] dollarMainTransitions;
  private void initdollarMainTransitions() {
    dollarMainTransitions = new int[][] {{0,-1},{0,-1,36,0,37,-1}};
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
  
  private boolean[] slashMainAccepts;
  private void initslashMainAccepts() {
    slashMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] slashMainTransitions;
  private void initslashMainTransitions() {
    slashMainTransitions = new int[][] {{0,-1},{0,-1,47,0,48,-1}};
  }
  
  private boolean[] qmarkMainAccepts;
  private void initqmarkMainAccepts() {
    qmarkMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] qmarkMainTransitions;
  private void initqmarkMainTransitions() {
    qmarkMainTransitions = new int[][] {{0,-1},{0,-1,63,0,64,-1}};
  }
  
  private boolean[] quoteMainAccepts;
  private void initquoteMainAccepts() {
    quoteMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] quoteMainTransitions;
  private void initquoteMainTransitions() {
    quoteMainTransitions = new int[][] {{0,-1},{0,-1,39,0,40,-1}};
  }
  
  private boolean[] doublequoteMainAccepts;
  private void initdoublequoteMainAccepts() {
    doublequoteMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] doublequoteMainTransitions;
  private void initdoublequoteMainTransitions() {
    doublequoteMainTransitions = new int[][] {{0,-1},{0,-1,34,0,35,-1}};
  }
  
  private boolean[] semicolonMainAccepts;
  private void initsemicolonMainAccepts() {
    semicolonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] semicolonMainTransitions;
  private void initsemicolonMainTransitions() {
    semicolonMainTransitions = new int[][] {{0,-1},{0,-1,59,0,60,-1}};
  }
  
  private boolean[] colonMainAccepts;
  private void initcolonMainAccepts() {
    colonMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] colonMainTransitions;
  private void initcolonMainTransitions() {
    colonMainTransitions = new int[][] {{0,-1},{0,-1,58,0,59,-1}};
  }
  
  private boolean[] quoted_nameMainAccepts;
  private void initquoted_nameMainAccepts() {
    quoted_nameMainAccepts = new boolean[] {true,true,false,false,false};
  }
    
  private int[][] quoted_nameMainTransitions;
  private void initquoted_nameMainTransitions() {
    quoted_nameMainTransitions = new int[][] {{0,-1,34,3,35,-1},{0,-1,39,2,40,-1},{0,2,39,1,40,2},{0,3,34,0,35,3},{0,-1,34,3,35,-1,39,2,40,-1}};
  }
  
  private boolean[] assocMainAccepts;
  private void initassocMainAccepts() {
    assocMainAccepts = new boolean[] {true,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
  }
    
  private int[][] assocMainTransitions;
  private void initassocMainTransitions() {
    assocMainTransitions = new int[][] {{0,-1},{0,-1,110,11,111,-1},{0,-1,102,12,103,-1},{0,-1,115,4,116,-1},{0,-1,115,8,116,-1},{0,-1,105,10,106,-1},{0,-1,99,0,100,-1},{0,-1,111,1,112,-1},{0,-1,111,6,112,-1},{0,-1,101,2,102,-1},{0,-1,103,14,104,-1},{0,-1,97,3,98,-1,101,0,102,-1},{0,-1,116,0,117,-1},{0,-1,108,9,109,-1,110,7,111,-1,114,5,115,-1},{0,-1,104,12,105,-1}};
  }
  
  private boolean[] commentMainAccepts;
  private void initcommentMainAccepts() {
    commentMainAccepts = new boolean[] {true,false,false,false,false};
  }
    
  private int[][] commentMainTransitions;
  private void initcommentMainTransitions() {
    commentMainTransitions = new int[][] {{0,-1},{0,-1,10,0,11,-1},{0,-1,47,3,48,-1},{0,-1,47,4,48,-1},{0,4,10,0,11,4,13,1,14,4}};
  }
  
  private boolean[] numberMainAccepts;
  private void initnumberMainAccepts() {
    numberMainAccepts = new boolean[] {true,true,false,false,false};
  }
    
  private int[][] numberMainTransitions;
  private void initnumberMainTransitions() {
    numberMainTransitions = new int[][] {{0,-1,48,0,58,-1},{0,-1,46,2,47,-1,48,1,58,-1},{0,-1,48,0,58,-1},{0,-1,48,1,58,-1},{0,-1,45,3,46,-1,48,1,58,-1}};
  }
  
  private boolean[] idMainAccepts;
  private void initidMainAccepts() {
    idMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] idMainTransitions;
  private void initidMainTransitions() {
    idMainTransitions = new int[][] {{0,-1,48,0,58,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1},{0,-1,65,0,91,-1,95,0,96,-1,97,0,123,-1}};
  }
  
  private boolean[] qualifiedidMainAccepts;
  private void initqualifiedidMainAccepts() {
    qualifiedidMainAccepts = new boolean[] {true,true,true,true,true,true,true,true,true,true,true,true,true,false,false,false,false,false,false,false,false,false,false,false,false,false};
  }
    
  private int[][] qualifiedidMainTransitions;
  private void initqualifiedidMainTransitions() {
    qualifiedidMainTransitions = new int[][] {{0,-1,32,1,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,123,-1},{0,-1,32,1,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,101,4,102,5,115,2,116,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,117,7,118,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,101,8,102,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,120,6,121,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,116,3,117,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,112,9,113,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,110,10,111,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,101,11,102,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,100,12,101,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,114,0,115,5,123,-1},{0,-1,32,22,33,-1,46,5,47,-1,48,5,58,-1,60,5,61,-1,62,5,64,-1,65,5,92,-1,93,5,94,-1,95,5,96,-1,97,5,115,0,116,5,123,-1},{0,-1,110,18,111,-1},{0,-1,117,25,118,-1},{0,-1,115,23,116,-1},{0,-1,101,13,102,-1},{0,-1,114,23,115,-1},{0,-1,100,15,101,-1},{0,-1,101,17,102,-1},{0,-1,65,5,91,-1,95,5,96,-1,97,5,123,-1},{0,-1,116,16,117,-1},{0,-1,32,22,33,-1,101,24,102,-1,115,14,116,-1},{0,-1,32,0,33,-1},{0,-1,120,21,121,-1},{0,-1,112,19,113,-1}};
  }
  
  private boolean[] regexquoteMainAccepts;
  private void initregexquoteMainAccepts() {
    regexquoteMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] regexquoteMainTransitions;
  private void initregexquoteMainTransitions() {
    regexquoteMainTransitions = new int[][] {{0,0,39,-1,40,0},{0,0,39,-1,40,0}};
  }
  
  private boolean[] regexdoublequoteMainAccepts;
  private void initregexdoublequoteMainAccepts() {
    regexdoublequoteMainAccepts = new boolean[] {true,false};
  }
    
  private int[][] regexdoublequoteMainTransitions;
  private void initregexdoublequoteMainTransitions() {
    regexdoublequoteMainTransitions = new int[][] {{0,0,34,-1,35,0},{0,0,34,-1,35,0}};
  }
  
  private final LexerTable<RuleEnum> table;
}

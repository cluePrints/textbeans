package fr.umlv.tatoo.cc.lexer.regex.pattern.parser;

import fr.umlv.tatoo.cc.lexer.regex.pattern.parser.NonTerminalEnum;
import fr.umlv.tatoo.cc.lexer.regex.pattern.parser.ProductionEnum;
import fr.umlv.tatoo.cc.lexer.regex.pattern.parser.TerminalEnum;
import fr.umlv.tatoo.runtime.parser.AcceptAction;
import fr.umlv.tatoo.runtime.parser.Action;
import fr.umlv.tatoo.runtime.parser.BranchAction;
import fr.umlv.tatoo.runtime.parser.ErrorAction;
import fr.umlv.tatoo.runtime.parser.ExitAction;
import fr.umlv.tatoo.runtime.parser.ParserTable;
import fr.umlv.tatoo.runtime.parser.ReduceAction;
import fr.umlv.tatoo.runtime.parser.ShiftAction;
import fr.umlv.tatoo.runtime.parser.StateMetadata;
import java.util.EnumMap;

/** 
 *  This class is generated - please do not edit it 
 */
public class ParserDataTable {
  private ParserDataTable() {
   accept = AcceptAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
   exit = ExitAction.<TerminalEnum,ProductionEnum,VersionEnum>getInstance();
    initmainGotoes();
    initstringGotoes();
    initregexGotoes();
    initfollowGotoes();
    initpatternGotoes();
    initintervalsGotoes();
    initspecialOrNormalLetterGotoes();
    initmacroGotoes();
    inithatOptGotoes();
    initspecialOrIntervalLetterGotoes();
    initintervalGotoes();
    initspecialOrStringLetterGotoes();
    reducehatEmpty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.hatEmpty,0,hatOptGotoes);
    reduceintervalSingleton = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.intervalSingleton,1,intervalGotoes);
    reducenormalSpecialLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.normalSpecialLetter,1,specialOrNormalLetterGotoes);
    reduceregexPar = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexPar,3,regexGotoes);
    reducefollowRegex = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.followRegex,2,followGotoes);
    reduceregexStar = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexStar,2,regexGotoes);
    reducespecialOrStringLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.specialOrStringLetter,1,stringGotoes);
    reducehatPresent = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.hatPresent,1,hatOptGotoes);
    reduceregexOptional = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexOptional,2,regexGotoes);
    reduceregexRange = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexRange,6,regexGotoes);
    reduceinterval = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.interval,1,intervalsGotoes);
    reduceregexAtLeast = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexAtLeast,5,regexGotoes);
    reduceregexPlus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexPlus,2,regexGotoes);
    reduceregexTimes = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexTimes,4,regexGotoes);
    reduceregexCat = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexCat,2,regexGotoes);
    reducefollowDollar = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.followDollar,1,followGotoes);
    reduceinitial = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.initial,3,patternGotoes);
    reducestringSpecialLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.stringSpecialLetter,1,specialOrStringLetterGotoes);
    reduceregexString = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexString,3,regexGotoes);
    reduceregexIntervalNegate = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexIntervalNegate,4,regexGotoes);
    reducestringLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.stringLetter,1,specialOrStringLetterGotoes);
    reducemacro = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.macro,1,macroGotoes);
    reduceintervalSpecialLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.intervalSpecialLetter,1,specialOrIntervalLetterGotoes);
    reduceregexLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexLetter,1,regexGotoes);
    reduceregexMacro = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexMacro,1,regexGotoes);
    reduceintervals = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.intervals,2,intervalsGotoes);
    reduceregexInterval = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexInterval,3,regexGotoes);
    reducemainRegex = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.mainRegex,1,mainGotoes);
    reducefollowEmpty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.followEmpty,0,followGotoes);
    reduceintervalLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.intervalLetter,1,specialOrIntervalLetterGotoes);
    reduceintervalSet = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.intervalSet,3,intervalGotoes);
    reducenormalLetter = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.normalLetter,1,specialOrNormalLetterGotoes);
    reducestring = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.string,2,stringGotoes);
    reduceregexAny = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexAny,1,regexGotoes);
    reduceregexOr = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regexOr,3,regexGotoes);
    shift1 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(1);
    shift6 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(6);
    shift24 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(24);
    shift53 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(53);
    shift51 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(51);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift32 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(32);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift22 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(22);
    shift41 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(41);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift36 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(36);
    shift15 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(15);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift25 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(25);
    shift3 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(3);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift34 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(34);
    shift35 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(35);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initintegerArray();
    initpipeArray();
    initstarArray();
    initlparArray();
    initcommaArray();
    initquoteArray();
    initrbrakArray();
    initspecialLetterArray();
    initplusArray();
    initrbracArray();
    initintervalLetterArray();
    initslashArray();
    initdollarArray();
    initstringLetterArray();
    initlbrakArray();
    inithatArray();
    initnameArray();
    initquestionArray();
    initnormalLetterArray();
    initminusArray();
    initrparArray();
    init__eof__Array();
    initdotArray();
    initlbracArray();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.integer,integerArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.comma,commaArray);
    tableMap.put(TerminalEnum.quote,quoteArray);
    tableMap.put(TerminalEnum.rbrak,rbrakArray);
    tableMap.put(TerminalEnum.specialLetter,specialLetterArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.rbrac,rbracArray);
    tableMap.put(TerminalEnum.intervalLetter,intervalLetterArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.dollar,dollarArray);
    tableMap.put(TerminalEnum.stringLetter,stringLetterArray);
    tableMap.put(TerminalEnum.lbrak,lbrakArray);
    tableMap.put(TerminalEnum.hat,hatArray);
    tableMap.put(TerminalEnum.name,nameArray);
    tableMap.put(TerminalEnum.question,questionArray);
    tableMap.put(TerminalEnum.normalLetter,normalLetterArray);
    tableMap.put(TerminalEnum.minus,minusArray);
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    tableMap.put(TerminalEnum.dot,dotArray);
    tableMap.put(TerminalEnum.lbrac,lbracArray);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.pattern,45);
    tableStarts.put(NonTerminalEnum.macro,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),56,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0lbrac_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lbrac,null);
    metadata0main_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.main,null);
    metadata0pattern_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.pattern,null);
    metadata0intervals_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.intervals,null);
    metadata0rbrac_metadata0reduceregexAtLeast = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rbrac,reduceregexAtLeast);
    metadata0specialOrStringLetter_metadata0reducespecialOrStringLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.specialOrStringLetter,reducespecialOrStringLetter);
    metadata0normalLetter_metadata0reducenormalLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.normalLetter,reducenormalLetter);
    metadata0specialOrIntervalLetter_metadata0reduceintervalSet = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.specialOrIntervalLetter,reduceintervalSet);
    metadata0rbrak_metadata0reduceregexInterval = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rbrak,reduceregexInterval);
    metadata0interval_metadata0reduceintervals = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.interval,reduceintervals);
    metadata0lbrak_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lbrak,null);
    metadata0regex_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex,null);
    metadata0specialOrNormalLetter_metadata0reduceregexLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.specialOrNormalLetter,reduceregexLetter);
    metadata0hat_metadata0reducehatPresent = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.hat,reducehatPresent);
    metadata0string_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.string,null);
    metadata0quote_metadata0reduceregexString = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceregexString);
    metadata0rpar_metadata0reduceregexPar = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reduceregexPar);
    metadata0intervalLetter_metadata0reduceintervalLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.intervalLetter,reduceintervalLetter);
    metadata0dollar_metadata0reducefollowDollar = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dollar,reducefollowDollar);
    metadata0null_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,null);
    metadata0interval_metadata0reduceinterval = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.interval,reduceinterval);
    metadata0minus_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.minus,null);
    metadata0specialLetter_metadata0reducestringSpecialLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.specialLetter,reducestringSpecialLetter);
    metadata0macro_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.macro,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0specialLetter_metadata0reducenormalSpecialLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.specialLetter,reducenormalSpecialLetter);
    metadata0specialOrStringLetter_metadata0reducestring = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.specialOrStringLetter,reducestring);
    metadata0name_metadata0reduceregexMacro = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.name,reduceregexMacro);
    metadata0comma_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.comma,null);
    metadata0specialOrIntervalLetter_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.specialOrIntervalLetter,null);
    metadata0pipe_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,null);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0dot_metadata0reduceregexAny = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dot,reduceregexAny);
    metadata0hatOpt_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.hatOpt,null);
    metadata0plus_metadata0reduceregexPlus = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,reduceregexPlus);
    metadata0rbrac_metadata0reduceregexTimes = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rbrac,reduceregexTimes);
    metadata0rbrak_metadata0reduceregexIntervalNegate = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rbrak,reduceregexIntervalNegate);
    metadata0specialLetter_metadata0reduceintervalSpecialLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.specialLetter,reduceintervalSpecialLetter);
    metadata0hat_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.hat,null);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0integer_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.integer,null);
    metadata0follow_metadata0reduceinitial = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.follow,reduceinitial);
    metadata0rbrac_metadata0reduceregexRange = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rbrac,reduceregexRange);
    metadata0stringLetter_metadata0reducestringLetter = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.stringLetter,reducestringLetter);
    metadata0quote_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,null);
    metadata0question_metadata0reduceregexOptional = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.question,reduceregexOptional);
    metadata0star_metadata0reduceregexStar = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,reduceregexStar);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0null,metadata0lbrak_metadata0null,metadata0hat_metadata0null,metadata0specialLetter_metadata0reduceintervalSpecialLetter,metadata0intervalLetter_metadata0reduceintervalLetter,metadata0intervals_metadata0null,metadata0rbrak_metadata0reduceregexIntervalNegate,metadata0specialOrIntervalLetter_metadata0null,metadata0minus_metadata0null,metadata0specialOrIntervalLetter_metadata0reduceintervalSet,metadata0interval_metadata0reduceintervals,metadata0interval_metadata0reduceinterval,metadata0intervals_metadata0null,metadata0rbrak_metadata0reduceregexInterval,metadata0lpar_metadata0null,metadata0quote_metadata0null,metadata0stringLetter_metadata0reducestringLetter,metadata0specialLetter_metadata0reducestringSpecialLetter,metadata0string_metadata0null,metadata0quote_metadata0reduceregexString,metadata0specialOrStringLetter_metadata0reducestring,metadata0specialOrStringLetter_metadata0reducespecialOrStringLetter,metadata0name_metadata0reduceregexMacro,metadata0specialLetter_metadata0reducenormalSpecialLetter,metadata0normalLetter_metadata0reducenormalLetter,metadata0dot_metadata0reduceregexAny,metadata0regex_metadata0null,metadata0star_metadata0reduceregexStar,metadata0pipe_metadata0null,metadata0regex_metadata0null,metadata0question_metadata0reduceregexOptional,metadata0plus_metadata0reduceregexPlus,metadata0lbrac_metadata0null,metadata0integer_metadata0null,metadata0comma_metadata0null,metadata0integer_metadata0null,metadata0rbrac_metadata0reduceregexRange,metadata0rbrac_metadata0reduceregexAtLeast,metadata0rbrac_metadata0reduceregexTimes,metadata0regex_metadata0null,metadata0specialOrNormalLetter_metadata0reduceregexLetter,metadata0rpar_metadata0reduceregexPar,metadata0regex_metadata0null,metadata0macro_metadata0null,metadata0__eof___metadata0null,metadata0null_metadata0null,metadata0hat_metadata0reducehatPresent,metadata0pattern_metadata0null,metadata0__eof___metadata0null,metadata0hatOpt_metadata0null,metadata0main_metadata0null,metadata0slash_metadata0null,metadata0regex_metadata0null,metadata0dollar_metadata0reducefollowDollar,metadata0follow_metadata0reduceinitial,metadata0regex_metadata0null};
  }

  
  private int[] mainGotoes;

  private void initmainGotoes() {
    mainGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,50,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] stringGotoes;

  private void initstringGotoes() {
    stringGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,18,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] regexGotoes;

  private void initregexGotoes() {
    regexGotoes = 
      new int[]{42,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,26,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,29,39,-1,-1,-1,-1,-1,-1,-1,-1,-1,39,-1,-1,39,-1,-1,-1,-1,-1,-1,55,-1,52,39,-1,-1,39};
  }
  
  private int[] followGotoes;

  private void initfollowGotoes() {
    followGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1};
  }
  
  private int[] patternGotoes;

  private void initpatternGotoes() {
    patternGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,47,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] intervalsGotoes;

  private void initintervalsGotoes() {
    intervalsGotoes = 
      new int[]{-1,12,5,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] specialOrNormalLetterGotoes;

  private void initspecialOrNormalLetterGotoes() {
    specialOrNormalLetterGotoes = 
      new int[]{40,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,40,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,40,-1,40,40,-1,-1,-1,-1,-1,-1,-1,-1,-1,40,-1,-1,40,-1,-1,-1,-1,-1,-1,40,-1,40,40,-1,-1,40};
  }
  
  private int[] macroGotoes;

  private void initmacroGotoes() {
    macroGotoes = 
      new int[]{43,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] hatOptGotoes;

  private void inithatOptGotoes() {
    hatOptGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] specialOrIntervalLetterGotoes;

  private void initspecialOrIntervalLetterGotoes() {
    specialOrIntervalLetterGotoes = 
      new int[]{-1,7,7,-1,-1,7,-1,-1,9,-1,-1,-1,7,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] intervalGotoes;

  private void initintervalGotoes() {
    intervalGotoes = 
      new int[]{-1,11,11,-1,-1,10,-1,-1,-1,-1,-1,-1,10,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] specialOrStringLetterGotoes;

  private void initspecialOrStringLetterGotoes() {
    specialOrStringLetterGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,21,-1,-1,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] integerArray;
  @SuppressWarnings("unchecked")
  private void initintegerArray() {
    integerArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift33,branch0,shift35,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift28,reduceregexStar,branch0,reduceregexOr,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift28,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift28,branch0,branch0,shift28};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift27,reduceregexStar,branch0,shift27,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,shift27,reduceregexLetter,reduceregexPar,shift27,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift27,branch0,branch0,shift27};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift14,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,shift14,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift14,reduceregexStar,shift14,shift14,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift14,branch0,branch0,reducehatEmpty,reducehatPresent,branch0,branch0,shift14,branch0,shift14,shift14,branch0,branch0,shift14};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commaArray;
  @SuppressWarnings("unchecked")
  private void initcommaArray() {
    commaArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift34,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] quoteArray;
  @SuppressWarnings("unchecked")
  private void initquoteArray() {
    quoteArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift15,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,shift15,branch0,reducestringLetter,reducestringSpecialLetter,shift19,reduceregexString,reducestring,reducespecialOrStringLetter,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift15,reduceregexStar,shift15,shift15,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift15,branch0,branch0,reducehatEmpty,reducehatPresent,branch0,branch0,shift15,branch0,shift15,shift15,branch0,branch0,shift15};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rbrakArray;
  @SuppressWarnings("unchecked")
  private void initrbrakArray() {
    rbrakArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reduceintervalSpecialLetter,reduceintervalLetter,shift6,branch0,reduceintervalSingleton,branch0,reduceintervalSet,reduceintervals,reduceinterval,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] specialLetterArray;
  @SuppressWarnings("unchecked")
  private void initspecialLetterArray() {
    specialLetterArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift23,shift3,shift3,reduceintervalSpecialLetter,reduceintervalLetter,shift3,reduceregexIntervalNegate,reduceintervalSingleton,shift3,reduceintervalSet,reduceintervals,reduceinterval,shift3,reduceregexInterval,shift23,shift17,reducestringLetter,reducestringSpecialLetter,shift17,reduceregexString,reducestring,reducespecialOrStringLetter,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift23,reduceregexStar,shift23,shift23,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift23,branch0,branch0,reducehatEmpty,reducehatPresent,branch0,branch0,shift23,branch0,shift23,shift23,branch0,branch0,shift23};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift31,reduceregexStar,branch0,shift31,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,shift31,reduceregexLetter,reduceregexPar,shift31,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift31,branch0,branch0,shift31};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rbracArray;
  @SuppressWarnings("unchecked")
  private void initrbracArray() {
    rbracArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,shift37,shift36,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] intervalLetterArray;
  @SuppressWarnings("unchecked")
  private void initintervalLetterArray() {
    intervalLetterArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,shift4,shift4,reduceintervalSpecialLetter,reduceintervalLetter,shift4,branch0,reduceintervalSingleton,shift4,reduceintervalSet,reduceintervals,reduceinterval,shift4,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,branch0,reduceregexStar,branch0,reduceregexOr,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift51,branch0,branch0,branch0,branch0,reducemainRegex};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dollarArray;
  @SuppressWarnings("unchecked")
  private void initdollarArray() {
    dollarArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,branch0,reduceregexStar,branch0,reduceregexOr,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift53,branch0,branch0,branch0,branch0,reducemainRegex};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] stringLetterArray;
  @SuppressWarnings("unchecked")
  private void initstringLetterArray() {
    stringLetterArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift16,reducestringLetter,reducestringSpecialLetter,shift16,branch0,reducestring,reducespecialOrStringLetter,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lbrakArray;
  @SuppressWarnings("unchecked")
  private void initlbrakArray() {
    lbrakArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift1,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,shift1,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift1,reduceregexStar,shift1,shift1,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift1,branch0,branch0,reducehatEmpty,reducehatPresent,branch0,branch0,shift1,branch0,shift1,shift1,branch0,branch0,shift1};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] hatArray;
  @SuppressWarnings("unchecked")
  private void inithatArray() {
    hatArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,shift2,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift46,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] nameArray;
  @SuppressWarnings("unchecked")
  private void initnameArray() {
    nameArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift22,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,shift22,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift22,reduceregexStar,shift22,shift22,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift22,branch0,branch0,reducehatEmpty,reducehatPresent,branch0,branch0,shift22,branch0,shift22,shift22,branch0,branch0,shift22};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] questionArray;
  @SuppressWarnings("unchecked")
  private void initquestionArray() {
    questionArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift30,reduceregexStar,branch0,shift30,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,shift30,reduceregexLetter,reduceregexPar,shift30,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift30,branch0,branch0,shift30};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] normalLetterArray;
  @SuppressWarnings("unchecked")
  private void initnormalLetterArray() {
    normalLetterArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift24,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,shift24,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift24,reduceregexStar,shift24,shift24,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift24,branch0,branch0,reducehatEmpty,reducehatPresent,branch0,branch0,shift24,branch0,shift24,shift24,branch0,branch0,shift24};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] minusArray;
  @SuppressWarnings("unchecked")
  private void initminusArray() {
    minusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,reduceintervalSpecialLetter,reduceintervalLetter,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift41,reduceregexStar,branch0,reduceregexOr,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,branch0,reduceregexStar,branch0,reduceregexOr,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,reducemacro,accept,accept,branch0,branch0,accept,accept,branch0,reducefollowEmpty,branch0,reducefollowRegex,reducefollowDollar,reduceinitial,reducemainRegex};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dotArray;
  @SuppressWarnings("unchecked")
  private void initdotArray() {
    dotArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift25,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,shift25,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift25,reduceregexStar,shift25,shift25,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,shift25,branch0,branch0,reducehatEmpty,reducehatPresent,branch0,branch0,shift25,branch0,shift25,shift25,branch0,branch0,shift25};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lbracArray;
  @SuppressWarnings("unchecked")
  private void initlbracArray() {
    lbracArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,reduceregexIntervalNegate,branch0,branch0,branch0,branch0,branch0,branch0,reduceregexInterval,branch0,branch0,branch0,branch0,branch0,reduceregexString,branch0,branch0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,shift32,reduceregexStar,branch0,shift32,reduceregexOptional,reduceregexPlus,branch0,branch0,branch0,branch0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,shift32,reduceregexLetter,reduceregexPar,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift32,branch0,branch0,shift32};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{error0,error0,error0,error0,error0,error0,reduceregexIntervalNegate,error0,error0,error0,error0,error0,error0,reduceregexInterval,error0,error0,error0,error0,error0,reduceregexString,error0,error0,reduceregexMacro,reducenormalSpecialLetter,reducenormalLetter,reduceregexAny,error0,reduceregexStar,error0,reduceregexOr,reduceregexOptional,reduceregexPlus,error0,error0,error0,error0,reduceregexRange,reduceregexAtLeast,reduceregexTimes,reduceregexCat,reduceregexLetter,reduceregexPar,reducemacro,exit,exit,error0,error0,exit,exit,error0,reducefollowEmpty,error0,reducefollowRegex,reducefollowDollar,reduceinitial,reducemainRegex};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducehatEmpty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceintervalSingleton;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducenormalSpecialLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexPar;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefollowRegex;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexStar;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducespecialOrStringLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducehatPresent;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexOptional;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexRange;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinterval;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexAtLeast;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexPlus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexTimes;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexCat;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefollowDollar;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceinitial;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestringSpecialLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexString;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexIntervalNegate;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestringLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemacro;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceintervalSpecialLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexMacro;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceintervals;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexInterval;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducemainRegex;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducefollowEmpty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceintervalLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceintervalSet;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducenormalLetter;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestring;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexAny;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregexOr;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift1;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift6;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift24;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift53;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift51;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift32;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift22;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift41;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift36;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift15;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift25;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift3;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift34;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift35;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lbrac_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0main_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pattern_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0intervals_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rbrac_metadata0reduceregexAtLeast;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialOrStringLetter_metadata0reducespecialOrStringLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0normalLetter_metadata0reducenormalLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialOrIntervalLetter_metadata0reduceintervalSet;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rbrak_metadata0reduceregexInterval;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0interval_metadata0reduceintervals;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lbrak_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialOrNormalLetter_metadata0reduceregexLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0hat_metadata0reducehatPresent;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0string_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceregexString;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reduceregexPar;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0intervalLetter_metadata0reduceintervalLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dollar_metadata0reducefollowDollar;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0interval_metadata0reduceinterval;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0minus_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialLetter_metadata0reducestringSpecialLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0macro_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialLetter_metadata0reducenormalSpecialLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialOrStringLetter_metadata0reducestring;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0name_metadata0reduceregexMacro;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comma_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialOrIntervalLetter_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dot_metadata0reduceregexAny;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0hatOpt_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0reduceregexPlus;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rbrac_metadata0reduceregexTimes;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rbrak_metadata0reduceregexIntervalNegate;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0specialLetter_metadata0reduceintervalSpecialLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0hat_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0integer_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0follow_metadata0reduceinitial;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rbrac_metadata0reduceregexRange;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0stringLetter_metadata0reducestringLetter;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0question_metadata0reduceregexOptional;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0reduceregexStar;
}

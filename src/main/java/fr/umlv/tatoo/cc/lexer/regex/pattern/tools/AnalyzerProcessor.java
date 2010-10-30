package fr.umlv.tatoo.cc.lexer.regex.pattern.tools;

  import fr.umlv.tatoo.cc.lexer.charset.CharacterInterval;
    import fr.umlv.tatoo.cc.lexer.regex.Regex;
    import java.util.ArrayList;
  
import fr.umlv.tatoo.cc.lexer.regex.pattern.lexer.RuleEnum;
import fr.umlv.tatoo.cc.lexer.regex.pattern.parser.TerminalEnum;
import fr.umlv.tatoo.cc.lexer.regex.pattern.parser.NonTerminalEnum;
import fr.umlv.tatoo.cc.lexer.regex.pattern.parser.ProductionEnum;
import fr.umlv.tatoo.cc.lexer.regex.pattern.tools.TerminalEvaluator;
import fr.umlv.tatoo.cc.lexer.regex.pattern.tools.GrammarEvaluator;

import fr.umlv.tatoo.runtime.buffer.LexerBuffer;
import fr.umlv.tatoo.runtime.tools.AnalyzerListener;
import fr.umlv.tatoo.runtime.tools.DataViewer;
import fr.umlv.tatoo.runtime.tools.SemanticStack;

/**  This class is called by the parser when
 *  <ol>
 *    <li>a terminal is shifted</li>
 *    <li>a non terminal is reduced</li>
 *    <li>a non terminal is accepted</li>
 *   </ol>
 *   In that case, depending on the information of the .xtls, terminal and non-terminal
 *   values are pushed/pop from a semantic stack.
 *   
 *   Furthermore, in case of error recovery, values of the stack can be pop out
 *   depending if the last recognized element is a terminal or a non-terminal.
 * 
 *  This class is generated - please do not edit it 
 */
public class AnalyzerProcessor<B extends LexerBuffer,D>
  implements AnalyzerListener<RuleEnum,B,TerminalEnum,NonTerminalEnum,ProductionEnum> {
          
  private final GrammarEvaluator grammarEvaluator;
  private final TerminalEvaluator<? super D> terminalEvaluator;
  private final DataViewer<? super B,? extends D> dataViewer;
  private final SemanticStack stack;
  
  protected AnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    this.terminalEvaluator=terminalEvaluator;
    this.grammarEvaluator=grammarEvaluator;
    this.dataViewer=dataViewer;
    this.stack=stack;
  }
  
  /** Creates a tools listener that redirect accept/shift/reduce and comment to the terminal Evaluator
      and the grammar evaluator..
      This constructor allows to share the same stack between more
      than one parser processor.
      @param terminalEvaluator the terminal evaluator.
      @param grammarEvaluator the grammar evaluator.
      @param stack the stack used by the processor
   */
  public static <B extends LexerBuffer,D> AnalyzerProcessor<B,D>
    createAnalyzerProcessor(TerminalEvaluator<? super D> terminalEvaluator, GrammarEvaluator grammarEvaluator, DataViewer<? super B,? extends D> dataViewer, SemanticStack stack) {
    
    return new AnalyzerProcessor<B,D>(terminalEvaluator,grammarEvaluator,dataViewer,stack);
  }
  
  public void comment(RuleEnum rule, B buffer) {
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(TerminalEnum terminal, RuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case plus: {
                       return;
           }
                 case star: {
                       return;
           }
                 case question: {
                       return;
           }
                 case minus: {
                       return;
           }
                 case slash: {
                       return;
           }
                 case comma: {
                       return;
           }
                 case hat: {
                       return;
           }
                 case dollar: {
                       return;
           }
                 case pipe: {
                       return;
           }
                 case integer: {
         data=dataViewer.view(buffer);
                                  int integer=terminalEvaluator.integer(data);
                                      stack.push_int(integer);
                                 return;
           }
                 case lbrac: {
                       return;
           }
                 case rbrac: {
                       return;
           }
                 case lpar: {
                       return;
           }
                 case rpar: {
                       return;
           }
                 case lbrak: {
                       return;
           }
                 case rbrak: {
                       return;
           }
                 case quote: {
                       return;
           }
                 case dot: {
                       return;
           }
                 case name: {
         data=dataViewer.view(buffer);
                                  String name=terminalEvaluator.macro(data);
                                      stack.push_Object(name);
                                 return;
           }
                 case specialLetter: {
         data=dataViewer.view(buffer);
          char specialLetter;
                                      switch(rule) {
                                          case formfeed:
                                                 specialLetter=terminalEvaluator.formfeed(data);
                           break;
                                              case backspace:
                                                 specialLetter=terminalEvaluator.backspace(data);
                           break;
                                              case tab:
                                                 specialLetter=terminalEvaluator.tab(data);
                           break;
                                              case eoln:
                                                 specialLetter=terminalEvaluator.eoln(data);
                           break;
                                              case unicodeChar:
                                                 specialLetter=terminalEvaluator.unicodeChar(data);
                           break;
                                              case cr:
                                                 specialLetter=terminalEvaluator.cr(data);
                           break;
                                             default:
                          throw new AssertionError("Unknown rule " +rule);
                    }
                                     stack.push_char(specialLetter);
                                 return;
           }
                 case normalLetter: {
         data=dataViewer.view(buffer);
          char normalLetter;
                                      switch(rule) {
                                          case escapedChar:
                                                 normalLetter=terminalEvaluator.escapedChar(data);
                           break;
                                              case normalChar:
                                                 normalLetter=terminalEvaluator.normalChar(data);
                           break;
                                             default:
                          throw new AssertionError("Unknown rule " +rule);
                    }
                                     stack.push_char(normalLetter);
                                 return;
           }
                 case stringLetter: {
         data=dataViewer.view(buffer);
          char stringLetter;
                                      switch(rule) {
                                          case stringChar:
                                                 stringLetter=terminalEvaluator.stringChar(data);
                           break;
                                              case stringEscapedChar:
                                                 stringLetter=terminalEvaluator.stringEscapedChar(data);
                           break;
                                             default:
                          throw new AssertionError("Unknown rule " +rule);
                    }
                                     stack.push_char(stringLetter);
                                 return;
           }
                 case intervalLetter: {
         data=dataViewer.view(buffer);
          char intervalLetter;
                                      switch(rule) {
                                          case intervalChar:
                                                 intervalLetter=terminalEvaluator.intervalChar(data);
                           break;
                                              case intervalEscapedChar:
                                                 intervalLetter=terminalEvaluator.intervalEscapedChar(data);
                           break;
                                             default:
                          throw new AssertionError("Unknown rule " +rule);
                    }
                                     stack.push_char(intervalLetter);
                                 return;
           }
                 case __eof__: {
                       return;
           }
                 }
     throw new AssertionError("unknown terminal "+terminal);
   }
    
    
    @SuppressWarnings("unchecked")
    public void reduce(ProductionEnum production) {
      switch(production) {           case initial: { // not synthetic
                                 Regex follow=(Regex)stack.pop_Object();
                                          Regex main=(Regex)stack.pop_Object();
                                          boolean hatOpt=stack.pop_boolean();
                                           grammarEvaluator.initial(hatOpt,main,follow);
                      
          }
          return;
                    case macro: { // not synthetic
                                 Regex regex=(Regex)stack.pop_Object();
                                           grammarEvaluator.macro(regex);
                      
          }
          return;
                    case mainRegex: { // not synthetic
                                 Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.mainRegex(regex));
                      
          }
          return;
                    case followEmpty: { // not synthetic
                                       stack.push_Object(grammarEvaluator.followEmpty());
                      
          }
          return;
                    case followDollar: { // not synthetic
                                       stack.push_Object(grammarEvaluator.followDollar());
                      
          }
          return;
                    case followRegex: { // not synthetic
                                 Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.followRegex(regex));
                      
          }
          return;
                    case hatEmpty: { // not synthetic
                                       stack.push_boolean(grammarEvaluator.hatEmpty());
                      
          }
          return;
                    case hatPresent: { // not synthetic
                                       stack.push_boolean(grammarEvaluator.hatPresent());
                      
          }
          return;
                    case regexMacro: { // not synthetic
                                 String name=(String)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexMacro(name));
                      
          }
          return;
                    case regexAny: { // not synthetic
                                       stack.push_Object(grammarEvaluator.regexAny());
                      
          }
          return;
                    case regexLetter: { // not synthetic
                                 char specialOrNormalLetter=stack.pop_char();
                                                stack.push_Object(grammarEvaluator.regexLetter(specialOrNormalLetter));
                      
          }
          return;
                    case normalLetter: { // not synthetic
                                 char normalLetter=stack.pop_char();
                                                stack.push_char(grammarEvaluator.normalLetter(normalLetter));
                      
          }
          return;
                    case normalSpecialLetter: { // not synthetic
                                 char specialLetter=stack.pop_char();
                                                stack.push_char(grammarEvaluator.normalSpecialLetter(specialLetter));
                      
          }
          return;
                    case regexString: { // not synthetic
                                 Regex string=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexString(string));
                      
          }
          return;
                    case string: { // not synthetic
                                 Regex specialOrStringLetter=(Regex)stack.pop_Object();
                                          Regex string=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.string(string,specialOrStringLetter));
                      
          }
          return;
                    case specialOrStringLetter: { // not synthetic
                                 Regex specialOrStringLetter=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.specialOrStringLetter(specialOrStringLetter));
                      
          }
          return;
                    case stringSpecialLetter: { // not synthetic
                                 char specialLetter=stack.pop_char();
                                                stack.push_Object(grammarEvaluator.stringSpecialLetter(specialLetter));
                      
          }
          return;
                    case stringLetter: { // not synthetic
                                 char stringLetter=stack.pop_char();
                                                stack.push_Object(grammarEvaluator.stringLetter(stringLetter));
                      
          }
          return;
                    case regexInterval: { // not synthetic
                                 ArrayList<CharacterInterval> intervals=(ArrayList<CharacterInterval>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexInterval(intervals));
                      
          }
          return;
                    case regexIntervalNegate: { // not synthetic
                                 ArrayList<CharacterInterval> intervals=(ArrayList<CharacterInterval>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexIntervalNegate(intervals));
                      
          }
          return;
                    case interval: { // not synthetic
                                 CharacterInterval interval=(CharacterInterval)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.interval(interval));
                      
          }
          return;
                    case intervals: { // not synthetic
                                 CharacterInterval interval=(CharacterInterval)stack.pop_Object();
                                          ArrayList<CharacterInterval> intervals=(ArrayList<CharacterInterval>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.intervals(intervals,interval));
                      
          }
          return;
                    case intervalSet: { // not synthetic
                                 char specialOrIntervalLetter2=stack.pop_char();
                                          char specialOrIntervalLetter=stack.pop_char();
                                                stack.push_Object(grammarEvaluator.intervalSet(specialOrIntervalLetter,specialOrIntervalLetter2));
                      
          }
          return;
                    case intervalSingleton: { // not synthetic
                                 char specialOrIntervalLetter=stack.pop_char();
                                                stack.push_Object(grammarEvaluator.intervalSingleton(specialOrIntervalLetter));
                      
          }
          return;
                    case intervalSpecialLetter: { // not synthetic
                                 char specialLetter=stack.pop_char();
                                                stack.push_char(grammarEvaluator.intervalSpecialLetter(specialLetter));
                      
          }
          return;
                    case intervalLetter: { // not synthetic
                                 char intervalLetter=stack.pop_char();
                                                stack.push_char(grammarEvaluator.intervalLetter(intervalLetter));
                      
          }
          return;
                    case regexStar: { // not synthetic
                                 Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexStar(regex));
                      
          }
          return;
                    case regexPlus: { // not synthetic
                                 Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexPlus(regex));
                      
          }
          return;
                    case regexOptional: { // not synthetic
                                 Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexOptional(regex));
                      
          }
          return;
                    case regexRange: { // not synthetic
                                 int integer2=stack.pop_int();
                                          int integer=stack.pop_int();
                                          Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexRange(regex,integer,integer2));
                      
          }
          return;
                    case regexAtLeast: { // not synthetic
                                 int integer=stack.pop_int();
                                          Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexAtLeast(regex,integer));
                      
          }
          return;
                    case regexTimes: { // not synthetic
                                 int integer=stack.pop_int();
                                          Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexTimes(regex,integer));
                      
          }
          return;
                    case regexPar: { // not synthetic
                                 Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexPar(regex));
                      
          }
          return;
                    case regexCat: { // not synthetic
                                 Regex regex2=(Regex)stack.pop_Object();
                                          Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexCat(regex,regex2));
                      
          }
          return;
                    case regexOr: { // not synthetic
                                 Regex regex2=(Regex)stack.pop_Object();
                                          Regex regex=(Regex)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regexOr(regex,regex2));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(NonTerminalEnum nonterminal) {
       switch(nonterminal) {            case pattern:
             grammarEvaluator.acceptPattern();
             return;
                      case macro:
             grammarEvaluator.acceptMacro();
             return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(TerminalEnum terminal) {
        switch(terminal) {             case plus:
              
              return;
                         case star:
              
              return;
                         case question:
              
              return;
                         case minus:
              
              return;
                         case slash:
              
              return;
                         case comma:
              
              return;
                         case hat:
              
              return;
                         case dollar:
              
              return;
                         case pipe:
              
              return;
                         case integer:
              stack.pop_int();
              return;
                         case lbrac:
              
              return;
                         case rbrac:
              
              return;
                         case lpar:
              
              return;
                         case rpar:
              
              return;
                         case lbrak:
              
              return;
                         case rbrak:
              
              return;
                         case quote:
              
              return;
                         case dot:
              
              return;
                         case name:
              stack.pop_Object();
              return;
                         case specialLetter:
              stack.pop_char();
              return;
                         case normalLetter:
              stack.pop_char();
              return;
                         case stringLetter:
              stack.pop_char();
              return;
                         case intervalLetter:
              stack.pop_char();
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(NonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case pattern:
              
              return;
                         case macro:
              
              return;
                         case hatOpt:
              stack.pop_boolean();
              return;
                         case main:
              stack.pop_Object();
              return;
                         case follow:
              stack.pop_Object();
              return;
                         case regex:
              stack.pop_Object();
              return;
                         case specialOrNormalLetter:
              stack.pop_char();
              return;
                         case string:
              stack.pop_Object();
              return;
                         case specialOrStringLetter:
              stack.pop_Object();
              return;
                         case intervals:
              stack.pop_Object();
              return;
                         case interval:
              stack.pop_Object();
              return;
                         case specialOrIntervalLetter:
              stack.pop_char();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}
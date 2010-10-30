package fr.umlv.tatoo.cc.lexer.regex.pattern.tools;

import fr.umlv.tatoo.cc.lexer.charset.CharacterInterval;
import fr.umlv.tatoo.cc.lexer.regex.Regex;
import java.util.ArrayList;

/** 
 *  This class is generated - please do not edit it 
 */
public interface GrammarEvaluator {
  /** This methods is called after the reduction of the non terminal pattern
   *  by the grammar production initial.
   *  <code>pattern ::= hatOpt main follow</code>
   */
  public void initial(boolean hatOpt,Regex main,Regex follow);
  /** This methods is called after the reduction of the non terminal macro
   *  by the grammar production macro.
   *  <code>macro ::= regex</code>
   */
  public void macro(Regex regex);
  /** This methods is called after the reduction of the non terminal main
   *  by the grammar production mainRegex.
   *  <code>main ::= regex</code>
   */
  public Regex mainRegex(Regex regex);
  /** This methods is called after the reduction of the non terminal follow
   *  by the grammar production followEmpty.
   *  <code>follow ::=</code>
   */
  public Regex followEmpty();
  /** This methods is called after the reduction of the non terminal follow
   *  by the grammar production followDollar.
   *  <code>follow ::= dollar</code>
   */
  public Regex followDollar();
  /** This methods is called after the reduction of the non terminal follow
   *  by the grammar production followRegex.
   *  <code>follow ::= slash regex</code>
   */
  public Regex followRegex(Regex regex);
  /** This methods is called after the reduction of the non terminal hatOpt
   *  by the grammar production hatEmpty.
   *  <code>hatOpt ::=</code>
   */
  public boolean hatEmpty();
  /** This methods is called after the reduction of the non terminal hatOpt
   *  by the grammar production hatPresent.
   *  <code>hatOpt ::= hat</code>
   */
  public boolean hatPresent();
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexMacro.
   *  <code>regex ::= name</code>
   */
  public Regex regexMacro(String name);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexAny.
   *  <code>regex ::= dot</code>
   */
  public Regex regexAny();
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexLetter.
   *  <code>regex ::= specialOrNormalLetter</code>
   */
  public Regex regexLetter(char specialOrNormalLetter);
  /** This methods is called after the reduction of the non terminal specialOrNormalLetter
   *  by the grammar production normalLetter.
   *  <code>specialOrNormalLetter ::= normalLetter</code>
   */
  public char normalLetter(char normalLetter);
  /** This methods is called after the reduction of the non terminal specialOrNormalLetter
   *  by the grammar production normalSpecialLetter.
   *  <code>specialOrNormalLetter ::= specialLetter</code>
   */
  public char normalSpecialLetter(char specialLetter);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexString.
   *  <code>regex ::= quote string quote</code>
   */
  public Regex regexString(Regex string);
  /** This methods is called after the reduction of the non terminal string
   *  by the grammar production string.
   *  <code>string ::= string specialOrStringLetter</code>
   */
  public Regex string(Regex string,Regex specialOrStringLetter);
  /** This methods is called after the reduction of the non terminal string
   *  by the grammar production specialOrStringLetter.
   *  <code>string ::= specialOrStringLetter</code>
   */
  public Regex specialOrStringLetter(Regex specialOrStringLetter);
  /** This methods is called after the reduction of the non terminal specialOrStringLetter
   *  by the grammar production stringSpecialLetter.
   *  <code>specialOrStringLetter ::= specialLetter</code>
   */
  public Regex stringSpecialLetter(char specialLetter);
  /** This methods is called after the reduction of the non terminal specialOrStringLetter
   *  by the grammar production stringLetter.
   *  <code>specialOrStringLetter ::= stringLetter</code>
   */
  public Regex stringLetter(char stringLetter);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexInterval.
   *  <code>regex ::= lbrak intervals rbrak</code>
   */
  public Regex regexInterval(ArrayList<CharacterInterval> intervals);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexIntervalNegate.
   *  <code>regex ::= lbrak hat intervals rbrak</code>
   */
  public Regex regexIntervalNegate(ArrayList<CharacterInterval> intervals);
  /** This methods is called after the reduction of the non terminal intervals
   *  by the grammar production interval.
   *  <code>intervals ::= interval</code>
   */
  public ArrayList<CharacterInterval> interval(CharacterInterval interval);
  /** This methods is called after the reduction of the non terminal intervals
   *  by the grammar production intervals.
   *  <code>intervals ::= intervals interval</code>
   */
  public ArrayList<CharacterInterval> intervals(ArrayList<CharacterInterval> intervals,CharacterInterval interval);
  /** This methods is called after the reduction of the non terminal interval
   *  by the grammar production intervalSet.
   *  <code>interval ::= specialOrIntervalLetter minus specialOrIntervalLetter</code>
   */
  public CharacterInterval intervalSet(char specialOrIntervalLetter,char specialOrIntervalLetter2);
  /** This methods is called after the reduction of the non terminal interval
   *  by the grammar production intervalSingleton.
   *  <code>interval ::= specialOrIntervalLetter</code>
   */
  public CharacterInterval intervalSingleton(char specialOrIntervalLetter);
  /** This methods is called after the reduction of the non terminal specialOrIntervalLetter
   *  by the grammar production intervalSpecialLetter.
   *  <code>specialOrIntervalLetter ::= specialLetter</code>
   */
  public char intervalSpecialLetter(char specialLetter);
  /** This methods is called after the reduction of the non terminal specialOrIntervalLetter
   *  by the grammar production intervalLetter.
   *  <code>specialOrIntervalLetter ::= intervalLetter</code>
   */
  public char intervalLetter(char intervalLetter);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexStar.
   *  <code>regex ::= regex star</code>
   */
  public Regex regexStar(Regex regex);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexPlus.
   *  <code>regex ::= regex plus</code>
   */
  public Regex regexPlus(Regex regex);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexOptional.
   *  <code>regex ::= regex question</code>
   */
  public Regex regexOptional(Regex regex);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexRange.
   *  <code>regex ::= regex lbrac integer comma integer rbrac</code>
   */
  public Regex regexRange(Regex regex,int integer,int integer2);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexAtLeast.
   *  <code>regex ::= regex lbrac integer comma rbrac</code>
   */
  public Regex regexAtLeast(Regex regex,int integer);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexTimes.
   *  <code>regex ::= regex lbrac integer rbrac</code>
   */
  public Regex regexTimes(Regex regex,int integer);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexPar.
   *  <code>regex ::= lpar regex rpar</code>
   */
  public Regex regexPar(Regex regex);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexCat.
   *  <code>regex ::= regex regex</code>
   */
  public Regex regexCat(Regex regex,Regex regex2);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regexOr.
   *  <code>regex ::= regex pipe regex</code>
   */
  public Regex regexOr(Regex regex,Regex regex2);

  public void acceptPattern();
  public void acceptMacro();
}

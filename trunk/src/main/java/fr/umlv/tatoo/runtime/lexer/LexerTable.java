/*
 * Created on 26 dec. 2005
 *
 */
package fr.umlv.tatoo.runtime.lexer;

import java.util.Map;

import fr.umlv.tatoo.runtime.lexer.rules.RuleData;

/** Table that associates rule data to lexer rule.
 *  This table is filled by data generated by Tatoo lexer.
 * 
 * @param <R> type of rules.
 * 
 * @author Remi
 */
public class LexerTable<R> {
  /** Creates a lexer table from a map of rules with their lexer data.
   * @param ruleDatas the map of lexer data.
   */
  public LexerTable(Map<R,RuleData> ruleDatas) {
    this.ruleDatas=ruleDatas;
  }
  
  /** Returns an unmodifiable map that associates a rule data
   *  for each rule.
   * @return an unmodifiable map of rule data.
   * 
   */
  public Map<R,RuleData> getRuleDataMap() {
    return ruleDatas;
  }
  
  private final Map<R,RuleData> ruleDatas;
}

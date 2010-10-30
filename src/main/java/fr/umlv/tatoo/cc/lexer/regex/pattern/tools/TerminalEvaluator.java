package fr.umlv.tatoo.cc.lexer.regex.pattern.tools;


/** 
 *  @param <D> data type passed by the lexer listener.
 *
 *  This class is generated - please do not edit it 
 */
public interface TerminalEvaluator<D> {
  /** This method is called when the rule <code>intervalChar</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char intervalChar(D data);
  /** This method is called when the rule <code>stringChar</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char stringChar(D data);
  /** This method is called when the rule <code>escapedChar</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char escapedChar(D data);
  /** This method is called when the rule <code>intervalEscapedChar</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char intervalEscapedChar(D data);
  /** This method is called when the rule <code>normalChar</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char normalChar(D data);
  /** This method is called when the rule <code>integer</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public int integer(D data);
  /** This method is called when the rule <code>unicodeChar</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char unicodeChar(D data);
  /** This method is called when the rule <code>formfeed</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char formfeed(D data);
  /** This method is called when the rule <code>backspace</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char backspace(D data);
  /** This method is called when the rule <code>eoln</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char eoln(D data);
  /** This method is called when the rule <code>stringEscapedChar</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char stringEscapedChar(D data);
  /** This method is called when the rule <code>macro</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public String macro(D data);
  /** This method is called when the rule <code>tab</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char tab(D data);
  /** This method is called when the rule <code>cr</code> is recognized by the lexer.
   *  @param data the data sent by the lexer, in general, the
   *         {@link fr.umlv.tatoo.runtime.buffer.TokenBuffer#view a view of the token buffer} or the buffer itself.
  
   *  @return the value associated with the terminal spawn for the rule.
   */
  public char cr(D data);
}

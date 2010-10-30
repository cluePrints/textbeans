package fr.umlv.tatoo.cc.lexer.ebnf.tools;

  import fr.umlv.tatoo.cc.ebnf.ast.AliasDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.AttributeDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.DirectiveDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.ImportDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.NonTerminalDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.PriorityDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.PriorityVarAST;
    import fr.umlv.tatoo.cc.ebnf.ast.ProductionIdAndVersionDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.RootDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.SimpleNodeAST;
    import fr.umlv.tatoo.cc.ebnf.ast.StartNonTerminalSetDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.TerminalDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.TokenAST;
    import fr.umlv.tatoo.cc.ebnf.ast.TypeVarAST;
    import fr.umlv.tatoo.cc.ebnf.ast.UnquotedIdVarAST;
    import fr.umlv.tatoo.cc.ebnf.ast.VariableTypeDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.VariableVarAST;
    import fr.umlv.tatoo.cc.ebnf.ast.VersionDefAST;
    import fr.umlv.tatoo.cc.ebnf.ast.VersionVarAST;
    import fr.umlv.tatoo.runtime.node.Node;
    import java.util.List;
  
import fr.umlv.tatoo.cc.lexer.ebnf.lexer.RuleEnum;
import fr.umlv.tatoo.cc.lexer.ebnf.parser.TerminalEnum;
import fr.umlv.tatoo.cc.lexer.ebnf.parser.NonTerminalEnum;
import fr.umlv.tatoo.cc.lexer.ebnf.parser.ProductionEnum;
import fr.umlv.tatoo.cc.lexer.ebnf.tools.TerminalEvaluator;
import fr.umlv.tatoo.cc.lexer.ebnf.tools.GrammarEvaluator;

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
    D data;
    switch(rule) {           case comment:
            data=dataViewer.view(buffer);
            terminalEvaluator.comment(data);
            return;
              default:
    }
    throw new AssertionError("unknown rule "+rule);
  }
 
   public void shift(TerminalEnum terminal, RuleEnum rule, B buffer) {
     D data;
     switch(terminal) {      case directivesdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> directivesdecl=terminalEvaluator.directivesdecl(data);
                                      stack.push_Object(directivesdecl);
                                 return;
           }
                 case importsdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> importsdecl=terminalEvaluator.importsdecl(data);
                                      stack.push_Object(importsdecl);
                                 return;
           }
                 case prioritiesdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> prioritiesdecl=terminalEvaluator.prioritiesdecl(data);
                                      stack.push_Object(prioritiesdecl);
                                 return;
           }
                 case tokensdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> tokensdecl=terminalEvaluator.tokensdecl(data);
                                      stack.push_Object(tokensdecl);
                                 return;
           }
                 case blanksdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> blanksdecl=terminalEvaluator.blanksdecl(data);
                                      stack.push_Object(blanksdecl);
                                 return;
           }
                 case commentsdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> commentsdecl=terminalEvaluator.commentsdecl(data);
                                      stack.push_Object(commentsdecl);
                                 return;
           }
                 case branchesdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> branchesdecl=terminalEvaluator.branchesdecl(data);
                                      stack.push_Object(branchesdecl);
                                 return;
           }
                 case startsdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> startsdecl=terminalEvaluator.startsdecl(data);
                                      stack.push_Object(startsdecl);
                                 return;
           }
                 case errordecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> errordecl=terminalEvaluator.errordecl(data);
                                      stack.push_Object(errordecl);
                                 return;
           }
                 case typesdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> typesdecl=terminalEvaluator.typesdecl(data);
                                      stack.push_Object(typesdecl);
                                 return;
           }
                 case attributesdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> attributesdecl=terminalEvaluator.attributesdecl(data);
                                      stack.push_Object(attributesdecl);
                                 return;
           }
                 case versionsdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> versionsdecl=terminalEvaluator.versionsdecl(data);
                                      stack.push_Object(versionsdecl);
                                 return;
           }
                 case productionsdecl: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> productionsdecl=terminalEvaluator.productionsdecl(data);
                                      stack.push_Object(productionsdecl);
                                 return;
           }
                 case number: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<Double> number=terminalEvaluator.number(data);
                                      stack.push_Object(number);
                                 return;
           }
                 case id: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<String> id=terminalEvaluator.id(data);
                                      stack.push_Object(id);
                                 return;
           }
                 case qualifiedid: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<String> qualifiedid=terminalEvaluator.qualifiedid(data);
                                      stack.push_Object(qualifiedid);
                                 return;
           }
                 case eof: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<String> eof=terminalEvaluator.eof(data);
                                      stack.push_Object(eof);
                                 return;
           }
                 case quoted_name: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<String> quoted_name=terminalEvaluator.quoted_name(data);
                                      stack.push_Object(quoted_name);
                                 return;
           }
                 case regexquote: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<String> regexquote=terminalEvaluator.regexquote(data);
                                      stack.push_Object(regexquote);
                                 return;
           }
                 case regexdoublequote: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<String> regexdoublequote=terminalEvaluator.regexdoublequote(data);
                                      stack.push_Object(regexdoublequote);
                                 return;
           }
                 case lbracket: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> lbracket=terminalEvaluator.lbracket(data);
                                      stack.push_Object(lbracket);
                                 return;
           }
                 case rbracket: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> rbracket=terminalEvaluator.rbracket(data);
                                      stack.push_Object(rbracket);
                                 return;
           }
                 case lsqbracket: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> lsqbracket=terminalEvaluator.lsqbracket(data);
                                      stack.push_Object(lsqbracket);
                                 return;
           }
                 case rsqbracket: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> rsqbracket=terminalEvaluator.rsqbracket(data);
                                      stack.push_Object(rsqbracket);
                                 return;
           }
                 case lpar: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> lpar=terminalEvaluator.lpar(data);
                                      stack.push_Object(lpar);
                                 return;
           }
                 case rpar: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> rpar=terminalEvaluator.rpar(data);
                                      stack.push_Object(rpar);
                                 return;
           }
                 case assign: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> assign=terminalEvaluator.assign(data);
                                      stack.push_Object(assign);
                                 return;
           }
                 case dollar: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> dollar=terminalEvaluator.dollar(data);
                                      stack.push_Object(dollar);
                                 return;
           }
                 case pipe: {
                       return;
           }
                 case slash: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> slash=terminalEvaluator.slash(data);
                                      stack.push_Object(slash);
                                 return;
           }
                 case qmark: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> qmark=terminalEvaluator.qmark(data);
                                      stack.push_Object(qmark);
                                 return;
           }
                 case star: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> star=terminalEvaluator.star(data);
                                      stack.push_Object(star);
                                 return;
           }
                 case plus: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> plus=terminalEvaluator.plus(data);
                                      stack.push_Object(plus);
                                 return;
           }
                 case quote: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> quote=terminalEvaluator.quote(data);
                                      stack.push_Object(quote);
                                 return;
           }
                 case doublequote: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> doublequote=terminalEvaluator.doublequote(data);
                                      stack.push_Object(doublequote);
                                 return;
           }
                 case semicolon: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> semicolon=terminalEvaluator.semicolon(data);
                                      stack.push_Object(semicolon);
                                 return;
           }
                 case colon: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<?> colon=terminalEvaluator.colon(data);
                                      stack.push_Object(colon);
                                 return;
           }
                 case assoc: {
         data=dataViewer.view(buffer);
                                  fr.umlv.tatoo.cc.ebnf.ast.TokenAST<String> assoc=terminalEvaluator.assoc(data);
                                      stack.push_Object(assoc);
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
      switch(production) {           case directives_lhs_optional_0_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case directives_lhs_optional_0_directives_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case imports_lhs_optional_1_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case imports_lhs_optional_1_imports_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case priorities_lhs_optional_2_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case priorities_lhs_optional_2_priorities_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case blank_lhs_optional_3_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case blank_lhs_optional_3_blank_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case comment_lhs_optional_4_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case comment_lhs_optional_4_comment_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case branch_lhs_optional_5_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case branch_lhs_optional_5_branch_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case error_lhs_optional_6_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case error_lhs_optional_6_error_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case versions_optional_7_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case versions_optional_7_versions: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case types_lhs_optional_8_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case types_lhs_optional_8_types_lhs: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case attributes_optional_9_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case attributes_optional_9_attributes: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case start_non_terminals_optional_10_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case start_non_terminals_optional_10_start_non_terminals: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case start_def: { // not synthetic
                                 SimpleNodeAST<?> production_lhs=(SimpleNodeAST<?>)stack.pop_Object();
                                          StartNonTerminalSetDefAST start_non_terminals_optional_10=(StartNonTerminalSetDefAST)stack.pop_Object();
                                          SimpleNodeAST<?> attributes_optional_9=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> types_lhs_optional_8=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> versions_optional_7=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> error_lhs_optional_6=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> branch_lhs_optional_5=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> comment_lhs_optional_4=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> blank_lhs_optional_3=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> token_lhs=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> priorities_lhs_optional_2=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> imports_lhs_optional_1=(SimpleNodeAST<?>)stack.pop_Object();
                                          SimpleNodeAST<?> directives_lhs_optional_0=(SimpleNodeAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.start_def(directives_lhs_optional_0,imports_lhs_optional_1,priorities_lhs_optional_2,token_lhs,blank_lhs_optional_3,comment_lhs_optional_4,branch_lhs_optional_5,error_lhs_optional_6,versions_optional_7,types_lhs_optional_8,attributes_optional_9,start_non_terminals_optional_10,production_lhs));
                      
          }
          return;
                    case directive_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case directive_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    DirectiveDefAST directive=(DirectiveDefAST)stack.pop_Object();
                    List<DirectiveDefAST> directive_list=(List<DirectiveDefAST>)stack.pop_Object();
                     directive_list.add(directive);
                     stack.push_Object(directive_list);
                       
          }
          return;
                    case directives_def: { // not synthetic
                                 List<DirectiveDefAST> directive_list=(List<DirectiveDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> directivesdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.directives_def(directivesdecl,colon,directive_list));
                      
          }
          return;
                    case directive_def: { // not synthetic
                                 TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.directive_def(id));
                      
          }
          return;
                    case tokens_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case tokens_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    Node lexem=(Node)stack.pop_Object();
                    List<Node> tokens_list=(List<Node>)stack.pop_Object();
                     tokens_list.add(lexem);
                     stack.push_Object(tokens_list);
                       
          }
          return;
                    case token_def: { // not synthetic
                                 List<Node> tokens_list=(List<Node>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> tokensdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.token_def(tokensdecl,colon,tokens_list));
                      
          }
          return;
                    case decls_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case decls_rec: { // STAR_RECURSIVE_LEFT
                            
                    NonTerminalDefAST decl=(NonTerminalDefAST)stack.pop_Object();
                    List<NonTerminalDefAST> decls=(List<NonTerminalDefAST>)stack.pop_Object();
                     decls.add(decl);
                     stack.push_Object(decls);
                       
          }
          return;
                    case production_def: { // not synthetic
                                 List<NonTerminalDefAST> decls=(List<NonTerminalDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> productionsdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.production_def(productionsdecl,colon,decls));
                      
          }
          return;
                    case blanks_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case blanks_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    Node blank_lexem=(Node)stack.pop_Object();
                    List<Node> blanks_list=(List<Node>)stack.pop_Object();
                     blanks_list.add(blank_lexem);
                     stack.push_Object(blanks_list);
                       
          }
          return;
                    case blank_def: { // not synthetic
                                 List<Node> blanks_list=(List<Node>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> blanksdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.blank_def(blanksdecl,colon,blanks_list));
                      
          }
          return;
                    case comments_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case comments_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    Node comment_lexem=(Node)stack.pop_Object();
                    List<Node> comments_list=(List<Node>)stack.pop_Object();
                     comments_list.add(comment_lexem);
                     stack.push_Object(comments_list);
                       
          }
          return;
                    case comment_def: { // not synthetic
                                 List<Node> comments_list=(List<Node>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> commentsdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.comment_def(commentsdecl,colon,comments_list));
                      
          }
          return;
                    case banches_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case banches_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    TerminalDefAST branch_lexem=(TerminalDefAST)stack.pop_Object();
                    List<TerminalDefAST> banches_list=(List<TerminalDefAST>)stack.pop_Object();
                     banches_list.add(branch_lexem);
                     stack.push_Object(banches_list);
                       
          }
          return;
                    case branch_def: { // not synthetic
                                 List<TerminalDefAST> banches_list=(List<TerminalDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> branchesdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.branch_def(branchesdecl,colon,banches_list));
                      
          }
          return;
                    case import_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case import_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    ImportDefAST import_=(ImportDefAST)stack.pop_Object();
                    List<ImportDefAST> import_list=(List<ImportDefAST>)stack.pop_Object();
                     import_list.add(import_);
                     stack.push_Object(import_list);
                       
          }
          return;
                    case imports_def: { // not synthetic
                                 List<ImportDefAST> import_list=(List<ImportDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> importsdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.imports_def(importsdecl,colon,import_list));
                      
          }
          return;
                    case import_def: { // not synthetic
                                 TokenAST<String> qualifiedid=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.import_def(qualifiedid));
                      
          }
          return;
                    case priority_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case priority_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    PriorityDefAST priority=(PriorityDefAST)stack.pop_Object();
                    List<PriorityDefAST> priority_list=(List<PriorityDefAST>)stack.pop_Object();
                     priority_list.add(priority);
                     stack.push_Object(priority_list);
                       
          }
          return;
                    case priorities_def: { // not synthetic
                                 List<PriorityDefAST> priority_list=(List<PriorityDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> prioritiesdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.priorities_def(prioritiesdecl,colon,priority_list));
                      
          }
          return;
                    case priority_def: { // not synthetic
                                 TokenAST<String> assoc=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<Double> number=(TokenAST<Double>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.priority_def(id,assign,number,assoc));
                      
          }
          return;
                    case version_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case version_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    VersionDefAST version=(VersionDefAST)stack.pop_Object();
                    List<VersionDefAST> version_list=(List<VersionDefAST>)stack.pop_Object();
                     version_list.add(version);
                     stack.push_Object(version_list);
                       
          }
          return;
                    case versions_def: { // not synthetic
                                 List<VersionDefAST> version_list=(List<VersionDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> versionsdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.versions_def(versionsdecl,colon,version_list));
                      
          }
          return;
                    case parent_version_optional_11_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case parent_version_optional_11_parent_version: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case version_def: { // not synthetic
                                 VersionVarAST parent_version_optional_11=(VersionVarAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.version_def(id,parent_version_optional_11));
                      
          }
          return;
                    case vartypedef_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case vartypedef_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    VariableTypeDefAST vartypedef=(VariableTypeDefAST)stack.pop_Object();
                    List<VariableTypeDefAST> vartypedef_list=(List<VariableTypeDefAST>)stack.pop_Object();
                     vartypedef_list.add(vartypedef);
                     stack.push_Object(vartypedef_list);
                       
          }
          return;
                    case types_def: { // not synthetic
                                 List<VariableTypeDefAST> vartypedef_list=(List<VariableTypeDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> typesdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.types_def(typesdecl,colon,vartypedef_list));
                      
          }
          return;
                    case vartype_def: { // not synthetic
                                 TypeVarAST type=(TypeVarAST)stack.pop_Object();
                                          VariableVarAST variable=(VariableVarAST)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.vartype_def(variable,type));
                      
          }
          return;
                    case variable_terminal: { // not synthetic
                                 TokenAST<?> quote2=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> quote=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.variable_terminal(quote,id,quote2));
                      
          }
          return;
                    case variable_nonterminal: { // not synthetic
                                 TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.variable_nonterminal(id));
                      
          }
          return;
                    case attribute_list_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case attribute_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    AttributeDefAST attribute=(AttributeDefAST)stack.pop_Object();
                    List<AttributeDefAST> attribute_list=(List<AttributeDefAST>)stack.pop_Object();
                     attribute_list.add(attribute);
                     stack.push_Object(attribute_list);
                       
          }
          return;
                    case attributes_def: { // not synthetic
                                 List<AttributeDefAST> attribute_list=(List<AttributeDefAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> attributesdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.attributes_def(attributesdecl,colon,attribute_list));
                      
          }
          return;
                    case attribute_def: { // not synthetic
                                 TypeVarAST type=(TypeVarAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.attribute_def(id,type));
                      
          }
          return;
                    case parent_version_def: { // not synthetic
                                 TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.parent_version_def(colon,id));
                      
          }
          return;
                    case lexem_macro: { // not synthetic
                                 SimpleNodeAST<String> regex=(SimpleNodeAST<String>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> dollar=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.lexem_macro(dollar,id,assign,regex));
                      
          }
          return;
                    case alias_optional_12_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case alias_optional_12_alias: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case type_optional_13_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case type_optional_13_type: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case regex_terminal_decl_optional_14_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case regex_terminal_decl_optional_14_regex_terminal_decl: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case terminal_or_prod_priority_optional_15_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case terminal_or_prod_priority_optional_15_terminal_or_prod_priority: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case lexem_terminal: { // not synthetic
                                 PriorityVarAST terminal_or_prod_priority_optional_15=(PriorityVarAST)stack.pop_Object();
                                          SimpleNodeAST<String> regex_terminal_decl_optional_14=(SimpleNodeAST<String>)stack.pop_Object();
                                          TypeVarAST type_optional_13=(TypeVarAST)stack.pop_Object();
                                          AliasDefAST alias_optional_12=(AliasDefAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.lexem_terminal(id,alias_optional_12,type_optional_13,regex_terminal_decl_optional_14,terminal_or_prod_priority_optional_15));
                      
          }
          return;
                    case alias_def: { // not synthetic
                                 TokenAST<?> rpar=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> quoted_name=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> lpar=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.alias_def(lpar,quoted_name,rpar));
                      
          }
          return;
                    case regex_terminal_decl: { // not synthetic
                                 SimpleNodeAST<String> regex=(SimpleNodeAST<String>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regex_terminal_decl(assign,regex));
                      
          }
          return;
                    case comment_lexem_macro: { // not synthetic
                                 SimpleNodeAST<String> regex=(SimpleNodeAST<String>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> dollar=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.comment_lexem_macro(dollar,id,assign,regex));
                      
          }
          return;
                    case comment_lexem_terminal: { // not synthetic
                                 SimpleNodeAST<String> regex=(SimpleNodeAST<String>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.comment_lexem_terminal(id,assign,regex));
                      
          }
          return;
                    case blank_lexem_macro: { // not synthetic
                                 SimpleNodeAST<String> regex=(SimpleNodeAST<String>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> dollar=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.blank_lexem_macro(dollar,id,assign,regex));
                      
          }
          return;
                    case blank_lexem_terminal: { // not synthetic
                                 SimpleNodeAST<String> regex=(SimpleNodeAST<String>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.blank_lexem_terminal(id,assign,regex));
                      
          }
          return;
                    case regex_quote: { // not synthetic
                                 TokenAST<?> quote2=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> regexquote=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> quote=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regex_quote(quote,regexquote,quote2));
                      
          }
          return;
                    case regex_doublequote: { // not synthetic
                                 TokenAST<?> doublequote2=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> regexdoublequote=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> doublequote=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.regex_doublequote(doublequote,regexdoublequote,doublequote2));
                      
          }
          return;
                    case type_optional_16_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case type_optional_16_type: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case terminal_or_prod_priority_optional_17_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case terminal_or_prod_priority_optional_17_terminal_or_prod_priority: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case branch_lexem_terminal: { // not synthetic
                                 PriorityVarAST terminal_or_prod_priority_optional_17=(PriorityVarAST)stack.pop_Object();
                                          TypeVarAST type_optional_16=(TypeVarAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.branch_lexem_terminal(id,type_optional_16,terminal_or_prod_priority_optional_17));
                      
          }
          return;
                    case terminal_or_prod_priority_optional_18_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case terminal_or_prod_priority_optional_18_terminal_or_prod_priority: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case branch_eof_terminal: { // not synthetic
                                 PriorityVarAST terminal_or_prod_priority_optional_18=(PriorityVarAST)stack.pop_Object();
                                          TokenAST<String> eof=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.branch_eof_terminal(eof,terminal_or_prod_priority_optional_18));
                      
          }
          return;
                    case terminal_or_prod_priority: { // not synthetic
                                 TokenAST<?> rsqbracket=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> lsqbracket=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.terminal_or_prod_priority(lsqbracket,id,rsqbracket));
                      
          }
          return;
                    case type_def: { // not synthetic
                                 TokenAST<String> qualifiedid=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.type_def(colon,qualifiedid));
                      
          }
          return;
                    case starts_list_element: { // STAR_SINGLETON
                             java.util.ArrayList<UnquotedIdVarAST> list=
                     new java.util.ArrayList<UnquotedIdVarAST>();
                   list.add((UnquotedIdVarAST)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case starts_list_rec: { // STAR_RECURSIVE_LEFT
                            
                    UnquotedIdVarAST startid=(UnquotedIdVarAST)stack.pop_Object();
                    List<UnquotedIdVarAST> starts_list=(List<UnquotedIdVarAST>)stack.pop_Object();
                     starts_list.add(startid);
                     stack.push_Object(starts_list);
                       
          }
          return;
                    case start_non_terminals_def: { // not synthetic
                                 List<UnquotedIdVarAST> starts_list=(List<UnquotedIdVarAST>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> startsdecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.start_non_terminals_def(startsdecl,colon,starts_list));
                      
          }
          return;
                    case startid_def: { // not synthetic
                                 TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.startid_def(id));
                      
          }
          return;
                    case error_def: { // not synthetic
                                 TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> errordecl=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.error_def(errordecl,colon,id));
                      
          }
          return;
                    case type_optional_19_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case type_optional_19_type: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case plus_optional_20_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case plus_optional_20_plus: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case prods_element: { // STAR_SINGLETON
                             java.util.ArrayList<Node> list=
                     new java.util.ArrayList<Node>();
                   list.add((Node)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case prods_rec: { // STAR_RECURSIVE_LEFT
                            
                    Node prod=(Node)stack.pop_Object();
                    List<Node> prods=(List<Node>)stack.pop_Object();
                     prods.add(prod);
                     stack.push_Object(prods);
                       
          }
          return;
                    case decl_productions: { // not synthetic
                                 TokenAST<?> semicolon=(TokenAST<?>)stack.pop_Object();
                                          List<Node> prods=(List<Node>)stack.pop_Object();
                                          TokenAST<?> assign=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> plus_optional_20=(TokenAST<?>)stack.pop_Object();
                                          TypeVarAST type_optional_19=(TypeVarAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.decl_productions(id,type_optional_19,plus_optional_20,assign,prods,semicolon));
                      
          }
          return;
                    case varlist_empty: { // STAR_EMPTY
                            stack.push_Object(new java.util.ArrayList<Object>());
                  
          }
          return;
                    case varlist_rec: { // STAR_RECURSIVE_LEFT
                            
                    Node var=(Node)stack.pop_Object();
                    List<Node> varlist=(List<Node>)stack.pop_Object();
                     varlist.add(var);
                     stack.push_Object(varlist);
                       
          }
          return;
                    case terminal_or_prod_priority_optional_21_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case terminal_or_prod_priority_optional_21_terminal_or_prod_priority: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case production_id_optional_22_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case production_id_optional_22_production_id: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case prod_production: { // not synthetic
                                 ProductionIdAndVersionDefAST production_id_optional_22=(ProductionIdAndVersionDefAST)stack.pop_Object();
                                          PriorityVarAST terminal_or_prod_priority_optional_21=(PriorityVarAST)stack.pop_Object();
                                          List<Node> varlist=(List<Node>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.prod_production(varlist,terminal_or_prod_priority_optional_21,production_id_optional_22));
                      
          }
          return;
                    case production_version_optional_23_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case production_version_optional_23_production_version: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case production_id: { // not synthetic
                                 TokenAST<?> rbracket=(TokenAST<?>)stack.pop_Object();
                                          VersionVarAST production_version_optional_23=(VersionVarAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> lbracket=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.production_id(lbracket,id,production_version_optional_23,rbracket));
                      
          }
          return;
                    case production_version: { // not synthetic
                                 TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> colon=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.production_version(colon,id));
                      
          }
          return;
                    case vargroup_element: { // STAR_SINGLETON
                             java.util.ArrayList<Node> list=
                     new java.util.ArrayList<Node>();
                   list.add((Node)stack.pop_Object());
                   stack.push_Object(list);
                    
          }
          return;
                    case vargroup_rec: { // STAR_RECURSIVE_LEFT
                            
                    Node var=(Node)stack.pop_Object();
                    List<Node> vargroup=(List<Node>)stack.pop_Object();
                     vargroup.add(var);
                     stack.push_Object(vargroup);
                       
          }
          return;
                    case var_group: { // not synthetic
                                 TokenAST<?> rpar=(TokenAST<?>)stack.pop_Object();
                                          List<Node> vargroup=(List<Node>)stack.pop_Object();
                                          TokenAST<?> lpar=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.var_group(lpar,vargroup,rpar));
                      
          }
          return;
                    case qmark_optional_24_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case qmark_optional_24_qmark: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case var_terminal: { // not synthetic
                                 TokenAST<?> qmark_optional_24=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> quoted_name=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.var_terminal(quoted_name,qmark_optional_24));
                      
          }
          return;
                    case qmark_optional_25_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case qmark_optional_25_qmark: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case var_nonterminal: { // not synthetic
                                 TokenAST<?> qmark_optional_25=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.var_nonterminal(id,qmark_optional_25));
                      
          }
          return;
                    case separator_optional_26_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case separator_optional_26_separator: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case var_terminal_star: { // not synthetic
                                 TokenAST<?> star=(TokenAST<?>)stack.pop_Object();
                                          VariableVarAST separator_optional_26=(VariableVarAST)stack.pop_Object();
                                          TokenAST<String> quoted_name=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.var_terminal_star(quoted_name,separator_optional_26,star));
                      
          }
          return;
                    case separator_optional_27_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case separator_optional_27_separator: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case var_terminal_plus: { // not synthetic
                                 TokenAST<?> plus=(TokenAST<?>)stack.pop_Object();
                                          VariableVarAST separator_optional_27=(VariableVarAST)stack.pop_Object();
                                          TokenAST<String> quoted_name=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.var_terminal_plus(quoted_name,separator_optional_27,plus));
                      
          }
          return;
                    case separator_optional_28_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case separator_optional_28_separator: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case var_nonterminal_star: { // not synthetic
                                 TokenAST<?> star=(TokenAST<?>)stack.pop_Object();
                                          VariableVarAST separator_optional_28=(VariableVarAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.var_nonterminal_star(id,separator_optional_28,star));
                      
          }
          return;
                    case separator_optional_29_empty: { // OPTIONAL_EMPTY
                              stack.push_Object(null);
                    
          }
          return;
                    case separator_optional_29_separator: { // OPTIONAL_SINGLETON
            
          }
          return;
                    case var_nonterminal_plus: { // not synthetic
                                 TokenAST<?> plus=(TokenAST<?>)stack.pop_Object();
                                          VariableVarAST separator_optional_29=(VariableVarAST)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.var_nonterminal_plus(id,separator_optional_29,plus));
                      
          }
          return;
                    case separator_terminal: { // not synthetic
                                 TokenAST<?> quote2=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> quote=(TokenAST<?>)stack.pop_Object();
                                          TokenAST<?> slash=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.separator_terminal(slash,quote,id,quote2));
                      
          }
          return;
                    case separator_non_terminal: { // not synthetic
                                 TokenAST<String> id=(TokenAST<String>)stack.pop_Object();
                                          TokenAST<?> slash=(TokenAST<?>)stack.pop_Object();
                                                stack.push_Object(grammarEvaluator.separator_non_terminal(slash,id));
                      
          }
          return;
                    default:
             throw new AssertionError("unknown production "+production);
       }
    }

     public void accept(NonTerminalEnum nonterminal) {
       switch(nonterminal) {            case start:
             grammarEvaluator.acceptStart((RootDefAST)stack.pop_Object());
             return;
                     default:
       }
        throw new AssertionError("unknown start nonterminal "+nonterminal);
     }

      public void popTerminalOnError(TerminalEnum terminal) {
        switch(terminal) {             case directivesdecl:
              stack.pop_Object();
              return;
                         case importsdecl:
              stack.pop_Object();
              return;
                         case prioritiesdecl:
              stack.pop_Object();
              return;
                         case tokensdecl:
              stack.pop_Object();
              return;
                         case blanksdecl:
              stack.pop_Object();
              return;
                         case commentsdecl:
              stack.pop_Object();
              return;
                         case branchesdecl:
              stack.pop_Object();
              return;
                         case startsdecl:
              stack.pop_Object();
              return;
                         case errordecl:
              stack.pop_Object();
              return;
                         case typesdecl:
              stack.pop_Object();
              return;
                         case attributesdecl:
              stack.pop_Object();
              return;
                         case versionsdecl:
              stack.pop_Object();
              return;
                         case productionsdecl:
              stack.pop_Object();
              return;
                         case number:
              stack.pop_Object();
              return;
                         case id:
              stack.pop_Object();
              return;
                         case qualifiedid:
              stack.pop_Object();
              return;
                         case eof:
              stack.pop_Object();
              return;
                         case quoted_name:
              stack.pop_Object();
              return;
                         case regexquote:
              stack.pop_Object();
              return;
                         case regexdoublequote:
              stack.pop_Object();
              return;
                         case lbracket:
              stack.pop_Object();
              return;
                         case rbracket:
              stack.pop_Object();
              return;
                         case lsqbracket:
              stack.pop_Object();
              return;
                         case rsqbracket:
              stack.pop_Object();
              return;
                         case lpar:
              stack.pop_Object();
              return;
                         case rpar:
              stack.pop_Object();
              return;
                         case assign:
              stack.pop_Object();
              return;
                         case dollar:
              stack.pop_Object();
              return;
                         case pipe:
              
              return;
                         case slash:
              stack.pop_Object();
              return;
                         case qmark:
              stack.pop_Object();
              return;
                         case star:
              stack.pop_Object();
              return;
                         case plus:
              stack.pop_Object();
              return;
                         case quote:
              stack.pop_Object();
              return;
                         case doublequote:
              stack.pop_Object();
              return;
                         case semicolon:
              stack.pop_Object();
              return;
                         case colon:
              stack.pop_Object();
              return;
                         case assoc:
              stack.pop_Object();
              return;
                         case __eof__:
              
              return;
                     }
        throw new AssertionError("unknown terminal "+terminal);
      }
 
      public void popNonTerminalOnError(NonTerminalEnum nonTerminal) {
        switch(nonTerminal) {             case start:
              stack.pop_Object();
              return;
                         case directives_lhs:
              stack.pop_Object();
              return;
                         case directives_lhs_optional_0:
              stack.pop_Object();
              return;
                         case imports_lhs:
              stack.pop_Object();
              return;
                         case imports_lhs_optional_1:
              stack.pop_Object();
              return;
                         case priorities_lhs:
              stack.pop_Object();
              return;
                         case priorities_lhs_optional_2:
              stack.pop_Object();
              return;
                         case token_lhs:
              stack.pop_Object();
              return;
                         case blank_lhs:
              stack.pop_Object();
              return;
                         case blank_lhs_optional_3:
              stack.pop_Object();
              return;
                         case comment_lhs:
              stack.pop_Object();
              return;
                         case comment_lhs_optional_4:
              stack.pop_Object();
              return;
                         case branch_lhs:
              stack.pop_Object();
              return;
                         case branch_lhs_optional_5:
              stack.pop_Object();
              return;
                         case error_lhs:
              stack.pop_Object();
              return;
                         case error_lhs_optional_6:
              stack.pop_Object();
              return;
                         case versions:
              stack.pop_Object();
              return;
                         case versions_optional_7:
              stack.pop_Object();
              return;
                         case types_lhs:
              stack.pop_Object();
              return;
                         case types_lhs_optional_8:
              stack.pop_Object();
              return;
                         case attributes:
              stack.pop_Object();
              return;
                         case attributes_optional_9:
              stack.pop_Object();
              return;
                         case start_non_terminals:
              stack.pop_Object();
              return;
                         case start_non_terminals_optional_10:
              stack.pop_Object();
              return;
                         case production_lhs:
              stack.pop_Object();
              return;
                         case directive:
              stack.pop_Object();
              return;
                         case directive_list:
              stack.pop_Object();
              return;
                         case lexem:
              stack.pop_Object();
              return;
                         case tokens_list:
              stack.pop_Object();
              return;
                         case decl:
              stack.pop_Object();
              return;
                         case decls:
              stack.pop_Object();
              return;
                         case blank_lexem:
              stack.pop_Object();
              return;
                         case blanks_list:
              stack.pop_Object();
              return;
                         case comment_lexem:
              stack.pop_Object();
              return;
                         case comments_list:
              stack.pop_Object();
              return;
                         case branch_lexem:
              stack.pop_Object();
              return;
                         case banches_list:
              stack.pop_Object();
              return;
                         case import_:
              stack.pop_Object();
              return;
                         case import_list:
              stack.pop_Object();
              return;
                         case priority:
              stack.pop_Object();
              return;
                         case priority_list:
              stack.pop_Object();
              return;
                         case version:
              stack.pop_Object();
              return;
                         case version_list:
              stack.pop_Object();
              return;
                         case parent_version:
              stack.pop_Object();
              return;
                         case parent_version_optional_11:
              stack.pop_Object();
              return;
                         case vartypedef:
              stack.pop_Object();
              return;
                         case vartypedef_list:
              stack.pop_Object();
              return;
                         case variable:
              stack.pop_Object();
              return;
                         case type:
              stack.pop_Object();
              return;
                         case attribute:
              stack.pop_Object();
              return;
                         case attribute_list:
              stack.pop_Object();
              return;
                         case regex:
              stack.pop_Object();
              return;
                         case alias:
              stack.pop_Object();
              return;
                         case alias_optional_12:
              stack.pop_Object();
              return;
                         case type_optional_13:
              stack.pop_Object();
              return;
                         case regex_terminal_decl:
              stack.pop_Object();
              return;
                         case regex_terminal_decl_optional_14:
              stack.pop_Object();
              return;
                         case terminal_or_prod_priority:
              stack.pop_Object();
              return;
                         case terminal_or_prod_priority_optional_15:
              stack.pop_Object();
              return;
                         case type_optional_16:
              stack.pop_Object();
              return;
                         case terminal_or_prod_priority_optional_17:
              stack.pop_Object();
              return;
                         case terminal_or_prod_priority_optional_18:
              stack.pop_Object();
              return;
                         case startid:
              stack.pop_Object();
              return;
                         case starts_list:
              stack.pop_Object();
              return;
                         case type_optional_19:
              stack.pop_Object();
              return;
                         case plus_optional_20:
              stack.pop_Object();
              return;
                         case prod:
              stack.pop_Object();
              return;
                         case prods:
              stack.pop_Object();
              return;
                         case var:
              stack.pop_Object();
              return;
                         case varlist:
              stack.pop_Object();
              return;
                         case terminal_or_prod_priority_optional_21:
              stack.pop_Object();
              return;
                         case production_id:
              stack.pop_Object();
              return;
                         case production_id_optional_22:
              stack.pop_Object();
              return;
                         case production_version:
              stack.pop_Object();
              return;
                         case production_version_optional_23:
              stack.pop_Object();
              return;
                         case vargroup:
              stack.pop_Object();
              return;
                         case qmark_optional_24:
              stack.pop_Object();
              return;
                         case qmark_optional_25:
              stack.pop_Object();
              return;
                         case separator:
              stack.pop_Object();
              return;
                         case separator_optional_26:
              stack.pop_Object();
              return;
                         case separator_optional_27:
              stack.pop_Object();
              return;
                         case separator_optional_28:
              stack.pop_Object();
              return;
                         case separator_optional_29:
              stack.pop_Object();
              return;
                     }
        throw new AssertionError("unknown nonterminal "+nonTerminal);
      }
}
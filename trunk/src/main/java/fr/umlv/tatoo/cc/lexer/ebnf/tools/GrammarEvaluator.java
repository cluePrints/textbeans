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

/** 
 *  This class is generated - please do not edit it 
 */
public interface GrammarEvaluator {
  /** This methods is called after the reduction of the non terminal start
   *  by the grammar production start_def.
   *  <code>start ::= directives_lhs_optional_0 imports_lhs_optional_1 priorities_lhs_optional_2 token_lhs blank_lhs_optional_3 comment_lhs_optional_4 branch_lhs_optional_5 error_lhs_optional_6 versions_optional_7 types_lhs_optional_8 attributes_optional_9 start_non_terminals_optional_10 production_lhs</code>
   */
  public RootDefAST start_def(SimpleNodeAST<?> directives_lhs_optional,SimpleNodeAST<?> imports_lhs_optional,SimpleNodeAST<?> priorities_lhs_optional,SimpleNodeAST<?> token_lhs,SimpleNodeAST<?> blank_lhs_optional,SimpleNodeAST<?> comment_lhs_optional,SimpleNodeAST<?> branch_lhs_optional,SimpleNodeAST<?> error_lhs_optional,SimpleNodeAST<?> versions_optional,SimpleNodeAST<?> types_lhs_optional,SimpleNodeAST<?> attributes_optional,StartNonTerminalSetDefAST start_non_terminals_optional,SimpleNodeAST<?> production_lhs);
  /** This methods is called after the reduction of the non terminal directives_lhs
   *  by the grammar production directives_def.
   *  <code>directives_lhs ::= directivesdecl colon directive_list</code>
   */
  public SimpleNodeAST<?> directives_def(TokenAST<?> directivesdecl,TokenAST<?> colon,List<DirectiveDefAST> directive_list);
  /** This methods is called after the reduction of the non terminal directive
   *  by the grammar production directive_def.
   *  <code>directive ::= id</code>
   */
  public DirectiveDefAST directive_def(TokenAST<String> id);
  /** This methods is called after the reduction of the non terminal token_lhs
   *  by the grammar production token_def.
   *  <code>token_lhs ::= tokensdecl colon tokens_list</code>
   */
  public SimpleNodeAST<?> token_def(TokenAST<?> tokensdecl,TokenAST<?> colon,List<Node> tokens_list);
  /** This methods is called after the reduction of the non terminal production_lhs
   *  by the grammar production production_def.
   *  <code>production_lhs ::= productionsdecl colon decls</code>
   */
  public SimpleNodeAST<?> production_def(TokenAST<?> productionsdecl,TokenAST<?> colon,List<NonTerminalDefAST> decls);
  /** This methods is called after the reduction of the non terminal blank_lhs
   *  by the grammar production blank_def.
   *  <code>blank_lhs ::= blanksdecl colon blanks_list</code>
   */
  public SimpleNodeAST<?> blank_def(TokenAST<?> blanksdecl,TokenAST<?> colon,List<Node> blanks_list);
  /** This methods is called after the reduction of the non terminal comment_lhs
   *  by the grammar production comment_def.
   *  <code>comment_lhs ::= commentsdecl colon comments_list</code>
   */
  public SimpleNodeAST<?> comment_def(TokenAST<?> commentsdecl,TokenAST<?> colon,List<Node> comments_list);
  /** This methods is called after the reduction of the non terminal branch_lhs
   *  by the grammar production branch_def.
   *  <code>branch_lhs ::= branchesdecl colon banches_list</code>
   */
  public SimpleNodeAST<?> branch_def(TokenAST<?> branchesdecl,TokenAST<?> colon,List<TerminalDefAST> banches_list);
  /** This methods is called after the reduction of the non terminal imports_lhs
   *  by the grammar production imports_def.
   *  <code>imports_lhs ::= importsdecl colon import_list</code>
   */
  public SimpleNodeAST<?> imports_def(TokenAST<?> importsdecl,TokenAST<?> colon,List<ImportDefAST> import_list);
  /** This methods is called after the reduction of the non terminal import_
   *  by the grammar production import_def.
   *  <code>import_ ::= qualifiedid</code>
   */
  public ImportDefAST import_def(TokenAST<String> qualifiedid);
  /** This methods is called after the reduction of the non terminal priorities_lhs
   *  by the grammar production priorities_def.
   *  <code>priorities_lhs ::= prioritiesdecl colon priority_list</code>
   */
  public SimpleNodeAST<?> priorities_def(TokenAST<?> prioritiesdecl,TokenAST<?> colon,List<PriorityDefAST> priority_list);
  /** This methods is called after the reduction of the non terminal priority
   *  by the grammar production priority_def.
   *  <code>priority ::= id assign number assoc</code>
   */
  public PriorityDefAST priority_def(TokenAST<String> id,TokenAST<?> assign,TokenAST<Double> number,TokenAST<String> assoc);
  /** This methods is called after the reduction of the non terminal versions
   *  by the grammar production versions_def.
   *  <code>versions ::= versionsdecl colon version_list</code>
   */
  public SimpleNodeAST<?> versions_def(TokenAST<?> versionsdecl,TokenAST<?> colon,List<VersionDefAST> version_list);
  /** This methods is called after the reduction of the non terminal version
   *  by the grammar production version_def.
   *  <code>version ::= id parent_version_optional_11</code>
   */
  public VersionDefAST version_def(TokenAST<String> id,VersionVarAST parent_version_optional);
  /** This methods is called after the reduction of the non terminal types_lhs
   *  by the grammar production types_def.
   *  <code>types_lhs ::= typesdecl colon vartypedef_list</code>
   */
  public SimpleNodeAST<?> types_def(TokenAST<?> typesdecl,TokenAST<?> colon,List<VariableTypeDefAST> vartypedef_list);
  /** This methods is called after the reduction of the non terminal vartypedef
   *  by the grammar production vartype_def.
   *  <code>vartypedef ::= variable type</code>
   */
  public VariableTypeDefAST vartype_def(VariableVarAST variable,TypeVarAST type);
  /** This methods is called after the reduction of the non terminal variable
   *  by the grammar production variable_terminal.
   *  <code>variable ::= quote id quote</code>
   */
  public VariableVarAST variable_terminal(TokenAST<?> quote,TokenAST<String> id,TokenAST<?> quote2);
  /** This methods is called after the reduction of the non terminal variable
   *  by the grammar production variable_nonterminal.
   *  <code>variable ::= id</code>
   */
  public VariableVarAST variable_nonterminal(TokenAST<String> id);
  /** This methods is called after the reduction of the non terminal attributes
   *  by the grammar production attributes_def.
   *  <code>attributes ::= attributesdecl colon attribute_list</code>
   */
  public SimpleNodeAST<?> attributes_def(TokenAST<?> attributesdecl,TokenAST<?> colon,List<AttributeDefAST> attribute_list);
  /** This methods is called after the reduction of the non terminal attribute
   *  by the grammar production attribute_def.
   *  <code>attribute ::= id type</code>
   */
  public AttributeDefAST attribute_def(TokenAST<String> id,TypeVarAST type);
  /** This methods is called after the reduction of the non terminal parent_version
   *  by the grammar production parent_version_def.
   *  <code>parent_version ::= colon id</code>
   */
  public VersionVarAST parent_version_def(TokenAST<?> colon,TokenAST<String> id);
  /** This methods is called after the reduction of the non terminal lexem
   *  by the grammar production lexem_macro.
   *  <code>lexem ::= dollar id assign regex</code>
   */
  public Node lexem_macro(TokenAST<?> dollar,TokenAST<String> id,TokenAST<?> assign,SimpleNodeAST<String> regex);
  /** This methods is called after the reduction of the non terminal lexem
   *  by the grammar production lexem_terminal.
   *  <code>lexem ::= id alias_optional_12 type_optional_13 regex_terminal_decl_optional_14 terminal_or_prod_priority_optional_15</code>
   */
  public Node lexem_terminal(TokenAST<String> id,AliasDefAST alias_optional,TypeVarAST type_optional,SimpleNodeAST<String> regex_terminal_decl_optional,PriorityVarAST terminal_or_prod_priority_optional);
  /** This methods is called after the reduction of the non terminal alias
   *  by the grammar production alias_def.
   *  <code>alias ::= lpar quoted_name rpar</code>
   */
  public AliasDefAST alias_def(TokenAST<?> lpar,TokenAST<String> quoted_name,TokenAST<?> rpar);
  /** This methods is called after the reduction of the non terminal regex_terminal_decl
   *  by the grammar production regex_terminal_decl.
   *  <code>regex_terminal_decl ::= assign regex</code>
   */
  public SimpleNodeAST<String> regex_terminal_decl(TokenAST<?> assign,SimpleNodeAST<String> regex);
  /** This methods is called after the reduction of the non terminal comment_lexem
   *  by the grammar production comment_lexem_macro.
   *  <code>comment_lexem ::= dollar id assign regex</code>
   */
  public Node comment_lexem_macro(TokenAST<?> dollar,TokenAST<String> id,TokenAST<?> assign,SimpleNodeAST<String> regex);
  /** This methods is called after the reduction of the non terminal comment_lexem
   *  by the grammar production comment_lexem_terminal.
   *  <code>comment_lexem ::= id assign regex</code>
   */
  public Node comment_lexem_terminal(TokenAST<String> id,TokenAST<?> assign,SimpleNodeAST<String> regex);
  /** This methods is called after the reduction of the non terminal blank_lexem
   *  by the grammar production blank_lexem_macro.
   *  <code>blank_lexem ::= dollar id assign regex</code>
   */
  public Node blank_lexem_macro(TokenAST<?> dollar,TokenAST<String> id,TokenAST<?> assign,SimpleNodeAST<String> regex);
  /** This methods is called after the reduction of the non terminal blank_lexem
   *  by the grammar production blank_lexem_terminal.
   *  <code>blank_lexem ::= id assign regex</code>
   */
  public Node blank_lexem_terminal(TokenAST<String> id,TokenAST<?> assign,SimpleNodeAST<String> regex);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regex_quote.
   *  <code>regex ::= quote regexquote quote</code>
   */
  public SimpleNodeAST<String> regex_quote(TokenAST<?> quote,TokenAST<String> regexquote,TokenAST<?> quote2);
  /** This methods is called after the reduction of the non terminal regex
   *  by the grammar production regex_doublequote.
   *  <code>regex ::= doublequote regexdoublequote doublequote</code>
   */
  public SimpleNodeAST<String> regex_doublequote(TokenAST<?> doublequote,TokenAST<String> regexdoublequote,TokenAST<?> doublequote2);
  /** This methods is called after the reduction of the non terminal branch_lexem
   *  by the grammar production branch_lexem_terminal.
   *  <code>branch_lexem ::= id type_optional_16 terminal_or_prod_priority_optional_17</code>
   */
  public TerminalDefAST branch_lexem_terminal(TokenAST<String> id,TypeVarAST type_optional,PriorityVarAST terminal_or_prod_priority_optional);
  /** This methods is called after the reduction of the non terminal branch_lexem
   *  by the grammar production branch_eof_terminal.
   *  <code>branch_lexem ::= eof terminal_or_prod_priority_optional_18</code>
   */
  public TerminalDefAST branch_eof_terminal(TokenAST<String> eof,PriorityVarAST terminal_or_prod_priority_optional);
  /** This methods is called after the reduction of the non terminal terminal_or_prod_priority
   *  by the grammar production terminal_or_prod_priority.
   *  <code>terminal_or_prod_priority ::= lsqbracket id rsqbracket</code>
   */
  public PriorityVarAST terminal_or_prod_priority(TokenAST<?> lsqbracket,TokenAST<String> id,TokenAST<?> rsqbracket);
  /** This methods is called after the reduction of the non terminal type
   *  by the grammar production type_def.
   *  <code>type ::= colon qualifiedid</code>
   */
  public TypeVarAST type_def(TokenAST<?> colon,TokenAST<String> qualifiedid);
  /** This methods is called after the reduction of the non terminal start_non_terminals
   *  by the grammar production start_non_terminals_def.
   *  <code>start_non_terminals ::= startsdecl colon starts_list</code>
   */
  public StartNonTerminalSetDefAST start_non_terminals_def(TokenAST<?> startsdecl,TokenAST<?> colon,List<UnquotedIdVarAST> starts_list);
  /** This methods is called after the reduction of the non terminal startid
   *  by the grammar production startid_def.
   *  <code>startid ::= id</code>
   */
  public UnquotedIdVarAST startid_def(TokenAST<String> id);
  /** This methods is called after the reduction of the non terminal error_lhs
   *  by the grammar production error_def.
   *  <code>error_lhs ::= errordecl colon id</code>
   */
  public SimpleNodeAST<?> error_def(TokenAST<?> errordecl,TokenAST<?> colon,TokenAST<String> id);
  /** This methods is called after the reduction of the non terminal decl
   *  by the grammar production decl_productions.
   *  <code>decl ::= id type_optional_19 plus_optional_20 assign prods semicolon</code>
   */
  public NonTerminalDefAST decl_productions(TokenAST<String> id,TypeVarAST type_optional,TokenAST<?> plus_optional,TokenAST<?> assign,List<Node> prods,TokenAST<?> semicolon);
  /** This methods is called after the reduction of the non terminal prod
   *  by the grammar production prod_production.
   *  <code>prod ::= varlist terminal_or_prod_priority_optional_21 production_id_optional_22</code>
   */
  public Node prod_production(List<Node> varlist,PriorityVarAST terminal_or_prod_priority_optional,ProductionIdAndVersionDefAST production_id_optional);
  /** This methods is called after the reduction of the non terminal production_id
   *  by the grammar production production_id.
   *  <code>production_id ::= lbracket id production_version_optional_23 rbracket</code>
   */
  public ProductionIdAndVersionDefAST production_id(TokenAST<?> lbracket,TokenAST<String> id,VersionVarAST production_version_optional,TokenAST<?> rbracket);
  /** This methods is called after the reduction of the non terminal production_version
   *  by the grammar production production_version.
   *  <code>production_version ::= colon id</code>
   */
  public VersionVarAST production_version(TokenAST<?> colon,TokenAST<String> id);
  /** This methods is called after the reduction of the non terminal var
   *  by the grammar production var_group.
   *  <code>var ::= lpar vargroup rpar</code>
   */
  public Node var_group(TokenAST<?> lpar,List<Node> vargroup,TokenAST<?> rpar);
  /** This methods is called after the reduction of the non terminal var
   *  by the grammar production var_terminal.
   *  <code>var ::= quoted_name qmark_optional_24</code>
   */
  public Node var_terminal(TokenAST<String> quoted_name,TokenAST<?> qmark_optional);
  /** This methods is called after the reduction of the non terminal var
   *  by the grammar production var_nonterminal.
   *  <code>var ::= id qmark_optional_25</code>
   */
  public Node var_nonterminal(TokenAST<String> id,TokenAST<?> qmark_optional);
  /** This methods is called after the reduction of the non terminal var
   *  by the grammar production var_terminal_star.
   *  <code>var ::= quoted_name separator_optional_26 star</code>
   */
  public Node var_terminal_star(TokenAST<String> quoted_name,VariableVarAST separator_optional,TokenAST<?> star);
  /** This methods is called after the reduction of the non terminal var
   *  by the grammar production var_terminal_plus.
   *  <code>var ::= quoted_name separator_optional_27 plus</code>
   */
  public Node var_terminal_plus(TokenAST<String> quoted_name,VariableVarAST separator_optional,TokenAST<?> plus);
  /** This methods is called after the reduction of the non terminal var
   *  by the grammar production var_nonterminal_star.
   *  <code>var ::= id separator_optional_28 star</code>
   */
  public Node var_nonterminal_star(TokenAST<String> id,VariableVarAST separator_optional,TokenAST<?> star);
  /** This methods is called after the reduction of the non terminal var
   *  by the grammar production var_nonterminal_plus.
   *  <code>var ::= id separator_optional_29 plus</code>
   */
  public Node var_nonterminal_plus(TokenAST<String> id,VariableVarAST separator_optional,TokenAST<?> plus);
  /** This methods is called after the reduction of the non terminal separator
   *  by the grammar production separator_terminal.
   *  <code>separator ::= slash quote id quote</code>
   */
  public VariableVarAST separator_terminal(TokenAST<?> slash,TokenAST<?> quote,TokenAST<String> id,TokenAST<?> quote2);
  /** This methods is called after the reduction of the non terminal separator
   *  by the grammar production separator_non_terminal.
   *  <code>separator ::= slash id</code>
   */
  public VariableVarAST separator_non_terminal(TokenAST<?> slash,TokenAST<String> id);

  public void acceptStart(RootDefAST start);
}

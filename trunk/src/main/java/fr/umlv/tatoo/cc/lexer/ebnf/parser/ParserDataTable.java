package fr.umlv.tatoo.cc.lexer.ebnf.parser;

import fr.umlv.tatoo.cc.lexer.ebnf.parser.NonTerminalEnum;
import fr.umlv.tatoo.cc.lexer.ebnf.parser.ProductionEnum;
import fr.umlv.tatoo.cc.lexer.ebnf.parser.TerminalEnum;
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
    initdirectives_lhs_optional_0Gotoes();
    initerror_lhs_optional_6Gotoes();
    initterminal_or_prod_priority_optional_15Gotoes();
    initregex_terminal_decl_optional_14Gotoes();
    initimport_listGotoes();
    initcomment_lhsGotoes();
    initterminal_or_prod_priorityGotoes();
    initstart_non_terminals_optional_10Gotoes();
    initproduction_version_optional_23Gotoes();
    initqmark_optional_25Gotoes();
    initbanches_listGotoes();
    initparent_versionGotoes();
    initattributes_optional_9Gotoes();
    initattribute_listGotoes();
    initstartidGotoes();
    initterminal_or_prod_priority_optional_18Gotoes();
    initprodsGotoes();
    initalias_optional_12Gotoes();
    initcomment_lexemGotoes();
    initblank_lhs_optional_3Gotoes();
    initblank_lexemGotoes();
    initprodGotoes();
    initimports_lhsGotoes();
    initseparator_optional_28Gotoes();
    inittypes_lhs_optional_8Gotoes();
    initaliasGotoes();
    initerror_lhsGotoes();
    initproduction_versionGotoes();
    initbranch_lhs_optional_5Gotoes();
    initseparator_optional_26Gotoes();
    initblanks_listGotoes();
    initstartGotoes();
    initdeclGotoes();
    initattributeGotoes();
    initimports_lhs_optional_1Gotoes();
    initpriorities_lhs_optional_2Gotoes();
    initproduction_lhsGotoes();
    initplus_optional_20Gotoes();
    initstarts_listGotoes();
    initcomment_lhs_optional_4Gotoes();
    initpriorityGotoes();
    initproduction_idGotoes();
    initbranch_lhsGotoes();
    initvarGotoes();
    initpriorities_lhsGotoes();
    initbranch_lexemGotoes();
    initqmark_optional_24Gotoes();
    initvarlistGotoes();
    initdirectives_lhsGotoes();
    inittype_optional_13Gotoes();
    inittype_optional_16Gotoes();
    initversions_optional_7Gotoes();
    inittoken_lhsGotoes();
    initvariableGotoes();
    initimport_Gotoes();
    initdirectiveGotoes();
    initattributesGotoes();
    initseparator_optional_29Gotoes();
    initblank_lhsGotoes();
    initversionGotoes();
    initregex_terminal_declGotoes();
    initseparatorGotoes();
    initregexGotoes();
    inittype_optional_19Gotoes();
    initlexemGotoes();
    initvargroupGotoes();
    initseparator_optional_27Gotoes();
    initparent_version_optional_11Gotoes();
    initcomments_listGotoes();
    initvartypedef_listGotoes();
    inittokens_listGotoes();
    initstart_non_terminalsGotoes();
    initversionsGotoes();
    inittypeGotoes();
    initversion_listGotoes();
    initdirective_listGotoes();
    initdeclsGotoes();
    initterminal_or_prod_priority_optional_21Gotoes();
    inittypes_lhsGotoes();
    initpriority_listGotoes();
    initvartypedefGotoes();
    initterminal_or_prod_priority_optional_17Gotoes();
    initproduction_id_optional_22Gotoes();
    reduceseparator_optional_27_separator = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_27_separator,1,separator_optional_27Gotoes);
    reduceversion_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.version_list_rec,2,version_listGotoes);
    reduceqmark_optional_25_qmark = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.qmark_optional_25_qmark,1,qmark_optional_25Gotoes);
    reducealias_optional_12_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.alias_optional_12_empty,0,alias_optional_12Gotoes);
    reducealias_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.alias_def,3,aliasGotoes);
    reducestarts_list_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.starts_list_element,1,starts_listGotoes);
    reduceseparator_optional_26_separator = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_26_separator,1,separator_optional_26Gotoes);
    reducecomment_lexem_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.comment_lexem_terminal,3,comment_lexemGotoes);
    reduceqmark_optional_24_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.qmark_optional_24_empty,0,qmark_optional_24Gotoes);
    reducetype_optional_13_type = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.type_optional_13_type,1,type_optional_13Gotoes);
    reduceprods_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.prods_element,1,prodsGotoes);
    reducevartype_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.vartype_def,2,vartypedefGotoes);
    reducepriority_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.priority_def,4,priorityGotoes);
    reducepriority_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.priority_list_rec,2,priority_listGotoes);
    reducetype_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.type_def,2,typeGotoes);
    reduceproduction_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.production_id,4,production_idGotoes);
    reduceblanks_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.blanks_list_empty,0,blanks_listGotoes);
    reducelexem_macro = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.lexem_macro,4,lexemGotoes);
    reducepriorities_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.priorities_def,3,priorities_lhsGotoes);
    reducestart_non_terminals_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.start_non_terminals_def,3,start_non_terminalsGotoes);
    reduceimport_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.import_list_rec,2,import_listGotoes);
    reduceblank_lhs_optional_3_blank_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.blank_lhs_optional_3_blank_lhs,1,blank_lhs_optional_3Gotoes);
    reducevar_terminal_star = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.var_terminal_star,3,varGotoes);
    reduceparent_version_optional_11_parent_version = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parent_version_optional_11_parent_version,1,parent_version_optional_11Gotoes);
    reducestart_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.start_def,13,startGotoes);
    reduceimports_lhs_optional_1_imports_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.imports_lhs_optional_1_imports_lhs,1,imports_lhs_optional_1Gotoes);
    reduceversion_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.version_list_empty,0,version_listGotoes);
    reducetype_optional_19_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.type_optional_19_empty,0,type_optional_19Gotoes);
    reducecomment_lhs_optional_4_comment_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.comment_lhs_optional_4_comment_lhs,1,comment_lhs_optional_4Gotoes);
    reducebanches_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.banches_list_empty,0,banches_listGotoes);
    reduceversions_optional_7_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.versions_optional_7_empty,0,versions_optional_7Gotoes);
    reduceterminal_or_prod_priority_optional_15_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_15_empty,0,terminal_or_prod_priority_optional_15Gotoes);
    reduceblanks_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.blanks_list_rec,2,blanks_listGotoes);
    reducecomments_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.comments_list_rec,2,comments_listGotoes);
    reduceregex_terminal_decl_optional_14_regex_terminal_decl = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regex_terminal_decl_optional_14_regex_terminal_decl,1,regex_terminal_decl_optional_14Gotoes);
    reduceparent_version_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parent_version_def,2,parent_versionGotoes);
    reduceblank_lexem_macro = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.blank_lexem_macro,4,blank_lexemGotoes);
    reduceblank_lexem_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.blank_lexem_terminal,3,blank_lexemGotoes);
    reduceregex_terminal_decl = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regex_terminal_decl,2,regex_terminal_declGotoes);
    reducestartid_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.startid_def,1,startidGotoes);
    reducecomment_lhs_optional_4_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.comment_lhs_optional_4_empty,0,comment_lhs_optional_4Gotoes);
    reducebranch_lhs_optional_5_branch_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.branch_lhs_optional_5_branch_lhs,1,branch_lhs_optional_5Gotoes);
    reduceattribute_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.attribute_list_empty,0,attribute_listGotoes);
    reducevar_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.var_terminal,2,varGotoes);
    reducebranch_lexem_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.branch_lexem_terminal,3,branch_lexemGotoes);
    reduceterminal_or_prod_priority_optional_18_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_18_empty,0,terminal_or_prod_priority_optional_18Gotoes);
    reduceproduction_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.production_def,3,production_lhsGotoes);
    reduceversions_optional_7_versions = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.versions_optional_7_versions,1,versions_optional_7Gotoes);
    reduceattributes_optional_9_attributes = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.attributes_optional_9_attributes,1,attributes_optional_9Gotoes);
    reducevar_terminal_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.var_terminal_plus,3,varGotoes);
    reducevartypedef_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.vartypedef_list_empty,0,vartypedef_listGotoes);
    reducevarlist_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.varlist_empty,0,varlistGotoes);
    reducevar_group = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.var_group,3,varGotoes);
    reducevartypedef_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.vartypedef_list_rec,2,vartypedef_listGotoes);
    reducevar_nonterminal_star = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.var_nonterminal_star,3,varGotoes);
    reducedirectives_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.directives_def,3,directives_lhsGotoes);
    reduceprod_production = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.prod_production,3,prodGotoes);
    reducepriority_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.priority_list_empty,0,priority_listGotoes);
    reduceblank_lhs_optional_3_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.blank_lhs_optional_3_empty,0,blank_lhs_optional_3Gotoes);
    reducecomments_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.comments_list_empty,0,comments_listGotoes);
    reducestarts_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.starts_list_rec,2,starts_listGotoes);
    reducebranch_lhs_optional_5_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.branch_lhs_optional_5_empty,0,branch_lhs_optional_5Gotoes);
    reducecomment_lexem_macro = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.comment_lexem_macro,4,comment_lexemGotoes);
    reducelexem_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.lexem_terminal,5,lexemGotoes);
    reducevar_nonterminal_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.var_nonterminal_plus,3,varGotoes);
    reduceattributes_optional_9_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.attributes_optional_9_empty,0,attributes_optional_9Gotoes);
    reducetype_optional_19_type = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.type_optional_19_type,1,type_optional_19Gotoes);
    reducedirective_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.directive_def,1,directiveGotoes);
    reduceimports_lhs_optional_1_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.imports_lhs_optional_1_empty,0,imports_lhs_optional_1Gotoes);
    reduceterminal_or_prod_priority = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority,3,terminal_or_prod_priorityGotoes);
    reducetype_optional_16_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.type_optional_16_empty,0,type_optional_16Gotoes);
    reducetoken_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.token_def,3,token_lhsGotoes);
    reducevariable_nonterminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.variable_nonterminal,1,variableGotoes);
    reduceattributes_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.attributes_def,3,attributesGotoes);
    reduceseparator_non_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_non_terminal,2,separatorGotoes);
    reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_17_terminal_or_prod_priority,1,terminal_or_prod_priority_optional_17Gotoes);
    reducevar_nonterminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.var_nonterminal,2,varGotoes);
    reducetypes_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.types_def,3,types_lhsGotoes);
    reducecomment_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.comment_def,3,comment_lhsGotoes);
    reduceimport_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.import_def,1,import_Gotoes);
    reducepriorities_lhs_optional_2_priorities_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.priorities_lhs_optional_2_priorities_lhs,1,priorities_lhs_optional_2Gotoes);
    reduceversion_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.version_def,2,versionGotoes);
    reduceseparator_optional_28_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_28_empty,0,separator_optional_28Gotoes);
    reducedecls_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.decls_rec,2,declsGotoes);
    reducevargroup_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.vargroup_rec,2,vargroupGotoes);
    reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_15_terminal_or_prod_priority,1,terminal_or_prod_priority_optional_15Gotoes);
    reduceregex_quote = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regex_quote,3,regexGotoes);
    reduceerror_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.error_def,3,error_lhsGotoes);
    reduceparent_version_optional_11_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.parent_version_optional_11_empty,0,parent_version_optional_11Gotoes);
    reduceplus_optional_20_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.plus_optional_20_empty,0,plus_optional_20Gotoes);
    reducedirectives_lhs_optional_0_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.directives_lhs_optional_0_empty,0,directives_lhs_optional_0Gotoes);
    reducetype_optional_13_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.type_optional_13_empty,0,type_optional_13Gotoes);
    reduceversions_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.versions_def,3,versionsGotoes);
    reduceproduction_id_optional_22_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.production_id_optional_22_empty,0,production_id_optional_22Gotoes);
    reduceerror_lhs_optional_6_error_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.error_lhs_optional_6_error_lhs,1,error_lhs_optional_6Gotoes);
    reduceblank_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.blank_def,3,blank_lhsGotoes);
    reducedirective_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.directive_list_empty,0,directive_listGotoes);
    reduceattribute_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.attribute_list_rec,2,attribute_listGotoes);
    reduceproduction_version_optional_23_production_version = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.production_version_optional_23_production_version,1,production_version_optional_23Gotoes);
    reducetypes_lhs_optional_8_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.types_lhs_optional_8_empty,0,types_lhs_optional_8Gotoes);
    reduceseparator_optional_27_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_27_empty,0,separator_optional_27Gotoes);
    reduceimports_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.imports_def,3,imports_lhsGotoes);
    reduceerror_lhs_optional_6_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.error_lhs_optional_6_empty,0,error_lhs_optional_6Gotoes);
    reducedirective_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.directive_list_rec,2,directive_listGotoes);
    reducevargroup_element = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.vargroup_element,1,vargroupGotoes);
    reduceregex_terminal_decl_optional_14_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regex_terminal_decl_optional_14_empty,0,regex_terminal_decl_optional_14Gotoes);
    reduceterminal_or_prod_priority_optional_21_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_21_empty,0,terminal_or_prod_priority_optional_21Gotoes);
    reducebranch_eof_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.branch_eof_terminal,2,branch_lexemGotoes);
    reduceplus_optional_20_plus = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.plus_optional_20_plus,1,plus_optional_20Gotoes);
    reduceseparator_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_terminal,4,separatorGotoes);
    reducebanches_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.banches_list_rec,2,banches_listGotoes);
    reducestart_non_terminals_optional_10_start_non_terminals = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.start_non_terminals_optional_10_start_non_terminals,1,start_non_terminals_optional_10Gotoes);
    reduceseparator_optional_26_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_26_empty,0,separator_optional_26Gotoes);
    reducetokens_list_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.tokens_list_rec,2,tokens_listGotoes);
    reducetypes_lhs_optional_8_types_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.types_lhs_optional_8_types_lhs,1,types_lhs_optional_8Gotoes);
    reduceterminal_or_prod_priority_optional_17_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_17_empty,0,terminal_or_prod_priority_optional_17Gotoes);
    reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_21_terminal_or_prod_priority,1,terminal_or_prod_priority_optional_21Gotoes);
    reducedecls_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.decls_empty,0,declsGotoes);
    reducestart_non_terminals_optional_10_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.start_non_terminals_optional_10_empty,0,start_non_terminals_optional_10Gotoes);
    reducedecl_productions = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.decl_productions,6,declGotoes);
    reducevarlist_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.varlist_rec,2,varlistGotoes);
    reduceprods_rec = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.prods_rec,3,prodsGotoes);
    reduceproduction_version_optional_23_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.production_version_optional_23_empty,0,production_version_optional_23Gotoes);
    reduceregex_doublequote = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.regex_doublequote,3,regexGotoes);
    reducetype_optional_16_type = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.type_optional_16_type,1,type_optional_16Gotoes);
    reduceproduction_id_optional_22_production_id = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.production_id_optional_22_production_id,1,production_id_optional_22Gotoes);
    reduceseparator_optional_28_separator = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_28_separator,1,separator_optional_28Gotoes);
    reducebranch_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.branch_def,3,branch_lhsGotoes);
    reducedirectives_lhs_optional_0_directives_lhs = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.directives_lhs_optional_0_directives_lhs,1,directives_lhs_optional_0Gotoes);
    reduceattribute_def = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.attribute_def,2,attributeGotoes);
    reduceseparator_optional_29_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_29_empty,0,separator_optional_29Gotoes);
    reduceimport_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.import_list_empty,0,import_listGotoes);
    reduceqmark_optional_24_qmark = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.qmark_optional_24_qmark,1,qmark_optional_24Gotoes);
    reducetokens_list_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.tokens_list_empty,0,tokens_listGotoes);
    reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.terminal_or_prod_priority_optional_18_terminal_or_prod_priority,1,terminal_or_prod_priority_optional_18Gotoes);
    reduceproduction_version = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.production_version,2,production_versionGotoes);
    reducepriorities_lhs_optional_2_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.priorities_lhs_optional_2_empty,0,priorities_lhs_optional_2Gotoes);
    reduceqmark_optional_25_empty = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.qmark_optional_25_empty,0,qmark_optional_25Gotoes);
    reducealias_optional_12_alias = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.alias_optional_12_alias,1,alias_optional_12Gotoes);
    reduceseparator_optional_29_separator = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.separator_optional_29_separator,1,separator_optional_29Gotoes);
    reducevariable_terminal = new ReduceAction<TerminalEnum,ProductionEnum,VersionEnum>(ProductionEnum.variable_terminal,3,variableGotoes);
    shift189 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(189);
    shift151 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(151);
    shift90 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(90);
    shift122 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(122);
    shift69 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(69);
    shift159 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(159);
    shift143 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(143);
    shift130 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(130);
    shift39 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(39);
    shift139 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(139);
    shift18 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(18);
    shift43 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(43);
    shift96 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(96);
    shift131 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(131);
    shift19 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(19);
    shift162 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(162);
    shift168 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(168);
    shift33 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(33);
    shift178 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(178);
    shift29 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(29);
    shift27 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(27);
    shift110 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(110);
    shift99 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(99);
    shift104 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(104);
    shift36 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(36);
    shift4 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(4);
    shift161 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(161);
    shift24 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(24);
    shift7 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(7);
    shift61 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(61);
    shift138 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(138);
    shift177 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(177);
    shift52 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(52);
    shift111 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(111);
    shift60 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(60);
    shift26 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(26);
    shift34 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(34);
    shift74 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(74);
    shift85 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(85);
    shift72 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(72);
    shift176 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(176);
    shift100 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(100);
    shift181 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(181);
    shift97 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(97);
    shift103 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(103);
    shift114 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(114);
    shift102 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(102);
    shift123 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(123);
    shift17 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(17);
    shift37 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(37);
    shift157 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(157);
    shift76 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(76);
    shift62 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(62);
    shift83 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(83);
    shift152 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(152);
    shift28 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(28);
    shift38 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(38);
    shift125 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(125);
    shift2 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(2);
    shift1 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(1);
    shift77 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(77);
    shift175 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(175);
    shift32 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(32);
    shift46 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(46);
    shift150 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(150);
    shift70 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(70);
    shift50 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(50);
    shift170 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(170);
    shift57 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(57);
    shift113 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(113);
    shift149 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(149);
    shift16 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(16);
    shift187 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(187);
    shift65 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(65);
    shift13 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(13);
    shift42 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(42);
    shift31 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(31);
    shift14 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(14);
    shift145 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(145);
    shift73 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(73);
    shift116 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(116);
    shift153 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(153);
    shift82 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(82);
    shift58 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(58);
    shift8 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(8);
    shift23 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(23);
    shift95 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(95);
    shift165 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(165);
    shift10 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(10);
    shift115 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(115);
    shift147 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(147);
    shift64 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(64);
    shift51 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(51);
    shift132 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(132);
    shift30 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(30);
    shift141 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(141);
    shift148 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(148);
    shift160 = new ShiftAction<TerminalEnum,ProductionEnum,VersionEnum>(160);
    error0 = new ErrorAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    branch0 = new BranchAction<TerminalEnum,ProductionEnum,VersionEnum>("parse error");
    initrparArray();
    initpipeArray();
    initdirectivesdeclArray();
    initslashArray();
    initregexquoteArray();
    initassignArray();
    inittypesdeclArray();
    initattributesdeclArray();
    initdoublequoteArray();
    initquoted_nameArray();
    initregexdoublequoteArray();
    initerrordeclArray();
    initsemicolonArray();
    initrbracketArray();
    initimportsdeclArray();
    initblanksdeclArray();
    initversionsdeclArray();
    initidArray();
    initstartsdeclArray();
    initbranchesdeclArray();
    initlsqbracketArray();
    initquoteArray();
    initproductionsdeclArray();
    initcolonArray();
    inittokensdeclArray();
    initassocArray();
    initcommentsdeclArray();
    initnumberArray();
    initlbracketArray();
    initqualifiedidArray();
    initdollarArray();
    initrsqbracketArray();
    initstarArray();
    initeofArray();
    initqmarkArray();
    initprioritiesdeclArray();
    initplusArray();
    initlparArray();
    init__eof__Array();
    EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]> tableMap =
      new EnumMap<TerminalEnum,Action<TerminalEnum,ProductionEnum,VersionEnum>[]>(TerminalEnum.class);
      
    tableMap.put(TerminalEnum.rpar,rparArray);
    tableMap.put(TerminalEnum.pipe,pipeArray);
    tableMap.put(TerminalEnum.directivesdecl,directivesdeclArray);
    tableMap.put(TerminalEnum.slash,slashArray);
    tableMap.put(TerminalEnum.regexquote,regexquoteArray);
    tableMap.put(TerminalEnum.assign,assignArray);
    tableMap.put(TerminalEnum.typesdecl,typesdeclArray);
    tableMap.put(TerminalEnum.attributesdecl,attributesdeclArray);
    tableMap.put(TerminalEnum.doublequote,doublequoteArray);
    tableMap.put(TerminalEnum.quoted_name,quoted_nameArray);
    tableMap.put(TerminalEnum.regexdoublequote,regexdoublequoteArray);
    tableMap.put(TerminalEnum.errordecl,errordeclArray);
    tableMap.put(TerminalEnum.semicolon,semicolonArray);
    tableMap.put(TerminalEnum.rbracket,rbracketArray);
    tableMap.put(TerminalEnum.importsdecl,importsdeclArray);
    tableMap.put(TerminalEnum.blanksdecl,blanksdeclArray);
    tableMap.put(TerminalEnum.versionsdecl,versionsdeclArray);
    tableMap.put(TerminalEnum.id,idArray);
    tableMap.put(TerminalEnum.startsdecl,startsdeclArray);
    tableMap.put(TerminalEnum.branchesdecl,branchesdeclArray);
    tableMap.put(TerminalEnum.lsqbracket,lsqbracketArray);
    tableMap.put(TerminalEnum.quote,quoteArray);
    tableMap.put(TerminalEnum.productionsdecl,productionsdeclArray);
    tableMap.put(TerminalEnum.colon,colonArray);
    tableMap.put(TerminalEnum.tokensdecl,tokensdeclArray);
    tableMap.put(TerminalEnum.assoc,assocArray);
    tableMap.put(TerminalEnum.commentsdecl,commentsdeclArray);
    tableMap.put(TerminalEnum.number,numberArray);
    tableMap.put(TerminalEnum.lbracket,lbracketArray);
    tableMap.put(TerminalEnum.qualifiedid,qualifiedidArray);
    tableMap.put(TerminalEnum.dollar,dollarArray);
    tableMap.put(TerminalEnum.rsqbracket,rsqbracketArray);
    tableMap.put(TerminalEnum.star,starArray);
    tableMap.put(TerminalEnum.eof,eofArray);
    tableMap.put(TerminalEnum.qmark,qmarkArray);
    tableMap.put(TerminalEnum.prioritiesdecl,prioritiesdeclArray);
    tableMap.put(TerminalEnum.plus,plusArray);
    tableMap.put(TerminalEnum.lpar,lparArray);
    tableMap.put(TerminalEnum.__eof__,__eof__Array);
    initBranchArrayTable();
    
    StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] tableMetadata = createStateMetadataTable();
    
    EnumMap<NonTerminalEnum,Integer> tableStarts =
      new EnumMap<NonTerminalEnum,Integer>(NonTerminalEnum.class);
    tableStarts.put(NonTerminalEnum.start,0);
    table = new ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>(tableMap,branchArrayTable,tableMetadata,tableStarts,VersionEnum.values(),200,TerminalEnum.__eof__,null);
  } 

  // metadata aren't stored in local vars because it freak-out the register allocator of android
  @SuppressWarnings("unchecked")
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[] createStateMetadataTable() {
        metadata0colon_metadata0reduceversion_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceversion_list_empty);
    metadata0priority_metadata0reducepriority_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.priority,reducepriority_list_rec);
    metadata0regex_terminal_decl_metadata0reduceregex_terminal_decl_optional_14_regex_terminal_decl = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl);
    metadata0quote_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,null);
    metadata0vargroup_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.vargroup,null);
    metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority);
    metadata0type_metadata0reducetype_optional_19_type = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type,reducetype_optional_19_type);
    metadata0id_metadata0reducestartid_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducestartid_def);
    metadata0pipe_metadata0reducevarlist_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.pipe,reducevarlist_empty);
    metadata0decls_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.decls,null);
    metadata0colon_metadata0reduceblanks_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceblanks_list_empty);
    metadata0versionsdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.versionsdecl,null);
    metadata0error_lhs_metadata0reduceerror_lhs_optional_6_error_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.error_lhs,reduceerror_lhs_optional_6_error_lhs);
    metadata0type_optional_19_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type_optional_19,null);
    metadata0plus_metadata0reduceplus_optional_20_plus = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,reduceplus_optional_20_plus);
    metadata0types_lhs_metadata0reducetypes_lhs_optional_8_types_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.types_lhs,reducetypes_lhs_optional_8_types_lhs);
    metadata0star_metadata0reducevar_nonterminal_star = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,reducevar_nonterminal_star);
    metadata0start_non_terminals_optional_10_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.start_non_terminals_optional_10,null);
    metadata0typesdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.typesdecl,null);
    metadata0terminal_or_prod_priority_optional_17_metadata0reducebranch_lexem_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority_optional_17,reducebranch_lexem_terminal);
    metadata0qmark_metadata0reduceqmark_optional_25_qmark = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.qmark,reduceqmark_optional_25_qmark);
    metadata0qmark_optional_25_metadata0reducevar_nonterminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.qmark_optional_25,reducevar_nonterminal);
    metadata0production_id_metadata0reduceproduction_id_optional_22_production_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.production_id,reduceproduction_id_optional_22_production_id);
    metadata0quote_metadata0reduceregex_quote = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceregex_quote);
    metadata0id_metadata0reducevariable_nonterminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducevariable_nonterminal);
    metadata0dollar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.dollar,null);
    metadata0regexquote_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.regexquote,null);
    metadata0doublequote_metadata0reduceregex_doublequote = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doublequote,reduceregex_doublequote);
    metadata0token_lhs_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.token_lhs,null);
    metadata0semicolon_metadata0reducedecl_productions = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.semicolon,reducedecl_productions);
    metadata0qmark_optional_24_metadata0reducevar_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.qmark_optional_24,reducevar_terminal);
    metadata0id_metadata0reduceseparator_non_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceseparator_non_terminal);
    metadata0rsqbracket_metadata0reduceterminal_or_prod_priority = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rsqbracket,reduceterminal_or_prod_priority);
    metadata0regex_terminal_decl_optional_14_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex_terminal_decl_optional_14,null);
    metadata0start_non_terminals_metadata0reducestart_non_terminals_optional_10_start_non_terminals = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.start_non_terminals,reducestart_non_terminals_optional_10_start_non_terminals);
    metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority);
    metadata0id_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,null);
    metadata0blanksdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.blanksdecl,null);
    metadata0lexem_metadata0reducetokens_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.lexem,reducetokens_list_rec);
    metadata0alias_optional_12_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.alias_optional_12,null);
    metadata0import_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.import_list,null);
    metadata0null_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(null,null);
    metadata0blank_lhs_optional_3_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.blank_lhs_optional_3,null);
    metadata0comment_lexem_metadata0reducecomments_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.comment_lexem,reducecomments_list_rec);
    metadata0colon_metadata0reducepriority_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reducepriority_list_empty);
    metadata0blank_lhs_metadata0reduceblank_lhs_optional_3_blank_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.blank_lhs,reduceblank_lhs_optional_3_blank_lhs);
    metadata0directives_lhs_metadata0reducedirectives_lhs_optional_0_directives_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.directives_lhs,reducedirectives_lhs_optional_0_directives_lhs);
    metadata0priorities_lhs_optional_2_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.priorities_lhs_optional_2,null);
    metadata0prod_metadata0reduceprods_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.prod,reduceprods_rec);
    metadata0tokens_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.tokens_list,null);
    metadata0vartypedef_metadata0reducevartypedef_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.vartypedef,reducevartypedef_list_rec);
    metadata0startsdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.startsdecl,null);
    metadata0versions_optional_7_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.versions_optional_7,null);
    metadata0tokensdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.tokensdecl,null);
    metadata0lpar_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lpar,null);
    metadata0directive_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.directive_list,null);
    metadata0error_lhs_optional_6_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.error_lhs_optional_6,null);
    metadata0terminal_or_prod_priority_optional_21_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority_optional_21,null);
    metadata0type_metadata0reduceattribute_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type,reduceattribute_def);
    metadata0variable_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.variable,null);
    metadata0quote_metadata0reducevariable_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reducevariable_terminal);
    metadata0colon_metadata0reducedecls_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reducedecls_empty);
    metadata0regex_metadata0reducecomment_lexem_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex,reducecomment_lexem_terminal);
    metadata0qualifiedid_metadata0reducetype_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.qualifiedid,reducetype_def);
    metadata0separator_optional_29_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.separator_optional_29,null);
    metadata0doublequote_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.doublequote,null);
    metadata0var_metadata0reducevarlist_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.var,reducevarlist_rec);
    metadata0star_metadata0reducevar_terminal_star = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.star,reducevar_terminal_star);
    metadata0id_metadata0reducedirective_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reducedirective_def);
    metadata0directivesdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.directivesdecl,null);
    metadata0parent_version_optional_11_metadata0reduceversion_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parent_version_optional_11,reduceversion_def);
    metadata0branch_lhs_metadata0reducebranch_lhs_optional_5_branch_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.branch_lhs,reducebranch_lhs_optional_5_branch_lhs);
    metadata0qualifiedid_metadata0reduceimport_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.qualifiedid,reduceimport_def);
    metadata0var_metadata0reducevargroup_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.var,reducevargroup_rec);
    metadata0rpar_metadata0reducevar_group = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reducevar_group);
    metadata0types_lhs_optional_8_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.types_lhs_optional_8,null);
    metadata0regex_metadata0reduceregex_terminal_decl = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex,reduceregex_terminal_decl);
    metadata0prods_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.prods,null);
    metadata0version_metadata0reduceversion_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.version,reduceversion_list_rec);
    metadata0priority_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.priority_list,null);
    metadata0__eof___metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.__eof__,null);
    metadata0id_metadata0reduceproduction_version = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceproduction_version);
    metadata0colon_metadata0reduceimport_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceimport_list_empty);
    metadata0blanks_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.blanks_list,null);
    metadata0colon_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,null);
    metadata0priorities_lhs_metadata0reducepriorities_lhs_optional_2_priorities_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.priorities_lhs,reducepriorities_lhs_optional_2_priorities_lhs);
    metadata0id_metadata0reduceerror_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceerror_def);
    metadata0versions_metadata0reduceversions_optional_7_versions = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.versions,reduceversions_optional_7_versions);
    metadata0id_metadata0reduceparent_version_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.id,reduceparent_version_def);
    metadata0varlist_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.varlist,null);
    metadata0banches_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.banches_list,null);
    metadata0rbracket_metadata0reduceproduction_id = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rbracket,reduceproduction_id);
    metadata0lbracket_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lbracket,null);
    metadata0lsqbracket_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.lsqbracket,null);
    metadata0start_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.start,null);
    metadata0terminal_or_prod_priority_optional_15_metadata0reducelexem_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority_optional_15,reducelexem_terminal);
    metadata0regex_metadata0reduceblank_lexem_macro = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex,reduceblank_lexem_macro);
    metadata0vartypedef_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.vartypedef_list,null);
    metadata0startid_metadata0reducestarts_list_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.startid,reducestarts_list_element);
    metadata0startid_metadata0reducestarts_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.startid,reducestarts_list_rec);
    metadata0attribute_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.attribute_list,null);
    metadata0colon_metadata0reduceattribute_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reduceattribute_list_empty);
    metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority);
    metadata0quoted_name_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quoted_name,null);
    metadata0colon_metadata0reducecomments_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reducecomments_list_empty);
    metadata0plus_metadata0reducevar_nonterminal_plus = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,reducevar_nonterminal_plus);
    metadata0type_optional_13_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type_optional_13,null);
    metadata0colon_metadata0reducebanches_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reducebanches_list_empty);
    metadata0type_metadata0reducevartype_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type,reducevartype_def);
    metadata0production_id_optional_22_metadata0reduceprod_production = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.production_id_optional_22,reduceprod_production);
    metadata0type_metadata0reducetype_optional_13_type = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type,reducetype_optional_13_type);
    metadata0regex_metadata0reducecomment_lexem_macro = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex,reducecomment_lexem_macro);
    metadata0branch_lexem_metadata0reducebanches_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.branch_lexem,reducebanches_list_rec);
    metadata0import__metadata0reduceimport_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.import_,reduceimport_list_rec);
    metadata0colon_metadata0reducedirective_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reducedirective_list_empty);
    metadata0imports_lhs_metadata0reduceimports_lhs_optional_1_imports_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.imports_lhs,reduceimports_lhs_optional_1_imports_lhs);
    metadata0starts_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.starts_list,null);
    metadata0assign_metadata0reducevarlist_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,reducevarlist_empty);
    metadata0branch_lhs_optional_5_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.branch_lhs_optional_5,null);
    metadata0type_metadata0reducetype_optional_16_type = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type,reducetype_optional_16_type);
    metadata0eof_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.eof,null);
    metadata0version_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.version_list,null);
    metadata0rpar_metadata0reducealias_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.rpar,reducealias_def);
    metadata0comment_lhs_optional_4_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.comment_lhs_optional_4,null);
    metadata0separator_optional_28_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.separator_optional_28,null);
    metadata0attributes_metadata0reduceattributes_optional_9_attributes = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.attributes,reduceattributes_optional_9_attributes);
    metadata0comments_list_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.comments_list,null);
    metadata0branchesdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.branchesdecl,null);
    metadata0separator_optional_26_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.separator_optional_26,null);
    metadata0production_version_optional_23_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.production_version_optional_23,null);
    metadata0number_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.number,null);
    metadata0type_optional_16_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.type_optional_16,null);
    metadata0colon_metadata0reducetokens_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reducetokens_list_empty);
    metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority,reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority);
    metadata0commentsdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.commentsdecl,null);
    metadata0production_lhs_metadata0reducestart_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.production_lhs,reducestart_def);
    metadata0alias_metadata0reducealias_optional_12_alias = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.alias,reducealias_optional_12_alias);
    metadata0errordecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.errordecl,null);
    metadata0assign_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assign,null);
    metadata0colon_metadata0reducevartypedef_list_empty = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.colon,reducevartypedef_list_empty);
    metadata0assoc_metadata0reducepriority_def = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.assoc,reducepriority_def);
    metadata0quote_metadata0reduceseparator_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.quote,reduceseparator_terminal);
    metadata0productionsdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.productionsdecl,null);
    metadata0regex_metadata0reducelexem_macro = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex,reducelexem_macro);
    metadata0parent_version_metadata0reduceparent_version_optional_11_parent_version = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.parent_version,reduceparent_version_optional_11_parent_version);
    metadata0terminal_or_prod_priority_optional_18_metadata0reducebranch_eof_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.terminal_or_prod_priority_optional_18,reducebranch_eof_terminal);
    metadata0attribute_metadata0reduceattribute_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.attribute,reduceattribute_list_rec);
    metadata0imports_lhs_optional_1_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.imports_lhs_optional_1,null);
    metadata0prod_metadata0reduceprods_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.prod,reduceprods_element);
    metadata0comment_lhs_metadata0reducecomment_lhs_optional_4_comment_lhs = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.comment_lhs,reducecomment_lhs_optional_4_comment_lhs);
    metadata0directive_metadata0reducedirective_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.directive,reducedirective_list_rec);
    metadata0slash_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.slash,null);
    metadata0var_metadata0reducevargroup_element = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.var,reducevargroup_element);
    metadata0plus_optional_20_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.plus_optional_20,null);
    metadata0blank_lexem_metadata0reduceblanks_list_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.blank_lexem,reduceblanks_list_rec);
    metadata0plus_metadata0reducevar_terminal_plus = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.plus,reducevar_terminal_plus);
    metadata0production_version_metadata0reduceproduction_version_optional_23_production_version = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.production_version,reduceproduction_version_optional_23_production_version);
    metadata0regexdoublequote_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.regexdoublequote,null);
    metadata0separator_optional_27_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.separator_optional_27,null);
    metadata0attributes_optional_9_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.attributes_optional_9,null);
    metadata0qmark_metadata0reduceqmark_optional_24_qmark = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.qmark,reduceqmark_optional_24_qmark);
    metadata0attributesdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.attributesdecl,null);
    metadata0decl_metadata0reducedecls_rec = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.decl,reducedecls_rec);
    metadata0regex_metadata0reduceblank_lexem_terminal = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.regex,reduceblank_lexem_terminal);
    metadata0separator_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.separator,null);
    metadata0prioritiesdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.prioritiesdecl,null);
    metadata0importsdecl_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithTerminal(TerminalEnum.importsdecl,null);
    metadata0directives_lhs_optional_0_metadata0null = StateMetadata.<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>createAllVersionWithNonTerminal(NonTerminalEnum.directives_lhs_optional_0,null);

    return (StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum>[])new StateMetadata<?,?,?,?>[]{metadata0null_metadata0null,metadata0directivesdecl_metadata0null,metadata0colon_metadata0reducedirective_list_empty,metadata0directive_list_metadata0null,metadata0id_metadata0reducedirective_def,metadata0directive_metadata0reducedirective_list_rec,metadata0directives_lhs_optional_0_metadata0null,metadata0importsdecl_metadata0null,metadata0colon_metadata0reduceimport_list_empty,metadata0import_list_metadata0null,metadata0qualifiedid_metadata0reduceimport_def,metadata0import__metadata0reduceimport_list_rec,metadata0imports_lhs_optional_1_metadata0null,metadata0prioritiesdecl_metadata0null,metadata0colon_metadata0reducepriority_list_empty,metadata0priority_list_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0number_metadata0null,metadata0assoc_metadata0reducepriority_def,metadata0priority_metadata0reducepriority_list_rec,metadata0priorities_lhs_metadata0reducepriorities_lhs_optional_2_priorities_lhs,metadata0priorities_lhs_optional_2_metadata0null,metadata0tokensdecl_metadata0null,metadata0colon_metadata0reducetokens_list_empty,metadata0tokens_list_metadata0null,metadata0dollar_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0doublequote_metadata0null,metadata0regexdoublequote_metadata0null,metadata0doublequote_metadata0reduceregex_doublequote,metadata0quote_metadata0null,metadata0regexquote_metadata0null,metadata0quote_metadata0reduceregex_quote,metadata0regex_metadata0reducelexem_macro,metadata0id_metadata0null,metadata0lpar_metadata0null,metadata0quoted_name_metadata0null,metadata0rpar_metadata0reducealias_def,metadata0alias_metadata0reducealias_optional_12_alias,metadata0alias_optional_12_metadata0null,metadata0colon_metadata0null,metadata0qualifiedid_metadata0reducetype_def,metadata0type_metadata0reducetype_optional_13_type,metadata0type_optional_13_metadata0null,metadata0assign_metadata0null,metadata0regex_metadata0reduceregex_terminal_decl,metadata0regex_terminal_decl_metadata0reduceregex_terminal_decl_optional_14_regex_terminal_decl,metadata0regex_terminal_decl_optional_14_metadata0null,metadata0lsqbracket_metadata0null,metadata0id_metadata0null,metadata0rsqbracket_metadata0reduceterminal_or_prod_priority,metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,metadata0terminal_or_prod_priority_optional_15_metadata0reducelexem_terminal,metadata0lexem_metadata0reducetokens_list_rec,metadata0token_lhs_metadata0null,metadata0blanksdecl_metadata0null,metadata0colon_metadata0reduceblanks_list_empty,metadata0blanks_list_metadata0null,metadata0dollar_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0regex_metadata0reduceblank_lexem_macro,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0regex_metadata0reduceblank_lexem_terminal,metadata0blank_lexem_metadata0reduceblanks_list_rec,metadata0blank_lhs_optional_3_metadata0null,metadata0commentsdecl_metadata0null,metadata0colon_metadata0reducecomments_list_empty,metadata0comments_list_metadata0null,metadata0dollar_metadata0null,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0regex_metadata0reducecomment_lexem_macro,metadata0id_metadata0null,metadata0assign_metadata0null,metadata0regex_metadata0reducecomment_lexem_terminal,metadata0comment_lexem_metadata0reducecomments_list_rec,metadata0comment_lhs_metadata0reducecomment_lhs_optional_4_comment_lhs,metadata0comment_lhs_optional_4_metadata0null,metadata0branchesdecl_metadata0null,metadata0colon_metadata0reducebanches_list_empty,metadata0banches_list_metadata0null,metadata0id_metadata0null,metadata0type_metadata0reducetype_optional_16_type,metadata0type_optional_16_metadata0null,metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,metadata0terminal_or_prod_priority_optional_17_metadata0reducebranch_lexem_terminal,metadata0eof_metadata0null,metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,metadata0terminal_or_prod_priority_optional_18_metadata0reducebranch_eof_terminal,metadata0branch_lexem_metadata0reducebanches_list_rec,metadata0branch_lhs_optional_5_metadata0null,metadata0errordecl_metadata0null,metadata0colon_metadata0null,metadata0id_metadata0reduceerror_def,metadata0error_lhs_optional_6_metadata0null,metadata0versionsdecl_metadata0null,metadata0colon_metadata0reduceversion_list_empty,metadata0version_list_metadata0null,metadata0id_metadata0null,metadata0colon_metadata0null,metadata0id_metadata0reduceparent_version_def,metadata0parent_version_optional_11_metadata0reduceversion_def,metadata0parent_version_metadata0reduceparent_version_optional_11_parent_version,metadata0version_metadata0reduceversion_list_rec,metadata0versions_metadata0reduceversions_optional_7_versions,metadata0versions_optional_7_metadata0null,metadata0typesdecl_metadata0null,metadata0colon_metadata0reducevartypedef_list_empty,metadata0vartypedef_list_metadata0null,metadata0id_metadata0reducevariable_nonterminal,metadata0quote_metadata0null,metadata0id_metadata0null,metadata0quote_metadata0reducevariable_terminal,metadata0vartypedef_metadata0reducevartypedef_list_rec,metadata0variable_metadata0null,metadata0type_metadata0reducevartype_def,metadata0types_lhs_metadata0reducetypes_lhs_optional_8_types_lhs,metadata0types_lhs_optional_8_metadata0null,metadata0attributesdecl_metadata0null,metadata0colon_metadata0reduceattribute_list_empty,metadata0attribute_list_metadata0null,metadata0id_metadata0null,metadata0type_metadata0reduceattribute_def,metadata0attribute_metadata0reduceattribute_list_rec,metadata0attributes_metadata0reduceattributes_optional_9_attributes,metadata0attributes_optional_9_metadata0null,metadata0startsdecl_metadata0null,metadata0colon_metadata0null,metadata0id_metadata0reducestartid_def,metadata0starts_list_metadata0null,metadata0startid_metadata0reducestarts_list_rec,metadata0startid_metadata0reducestarts_list_element,metadata0start_non_terminals_metadata0reducestart_non_terminals_optional_10_start_non_terminals,metadata0start_non_terminals_optional_10_metadata0null,metadata0productionsdecl_metadata0null,metadata0colon_metadata0reducedecls_empty,metadata0decls_metadata0null,metadata0id_metadata0null,metadata0type_optional_19_metadata0null,metadata0plus_metadata0reduceplus_optional_20_plus,metadata0plus_optional_20_metadata0null,metadata0assign_metadata0reducevarlist_empty,metadata0varlist_metadata0null,metadata0id_metadata0null,metadata0slash_metadata0null,metadata0id_metadata0reduceseparator_non_terminal,metadata0quote_metadata0null,metadata0id_metadata0null,metadata0quote_metadata0reduceseparator_terminal,metadata0qmark_metadata0reduceqmark_optional_25_qmark,metadata0separator_metadata0null,metadata0qmark_optional_25_metadata0reducevar_nonterminal,metadata0separator_optional_29_metadata0null,metadata0plus_metadata0reducevar_nonterminal_plus,metadata0separator_optional_28_metadata0null,metadata0star_metadata0reducevar_nonterminal_star,metadata0lpar_metadata0null,metadata0quoted_name_metadata0null,metadata0qmark_metadata0reduceqmark_optional_24_qmark,metadata0separator_metadata0null,metadata0separator_optional_26_metadata0null,metadata0star_metadata0reducevar_terminal_star,metadata0qmark_optional_24_metadata0reducevar_terminal,metadata0separator_optional_27_metadata0null,metadata0plus_metadata0reducevar_terminal_plus,metadata0vargroup_metadata0null,metadata0rpar_metadata0reducevar_group,metadata0var_metadata0reducevargroup_rec,metadata0var_metadata0reducevargroup_element,metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority,metadata0terminal_or_prod_priority_optional_21_metadata0null,metadata0lbracket_metadata0null,metadata0id_metadata0null,metadata0colon_metadata0null,metadata0id_metadata0reduceproduction_version,metadata0production_version_metadata0reduceproduction_version_optional_23_production_version,metadata0production_version_optional_23_metadata0null,metadata0rbracket_metadata0reduceproduction_id,metadata0production_id_metadata0reduceproduction_id_optional_22_production_id,metadata0production_id_optional_22_metadata0reduceprod_production,metadata0var_metadata0reducevarlist_rec,metadata0prod_metadata0reduceprods_element,metadata0prods_metadata0null,metadata0pipe_metadata0reducevarlist_empty,metadata0prod_metadata0reduceprods_rec,metadata0semicolon_metadata0reducedecl_productions,metadata0type_metadata0reducetype_optional_19_type,metadata0decl_metadata0reducedecls_rec,metadata0production_lhs_metadata0reducestart_def,metadata0error_lhs_metadata0reduceerror_lhs_optional_6_error_lhs,metadata0branch_lhs_metadata0reducebranch_lhs_optional_5_branch_lhs,metadata0blank_lhs_metadata0reduceblank_lhs_optional_3_blank_lhs,metadata0imports_lhs_metadata0reduceimports_lhs_optional_1_imports_lhs,metadata0start_metadata0null,metadata0__eof___metadata0null,metadata0directives_lhs_metadata0reducedirectives_lhs_optional_0_directives_lhs};
  }

  
  private int[] directives_lhs_optional_0Gotoes;

  private void initdirectives_lhs_optional_0Gotoes() {
    directives_lhs_optional_0Gotoes = 
      new int[]{6,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] error_lhs_optional_6Gotoes;

  private void initerror_lhs_optional_6Gotoes() {
    error_lhs_optional_6Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,98,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] terminal_or_prod_priority_optional_15Gotoes;

  private void initterminal_or_prod_priority_optional_15Gotoes() {
    terminal_or_prod_priority_optional_15Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,54,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] regex_terminal_decl_optional_14Gotoes;

  private void initregex_terminal_decl_optional_14Gotoes() {
    regex_terminal_decl_optional_14Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,49,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] import_listGotoes;

  private void initimport_listGotoes() {
    import_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,9,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] comment_lhsGotoes;

  private void initcomment_lhsGotoes() {
    comment_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,80,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] terminal_or_prod_priorityGotoes;

  private void initterminal_or_prod_priorityGotoes() {
    terminal_or_prod_priorityGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,53,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,88,-1,-1,91,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,173,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] start_non_terminals_optional_10Gotoes;

  private void initstart_non_terminals_optional_10Gotoes() {
    start_non_terminals_optional_10Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,137,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] production_version_optional_23Gotoes;

  private void initproduction_version_optional_23Gotoes() {
    production_version_optional_23Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,180,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] qmark_optional_25Gotoes;

  private void initqmark_optional_25Gotoes() {
    qmark_optional_25Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,155,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] banches_listGotoes;

  private void initbanches_listGotoes() {
    banches_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,84,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parent_versionGotoes;

  private void initparent_versionGotoes() {
    parent_versionGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,106,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] attributes_optional_9Gotoes;

  private void initattributes_optional_9Gotoes() {
    attributes_optional_9Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,129,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] attribute_listGotoes;

  private void initattribute_listGotoes() {
    attribute_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,124,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] startidGotoes;

  private void initstartidGotoes() {
    startidGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,135,-1,134,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] terminal_or_prod_priority_optional_18Gotoes;

  private void initterminal_or_prod_priority_optional_18Gotoes() {
    terminal_or_prod_priority_optional_18Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,92,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] prodsGotoes;

  private void initprodsGotoes() {
    prodsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,186,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] alias_optional_12Gotoes;

  private void initalias_optional_12Gotoes() {
    alias_optional_12Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,41,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] comment_lexemGotoes;

  private void initcomment_lexemGotoes() {
    comment_lexemGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,79,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blank_lhs_optional_3Gotoes;

  private void initblank_lhs_optional_3Gotoes() {
    blank_lhs_optional_3Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,68,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blank_lexemGotoes;

  private void initblank_lexemGotoes() {
    blank_lexemGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,67,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] prodGotoes;

  private void initprodGotoes() {
    prodGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,185,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,188,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] imports_lhsGotoes;

  private void initimports_lhsGotoes() {
    imports_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,196,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] separator_optional_28Gotoes;

  private void initseparator_optional_28Gotoes() {
    separator_optional_28Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,158,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] types_lhs_optional_8Gotoes;

  private void inittypes_lhs_optional_8Gotoes() {
    types_lhs_optional_8Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,121,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] aliasGotoes;

  private void initaliasGotoes() {
    aliasGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,40,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] error_lhsGotoes;

  private void initerror_lhsGotoes() {
    error_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,193,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] production_versionGotoes;

  private void initproduction_versionGotoes() {
    production_versionGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,179,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] branch_lhs_optional_5Gotoes;

  private void initbranch_lhs_optional_5Gotoes() {
    branch_lhs_optional_5Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,94,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] separator_optional_26Gotoes;

  private void initseparator_optional_26Gotoes() {
    separator_optional_26Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,164,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blanks_listGotoes;

  private void initblanks_listGotoes() {
    blanks_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,59,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] startGotoes;

  private void initstartGotoes() {
    startGotoes = 
      new int[]{197,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] declGotoes;

  private void initdeclGotoes() {
    declGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,191,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] attributeGotoes;

  private void initattributeGotoes() {
    attributeGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,127,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] imports_lhs_optional_1Gotoes;

  private void initimports_lhs_optional_1Gotoes() {
    imports_lhs_optional_1Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,12,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] priorities_lhs_optional_2Gotoes;

  private void initpriorities_lhs_optional_2Gotoes() {
    priorities_lhs_optional_2Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,22,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] production_lhsGotoes;

  private void initproduction_lhsGotoes() {
    production_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,192,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] plus_optional_20Gotoes;

  private void initplus_optional_20Gotoes() {
    plus_optional_20Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,144,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] starts_listGotoes;

  private void initstarts_listGotoes() {
    starts_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,133,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] comment_lhs_optional_4Gotoes;

  private void initcomment_lhs_optional_4Gotoes() {
    comment_lhs_optional_4Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,81,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] priorityGotoes;

  private void initpriorityGotoes() {
    priorityGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,20,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] production_idGotoes;

  private void initproduction_idGotoes() {
    production_idGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,182,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] branch_lhsGotoes;

  private void initbranch_lhsGotoes() {
    branch_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,194,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] varGotoes;

  private void initvarGotoes() {
    varGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,184,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,172,-1,-1,-1,-1,-1,-1,-1,-1,171,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] priorities_lhsGotoes;

  private void initpriorities_lhsGotoes() {
    priorities_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,21,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] branch_lexemGotoes;

  private void initbranch_lexemGotoes() {
    branch_lexemGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,93,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] qmark_optional_24Gotoes;

  private void initqmark_optional_24Gotoes() {
    qmark_optional_24Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,166,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] varlistGotoes;

  private void initvarlistGotoes() {
    varlistGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,146,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,146,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] directives_lhsGotoes;

  private void initdirectives_lhsGotoes() {
    directives_lhsGotoes = 
      new int[]{199,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] type_optional_13Gotoes;

  private void inittype_optional_13Gotoes() {
    type_optional_13Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,45,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] type_optional_16Gotoes;

  private void inittype_optional_16Gotoes() {
    type_optional_16Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,87,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] versions_optional_7Gotoes;

  private void initversions_optional_7Gotoes() {
    versions_optional_7Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,109,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] token_lhsGotoes;

  private void inittoken_lhsGotoes() {
    token_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,56,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] variableGotoes;

  private void initvariableGotoes() {
    variableGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,118,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] import_Gotoes;

  private void initimport_Gotoes() {
    import_Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,11,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] directiveGotoes;

  private void initdirectiveGotoes() {
    directiveGotoes = 
      new int[]{-1,-1,-1,5,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] attributesGotoes;

  private void initattributesGotoes() {
    attributesGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,128,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] separator_optional_29Gotoes;

  private void initseparator_optional_29Gotoes() {
    separator_optional_29Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,156,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] blank_lhsGotoes;

  private void initblank_lhsGotoes() {
    blank_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,195,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] versionGotoes;

  private void initversionGotoes() {
    versionGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,107,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] regex_terminal_declGotoes;

  private void initregex_terminal_declGotoes() {
    regex_terminal_declGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,48,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] separatorGotoes;

  private void initseparatorGotoes() {
    separatorGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,154,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,163,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] regexGotoes;

  private void initregexGotoes() {
    regexGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,35,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,47,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,63,-1,-1,66,-1,-1,-1,-1,-1,-1,-1,-1,75,-1,-1,78,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] type_optional_19Gotoes;

  private void inittype_optional_19Gotoes() {
    type_optional_19Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,142,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] lexemGotoes;

  private void initlexemGotoes() {
    lexemGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,55,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] vargroupGotoes;

  private void initvargroupGotoes() {
    vargroupGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,169,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] separator_optional_27Gotoes;

  private void initseparator_optional_27Gotoes() {
    separator_optional_27Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,167,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] parent_version_optional_11Gotoes;

  private void initparent_version_optional_11Gotoes() {
    parent_version_optional_11Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,105,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] comments_listGotoes;

  private void initcomments_listGotoes() {
    comments_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,71,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] vartypedef_listGotoes;

  private void initvartypedef_listGotoes() {
    vartypedef_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,112,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] tokens_listGotoes;

  private void inittokens_listGotoes() {
    tokens_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,25,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] start_non_terminalsGotoes;

  private void initstart_non_terminalsGotoes() {
    start_non_terminalsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,136,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] versionsGotoes;

  private void initversionsGotoes() {
    versionsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,108,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] typeGotoes;

  private void inittypeGotoes() {
    typeGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,44,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,86,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,119,-1,-1,-1,-1,-1,-1,126,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,190,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] version_listGotoes;

  private void initversion_listGotoes() {
    version_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,101,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] directive_listGotoes;

  private void initdirective_listGotoes() {
    directive_listGotoes = 
      new int[]{-1,-1,3,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] declsGotoes;

  private void initdeclsGotoes() {
    declsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,140,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] terminal_or_prod_priority_optional_21Gotoes;

  private void initterminal_or_prod_priority_optional_21Gotoes() {
    terminal_or_prod_priority_optional_21Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,174,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] types_lhsGotoes;

  private void inittypes_lhsGotoes() {
    types_lhsGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,120,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] priority_listGotoes;

  private void initpriority_listGotoes() {
    priority_listGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,15,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] vartypedefGotoes;

  private void initvartypedefGotoes() {
    vartypedefGotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,117,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] terminal_or_prod_priority_optional_17Gotoes;

  private void initterminal_or_prod_priority_optional_17Gotoes() {
    terminal_or_prod_priority_optional_17Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,89,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }
  
  private int[] production_id_optional_22Gotoes;

  private void initproduction_id_optional_22Gotoes() {
    production_id_optional_22Gotoes = 
      new int[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,183,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rparArray;
  @SuppressWarnings("unchecked")
  private void initrparArray() {
    rparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift39,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_empty,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,branch0,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,shift170,reducevar_group,reducevargroup_rec,reducevargroup_element,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] pipeArray;
  @SuppressWarnings("unchecked")
  private void initpipeArray() {
    pipeArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceterminal_or_prod_priority,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_empty,reduceterminal_or_prod_priority_optional_21_empty,reduceqmark_optional_25_empty,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,branch0,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,branch0,reducevar_group,branch0,branch0,reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority,reduceproduction_id_optional_22_empty,branch0,branch0,branch0,branch0,branch0,branch0,reduceproduction_id,reduceproduction_id_optional_22_production_id,reduceprod_production,reducevarlist_rec,reduceprods_element,shift187,reducevarlist_empty,reduceprods_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] directivesdeclArray;
  @SuppressWarnings("unchecked")
  private void initdirectivesdeclArray() {
    directivesdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{shift1,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] slashArray;
  @SuppressWarnings("unchecked")
  private void initslashArray() {
    slashArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift148,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift148,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] regexquoteArray;
  @SuppressWarnings("unchecked")
  private void initregexquoteArray() {
    regexquoteArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift33,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assignArray;
  @SuppressWarnings("unchecked")
  private void initassignArray() {
    assignArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift17,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift28,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,shift46,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift62,branch0,branch0,shift65,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift74,branch0,branch0,shift77,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_optional_19_empty,reduceplus_optional_20_empty,reduceplus_optional_20_plus,shift145,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_optional_19_type,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] typesdeclArray;
  @SuppressWarnings("unchecked")
  private void inittypesdeclArray() {
    typesdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,reducecomment_lhs_optional_4_empty,branch0,reducecomments_list_empty,reducecomment_def,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,reducecomment_lhs_optional_4_comment_lhs,reducebranch_lhs_optional_5_empty,branch0,reducebanches_list_empty,reducebranch_def,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,reduceerror_lhs_optional_6_empty,branch0,branch0,reduceerror_def,reduceversions_optional_7_empty,branch0,reduceversion_list_empty,reduceversions_def,reduceparent_version_optional_11_empty,branch0,reduceparent_version_def,reduceversion_def,reduceparent_version_optional_11_parent_version,reduceversion_list_rec,reduceversions_optional_7_versions,shift110,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceerror_lhs_optional_6_error_lhs,reducebranch_lhs_optional_5_branch_lhs,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] attributesdeclArray;
  @SuppressWarnings("unchecked")
  private void initattributesdeclArray() {
    attributesdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,reducecomment_lhs_optional_4_empty,branch0,reducecomments_list_empty,reducecomment_def,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,reducecomment_lhs_optional_4_comment_lhs,reducebranch_lhs_optional_5_empty,branch0,reducebanches_list_empty,reducebranch_def,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,reduceerror_lhs_optional_6_empty,branch0,branch0,reduceerror_def,reduceversions_optional_7_empty,branch0,reduceversion_list_empty,reduceversions_def,reduceparent_version_optional_11_empty,branch0,reduceparent_version_def,reduceversion_def,reduceparent_version_optional_11_parent_version,reduceversion_list_rec,reduceversions_optional_7_versions,reducetypes_lhs_optional_8_empty,branch0,reducevartypedef_list_empty,reducetypes_def,branch0,branch0,branch0,branch0,reducevartypedef_list_rec,branch0,reducevartype_def,reducetypes_lhs_optional_8_types_lhs,shift122,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceerror_lhs_optional_6_error_lhs,reducebranch_lhs_optional_5_branch_lhs,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] doublequoteArray;
  @SuppressWarnings("unchecked")
  private void initdoublequoteArray() {
    doublequoteArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,shift31,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift29,branch0,branch0,shift29,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] quoted_nameArray;
  @SuppressWarnings("unchecked")
  private void initquoted_nameArray() {
    quoted_nameArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift38,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_empty,shift161,reduceqmark_optional_25_empty,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,shift161,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,shift161,reducevar_group,reducevargroup_rec,reducevargroup_element,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_rec,branch0,branch0,reducevarlist_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] regexdoublequoteArray;
  @SuppressWarnings("unchecked")
  private void initregexdoublequoteArray() {
    regexdoublequoteArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift30,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] errordeclArray;
  @SuppressWarnings("unchecked")
  private void initerrordeclArray() {
    errordeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,reducecomment_lhs_optional_4_empty,branch0,reducecomments_list_empty,reducecomment_def,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,reducecomment_lhs_optional_4_comment_lhs,reducebranch_lhs_optional_5_empty,branch0,reducebanches_list_empty,reducebranch_def,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,shift95,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducebranch_lhs_optional_5_branch_lhs,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] semicolonArray;
  @SuppressWarnings("unchecked")
  private void initsemicolonArray() {
    semicolonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceterminal_or_prod_priority,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_empty,reduceterminal_or_prod_priority_optional_21_empty,reduceqmark_optional_25_empty,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,branch0,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,branch0,reducevar_group,branch0,branch0,reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority,reduceproduction_id_optional_22_empty,branch0,branch0,branch0,branch0,branch0,branch0,reduceproduction_id,reduceproduction_id_optional_22_production_id,reduceprod_production,reducevarlist_rec,reduceprods_element,shift189,reducevarlist_empty,reduceprods_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rbracketArray;
  @SuppressWarnings("unchecked")
  private void initrbracketArray() {
    rbracketArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceproduction_version_optional_23_empty,branch0,reduceproduction_version,reduceproduction_version_optional_23_production_version,shift181,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] importsdeclArray;
  @SuppressWarnings("unchecked")
  private void initimportsdeclArray() {
    importsdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducedirectives_lhs_optional_0_empty,branch0,reducedirective_list_empty,reducedirectives_def,reducedirective_def,reducedirective_list_rec,shift7,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedirectives_lhs_optional_0_directives_lhs};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] blanksdeclArray;
  @SuppressWarnings("unchecked")
  private void initblanksdeclArray() {
    blanksdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,shift57,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] versionsdeclArray;
  @SuppressWarnings("unchecked")
  private void initversionsdeclArray() {
    versionsdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,reducecomment_lhs_optional_4_empty,branch0,reducecomments_list_empty,reducecomment_def,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,reducecomment_lhs_optional_4_comment_lhs,reducebranch_lhs_optional_5_empty,branch0,reducebanches_list_empty,reducebranch_def,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,reduceerror_lhs_optional_6_empty,branch0,branch0,reduceerror_def,shift99,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceerror_lhs_optional_6_error_lhs,reducebranch_lhs_optional_5_branch_lhs,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] idArray;
  @SuppressWarnings("unchecked")
  private void initidArray() {
    idArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,reducedirective_list_empty,shift4,reducedirective_def,reducedirective_list_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducepriority_list_empty,shift16,branch0,branch0,branch0,reducepriority_def,reducepriority_list_rec,branch0,branch0,branch0,reducetokens_list_empty,shift36,shift27,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,shift51,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,branch0,branch0,reduceblanks_list_empty,shift64,shift61,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,branch0,branch0,reducecomments_list_empty,shift76,shift73,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,branch0,branch0,branch0,reducebanches_list_empty,shift85,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,branch0,branch0,shift97,branch0,branch0,branch0,reduceversion_list_empty,shift102,reduceparent_version_optional_11_empty,shift104,reduceparent_version_def,reduceversion_def,reduceparent_version_optional_11_parent_version,reduceversion_list_rec,branch0,branch0,branch0,reducevartypedef_list_empty,shift113,branch0,shift115,branch0,branch0,reducevartypedef_list_rec,branch0,reducevartype_def,branch0,branch0,branch0,reduceattribute_list_empty,shift125,branch0,reduceattribute_def,reduceattribute_list_rec,branch0,branch0,branch0,shift132,reducestartid_def,shift132,reducestarts_list_rec,reducestarts_list_element,branch0,branch0,branch0,reducedecls_empty,shift141,branch0,branch0,branch0,branch0,reducevarlist_empty,shift147,reduceqmark_optional_25_empty,shift149,branch0,shift151,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,shift147,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,shift147,reducevar_group,reducevargroup_rec,reducevargroup_element,branch0,branch0,shift176,branch0,shift178,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_rec,branch0,branch0,reducevarlist_empty,branch0,reducedecl_productions,branch0,reducedecls_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] startsdeclArray;
  @SuppressWarnings("unchecked")
  private void initstartsdeclArray() {
    startsdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,reducecomment_lhs_optional_4_empty,branch0,reducecomments_list_empty,reducecomment_def,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,reducecomment_lhs_optional_4_comment_lhs,reducebranch_lhs_optional_5_empty,branch0,reducebanches_list_empty,reducebranch_def,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,reduceerror_lhs_optional_6_empty,branch0,branch0,reduceerror_def,reduceversions_optional_7_empty,branch0,reduceversion_list_empty,reduceversions_def,reduceparent_version_optional_11_empty,branch0,reduceparent_version_def,reduceversion_def,reduceparent_version_optional_11_parent_version,reduceversion_list_rec,reduceversions_optional_7_versions,reducetypes_lhs_optional_8_empty,branch0,reducevartypedef_list_empty,reducetypes_def,branch0,branch0,branch0,branch0,reducevartypedef_list_rec,branch0,reducevartype_def,reducetypes_lhs_optional_8_types_lhs,reduceattributes_optional_9_empty,branch0,reduceattribute_list_empty,reduceattributes_def,branch0,reduceattribute_def,reduceattribute_list_rec,reduceattributes_optional_9_attributes,shift130,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceerror_lhs_optional_6_error_lhs,reducebranch_lhs_optional_5_branch_lhs,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchesdeclArray;
  @SuppressWarnings("unchecked")
  private void initbranchesdeclArray() {
    branchesdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,reducecomment_lhs_optional_4_empty,branch0,reducecomments_list_empty,reducecomment_def,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,reducecomment_lhs_optional_4_comment_lhs,shift82,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lsqbracketArray;
  @SuppressWarnings("unchecked")
  private void initlsqbracketArray() {
    lsqbracketArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,branch0,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_optional_16_empty,reducetype_optional_16_type,shift50,branch0,branch0,shift50,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_empty,shift50,reduceqmark_optional_25_empty,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,branch0,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,branch0,reducevar_group,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_rec,branch0,branch0,reducevarlist_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] quoteArray;
  @SuppressWarnings("unchecked")
  private void initquoteArray() {
    quoteArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift32,branch0,branch0,branch0,branch0,shift34,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_def,branch0,branch0,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift32,branch0,branch0,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift32,branch0,branch0,shift32,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevartypedef_list_empty,shift114,branch0,branch0,shift116,branch0,reducevartypedef_list_rec,branch0,reducevartype_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift150,branch0,branch0,shift152,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] productionsdeclArray;
  @SuppressWarnings("unchecked")
  private void initproductionsdeclArray() {
    productionsdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,reducecomment_lhs_optional_4_empty,branch0,reducecomments_list_empty,reducecomment_def,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,reducecomment_lhs_optional_4_comment_lhs,reducebranch_lhs_optional_5_empty,branch0,reducebanches_list_empty,reducebranch_def,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,reduceerror_lhs_optional_6_empty,branch0,branch0,reduceerror_def,reduceversions_optional_7_empty,branch0,reduceversion_list_empty,reduceversions_def,reduceparent_version_optional_11_empty,branch0,reduceparent_version_def,reduceversion_def,reduceparent_version_optional_11_parent_version,reduceversion_list_rec,reduceversions_optional_7_versions,reducetypes_lhs_optional_8_empty,branch0,reducevartypedef_list_empty,reducetypes_def,branch0,branch0,branch0,branch0,reducevartypedef_list_rec,branch0,reducevartype_def,reducetypes_lhs_optional_8_types_lhs,reduceattributes_optional_9_empty,branch0,reduceattribute_list_empty,reduceattributes_def,branch0,reduceattribute_def,reduceattribute_list_rec,reduceattributes_optional_9_attributes,reducestart_non_terminals_optional_10_empty,branch0,branch0,reducestartid_def,reducestart_non_terminals_def,reducestarts_list_rec,reducestarts_list_element,reducestart_non_terminals_optional_10_start_non_terminals,shift138,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceerror_lhs_optional_6_error_lhs,reducebranch_lhs_optional_5_branch_lhs,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] colonArray;
  @SuppressWarnings("unchecked")
  private void initcolonArray() {
    colonArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,shift2,branch0,branch0,branch0,branch0,branch0,shift8,branch0,branch0,branch0,branch0,branch0,shift14,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift24,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift58,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift70,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift83,branch0,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift96,branch0,branch0,branch0,shift100,branch0,branch0,shift103,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift111,branch0,branch0,reducevariable_nonterminal,branch0,branch0,reducevariable_terminal,branch0,shift42,branch0,branch0,branch0,shift123,branch0,branch0,shift42,branch0,branch0,branch0,branch0,shift131,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift139,branch0,branch0,shift42,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift177,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] tokensdeclArray;
  @SuppressWarnings("unchecked")
  private void inittokensdeclArray() {
    tokensdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducedirectives_lhs_optional_0_empty,branch0,reducedirective_list_empty,reducedirectives_def,reducedirective_def,reducedirective_list_rec,reduceimports_lhs_optional_1_empty,branch0,reduceimport_list_empty,reduceimports_def,reduceimport_def,reduceimport_list_rec,reducepriorities_lhs_optional_2_empty,branch0,reducepriority_list_empty,reducepriorities_def,branch0,branch0,branch0,reducepriority_def,reducepriority_list_rec,reducepriorities_lhs_optional_2_priorities_lhs,shift23,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceimports_lhs_optional_1_imports_lhs,branch0,branch0,reducedirectives_lhs_optional_0_directives_lhs};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] assocArray;
  @SuppressWarnings("unchecked")
  private void initassocArray() {
    assocArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift19,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] commentsdeclArray;
  @SuppressWarnings("unchecked")
  private void initcommentsdeclArray() {
    commentsdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,reducetoken_def,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,reduceblank_lhs_optional_3_empty,branch0,reduceblanks_list_empty,reduceblank_def,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,shift69,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceblank_lhs_optional_3_blank_lhs,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] numberArray;
  @SuppressWarnings("unchecked")
  private void initnumberArray() {
    numberArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift18,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lbracketArray;
  @SuppressWarnings("unchecked")
  private void initlbracketArray() {
    lbracketArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceterminal_or_prod_priority,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_empty,reduceterminal_or_prod_priority_optional_21_empty,reduceqmark_optional_25_empty,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,branch0,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,branch0,reducevar_group,branch0,branch0,reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority,shift175,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_rec,branch0,branch0,reducevarlist_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] qualifiedidArray;
  @SuppressWarnings("unchecked")
  private void initqualifiedidArray() {
    qualifiedidArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceimport_list_empty,shift10,reduceimport_def,reduceimport_list_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift43,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] dollarArray;
  @SuppressWarnings("unchecked")
  private void initdollarArray() {
    dollarArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetokens_list_empty,shift26,branch0,branch0,branch0,branch0,branch0,reduceregex_doublequote,branch0,branch0,reduceregex_quote,reducelexem_macro,reducealias_optional_12_empty,branch0,branch0,reducealias_def,reducealias_optional_12_alias,reducetype_optional_13_empty,branch0,reducetype_def,reducetype_optional_13_type,reduceregex_terminal_decl_optional_14_empty,branch0,reduceregex_terminal_decl,reduceregex_terminal_decl_optional_14_regex_terminal_decl,reduceterminal_or_prod_priority_optional_15_empty,branch0,branch0,reduceterminal_or_prod_priority,reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority,reducelexem_terminal,reducetokens_list_rec,branch0,branch0,reduceblanks_list_empty,shift60,branch0,branch0,branch0,reduceblank_lexem_macro,branch0,branch0,reduceblank_lexem_terminal,reduceblanks_list_rec,branch0,branch0,reducecomments_list_empty,shift72,branch0,branch0,branch0,reducecomment_lexem_macro,branch0,branch0,reducecomment_lexem_terminal,reducecomments_list_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] rsqbracketArray;
  @SuppressWarnings("unchecked")
  private void initrsqbracketArray() {
    rsqbracketArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift52,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] starArray;
  @SuppressWarnings("unchecked")
  private void initstarArray() {
    starArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceseparator_optional_28_empty,branch0,reduceseparator_non_terminal,branch0,branch0,reduceseparator_terminal,branch0,reduceseparator_optional_28_separator,branch0,branch0,branch0,shift159,branch0,branch0,reduceseparator_optional_26_empty,branch0,reduceseparator_optional_26_separator,shift165,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] eofArray;
  @SuppressWarnings("unchecked")
  private void initeofArray() {
    eofArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceterminal_or_prod_priority,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducebanches_list_empty,shift90,reducetype_optional_16_empty,reducetype_optional_16_type,reduceterminal_or_prod_priority_optional_17_empty,reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority,reducebranch_lexem_terminal,reduceterminal_or_prod_priority_optional_18_empty,reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority,reducebranch_eof_terminal,reducebanches_list_rec,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] qmarkArray;
  @SuppressWarnings("unchecked")
  private void initqmarkArray() {
    qmarkArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift153,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift162,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] prioritiesdeclArray;
  @SuppressWarnings("unchecked")
  private void initprioritiesdeclArray() {
    prioritiesdeclArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{reducedirectives_lhs_optional_0_empty,branch0,reducedirective_list_empty,reducedirectives_def,reducedirective_def,reducedirective_list_rec,reduceimports_lhs_optional_1_empty,branch0,reduceimport_list_empty,reduceimports_def,reduceimport_def,reduceimport_list_rec,shift13,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reduceimports_lhs_optional_1_imports_lhs,branch0,branch0,reducedirectives_lhs_optional_0_directives_lhs};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] plusArray;
  @SuppressWarnings("unchecked")
  private void initplusArray() {
    plusArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_optional_19_empty,shift143,branch0,branch0,branch0,branch0,reduceseparator_optional_29_empty,branch0,reduceseparator_non_terminal,branch0,branch0,reduceseparator_terminal,branch0,reduceseparator_optional_29_separator,branch0,shift157,branch0,branch0,branch0,branch0,reduceseparator_optional_27_empty,branch0,reduceseparator_optional_27_separator,branch0,branch0,branch0,shift168,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducetype_optional_19_type,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] lparArray;
  @SuppressWarnings("unchecked")
  private void initlparArray() {
    lparArray=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,shift37,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_empty,shift160,reduceqmark_optional_25_empty,branch0,branch0,branch0,branch0,branch0,reduceqmark_optional_25_qmark,branch0,reducevar_nonterminal,branch0,reducevar_nonterminal_plus,branch0,reducevar_nonterminal_star,shift160,reduceqmark_optional_24_empty,reduceqmark_optional_24_qmark,branch0,branch0,reducevar_terminal_star,reducevar_terminal,branch0,reducevar_terminal_plus,shift160,reducevar_group,reducevargroup_rec,reducevargroup_element,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducevarlist_rec,branch0,branch0,reducevarlist_empty,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0};
  }
  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] __eof__Array;
  @SuppressWarnings("unchecked")
  private void init__eof__Array() {
    __eof__Array=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedecls_empty,reduceproduction_def,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,branch0,reducedecl_productions,branch0,reducedecls_rec,reducestart_def,branch0,branch0,branch0,branch0,accept,accept,branch0};
  }

  private Action<TerminalEnum,ProductionEnum,VersionEnum>[] branchArrayTable;
  @SuppressWarnings("unchecked")
  private void initBranchArrayTable() {
    branchArrayTable=(Action<TerminalEnum,ProductionEnum,VersionEnum>[])new Action<?,?,?>[]{error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducedecls_empty,reduceproduction_def,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,error0,reducedecl_productions,error0,reducedecls_rec,reducestart_def,error0,error0,error0,error0,exit,exit,error0};
  }

  private final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> table;
  
  public static final ParserTable<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> createTable() {
    return new ParserDataTable().table;
  }

  private final AcceptAction<TerminalEnum,ProductionEnum,VersionEnum> accept;
  private final ExitAction<TerminalEnum,ProductionEnum,VersionEnum> exit;

  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_27_separator;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceversion_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceqmark_optional_25_qmark;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducealias_optional_12_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducealias_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestarts_list_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_26_separator;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducecomment_lexem_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceqmark_optional_24_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetype_optional_13_type;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceprods_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevartype_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducepriority_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducepriority_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetype_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproduction_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblanks_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducelexem_macro;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducepriorities_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestart_non_terminals_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceimport_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblank_lhs_optional_3_blank_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevar_terminal_star;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparent_version_optional_11_parent_version;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestart_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceimports_lhs_optional_1_imports_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceversion_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetype_optional_19_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducecomment_lhs_optional_4_comment_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducebanches_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceversions_optional_7_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_15_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblanks_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducecomments_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregex_terminal_decl_optional_14_regex_terminal_decl;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparent_version_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblank_lexem_macro;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblank_lexem_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregex_terminal_decl;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestartid_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducecomment_lhs_optional_4_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducebranch_lhs_optional_5_branch_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceattribute_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevar_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducebranch_lexem_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_18_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproduction_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceversions_optional_7_versions;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceattributes_optional_9_attributes;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevar_terminal_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevartypedef_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevarlist_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevar_group;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevartypedef_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevar_nonterminal_star;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedirectives_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceprod_production;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducepriority_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblank_lhs_optional_3_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducecomments_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestarts_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducebranch_lhs_optional_5_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducecomment_lexem_macro;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducelexem_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevar_nonterminal_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceattributes_optional_9_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetype_optional_19_type;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedirective_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceimports_lhs_optional_1_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetype_optional_16_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetoken_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevariable_nonterminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceattributes_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_non_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevar_nonterminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetypes_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducecomment_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceimport_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducepriorities_lhs_optional_2_priorities_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceversion_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_28_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedecls_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevargroup_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregex_quote;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceerror_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceparent_version_optional_11_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceplus_optional_20_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedirectives_lhs_optional_0_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetype_optional_13_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceversions_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproduction_id_optional_22_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceerror_lhs_optional_6_error_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceblank_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedirective_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceattribute_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproduction_version_optional_23_production_version;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetypes_lhs_optional_8_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_27_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceimports_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceerror_lhs_optional_6_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedirective_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevargroup_element;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregex_terminal_decl_optional_14_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_21_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducebranch_eof_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceplus_optional_20_plus;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_terminal;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducebanches_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestart_non_terminals_optional_10_start_non_terminals;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_26_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetokens_list_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetypes_lhs_optional_8_types_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_17_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedecls_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducestart_non_terminals_optional_10_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedecl_productions;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevarlist_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceprods_rec;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproduction_version_optional_23_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceregex_doublequote;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetype_optional_16_type;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproduction_id_optional_22_production_id;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_28_separator;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducebranch_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducedirectives_lhs_optional_0_directives_lhs;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceattribute_def;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_29_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceimport_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceqmark_optional_24_qmark;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducetokens_list_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceproduction_version;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducepriorities_lhs_optional_2_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceqmark_optional_25_empty;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducealias_optional_12_alias;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reduceseparator_optional_29_separator;
  private final ReduceAction<TerminalEnum,ProductionEnum,VersionEnum> reducevariable_terminal;

  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift189;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift151;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift90;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift122;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift69;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift159;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift143;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift130;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift39;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift139;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift18;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift43;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift96;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift131;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift19;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift162;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift168;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift33;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift178;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift29;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift27;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift110;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift99;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift104;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift36;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift4;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift161;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift24;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift7;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift61;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift138;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift177;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift52;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift111;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift60;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift26;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift34;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift74;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift85;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift72;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift176;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift100;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift181;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift97;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift103;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift114;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift102;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift123;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift17;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift37;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift157;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift76;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift62;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift83;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift152;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift28;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift38;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift125;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift2;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift1;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift77;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift175;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift32;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift46;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift150;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift70;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift50;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift170;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift57;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift113;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift149;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift16;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift187;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift65;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift13;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift42;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift31;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift14;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift145;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift73;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift116;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift153;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift82;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift58;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift8;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift23;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift95;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift165;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift10;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift115;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift147;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift64;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift51;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift132;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift30;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift141;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift148;
  private final ShiftAction<TerminalEnum,ProductionEnum,VersionEnum> shift160;


  private final ErrorAction<TerminalEnum,ProductionEnum,VersionEnum> error0;

  private final BranchAction<TerminalEnum,ProductionEnum,VersionEnum> branch0;


  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceversion_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0priority_metadata0reducepriority_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_terminal_decl_metadata0reduceregex_terminal_decl_optional_14_regex_terminal_decl;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0vargroup_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_17_terminal_or_prod_priority;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_metadata0reducetype_optional_19_type;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducestartid_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0pipe_metadata0reducevarlist_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0decls_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceblanks_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0versionsdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0error_lhs_metadata0reduceerror_lhs_optional_6_error_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_optional_19_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0reduceplus_optional_20_plus;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0types_lhs_metadata0reducetypes_lhs_optional_8_types_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0reducevar_nonterminal_star;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0start_non_terminals_optional_10_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0typesdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_optional_17_metadata0reducebranch_lexem_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0qmark_metadata0reduceqmark_optional_25_qmark;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0qmark_optional_25_metadata0reducevar_nonterminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0production_id_metadata0reduceproduction_id_optional_22_production_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceregex_quote;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducevariable_nonterminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0dollar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regexquote_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doublequote_metadata0reduceregex_doublequote;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0token_lhs_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0semicolon_metadata0reducedecl_productions;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0qmark_optional_24_metadata0reducevar_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceseparator_non_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rsqbracket_metadata0reduceterminal_or_prod_priority;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_terminal_decl_optional_14_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0start_non_terminals_metadata0reducestart_non_terminals_optional_10_start_non_terminals;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_15_terminal_or_prod_priority;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0blanksdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lexem_metadata0reducetokens_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0alias_optional_12_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0import_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0null_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0blank_lhs_optional_3_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comment_lexem_metadata0reducecomments_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reducepriority_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0blank_lhs_metadata0reduceblank_lhs_optional_3_blank_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0directives_lhs_metadata0reducedirectives_lhs_optional_0_directives_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0priorities_lhs_optional_2_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0prod_metadata0reduceprods_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0tokens_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0vartypedef_metadata0reducevartypedef_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0startsdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0versions_optional_7_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0tokensdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lpar_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0directive_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0error_lhs_optional_6_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_optional_21_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_metadata0reduceattribute_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0variable_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reducevariable_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reducedecls_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_metadata0reducecomment_lexem_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0qualifiedid_metadata0reducetype_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0separator_optional_29_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0doublequote_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0var_metadata0reducevarlist_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0star_metadata0reducevar_terminal_star;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reducedirective_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0directivesdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parent_version_optional_11_metadata0reduceversion_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0branch_lhs_metadata0reducebranch_lhs_optional_5_branch_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0qualifiedid_metadata0reduceimport_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0var_metadata0reducevargroup_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reducevar_group;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0types_lhs_optional_8_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_metadata0reduceregex_terminal_decl;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0prods_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0version_metadata0reduceversion_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0priority_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0__eof___metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceproduction_version;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceimport_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0blanks_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0priorities_lhs_metadata0reducepriorities_lhs_optional_2_priorities_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceerror_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0versions_metadata0reduceversions_optional_7_versions;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0id_metadata0reduceparent_version_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0varlist_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0banches_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rbracket_metadata0reduceproduction_id;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lbracket_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0lsqbracket_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0start_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_optional_15_metadata0reducelexem_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_metadata0reduceblank_lexem_macro;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0vartypedef_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0startid_metadata0reducestarts_list_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0startid_metadata0reducestarts_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0attribute_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reduceattribute_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_18_terminal_or_prod_priority;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quoted_name_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reducecomments_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0reducevar_nonterminal_plus;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_optional_13_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reducebanches_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_metadata0reducevartype_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0production_id_optional_22_metadata0reduceprod_production;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_metadata0reducetype_optional_13_type;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_metadata0reducecomment_lexem_macro;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0branch_lexem_metadata0reducebanches_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0import__metadata0reduceimport_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reducedirective_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0imports_lhs_metadata0reduceimports_lhs_optional_1_imports_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0starts_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0reducevarlist_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0branch_lhs_optional_5_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_metadata0reducetype_optional_16_type;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0eof_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0version_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0rpar_metadata0reducealias_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comment_lhs_optional_4_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0separator_optional_28_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0attributes_metadata0reduceattributes_optional_9_attributes;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comments_list_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0branchesdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0separator_optional_26_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0production_version_optional_23_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0number_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0type_optional_16_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reducetokens_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_metadata0reduceterminal_or_prod_priority_optional_21_terminal_or_prod_priority;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0commentsdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0production_lhs_metadata0reducestart_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0alias_metadata0reducealias_optional_12_alias;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0errordecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assign_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0colon_metadata0reducevartypedef_list_empty;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0assoc_metadata0reducepriority_def;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0quote_metadata0reduceseparator_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0productionsdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_metadata0reducelexem_macro;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0parent_version_metadata0reduceparent_version_optional_11_parent_version;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0terminal_or_prod_priority_optional_18_metadata0reducebranch_eof_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0attribute_metadata0reduceattribute_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0imports_lhs_optional_1_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0prod_metadata0reduceprods_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0comment_lhs_metadata0reducecomment_lhs_optional_4_comment_lhs;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0directive_metadata0reducedirective_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0slash_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0var_metadata0reducevargroup_element;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_optional_20_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0blank_lexem_metadata0reduceblanks_list_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0plus_metadata0reducevar_terminal_plus;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0production_version_metadata0reduceproduction_version_optional_23_production_version;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regexdoublequote_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0separator_optional_27_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0attributes_optional_9_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0qmark_metadata0reduceqmark_optional_24_qmark;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0attributesdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0decl_metadata0reducedecls_rec;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0regex_metadata0reduceblank_lexem_terminal;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0separator_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0prioritiesdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0importsdecl_metadata0null;
  private StateMetadata<TerminalEnum,NonTerminalEnum,ProductionEnum,VersionEnum> metadata0directives_lhs_optional_0_metadata0null;
}

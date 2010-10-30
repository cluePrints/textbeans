package fr.umlv.tatoo.cc.lexer.ebnf.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import fr.umlv.tatoo.cc.lexer.ebnf.lexer.RuleEnum;
import fr.umlv.tatoo.cc.lexer.ebnf.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.of(RuleEnum.regexdoublequote,RuleEnum.qmark,RuleEnum.blanksdecl,RuleEnum.commentsdecl,RuleEnum.dollar,RuleEnum.tokensdecl,RuleEnum.semicolon,RuleEnum.lpar,RuleEnum.assign,RuleEnum.lbracket,RuleEnum.lsqbracket,RuleEnum.star,RuleEnum.plus,RuleEnum.slash,RuleEnum.id,RuleEnum.eof,RuleEnum.productionsdecl,RuleEnum.typesdecl,RuleEnum.rsqbracket,RuleEnum.rpar,RuleEnum.attributesdecl,RuleEnum.quoted_name,RuleEnum.pipe,RuleEnum.versionsdecl,RuleEnum.importsdecl,RuleEnum.qualifiedid,RuleEnum.rbracket,RuleEnum.prioritiesdecl,RuleEnum.comment,RuleEnum.directivesdecl,RuleEnum.assoc,RuleEnum.doublequote,RuleEnum.startsdecl,RuleEnum.regexquote,RuleEnum.errordecl,RuleEnum.quote,RuleEnum.number,RuleEnum.branchesdecl,RuleEnum.colon);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.qmark,TerminalEnum.qmark);
              terminal.put(RuleEnum.regexdoublequote,TerminalEnum.regexdoublequote);
              terminal.put(RuleEnum.commentsdecl,TerminalEnum.commentsdecl);
              terminal.put(RuleEnum.blanksdecl,TerminalEnum.blanksdecl);
              terminal.put(RuleEnum.dollar,TerminalEnum.dollar);
              terminal.put(RuleEnum.tokensdecl,TerminalEnum.tokensdecl);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.semicolon,TerminalEnum.semicolon);
              terminal.put(RuleEnum.assign,TerminalEnum.assign);
              terminal.put(RuleEnum.lsqbracket,TerminalEnum.lsqbracket);
              terminal.put(RuleEnum.lbracket,TerminalEnum.lbracket);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum.id,TerminalEnum.id);
              terminal.put(RuleEnum.eof,TerminalEnum.eof);
              terminal.put(RuleEnum.productionsdecl,TerminalEnum.productionsdecl);
              terminal.put(RuleEnum.typesdecl,TerminalEnum.typesdecl);
              terminal.put(RuleEnum.rsqbracket,TerminalEnum.rsqbracket);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.attributesdecl,TerminalEnum.attributesdecl);
              terminal.put(RuleEnum.quoted_name,TerminalEnum.quoted_name);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum.versionsdecl,TerminalEnum.versionsdecl);
              terminal.put(RuleEnum.importsdecl,TerminalEnum.importsdecl);
              terminal.put(RuleEnum.qualifiedid,TerminalEnum.qualifiedid);
              terminal.put(RuleEnum.prioritiesdecl,TerminalEnum.prioritiesdecl);
              terminal.put(RuleEnum.rbracket,TerminalEnum.rbracket);
              terminal.put(RuleEnum.directivesdecl,TerminalEnum.directivesdecl);
              terminal.put(RuleEnum.assoc,TerminalEnum.assoc);
              terminal.put(RuleEnum.doublequote,TerminalEnum.doublequote);
              terminal.put(RuleEnum.startsdecl,TerminalEnum.startsdecl);
              terminal.put(RuleEnum.errordecl,TerminalEnum.errordecl);
              terminal.put(RuleEnum.regexquote,TerminalEnum.regexquote);
              terminal.put(RuleEnum.quote,TerminalEnum.quote);
              terminal.put(RuleEnum.number,TerminalEnum.number);
              terminal.put(RuleEnum.branchesdecl,TerminalEnum.branchesdecl);
              terminal.put(RuleEnum.colon,TerminalEnum.colon);
            EnumSet<RuleEnum> unconditionals = EnumSet.of(RuleEnum.space,RuleEnum.comment);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}
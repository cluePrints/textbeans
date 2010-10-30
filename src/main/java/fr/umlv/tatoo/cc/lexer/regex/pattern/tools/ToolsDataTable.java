package fr.umlv.tatoo.cc.lexer.regex.pattern.tools;

import fr.umlv.tatoo.runtime.tools.ToolsTable;

import java.util.EnumMap;
import java.util.EnumSet;

import fr.umlv.tatoo.cc.lexer.regex.pattern.lexer.RuleEnum;
import fr.umlv.tatoo.cc.lexer.regex.pattern.parser.TerminalEnum;

public class ToolsDataTable {
  public static ToolsTable<RuleEnum,TerminalEnum> createToolsTable() {
      EnumSet<RuleEnum> spawns = EnumSet.allOf(RuleEnum.class);
      EnumSet<RuleEnum> discards = EnumSet.allOf(RuleEnum.class);
      EnumMap<RuleEnum,TerminalEnum> terminal = new EnumMap<RuleEnum,TerminalEnum>(RuleEnum.class);
              terminal.put(RuleEnum.comma,TerminalEnum.comma);
              terminal.put(RuleEnum.dollar,TerminalEnum.dollar);
              terminal.put(RuleEnum.lpar,TerminalEnum.lpar);
              terminal.put(RuleEnum.intervalChar,TerminalEnum.intervalLetter);
              terminal.put(RuleEnum.stringChar,TerminalEnum.stringLetter);
              terminal.put(RuleEnum.escapedChar,TerminalEnum.normalLetter);
              terminal.put(RuleEnum.dot,TerminalEnum.dot);
              terminal.put(RuleEnum.plus,TerminalEnum.plus);
              terminal.put(RuleEnum.intervalEscapedChar,TerminalEnum.intervalLetter);
              terminal.put(RuleEnum.pipe,TerminalEnum.pipe);
              terminal.put(RuleEnum.normalChar,TerminalEnum.normalLetter);
              terminal.put(RuleEnum.lbrak,TerminalEnum.lbrak);
              terminal.put(RuleEnum.rpar,TerminalEnum.rpar);
              terminal.put(RuleEnum.rbrak,TerminalEnum.rbrak);
              terminal.put(RuleEnum.rbrac,TerminalEnum.rbrac);
              terminal.put(RuleEnum.quote,TerminalEnum.quote);
              terminal.put(RuleEnum.integer,TerminalEnum.integer);
              terminal.put(RuleEnum.unicodeChar,TerminalEnum.specialLetter);
              terminal.put(RuleEnum.minus,TerminalEnum.minus);
              terminal.put(RuleEnum.star,TerminalEnum.star);
              terminal.put(RuleEnum.formfeed,TerminalEnum.specialLetter);
              terminal.put(RuleEnum.backspace,TerminalEnum.specialLetter);
              terminal.put(RuleEnum.lbrac,TerminalEnum.lbrac);
              terminal.put(RuleEnum.eoln,TerminalEnum.specialLetter);
              terminal.put(RuleEnum.stringEscapedChar,TerminalEnum.stringLetter);
              terminal.put(RuleEnum.question,TerminalEnum.question);
              terminal.put(RuleEnum.macro,TerminalEnum.name);
              terminal.put(RuleEnum.slash,TerminalEnum.slash);
              terminal.put(RuleEnum.tab,TerminalEnum.specialLetter);
              terminal.put(RuleEnum.hat,TerminalEnum.hat);
              terminal.put(RuleEnum.cr,TerminalEnum.specialLetter);
            EnumSet<RuleEnum> unconditionals = EnumSet.noneOf(RuleEnum.class);
      return new ToolsTable<RuleEnum,TerminalEnum>(spawns,discards,unconditionals,terminal);
  }
}
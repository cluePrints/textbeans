package net.sf.textbeans.beaver;

import java.util.List;

import beaver.Action;
import beaver.Symbol;
import beaver.spec.Grammar;
import beaver.spec.Production;
import beaver.spec.ProductionType;

import com.google.common.collect.Lists;

/**
 * Is adaptor to grammar which allows it to act like a reduce action
 **/
public class BeaverActionWrapper {
	private Grammar grammar;
	public BeaverActionWrapper(Grammar grammar) {
		super();
		this.grammar = grammar;
	}

	public Symbol reduce(int i, Symbol[] args, int offset)
	{
		Production rule = grammar.rules[i];
		if (rule.code == null)
		{
			if (rule.rhs.size() == 0)
			{
				return Action.NONE.reduce(args, offset);
			}
			else if (rule.rhs.size() == 1)
			{
				return Action.RETURN.reduce(args, offset);
			}
			else
			{
				int n = indexOfLastReferencedSymbol(rule.rhs);
				if (n == 0)
				{
					return Action.RETURN.reduce(args, offset);
				}
				else if (n > 0)
				{
					return args[offset + n+1];
				}
                else
                {
            		return args[rule.rhs.size()];
                }
			}
		}
		else
		{
			return writeReduceActionCode(rule, args, offset);
		}
	}
	/*
	static private void writeParserActionsArray(Grammar grammar, Options opts, Writer out) throws IOException
	{
		for (int i = 0, last_i = grammar.rules.length - 1; i < grammar.rules.length; i++)
		{
			Production rule = grammar.rules[i];
			out.write("\n\t\t\t");
			if (rule.code == null)
			{
				if (rule.rhs.size() == 0)
				{
					out.write("Action.NONE");
					if (i != last_i) out.write(",  ");
					out.write("\t// [");
					out.write(String.valueOf(rule.id));
					out.write("] ");
					out.write(rule.toString());
				}
				else if (rule.rhs.size() == 1)
				{
					out.write("Action.RETURN");
					if (i != last_i) out.write(',');
					out.write("\t// [");
					out.write(String.valueOf(rule.id));
					out.write("] ");
					out.write(rule.toString());
				}
				else
				{
					int n = indexOfLastReferencedSymbol(rule.rhs);
					if (n == 0)
					{
						out.write("Action.RETURN");
					}
					else if (n > 0)
					{
						out.write("RETURN");
						out.write(String.valueOf(n + 1));
					}
                    else
                    {
                        out.write("RETURN");
                        out.write(String.valueOf(rule.rhs.size()));
                    }
					if (i != last_i) out.write(',');
					out.write("\t// [");
					out.write(String.valueOf(rule.id));
					out.write("] ");
					out.write(rule.toString());

					if (n < 0)
					{
						out.write("; returns '");
						out.write(rule.rhs.items[rule.rhs.size() - 1].symbol.name);
						out.write("' although none is marked");
					}
				}
			}
			else
			{
				out.write("new Action");
				if (opts.name_action_classes)
				{
					out.write(String.valueOf(rule.id));
					out.write("()");
					if (i != last_i) out.write(',');
					out.write("\t// [");
					out.write(String.valueOf(rule.id));
					out.write("] ");
					out.write(rule.toString());
				}
				else
				{
					out.write("() {\t// [");
					out.write(String.valueOf(rule.id));
					out.write("] ");
					out.write(rule.toString());
					out.write('\n');
					out.write("\t\t\t\tpublic Symbol reduce(Symbol[] _symbols, int offset) {\n");
					return writeReduceActionCode(rule);
					out.write("\t\t\t\t}");
					out.write("\n\t\t\t}");
					if (i != last_i) out.write(',');
				}
			}
		}
	}*/

	
	private static Symbol writeReduceActionCode(Production rule, Symbol[] args, int offset)
	{
		for (int i = 0; i < rule.rhs.items.length; i++)
		{
			Production.RHS.Item rhs_item = rule.rhs.items[i];
			if (rhs_item.alias != null)
			{
				String type = rhs_item.symbol.type;
				if (type == null)
				{
					/*out.write("final Symbol ");
					out.write(rhs_item.alias);
					out.write(" = _symbols[offset + ");
					out.write(String.valueOf(i + 1));
					out.write("];\n");*/
					notSupported();
				}
				else
				{
					/*out.write("final Symbol _symbol_");
					out.write(rhs_item.alias);
					out.write(" = _symbols[offset + ");
					out.write(String.valueOf(i + 1));
					out.write("];\n");*/

					if (type.charAt(0) == '+')
					{
						/*type = type.substring(1);
						out.write("\t\t\t\t\tfinal ");
						out.write(Grammar.EBNF_LIST_TYPE_NAME);
						out.write(" _list_");
						out.write(rhs_item.alias);
						out.write(" = (");
						out.write(Grammar.EBNF_LIST_TYPE_NAME);
						out.write(") _symbol_");
						out.write(rhs_item.alias);
						out.write(".value;\n");

						out.write("\t\t\t\t\tfinal ");
						out.write(type);
						out.write("[] ");
						out.write(rhs_item.alias);
						out.write(" = _list_");
						out.write(rhs_item.alias);
						out.write(" == null ? new ");
						out.write(type);
						out.write("[0] : (");
						out.write(type);
						out.write("[]) _list_");
						out.write(rhs_item.alias);
						out.write(".toArray(new ");
						out.write(type);
						out.write("[_list_");
						out.write(rhs_item.alias);
						out.write(".size()]);\n");*/
						notSupported();
					}
					else
					{
						/*out.write("\t\t\t\t\tfinal ");
						out.write(type);
						out.write(' ');
						out.write(rhs_item.alias);
						out.write(" = (");
						out.write(type);
						out.write(") _symbol_");
						out.write(rhs_item.alias);
						out.write(".value;\n");*/
						notSupported();
					}
				}
			}
		}
		if (rule.type == ProductionType.NEW_LIST) {
			List<Symbol> lst = Lists.newArrayList();
			lst.add(args[offset+1]);
			return new Symbol(lst);
		}
		throw new RuntimeException("Not supported yet");
		// rule.code here
	}

	private static void notSupported() throws RuntimeException {
		throw new RuntimeException("Not supported yet");
	}

	
	static private int indexOfLastReferencedSymbol(Production.RHS rhs)
	{
        int i = rhs.size();
		while (--i >= 0 && rhs.items[i].alias == null)
            ;
		return i;
	}
}

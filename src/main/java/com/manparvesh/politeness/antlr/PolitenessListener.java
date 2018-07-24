// Generated from /home/manparvesh/Desktop/github_repos/grace/src/main/antlr/com/manparvesh/politeness/antlr/Politeness.g4 by ANTLR 4.7
package com.manparvesh.politeness.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PolitenessParser}.
 */
public interface PolitenessListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PolitenessParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PolitenessParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolitenessParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PolitenessParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolitenessParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PolitenessParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolitenessParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PolitenessParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolitenessParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PolitenessParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolitenessParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PolitenessParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolitenessParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PolitenessParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolitenessParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PolitenessParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolitenessParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(PolitenessParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolitenessParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(PolitenessParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PolitenessParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PolitenessParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link PolitenessParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PolitenessParser.AddContext ctx);
}
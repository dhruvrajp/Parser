// Generated from Hello.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(@NotNull HelloParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(@NotNull HelloParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubtLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtLabel(@NotNull HelloParser.SubtLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubtLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtLabel(@NotNull HelloParser.SubtLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull HelloParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull HelloParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFStatementLabel1}
	 * labeled alternative in {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIFStatementLabel1(@NotNull HelloParser.IFStatementLabel1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IFStatementLabel1}
	 * labeled alternative in {@link HelloParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIFStatementLabel1(@NotNull HelloParser.IFStatementLabel1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code GTLTEQLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGTLTEQLabel(@NotNull HelloParser.GTLTEQLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GTLTEQLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGTLTEQLabel(@NotNull HelloParser.GTLTEQLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterLabel}
	 * labeled alternative in {@link HelloParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterLabel(@NotNull HelloParser.ParameterLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterLabel}
	 * labeled alternative in {@link HelloParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterLabel(@NotNull HelloParser.ParameterLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndORNotLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndORNotLabel(@NotNull HelloParser.AndORNotLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndORNotLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndORNotLabel(@NotNull HelloParser.AndORNotLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallParamLabel}
	 * labeled alternative in {@link HelloParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void enterCallParamLabel(@NotNull HelloParser.CallParamLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallParamLabel}
	 * labeled alternative in {@link HelloParser#callParameters}.
	 * @param ctx the parse tree
	 */
	void exitCallParamLabel(@NotNull HelloParser.CallParamLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PassParameters}
	 * labeled alternative in {@link HelloParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterPassParameters(@NotNull HelloParser.PassParametersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PassParameters}
	 * labeled alternative in {@link HelloParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitPassParameters(@NotNull HelloParser.PassParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctDefLabel}
	 * labeled alternative in {@link HelloParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctDefLabel(@NotNull HelloParser.FunctDefLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctDefLabel}
	 * labeled alternative in {@link HelloParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctDefLabel(@NotNull HelloParser.FunctDefLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLabel(@NotNull HelloParser.BooleanLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLabel(@NotNull HelloParser.BooleanLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctCallLabel}
	 * labeled alternative in {@link HelloParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctCallLabel(@NotNull HelloParser.FunctCallLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctCallLabel}
	 * labeled alternative in {@link HelloParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctCallLabel(@NotNull HelloParser.FunctCallLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentLabel}
	 * labeled alternative in {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentLabel(@NotNull HelloParser.AssignmentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentLabel}
	 * labeled alternative in {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentLabel(@NotNull HelloParser.AssignmentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationLabel}
	 * labeled alternative in {@link HelloParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationLabel(@NotNull HelloParser.DeclarationLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationLabel}
	 * labeled alternative in {@link HelloParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationLabel(@NotNull HelloParser.DeclarationLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LoopStatLabel}
	 * labeled alternative in {@link HelloParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatLabel(@NotNull HelloParser.LoopStatLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LoopStatLabel}
	 * labeled alternative in {@link HelloParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatLabel(@NotNull HelloParser.LoopStatLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakLabel}
	 * labeled alternative in {@link HelloParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakLabel(@NotNull HelloParser.BreakLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakLabel}
	 * labeled alternative in {@link HelloParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakLabel(@NotNull HelloParser.BreakLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultLabel(@NotNull HelloParser.MultLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultLabel(@NotNull HelloParser.MultLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProgramLabel}
	 * labeled alternative in {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramLabel(@NotNull HelloParser.ProgramLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProgramLabel}
	 * labeled alternative in {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramLabel(@NotNull HelloParser.ProgramLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockLabel}
	 * labeled alternative in {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockLabel(@NotNull HelloParser.BlockLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockLabel}
	 * labeled alternative in {@link HelloParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockLabel(@NotNull HelloParser.BlockLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull HelloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull HelloParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctCallExprLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctCallExprLabel(@NotNull HelloParser.FunctCallExprLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctCallExprLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctCallExprLabel(@NotNull HelloParser.FunctCallExprLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddLabel(@NotNull HelloParser.AddLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddLabel(@NotNull HelloParser.AddLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLabel(@NotNull HelloParser.IntegerLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLabel(@NotNull HelloParser.IntegerLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivLabel(@NotNull HelloParser.DivLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivLabel(@NotNull HelloParser.DivLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnLabel}
	 * labeled alternative in {@link HelloParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnLabel(@NotNull HelloParser.ReturnLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnLabel}
	 * labeled alternative in {@link HelloParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnLabel(@NotNull HelloParser.ReturnLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentLabel(@NotNull HelloParser.IdentLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentLabel(@NotNull HelloParser.IdentLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GTEQLTEQLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGTEQLTEQLabel(@NotNull HelloParser.GTEQLTEQLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GTEQLTEQLabel}
	 * labeled alternative in {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGTEQLTEQLabel(@NotNull HelloParser.GTEQLTEQLabelContext ctx);
}
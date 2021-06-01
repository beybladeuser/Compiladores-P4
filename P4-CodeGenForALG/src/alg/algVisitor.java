// Generated from E:/escola/universidade_boi/3_ano/2_semestre/Compiladores/Praticas/Compiladores-P4/P4-CodeGenForALG/src\alg.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link alg}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface algVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link alg#alg_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_file(alg.Alg_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_program(alg.Alg_programContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_declaration(alg.Alg_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_var_declaration(alg.Alg_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_simple_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_simple_var_declaration(alg.Alg_simple_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_type(alg.Alg_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_primitive_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_primitive_type(alg.Alg_primitive_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_pointer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_pointer_type(alg.Alg_pointer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_init_var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_init_var_declaration(alg.Alg_init_var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(alg.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(alg.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(alg.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool_True}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_True(alg.Bool_TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool_False}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_False(alg.Bool_FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(alg.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(alg.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(alg.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Simple_expr}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(alg.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(alg.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren_fail_1}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_fail_1(alg.Paren_fail_1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Paren_fail_2}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen_fail_2(alg.Paren_fail_2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code And_op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_op(alg.And_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(alg.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(alg.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or_op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_op(alg.Or_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Comparisson}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisson(alg.ComparissonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Simple_expression}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(alg.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unary_Op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_Op(alg.Unary_OpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pointer_Indexing}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer_Indexing(alg.Pointer_IndexingContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_func_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_func_type(alg.Alg_func_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Normal_Func}
	 * labeled alternative in {@link alg#alg_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_Func(alg.Normal_FuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ALG_Func}
	 * labeled alternative in {@link alg#alg_func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitALG_Func(alg.ALG_FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_alg_function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_alg_function_args(alg.Alg_alg_function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_func_declaration_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_func_declaration_arg(alg.Alg_func_declaration_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_func_body(alg.Alg_func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_func_prologue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_func_prologue(alg.Alg_func_prologueContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_func_epilogue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_func_epilogue(alg.Alg_func_epilogueContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_block(alg.Alg_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Normal_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_Function_Call(alg.Normal_Function_CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AT_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAT_Function_Call(alg.AT_Function_CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sizeof_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeof_Function_Call(alg.Sizeof_Function_CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Write_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_Function_Call(alg.Write_Function_CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteLn_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteLn_Function_Call(alg.WriteLn_Function_CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_funtion_call_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_funtion_call_args(alg.Alg_funtion_call_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_funtion_call_args_aux}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_funtion_call_args_aux(alg.Alg_funtion_call_args_auxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpInst}
	 * labeled alternative in {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpInst(alg.ExpInstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ctrl}
	 * labeled alternative in {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtrl(alg.CtrlContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(alg.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(alg.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code While}
	 * labeled alternative in {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(alg.WhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubBlock}
	 * labeled alternative in {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubBlock(alg.SubBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Leave_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeave_control_instr(alg.Leave_control_instrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Restart_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestart_control_instr(alg.Restart_control_instrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_control_instr(alg.Return_control_instrContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_instruction_controle_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_instruction_controle_next(alg.Alg_instruction_controle_nextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lado_esquerdo_ident}
	 * labeled alternative in {@link alg#lado_esquerdo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLado_esquerdo_ident(alg.Lado_esquerdo_identContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lado_esquerdo_pointer_index}
	 * labeled alternative in {@link alg#lado_esquerdo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLado_esquerdo_pointer_index(alg.Lado_esquerdo_pointer_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_atrib(alg.Alg_atribContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_instruction_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_instruction_cond(alg.Alg_instruction_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_instruction_cond_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_instruction_cond_next(alg.Alg_instruction_cond_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_cicle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_cicle(alg.Alg_cicleContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_cicle_next}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_cicle_next(alg.Alg_cicle_nextContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_subblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_subblock(alg.Alg_subblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link alg#alg_instr_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlg_instr_repeat(alg.Alg_instr_repeatContext ctx);
}
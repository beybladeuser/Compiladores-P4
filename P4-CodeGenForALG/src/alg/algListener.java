// Generated from E:/escola/universidade_boi/3_ano/2_semestre/Compiladores/Praticas/Compiladores-P3/P3-SemanticsForALG/src\alg.g4 by ANTLR 4.9.1
package alg;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link alg}.
 */
public interface algListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link alg#alg_file}.
	 * @param ctx the parse tree
	 */
	void enterAlg_file(alg.Alg_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_file}.
	 * @param ctx the parse tree
	 */
	void exitAlg_file(alg.Alg_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_program}.
	 * @param ctx the parse tree
	 */
	void enterAlg_program(alg.Alg_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_program}.
	 * @param ctx the parse tree
	 */
	void exitAlg_program(alg.Alg_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAlg_declaration(alg.Alg_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAlg_declaration(alg.Alg_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAlg_var_declaration(alg.Alg_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAlg_var_declaration(alg.Alg_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_simple_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAlg_simple_var_declaration(alg.Alg_simple_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_simple_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAlg_simple_var_declaration(alg.Alg_simple_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_type}.
	 * @param ctx the parse tree
	 */
	void enterAlg_type(alg.Alg_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_type}.
	 * @param ctx the parse tree
	 */
	void exitAlg_type(alg.Alg_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_primitive_type}.
	 * @param ctx the parse tree
	 */
	void enterAlg_primitive_type(alg.Alg_primitive_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_primitive_type}.
	 * @param ctx the parse tree
	 */
	void exitAlg_primitive_type(alg.Alg_primitive_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_pointer_type}.
	 * @param ctx the parse tree
	 */
	void enterAlg_pointer_type(alg.Alg_pointer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_pointer_type}.
	 * @param ctx the parse tree
	 */
	void exitAlg_pointer_type(alg.Alg_pointer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_init_var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAlg_init_var_declaration(alg.Alg_init_var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_init_var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAlg_init_var_declaration(alg.Alg_init_var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(alg.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(alg.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Null}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull(alg.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Null}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull(alg.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Real}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterReal(alg.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Real}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitReal(alg.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool_True}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_True(alg.Bool_TrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool_True}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_True(alg.Bool_TrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool_False}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterBool_False(alg.Bool_FalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool_False}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitBool_False(alg.Bool_FalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterString(alg.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitString(alg.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterVar(alg.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitVar(alg.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterCall(alg.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link alg#alg_simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitCall(alg.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simple_expr}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(alg.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simple_expr}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(alg.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void enterParen(alg.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void exitParen(alg.ParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren_fail_1}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void enterParen_fail_1(alg.Paren_fail_1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren_fail_1}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void exitParen_fail_1(alg.Paren_fail_1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Paren_fail_2}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void enterParen_fail_2(alg.Paren_fail_2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Paren_fail_2}
	 * labeled alternative in {@link alg#alg_simple_expression_aux}.
	 * @param ctx the parse tree
	 */
	void exitParen_fail_2(alg.Paren_fail_2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code And_op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd_op(alg.And_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And_op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd_op(alg.And_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(alg.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(alg.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddition(alg.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddition(alg.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or_op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterOr_op(alg.Or_opContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or_op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitOr_op(alg.Or_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparisson}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisson(alg.ComparissonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparisson}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisson(alg.ComparissonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simple_expression}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(alg.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simple_expression}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(alg.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary_Op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_Op(alg.Unary_OpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary_Op}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_Op(alg.Unary_OpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pointer_Indexing}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void enterPointer_Indexing(alg.Pointer_IndexingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pointer_Indexing}
	 * labeled alternative in {@link alg#alg_expression}.
	 * @param ctx the parse tree
	 */
	void exitPointer_Indexing(alg.Pointer_IndexingContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_func_type}.
	 * @param ctx the parse tree
	 */
	void enterAlg_func_type(alg.Alg_func_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_func_type}.
	 * @param ctx the parse tree
	 */
	void exitAlg_func_type(alg.Alg_func_typeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Normal_Func}
	 * labeled alternative in {@link alg#alg_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNormal_Func(alg.Normal_FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Normal_Func}
	 * labeled alternative in {@link alg#alg_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNormal_Func(alg.Normal_FuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ALG_Func}
	 * labeled alternative in {@link alg#alg_func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterALG_Func(alg.ALG_FuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ALG_Func}
	 * labeled alternative in {@link alg#alg_func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitALG_Func(alg.ALG_FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_alg_function_args}.
	 * @param ctx the parse tree
	 */
	void enterAlg_alg_function_args(alg.Alg_alg_function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_alg_function_args}.
	 * @param ctx the parse tree
	 */
	void exitAlg_alg_function_args(alg.Alg_alg_function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_func_declaration_arg}.
	 * @param ctx the parse tree
	 */
	void enterAlg_func_declaration_arg(alg.Alg_func_declaration_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_func_declaration_arg}.
	 * @param ctx the parse tree
	 */
	void exitAlg_func_declaration_arg(alg.Alg_func_declaration_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_func_body}.
	 * @param ctx the parse tree
	 */
	void enterAlg_func_body(alg.Alg_func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_func_body}.
	 * @param ctx the parse tree
	 */
	void exitAlg_func_body(alg.Alg_func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_func_prologue}.
	 * @param ctx the parse tree
	 */
	void enterAlg_func_prologue(alg.Alg_func_prologueContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_func_prologue}.
	 * @param ctx the parse tree
	 */
	void exitAlg_func_prologue(alg.Alg_func_prologueContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_func_epilogue}.
	 * @param ctx the parse tree
	 */
	void enterAlg_func_epilogue(alg.Alg_func_epilogueContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_func_epilogue}.
	 * @param ctx the parse tree
	 */
	void exitAlg_func_epilogue(alg.Alg_func_epilogueContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_block}.
	 * @param ctx the parse tree
	 */
	void enterAlg_block(alg.Alg_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_block}.
	 * @param ctx the parse tree
	 */
	void exitAlg_block(alg.Alg_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Normal_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void enterNormal_Function_Call(alg.Normal_Function_CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Normal_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void exitNormal_Function_Call(alg.Normal_Function_CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AT_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void enterAT_Function_Call(alg.AT_Function_CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AT_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void exitAT_Function_Call(alg.AT_Function_CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sizeof_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void enterSizeof_Function_Call(alg.Sizeof_Function_CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sizeof_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void exitSizeof_Function_Call(alg.Sizeof_Function_CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Write_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void enterWrite_Function_Call(alg.Write_Function_CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Write_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void exitWrite_Function_Call(alg.Write_Function_CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteLn_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void enterWriteLn_Function_Call(alg.WriteLn_Function_CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteLn_Function_Call}
	 * labeled alternative in {@link alg#alg_funtion_call}.
	 * @param ctx the parse tree
	 */
	void exitWriteLn_Function_Call(alg.WriteLn_Function_CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_funtion_call_args}.
	 * @param ctx the parse tree
	 */
	void enterAlg_funtion_call_args(alg.Alg_funtion_call_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_funtion_call_args}.
	 * @param ctx the parse tree
	 */
	void exitAlg_funtion_call_args(alg.Alg_funtion_call_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_funtion_call_args_aux}.
	 * @param ctx the parse tree
	 */
	void enterAlg_funtion_call_args_aux(alg.Alg_funtion_call_args_auxContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_funtion_call_args_aux}.
	 * @param ctx the parse tree
	 */
	void exitAlg_funtion_call_args_aux(alg.Alg_funtion_call_args_auxContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 */
	void enterAlg_instruction(alg.Alg_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_instruction}.
	 * @param ctx the parse tree
	 */
	void exitAlg_instruction(alg.Alg_instructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Leave_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 */
	void enterLeave_control_instr(alg.Leave_control_instrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Leave_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 */
	void exitLeave_control_instr(alg.Leave_control_instrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Restart_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 */
	void enterRestart_control_instr(alg.Restart_control_instrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Restart_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 */
	void exitRestart_control_instr(alg.Restart_control_instrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 */
	void enterReturn_control_instr(alg.Return_control_instrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return_control_instr}
	 * labeled alternative in {@link alg#alg_instruction_controle}.
	 * @param ctx the parse tree
	 */
	void exitReturn_control_instr(alg.Return_control_instrContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_instruction_controle_next}.
	 * @param ctx the parse tree
	 */
	void enterAlg_instruction_controle_next(alg.Alg_instruction_controle_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_instruction_controle_next}.
	 * @param ctx the parse tree
	 */
	void exitAlg_instruction_controle_next(alg.Alg_instruction_controle_nextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lado_esquerdo_ident}
	 * labeled alternative in {@link alg#lado_esquerdo}.
	 * @param ctx the parse tree
	 */
	void enterLado_esquerdo_ident(alg.Lado_esquerdo_identContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lado_esquerdo_ident}
	 * labeled alternative in {@link alg#lado_esquerdo}.
	 * @param ctx the parse tree
	 */
	void exitLado_esquerdo_ident(alg.Lado_esquerdo_identContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lado_esquerdo_pointer_index}
	 * labeled alternative in {@link alg#lado_esquerdo}.
	 * @param ctx the parse tree
	 */
	void enterLado_esquerdo_pointer_index(alg.Lado_esquerdo_pointer_indexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lado_esquerdo_pointer_index}
	 * labeled alternative in {@link alg#lado_esquerdo}.
	 * @param ctx the parse tree
	 */
	void exitLado_esquerdo_pointer_index(alg.Lado_esquerdo_pointer_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_atrib}.
	 * @param ctx the parse tree
	 */
	void enterAlg_atrib(alg.Alg_atribContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_atrib}.
	 * @param ctx the parse tree
	 */
	void exitAlg_atrib(alg.Alg_atribContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_instruction_cond}.
	 * @param ctx the parse tree
	 */
	void enterAlg_instruction_cond(alg.Alg_instruction_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_instruction_cond}.
	 * @param ctx the parse tree
	 */
	void exitAlg_instruction_cond(alg.Alg_instruction_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_instruction_cond_next}.
	 * @param ctx the parse tree
	 */
	void enterAlg_instruction_cond_next(alg.Alg_instruction_cond_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_instruction_cond_next}.
	 * @param ctx the parse tree
	 */
	void exitAlg_instruction_cond_next(alg.Alg_instruction_cond_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_cicle}.
	 * @param ctx the parse tree
	 */
	void enterAlg_cicle(alg.Alg_cicleContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_cicle}.
	 * @param ctx the parse tree
	 */
	void exitAlg_cicle(alg.Alg_cicleContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_cicle_next}.
	 * @param ctx the parse tree
	 */
	void enterAlg_cicle_next(alg.Alg_cicle_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_cicle_next}.
	 * @param ctx the parse tree
	 */
	void exitAlg_cicle_next(alg.Alg_cicle_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_subblock}.
	 * @param ctx the parse tree
	 */
	void enterAlg_subblock(alg.Alg_subblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_subblock}.
	 * @param ctx the parse tree
	 */
	void exitAlg_subblock(alg.Alg_subblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link alg#alg_instr_repeat}.
	 * @param ctx the parse tree
	 */
	void enterAlg_instr_repeat(alg.Alg_instr_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link alg#alg_instr_repeat}.
	 * @param ctx the parse tree
	 */
	void exitAlg_instr_repeat(alg.Alg_instr_repeatContext ctx);
}
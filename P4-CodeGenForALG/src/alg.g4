parser grammar alg;

options{tokenVocab=algLexer;}

alg_file : alg_program EOF
	|	EOF {notifyErrorListeners("Valid ALG program requires at least one declaration, but only <EOF> was found");};

alg_program :	alg_declaration+;

alg_declaration :
	alg_var_declaration SEMMI_COLON
	|	alg_func_declaration
	| alg_var_declaration {notifyErrorListeners("Missing closing ;");}
	;

alg_var_declaration : alg_simple_var_declaration
	|	alg_init_var_declaration;

alg_simple_var_declaration : alg_type IDENT (COMMA IDENT)*;
//maneira tradicional
//alg_simple_var_declaration : alg_type IDENT alg_simple_var_declaration_next;
//alg_simple_var_declaration_next : COMMA IDENT alg_simple_var_declaration_next | ;

alg_type : 	alg_primitive_type
	|	alg_pointer_type;

alg_primitive_type : INT
	|	BOOL
	|	FLOAT
	|	STRING;

alg_pointer_type : LTRIANG alg_primitive_type RTRIANG;

alg_init_var_declaration : alg_type IDENT ATTRIBUTION_OP (alg_expression|LBRACKET alg_expression RBRACKET);

alg_simple_expression :
	LITERAL_INTEGER # Int
    |	NULL # Null
    |	LITERAL_REAL # Real
    |	TRUE # Bool_True
    |	FALSE # Bool_False
    |	CHAR_CHAIN # String
    |	IDENT # Var
    |	alg_funtion_call # Call;

alg_simple_expression_aux:
	alg_simple_expression # Simple_expr
	|	LPARENT alg_expression RPARENT # Paren
	| LPARENT alg_expression RPARENT RPARENT {notifyErrorListeners("Didn't expect closing ')'");} # Paren_fail_1
	| LPARENT alg_expression {notifyErrorListeners("Missing closing ')'");} # Paren_fail_2;

alg_expression :
	alg_simple_expression_aux # Simple_expression
	|	alg_expression LBRACKET alg_expression RBRACKET # Pointer_Indexing
	|	(PLUS_OP|MINUS_OP|NEGATION_OP|POINTER_EXTRATION_OP)alg_expression # Unary_Op
	|	alg_expression(MULTIPLICATION_OP|DIVISION_OP|REMAINDER_OP)alg_expression # Multiplication
	|	alg_expression(PLUS_OP|MINUS_OP)alg_expression # Addition
	|	alg_expression(LTRIANG|RTRIANG|COMPARISON_OP|EQUALITY_OP)alg_expression # Comparisson
	|	alg_expression LOGICAL_AND_OP alg_expression # And_op
	|	alg_expression LOGICAL_OR_OP alg_expression # Or_op;
//aqui a regra em baixo foi modificada para a de cima de forma a simplificar a analise semantica de expressoes
/*
alg_expression :
	alg_expression_logical_or;

alg_expression_logical_or :
	alg_expression_logical_and alg_expression_logical_or_aux;

alg_expression_logical_or_aux :
	LOGICAL_OR_OP alg_expression_logical_and alg_expression_logical_or_aux
	|;

alg_expression_logical_and :
	alg_expression_comparison alg_expression_logical_and_aux;

alg_expression_logical_and_aux :
	LOGICAL_AND_OP alg_expression_comparison alg_expression_logical_and_aux
	|;

alg_expression_comparison :
   	alg_expression_adition alg_expression_comparison_aux;

alg_expression_comparison_aux :
	(LTRIANG|RTRIANG|COMPARISON_OP|EQUALITY_OP)alg_expression_adition alg_expression_comparison_aux
	|;

alg_expression_adition :
	alg_expression_multiplication alg_expression_adition_aux;

alg_expression_adition_aux :
	(PLUS_OP|MINUS_OP)alg_expression_multiplication alg_expression_adition_aux
	|;

alg_expression_multiplication :
	alg_expression_unary_op alg_expression_multiplication_aux;

alg_expression_multiplication_aux :
	(MULTIPLICATION_OP|DIVISION_OP|REMAINDER_OP)alg_expression_unary_op alg_expression_multiplication_aux
	|;

alg_expression_unary_op :
	(PLUS_OP|MINUS_OP|NEGATION_OP|POINTER_EXTRATION_OP)alg_expression_pointer_indexing
	|	alg_expression_pointer_indexing;

alg_expression_pointer_indexing :
	alg_simple_expression_aux alg_expression_pointer_indexing_aux;

alg_expression_pointer_indexing_aux :
	LBRACKET alg_expression RBRACKET alg_expression_pointer_indexing_aux
	|;
*/


/////////////////////////////////////////////////////////////////////////////////////////////////////////

alg_func_type : alg_type | VOID;

//DECLARAÇÃO DE FUNÇÃO
alg_func_declaration :
   alg_func_type IDENT LPARENT alg_func_declaration_arg RPARENT alg_func_body # Normal_Func
   //|   INT ALG LPARENT INT IDENT COMMA LTRIANG STRING RTRIANG IDENT RPARENT alg_func_body # ALG_Func;
   //esta linha foi modificada de forma a ser possivel acrescentar os argumentos ao local scope antes de sair de ALG_Func, para usar estes no corpo
   |   INT ALG LPARENT alg_alg_function_args RPARENT alg_func_body # ALG_Func;

alg_alg_function_args : INT IDENT COMMA LTRIANG STRING RTRIANG IDENT;

alg_func_declaration_arg : alg_type IDENT (COMMA alg_type IDENT)* | ;


//CORPO DE FUNÇÃO
alg_func_body : alg_func_prologue alg_block alg_func_epilogue;
alg_func_prologue : AT_OP alg_block | ;
alg_func_epilogue : DOUBLE_ARROW_OP alg_block | ;

//BLOCO DE FUNÇÃO
alg_block : LCURLY (alg_var_declaration SEMMI_COLON)* alg_instruction+ RCURLY; //LCURLY alg_var_declr_repeat alg_instruction  alg_instr_repeat RCURLY;
                                                                 				// alg_var_declr_repeat : alg_var_declaration SEMMI_COLON alg_var_declr_repeat | ;


//INVOCAÇÃO DE FUNÇÕES
alg_funtion_call :
    IDENT LPARENT alg_funtion_call_args  RPARENT # Normal_Function_Call
    |   AT_OP LPARENT  RPARENT # AT_Function_Call
    |   SIZEOF LPARENT alg_expression RPARENT # Sizeof_Function_Call
    |   WRITE LPARENT alg_funtion_call_args RPARENT # Write_Function_Call
    |   WRITELN LPARENT alg_funtion_call_args RPARENT # WriteLn_Function_Call;


alg_funtion_call_args :
	alg_expression alg_funtion_call_args_aux
	|;

alg_funtion_call_args_aux :
	COMMA alg_expression alg_funtion_call_args_aux
	|;


//INSTRUÇÕES
alg_instruction :
    alg_expression SEMMI_COLON # ExpInst
    |   alg_instruction_controle SEMMI_COLON # Ctrl
    |   alg_atrib SEMMI_COLON # Assign
    |   alg_instruction_cond # If
    |   alg_cicle # While
    |   alg_subblock # SubBlock;

//INSTRUCAO CONTROLE
//alg_instruction_controle : LEAVE | RESTART | RETURN | RETURN alg_expression;
//aqui foi feito fatorizacao a esquerda. o que originou o seguinte
alg_instruction_controle : LEAVE # Leave_control_instr
	| RESTART # Restart_control_instr
	| RETURN alg_instruction_controle_next # Return_control_instr;
alg_instruction_controle_next : alg_expression |;


//ATRIBUICAO
lado_esquerdo : IDENT # Lado_esquerdo_ident
	| alg_expression LBRACKET alg_expression RBRACKET # Lado_esquerdo_pointer_index;

alg_atrib : lado_esquerdo  ATTRIBUTION_OP alg_expression;

//INSTRUCAO CONDICIONAL
//alg_instruction_cond : IF  alg_expression THEN alg_instruction | IF  alg_expression THEN alg_instruction ELSE alg_instruction;
//aqui foi feito fatorizacao a esquerda. o que originou o seguinte
alg_instruction_cond : IF  alg_expression THEN alg_instruction alg_instruction_cond_next;
alg_instruction_cond_next : ELSE alg_instruction | ;

//CICLO
//alg_cicle :  WHILE alg_expression DO alg_instruction |  WHILE alg_expression DO alg_instruction FINALLY alg_instruction;
//aqui foi feito fatorizacao a esquerda. o que originou o seguinte
alg_cicle :  WHILE alg_expression DO alg_instruction alg_cicle_next;
alg_cicle_next : FINALLY alg_instruction | ;


//SUBBLOCO
alg_subblock: LCURLY alg_instr_repeat RCURLY;
alg_instr_repeat : alg_instruction alg_instr_repeat | ; //LCURLY alg_instruction* RCURLY
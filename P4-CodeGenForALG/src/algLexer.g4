lexer grammar algLexer;

 //reserved words are recommended to have its own token
 INT : 'int';
 BOOL : 'bool';
 FLOAT : 'float';
 STRING : 'string';
 VOID : 'void';
 SIZEOF : 'sizeof';
 NULL : 'null';
 ALG : 'alg';

 TRUE : 'true';
 FALSE : 'false';

 WHILE : 'while';
 DO : 'do';
 FINALLY : 'finally';
 LEAVE : 'leave';
 RESTART : 'restart';
 RETURN : 'return';
 IF : 'if';
 THEN : 'then';
 ELSE : 'else';
 WRITE : 'write';
 WRITELN : 'writeln';

 //discard irrelevant info
 BLANK : ('\n'|'\r'|' '|'\t') -> skip;
 //grouped the 2 types of COMMENT
 fragment BLOCK_COMMENT_BODY : (~[*)] | '(*' | '*'(~[)]) | (~[*])')'     )*;
 COMMENT : ('##'(~[\r\n])*|'(*'BLOCK_COMMENT_BODY'*)') -> skip;

 //every pontuation simbol should have its own token
 COMMA : ',';
 SEMMI_COLON : ';';
 LPARENT : '(';
 RPARENT : ')';

 fragment LETTER :[a-zA-Z\p{Block=Latin_1_Supplement}];
 IDENT : LETTER(LETTER|DIGIT|'_')*;

 fragment DIGIT : [0-9];
 LITERAL_INTEGER : ([1-9]DIGIT*|[0]);

 fragment EXPONENT : ('E'|'e')(PLUS_OP|MINUS_OP|)LITERAL_INTEGER;

 LITERAL_REAL : LITERAL_INTEGER ('.'DIGIT+(EXPONENT|) | EXPONENT );

 CHAR_CHAIN : '\''(~[\u0000~']|'~\''|'~~'|'~n'|'~r'|'~t')*'\'';

 LBRACKET : '[';
 RBRACKET : ']';

 LCURLY : '{';
 RCURLY : '}';

 PLUS_OP : '+';
 MINUS_OP : '-';
 POINTER_EXTRATION_OP : '?';
 MULTIPLICATION_OP : '*';
 DIVISION_OP : '/';
 REMAINDER_OP : '%';
 LTRIANG : '<';
 RTRIANG : '>';
 COMPARISON_OP : ('>='|'<=');
 EQUALITY_OP : ('=='|'!=');
 NEGATION_OP : '~';
 LOGICAL_AND_OP : '&&';
 LOGICAL_OR_OP : '||';
 ATTRIBUTION_OP : '=';
 DOUBLE_ARROW_OP : '>>';
 AT_OP : '@';
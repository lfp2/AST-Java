grammar brgccf_lfp2;

/* This will be the entry point of our parser. */
goal
	:	mainClass ( classDeclaration )* EOF
	;

WS : [ \t\r\n\f]+ -> skip ;

formal
	:	type Identifier
	;
mainClass
	:	'class' Identifier '{' 'public' 'static' 'void' 'main' '(' 'String' 
		'[' ']' Identifier ')' '{' statement '}' '}'
	;
classDeclaration
	:	'class' Identifier ( 'extends' Identifier )? '{' ( varDeclaration )* 
		( methodDeclaration )* '}' 	
	;
varDeclaration 
	: 
		formal ';'
	;
methodDeclaration
	: 'public' formal '(' ( formal (',' formal)*)? ')' '{'
		( varDeclaration )* (statement)* 'return' expression ';''}'
	;
type
	:	'int' '[' ']'  
	|	'boolean'
	|	'int'
	|	Identifier
	;
statement
	:	'{'(statement)* '}'
	|	'if' '(' expression ')' statement 'else' statement
	|	'while' '(' expression ')' statement
	|	'System.out.println' '(' expression ')'';'
	|	Identifier '=' expression ';'
	|	Identifier '[' expression ']' '=' expression ';'
	;
INTEGER_LITERAL
	:
		[1-9][0-9]*|[0] //INTEGER_LITERAL
	;
expression
	:
		expression ( '&&' | '<' | '+' | '-' | '*' ) expression
	|	
		'[' expression ']'
	|
		'.' 'length'
	|
		'.' Identifier '(' ( expression ( ',' expression )* )? ')'
	|
		INTEGER_LITERAL
	|
		'true' 
	|
		'false' 
	|
		Identifier
	|
		'this' 
	|
		'new' 'int' '[' expression ']'
	|
		'new' Identifier '(' ')'
	|
		'!' expression
	|
		'(' expression ')'
	;
Identifier
	:
		[a-zA-Z]([a-zA-Z]|[0-9]|['_'])*
	;
Comment_line
	:
		'//'(~'\n')* -> skip
	;
Comment_ext
	:
		[/][*][^*]*[*]+([^*/][^*]*[*]+)*[/] -> skip
	;

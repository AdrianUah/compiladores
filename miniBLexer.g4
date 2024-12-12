lexer grammar miniBLexer;

// Tokens léxicos
NUMERO: [0-9]+;
STRING: '"' (~["])* '"';
ESPACIOS: [ \r\n\t]+ -> skip; // Ignora espacios en blanco, tabulaciones y saltos de línea

// Reglas de tokens literales
TRUE:'true';
FALSE:'false';
SWITCH: 'SWITCH' | 'switch';
CASE: 'CASE' | 'case';
DEFAULT: 'DEFAULT' | 'default';
BREAK: 'BREAK' | 'break';
LET: 'LET' | 'let';
IF: 'IF' | 'if';
THEN: 'THEN' | 'then';
ELSE: 'ELSE' | 'else';
END: 'END' | 'end';
WHILE: 'WHILE' | 'while';
DO: 'DO' | 'do';
FOR: 'FOR' | 'for';
TO: 'TO' | 'to';
NEXT: 'NEXT' | 'next';
REPEAT: 'REPEAT' | 'repeat';
UNTIL: 'UNTIL' | 'until';
VAL: 'VAL' | 'val';
LEN: 'LEN' | 'len';
ISNAN: 'ISNAN' | 'isnan';
PRINT: 'PRINT' | 'print';
INPUT: 'INPUT' | 'input';
COPY:'copy'|'COPY';
CONCAT:'CONCAT'|'concat';
ASIGNACION: '=';
MAS: '+';
MENOS: '-';
POR: '*';
DIVIDIR: '/';
LPAREN: '(';
LCORCH:'[';
RCORCH:']';
RPAREN: ')';
MAYOR: '>';
MENOR: '<';
MOD: 'MOD' | 'mod';
EXIT: 'EXIT' | 'exit';
CONTINUE: 'CONTINUE' | 'continue';
COMA: ',';
PUNTOPUNTO: ':';
PUNTO:'.';
COMENTARIOLINEA: 'REM' -> pushMode(COMENTARIO_LINEA_MODE);

IDENTIFICADOR: [a-zA-Z_][a-zA-Z_0-9]*;

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_UL: [\r\n] -> popMode, skip;
TEXTOCOMENTARIOUL: .+?;
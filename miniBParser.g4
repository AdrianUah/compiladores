parser grammar miniBParser;

options{
    tokenVocab = miniBLexer;
    language = Java;
}

// Regla de inicio para el análisis del programa
programa: (sentencia | comentario)* EOF;

// Definición de las sentencias posibles
sentencia: asignacion
    | funcion_llamada // Llamada a función como sentencia independiente
    | funcion   
    | expresion 
    | condicion
    | comentario
    | ciclo;

//Regla para la declaración de comentarios
comentario: COMENTARIOLINEA textos* #Coment; //FINAL_COMENTARIO_UL;
textos: TEXTOCOMENTARIOUL+;

// Regla para la asignación de valores a variables
asignacion: LET? identificador ASIGNACION expresion #Asign;

// Expresiones aritméticas básicas
// Expresiones aritméticas y operaciones básicas
expresion: expresion MAS expresion  #Mas
        | expresion MENOS expresion #Menos
        | expresion POR expresion   #Por
        | expresion DIVIDIR expresion   #Dividir
        | expresion MAYOR expresion #Mayor
        | expresion MENOR expresion #Menor
        | expresion MOD expresion   #Mod
        | expresion ASIGNACION expresion #Asigancion
         | LPAREN expresion RPAREN  #Agrupacion                                   
         | identificador  #Id
         | flotante #floatt                                                
         | numero         #Num                                                                                            
         | funcion        #F
         | booleano       #Bool
         | array          #Arrayy
         | string   #Strin
         | array_llamada #ArayLlamada
         | funcion_llamada #FunCall;  // Soporte para llamadas a funciones                               
         


// Regla para las estructuras de control
condicion: IF expresion THEN sentencia* (ELSE sentencia*)? END  #If
        | SWITCH expresion (CASE expresion PUNTOPUNTO sentencia* BREAK)* (DEFAULT PUNTOPUNTO sentencia*)? END   #Switch; 


// Regla para los ciclos (while, for y repeat)
ciclo: WHILE expresion sentencia* END   #While
     | FOR  expresion TO expresion sentencia+ NEXT  #For
     | REPEAT sentencia+ UNTIL expresion    #Repeat;
     
// Funciones de MiniB
funcion: VAL  expresion #Print
       | LEN  expresion #Len
       | ISNAN  expresion #Isnan
       | PRINT expresion    #Print
       | EXIT   #Exit
       | CONTINUE   #Continue
       | INPUT string identificador #Input
       | COPY identificador identificador #CopyString // Agregamos la operación para copiar cadenas
       | CONCAT identificador COMA identificador #ConcatString // Ejemplo adicional para concatenar cadenas
       | funcion_usuario #F_U
       ;

// Funcion del usuario       
funcion_usuario: identificador LPAREN (identificador (COMA identificador)*)? RPAREN (sentencia END)*  #FunUsuario;

//bloque: (sentencia | comentario)*;

funcion_llamada: identificador LPAREN (expresion (COMA expresion)*)? RPAREN #FunLlamada;

// Tipos y definiciones
identificador: IDENTIFICADOR;
flotante: NUMERO PUNTO NUMERO #Float;  // Definir tipo flotante
numero: NUMERO;
string: STRING;
booleano: TRUE | FALSE #Bool; // Definir tipo booleano
array: identificador LCORCH RCORCH ASIGNACION (expresion (COMA expresion)*) #Aray;  // Definir array

array_llamada:identificador LCORCH numero RCORCH    #ArrayLlamada;
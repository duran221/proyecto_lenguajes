package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
LETRACARACTER=[a-zA-Z_]+
NUMERO=[0-9]+
ESPACIO=[ ,\t,\n,\r]+
EXTENSION=[j,p,g,i]
%{
    public String Analizador;
%}
%%
APPEND |
EDIT |
DESTROY |
FACT |
DESTROYNAME |
DESTROYNIT |
DESTROYTEL |
DESTROYDIR |
DESTROYLOGO |
DESTROYCODFAC |
TOLPRE |
TOLFACT |
EDITNAME |
EDITCED |
EDITTEL |
DESTROYCANT |
DESTROYIVA |
DESTROYPRECIO |
DESTROYCED |
LOCATION


{Analizador=yytext(); return PALABRA_RESERVADA;}
{ESPACIO} {/*Ignore*/}
"//".* {/*Ignore*/}

"=" {return Igual;}
"+" {return Suma;}
"-" {return Resta;}
"*" {return Multiplicacion;}
"'" {return Apostrofe;}
"<" {return Menor;}
">" {return Mayor;}
"#" {return Numeral;}
"$" {return Dolar;}
"%" {return Porcentaje;}
"&" {return Anpersand;}
"/" {return Division;}
"(" {return ParentesisAbierto;}
")" {return ParentesisCerrado;}
"?" {return Interrogacion;}
"¿" {return InterrogacionC;}
"-" {return GuionMedio;}
"," {return Coma;}
"." {return Punto;}
";" {return PuntoComa;}


("P_#"{NUMERO}) {Analizador=yytext(); return IDENTIFICADORPRODUCTO;}
("F_#"{NUMERO}) {Analizador=yytext(); return IDENTIFICADORFACTURA;}
("CL_#"{NUMERO}) {Analizador=yytext(); return IDCLIENTE;}
("V_#"{NUMERO}) {Analizador=yytext(); return IDENTIFICADORVENTA;}

("31"{NUMERO}) | ("32"{NUMERO}) | ("30"{NUMERO}) {Analizador=yytext(); return TELEFONO;}
({LETRACARACTER}) ({ESPACIO} ({NUMERO} | {NUMERO}{LETRACARACTER})) ((" #"{NUMERO}"-"{NUMERO}) | (" #"{NUMERO}{LETRACARACTER}"-"{NUMERO})) {Analizador=yytext(); return DIRECCION;}
({LETRACARACTER}".") {EXTENSION} {Analizador=yytext(); return LOGO;}
("$"{NUMERO}) {Analizador=yytext(); return PRECIO;}

("CL"{NUMERO}) {Analizador=yytext(); return IDCLIENTE;}

({NUMERO}"%")|({NUMERO}"."{NUMERO}"%") {Analizador=yytext(); return IVA;}
("F"{NUMERO}) {Analizador=yytext(); return CODIGOFACTURA;}
("N"{NUMERO}) {Analizador=yytext(); return NIT;}
({NUMERO}"V") {Analizador=yytext(); return COORDENADA_Y;}
({NUMERO}"H") {Analizador=yytext(); return COORDENADA_X;}


("COMERCIANTE INDEPENDIENTE") | ("PEQUEÑA EMPRESA") |("GRANDE EMPRESA") | ("PUBLICO GENERAL") {Analizador=yytext(); return ENTE;}
{NUMERO}+ {Analizador=yytext(); return Numero;}
{LETRACARACTER}+ {Analizador=yytext(); return NOMBRE;}

 . {return ERROR;}


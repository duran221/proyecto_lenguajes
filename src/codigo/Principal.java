package codigo;


import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Principal {
    public static void main(String[] args) {
        String ruta = "C:/Users/crist/OneDrive/Documentos/Universidad/EstructuraLenguajes/Proyecto/ProyectoLenguajes/src/codigo/lexer.flex";
        generarLexer(ruta);
    }
    
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        
    }
    
    }
    
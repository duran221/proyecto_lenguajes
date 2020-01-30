/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author crist
 */
public class frmInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form frmInterfaz
     */
    public frmInterfaz() {
        initComponents();
        Color color = new Color( hex("F9AF95") );
        this.getContentPane().setBackground(color);
        txtInfo.setEditable(false);
        
        PanelFondo panel= new PanelFondo();
        this.add(panel,BorderLayout.CENTER);
        this.pack();
        
    }
    
    /**
     * 
     * @param color_hex código hexadecimal de el color a consultar
     * @return un entero con la referencia de el color consultado
     */
    private int hex( String color_hex )
    {
        return Integer.parseInt(color_hex,  16 );
    }
    
    
    /**
     * Analiza el archivo ingresado en la interfaz de ejecución retornando los tokens encontrados
     */
    public void analizador(){
        File archivo= new File("archivo.txt");
        PrintWriter escribir;
        try {
            escribir= new PrintWriter(archivo);
            escribir.print(txtInput.getText());
            escribir.close();
            this.verificar();
            
        } catch (FileNotFoundException ex) {
            
            Logger.getLogger(frmInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
       
        
        
    }
    
    /**
     * Lee cada uno de los tokens retornados por el analizador Lexer
     */
    public void verificar(){
        try {
            Reader lector = new BufferedReader(new FileReader("archivo.txt"));
            Lexer lexer = new Lexer(lector);
            String resultado= "";
            while (true) {
                Tokens tokens = lexer.yylex();
                
                if(tokens== null){
                    resultado+= "FIN";
                    txtInfo.setText(resultado);
                    return;
                }
                
                resultado= this.verificarToken(lexer,tokens,resultado);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmInterfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    /**
     * 
     * @param lexer Analizador que me permite retornar los tokens del archivo consultado
     * @param tokens Cada uno de los elementos encontrados en el analisis de el código
     * @param resultado Cadena que va concatenando los resultados
     * @return una cadena con todos los tokens encontrados
     */
    public String verificarToken(Lexer lexer,Tokens tokens,String resultado){
        
        switch(tokens){
            case ERROR:
                
                resultado+= "Simbolo no definido\n";
                break;
                
            case IDENTIFICADORPRODUCTO:
            case IDENTIFICADORFACTURA:
            case IDENTIFICADORVENTA:
            case IDCLIENTE:
                resultado+= lexer.Analizador + " Es un " + tokens +" : Identificador\n";
                break;
            
            
            default:
                resultado+= "Token: " +tokens +"\n";
                break;
        }   
        
        return resultado;
    }
    
    /**
     * Limpiar los cuadros de ingreso y muestra de información:
     */
    public void limpiarInterfaz(){
        this.txtInput.setText("");
        this.txtInfo.setText("");
    
    }
    
    
    
    /**
     * Busca un archivo txt desde una fuente externa y lo carga en el cuadro de texto de edición de código
     * 
     */
    public void cargarArchivo(){
        // muestra el cuadro de diálogo de archivos, para que el usuario pueda elegir el archivo a abrir
        JFileChooser selectorArchivos = new JFileChooser();
        
        selectorArchivos.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        // indica cual fue la accion de usuario sobre el jfilechooser
        int resultado = selectorArchivos.showOpenDialog(this);
        
   
        File archivo = selectorArchivos.getSelectedFile(); // obtiene el archivo seleccionado

        // muestra error si es inválido
        if ((archivo == null) || (archivo.getName().equals(""))) {
            txtInfo.setText("Archivo invalido");
        } // fin de if

        
            try {
                lblCarga.setText(archivo.getAbsolutePath());
    
                Scanner scn;
                scn = new Scanner(archivo);
                while (scn.hasNext()) {
                    txtInput.insert(scn.nextLine() + "\n", txtInput.getText().length());
                }
            } catch (FileNotFoundException ex) {
                txtInfo.setText("Escriba o cargue desde un archivo txt");
            }


        }
    
    
    
        /**
         * Finaliza la ejecución de el programa:
         */
        public void cerrar(){
            this.dispose();
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        btnEjecutar = new javax.swing.JButton();
        lblCadena = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnCargarArchivo = new javax.swing.JButton();
        lblCarga = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N

        txtInfo.setColumns(20);
        txtInfo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtInfo.setRows(5);
        jScrollPane1.setViewportView(txtInfo);

        btnEjecutar.setBackground(new java.awt.Color(51, 153, 255));
        btnEjecutar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEjecutar.setText("Aceptar");
        btnEjecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        lblCadena.setBackground(new java.awt.Color(255, 255, 255));
        lblCadena.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCadena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCadena.setText("Introduce Cadena");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Analizador Léxico");

        txtInput.setColumns(20);
        txtInput.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txtInput.setRows(5);
        jScrollPane2.setViewportView(txtInput);

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCargarArchivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCargarArchivo.setText("Cargar Archivo");
        btnCargarArchivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarArchivoActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 102, 102));
        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCerrar.setText("Cerrar");
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCargarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEjecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCargarArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(lblCadena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblCarga, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEjecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        // TODO add your handling code here:
        this.analizador();
    }//GEN-LAST:event_btnEjecutarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        this.limpiarInterfaz();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCargarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarArchivoActionPerformed
        // TODO add your handling code here:
        this.cargarArchivo();
    }//GEN-LAST:event_btnCargarArchivoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:}
        this.cerrar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInterfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInterfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarArchivo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCadena;
    private javax.swing.JLabel lblCarga;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txtInfo;
    private javax.swing.JTextArea txtInput;
    // End of variables declaration//GEN-END:variables
}

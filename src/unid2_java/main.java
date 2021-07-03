package unid2_java;

import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro
 */
public class main {

  
    public static void main(String[] args) {
    
        String nombre, apellido, hobbie, editorCodigo, sistOperativo;
        int edad;
        
        //Pedido de datos        
        nombre=JOptionPane.showInputDialog("Ingrese su Nombre:");
        apellido=JOptionPane.showInputDialog("Ingrese su Apellido:");
        edad= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
        hobbie=JOptionPane.showInputDialog("Ingrese su hobbie:");
        editorCodigo=JOptionPane.showInputDialog("Ingrese el editor de codigo mas utilizado:");
        sistOperativo=JOptionPane.showInputDialog("Ingrese el Sistema Operativo qe utiliza:");
        
        //Creacion de Objeto Persona1
        Usuario Persona1 = new Usuario (nombre, apellido, edad,hobbie, editorCodigo,sistOperativo);
        Persona1.mostrasDatos();
        
        
    }
    
}

package unid2_java;

import javax.swing.JOptionPane;


public class Usuario {
    
//Atributos
    private String nombre;
    private String  apellido;
    private int edad;
    private String hobbie;
    private String editorCodigo;
    private String sistOperativo;

    
//Constructores    
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad, String hobbie, String editorTexto, String sistOperativo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.hobbie = hobbie;
        this.editorCodigo = editorTexto;
        this.sistOperativo = sistOperativo;
    }

    
//Metodos Getters y Setters (no son necesarios en este ejercicio)
    public String getSistOperativo() {
        return sistOperativo;
    }

    public void setSistOperativo(String sistOperativo) {
        this.sistOperativo = sistOperativo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getEditorCodigo() {
        return editorCodigo;
    }

    public void setEditorCodigo(String editorCodigo) {
        this.editorCodigo = editorCodigo;
    }

//Metodo
    public void mostrasDatos() {
        
        JOptionPane.showMessageDialog(null, "Los datos ingresados son: ver en consola");
        System.out.println("El nombre es: " + nombre +"\nEl apellido es: " + apellido + "\nLa edad es: " + edad + "\nEl hobbie es: " + hobbie +" \nEl editor de texto preferido es: " + editorCodigo + "\nEl sistema operativo que utiliza es: " + sistOperativo);
        
    }
    
    
    
    
    
    
    
    
    
}

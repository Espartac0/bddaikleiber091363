package Ejercicio5;

/**
 *
 * @author Kleiber
 */
public class CPersona {
    //--atributo
    private String nombre;
    private int edad;
    //--constructor
    public CPersona(String nombre,int edad){
        super();
        this.nombre = nombre;
        this.edad = edad;
    }
    //--propiedades
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    //--Otros metodos
    @Override
    public boolean equals(Object o){
        CPersona P = (CPersona) o;
        if(P.getNombre()== this.nombre && P.getEdad() == this.edad)
            return true;
        else 
            return false;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Edad: " + this.edad;
    }
}

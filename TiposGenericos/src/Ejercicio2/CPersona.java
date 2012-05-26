package Ejercicio2;
/**
 *
 * @author Kleiber
 */
public class CPersona implements Comparable<CPersona>{
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
    public int compareTo(CPersona o) {
        return String.valueOf(o.edad).compareTo(String.valueOf(edad));
        //return o.nombre.compareTo(nombre);
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Edad: " + this.edad;
    }
}

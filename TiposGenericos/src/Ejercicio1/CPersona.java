package Ejercicio1;

/**
 *
 * @author Kleiber
 */
public class CPersona implements Comparable<CPersona> {
        //--atributo
    private String nombre;
    //--constructor
    public CPersona(String nombre){
        super();
        this.nombre = nombre;
    }
    //--propiedades
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //--Otros metodos
    @Override
    public int compareTo(CPersona o) {
        return o.nombre.compareTo(nombre);
        //return o.nombre.compareTo(nombre);
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre;
    }
    
}

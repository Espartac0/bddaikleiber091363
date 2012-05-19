package Ejercicio2And3;
import java.io.*;
import java.util.*;
/**
 *
 * @author Kleiber
 */
public class Persona implements Serializable{
    //==============================ATRIBUTOS===================================
    public Nombre aNombre ;
    public Direccion aDireccion;

    public Persona(){
        aNombre =  new Nombre();
        aDireccion = new Direccion();
    }
    //=========================PROPIEDADES======================================
    public Direccion getaDireccion() {
        return aDireccion;
    }

    public void setaDireccion(Direccion aDireccion) {
        this.aDireccion = aDireccion;
    }

    public Nombre getaNombre() {
        return aNombre;
    }

    public void setaNombre(Nombre aNombre) {
        this.aNombre = aNombre;
    }
    //=================================METODOS==================================

    /*======================== OVERRIDE ===============================*/
    /*reescribimos los metodos tostring equals and hascode*/
    @Override
    public String toString(){
        return (getaNombre() + " " + getaDireccion());
    }
}

package Ejercicio5;

/**
 *
 * @author Kleiber
 */
public class Elemento<E>{
        //--atributos
    public E Dato;
    public Elemento<E> Siguiente;
    //--constructores
    public Elemento(E Dato){
        this.Dato = Dato;
        this.Siguiente = null;
    }
    public Elemento(E Dato,Elemento Siguiente){
        this.Dato = Dato;
        this.Siguiente = Siguiente;
    }
    //--propiedades

    public E getDato() {
        return Dato;
    }

    public void setDato(E Dato) {
        this.Dato = Dato;
    }

    public Elemento<E> getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Elemento<E> Siguiente) {
        this.Siguiente = Siguiente;
    }
  
}

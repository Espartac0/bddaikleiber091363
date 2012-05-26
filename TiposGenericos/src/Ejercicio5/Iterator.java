package Ejercicio5;

/**
 *
 * @author Kleiber
 */
public class Iterator<E> {
    //--Atributos
    public ListaEnlazada<E> Lista;
    public int Posicion;
    public int Anterior;
    //--Constructores
    public Iterator(ListaEnlazada<E> Lista){
        this.Lista = Lista;
        this.Posicion = 0;
        this.Anterior = -1;
    }
    //--Propiedades
    
    public ListaEnlazada<E> getLista() {
        return Lista;
    }

    public void setLista(ListaEnlazada<E> Lista) {
        this.Lista = Lista;
    }

    public int getPosicion() {
        return Posicion;
    }

    public void setPosicion(int Posicion) {
        this.Posicion = Posicion;
    }
    //--Otros Metodos
    public boolean ExisteSiguiente(){
        return (Posicion < Lista.Tamaño);
    }
    
    public E Siguiente(){
        E S = null;
        if(Posicion < Lista.Tamaño){
            S = Lista.Elemento(Posicion); 
            Anterior = Posicion;
            Posicion ++;
            
        }
        return S;
    }
    
    public boolean ExisteAnterior(){
        return (-1 < Posicion--);
    }
    
    public E Anterior(){
        E S = null;
        if(-1 < Posicion){
            S = Lista.Elemento(Posicion); 
            Anterior --;
            Posicion --;
            
        }
        return S;
    }
}

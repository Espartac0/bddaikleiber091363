package Ejercicio3;
/**
 *
 * @author Kleiber
 */
public class ListaEnlazada<E>{
    //--Atributos
    private Elemento<E> Primero;
    private int Tamaño;
    
    //--Constructores
    public ListaEnlazada(){
        Primero = null;
        Tamaño = 0;
    }
    //--Otros Metodos
    public void Insertar(E X){
        Primero = new Elemento<E>(X,Primero);
        this.Tamaño++;
    }
    
    public void Borrar(E X){
        Elemento<E> aux = Primero,ant = null;
        while(aux != null && !aux.Dato.equals(X)){
            ant  = aux;
            aux = aux.Siguiente;
        }
        if(aux != null){
            this.Tamaño--;
            if(ant == null)
                Primero = aux.Siguiente;
            else
                ant.Siguiente = aux.Siguiente;
        }
        else
            System.out.println(X.toString() +  " Elemento no existe en la lista");
    }
    //--Metodos Override
    @Override
    public String toString(){
        String E = "";
        for (Elemento<E>aux = Primero; aux != null;aux = aux.Siguiente) {
            E += aux.Dato.toString() + "\n";
        }
        return E;
    }
}

package Ejercicio5;

/**
 *
 * @author Kleiber
 */
public class PruebaIterator {
    public static void main(String[] args){
        ListaEnlazada<CPersona> lista = new ListaEnlazada<CPersona>();
        lista.Insertar(new CPersona("Juan",15));
        lista.Insertar(new CPersona("Alberto",20));
        lista.Insertar(new CPersona("Ivan",12));
        lista.Insertar(new CPersona("Angel",17));
        //--iterator
        Iterator<CPersona> i =  new Iterator(lista);
        while (i.ExisteSiguiente()) {
            CPersona P = i.Siguiente();
            System.out.println(P);
        }
    }
}

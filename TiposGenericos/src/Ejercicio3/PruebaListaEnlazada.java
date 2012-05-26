package Ejercicio3;
/**
 *
 * @author Kleiber
 */
public class PruebaListaEnlazada {
    public static void main(String[] args){
        ListaEnlazada<CPersona> lista = new ListaEnlazada<CPersona>();
        lista.Insertar(new CPersona("Juan",15));
        lista.Insertar(new CPersona("Alberto",20));
        lista.Insertar(new CPersona("Ivan",12));
        lista.Insertar(new CPersona("Angel",17));
        System.out.println(lista);
        CPersona P = new CPersona("Alberto",20);
        lista.Borrar(P);
        System.out.println(lista);
    }
}

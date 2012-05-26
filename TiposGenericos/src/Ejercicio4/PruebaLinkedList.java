package Ejercicio4;
import java.util.LinkedList;

/**
 *
 * @author Kleiber
 */
public class PruebaLinkedList {
         public static void main(String[] args){
        //--crear una lista de personas
        LinkedList <CPersona> lista = new LinkedList<CPersona>();
        lista.add(new CPersona("Juan",15));
        lista.add(new CPersona("Alberto",20));
        lista.add(new CPersona("Ivan",12));
        lista.add(new CPersona("Angel",17));
        //--imprimir la lista de personas
        System.out.println(lista);
        CPersona P = new CPersona("Alberto",20);
        lista.remove(P);
        System.out.println(lista);
    }
}

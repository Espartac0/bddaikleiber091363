package Ejercicio1;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Kleiber
 */
public class PruebaDescentente {
     public static void main(String[] args){
        //--crear una lista de personas
        Set <CPersona> lista = new TreeSet<CPersona>();
        lista.add(new CPersona("Juan"));
        lista.add(new CPersona("Alberto"));
        lista.add(new CPersona("Ivan"));
        lista.add(new CPersona("Angel"));
        //--imprimir la lista de personas
        System.out.println(lista);
    }
}

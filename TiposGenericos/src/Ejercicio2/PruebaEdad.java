package Ejercicio2;
import java.util.Set;
import java.util.TreeSet;
/**
 *
 * @author Kleiber
 */
public class PruebaEdad {
    public static void main(String[] args){
            //--crear una lista de personas
        Set <CPersona> lista = new TreeSet<CPersona>();
        lista.add(new CPersona("Juan",15));
        lista.add(new CPersona("Alberto",20));
        lista.add(new CPersona("Ivan",12));
        lista.add(new CPersona("Angel",17));
        //--imprimir la lista de personas
        System.out.println(lista);
    }
}


package Ejercicio2And3;
import java.util.*;

/**
 *
 * @author Kleiber
 */
public class Main {
    //=========================================================
    public static void AgregarPersona(ArrayList L){
        Scanner in =  new Scanner(System.in);
        System.out.print("Numero de Personas : ");
        int n = in.nextInt();
        System.out.println();
        for (int i= 0; i < n; i++) {
            System.out.println("DATOS DE LA " + (i+1) +" PERSONA ");
            Persona P = new Persona();
            P.aNombre.LeerNombre();
            P.aDireccion.ElegirDirreccion();
            L.add(P);
            System.out.println();
        }
        System.out.println();
        CSerializacion S = new CSerializacion();
        S.Serealizar(L);
       
    }
//===================================================================
    public static void ListarPersonas(){
        CDeserializacion D = new CDeserializacion();
        D.Deserealizar();
    }
//=====================================================================
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList L = new ArrayList();
        int opcion = 0;
        do{
            System.out.println("       MENU       ");
            System.out.println("==================");
            System.out.println("1.Agregar Persona");
            System.out.println("2.Listar Personas");
            System.out.println("3.Salir");
            Scanner in =  new Scanner(System.in);
            System.out.print("Opcion ----> ");
            opcion = in.nextInt();
            switch(opcion){
                case 1: AgregarPersona(L);
                break;
                case 2: ListarPersonas();
                break;
            }
        }while(opcion < 3);

    }

}

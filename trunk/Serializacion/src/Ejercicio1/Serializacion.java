package Ejercicio1;
import java.io.*;
/**
 *
 * @author Kleiber
 */
public class Serializacion {
    public static void main(String[] args){
        Agenda a1 = new Agenda("Edison", "Ttito", "Concha");
        Agenda a2 = new Agenda("Oscar", "Sequeiros", "Serrano");

        //--colocamos los objetos en disco
        try{
            //--creamos el archivo
            FileOutputStream fs = new FileOutputStream("agenda.ser");
            //--posee el metodo writeObject()
            ObjectOutputStream os =  new ObjectOutputStream(fs);
            //--serializamos el objeto
            os.writeObject(a1);
            os.writeObject(a2);
            //--cerramos el archivo
            os.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Los objetos se han serializados correctamente");
    }
}

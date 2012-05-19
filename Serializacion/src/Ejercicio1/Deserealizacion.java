package Ejercicio1;
import java.io.*;
/**
 *
 * @author Kleiber
 */
public class Deserealizacion {
    public static void main(String[] args){
        Agenda a1 = null;
        Agenda a2 = null;

        //--colocamos los objetos en disco
        try{
            //--creamos el archivo
            FileInputStream fis = new FileInputStream("agenda.ser");
            //--posee el metodo readObject()
            ObjectInputStream ois =  new ObjectInputStream(fis);
            //--deserealizamos el objeto
            a1 = (Agenda) ois.readObject();
            a2 = (Agenda) ois.readObject();
            //--cerramos el archivo
            ois.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Los objetos se han deserealizados correctamente");
        System.out.println(a1.toString());
        System.out.println(a2.toString());


    }
}

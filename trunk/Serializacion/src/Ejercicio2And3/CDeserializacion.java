package Ejercicio2And3;
import java.io.*;
import java.util.ArrayList;

public class CDeserializacion {

    public CDeserializacion()
    {
        /*constructor*/
    }
    public void Deserealizar()
    {
        //--colocamos los objetos en disco
        try{
            //--creamos el archivo
            FileInputStream fis = new FileInputStream("agenda.ser");
            //--posee el metodo readObject()
            ObjectInputStream ois =  new ObjectInputStream(fis);
            //--deserealizamos el objeto
            System.out.println();
            System.out.println("           PERSONAS AGREGADAS      ");
            System.out.println("===================================");
            int n = 1;
            for ( int i = 0; i<= n; i++) {
                if(i == 0){
                    n = ois.readInt();
                }
                else{
                    Persona P = null;
                    P = (Persona)ois.readObject();
                    System.out.println(P.toString());
                }
            }
            System.out.println();
            //--cerramos el archivo
            ois.close();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }


    }
}

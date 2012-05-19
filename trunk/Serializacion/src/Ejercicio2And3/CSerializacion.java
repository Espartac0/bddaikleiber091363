package Ejercicio2And3;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author Kleiber
 */
public class CSerializacion {
    public CSerializacion()
    {
    }

    public void Serealizar(ArrayList L)
    {
         //--colocamos los objetos en disco
        try{
            //--creamos el archivo
            FileOutputStream fs = new FileOutputStream("agenda.ser");
            //--posee el metodo writeObject()
            ObjectOutputStream os =  new ObjectOutputStream(fs);
            //--serializamos el objeto
            for (int i= 0; i <= L.size(); i++) {
                if(i == 0){
                    os.writeInt(L.size());
                }
                else{
                    Persona P = (Persona)L.get(i - 1);
                    os.writeObject(P);
                }
              }
            //--cerramos el archivo
            os.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    /*======================== OVERRIDE ===============================*/
    /*reescribimos los metodos writeobject*/

}

package Ejercicio2And3;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Kleiber
 */
public class Nombre implements Serializable {
    //==============================ATRIBUTOS===================================
    public String nombre ;
    public String ApellidoPaterno;
    public String ApellidoMaterno;
    //==============================PROPIEDADES============================
    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void LeerNombre()
    {
        try{
        Scanner in =  new Scanner(System.in);
        //--leemos el nombre
        System.out.print("Nombre : ");
        nombre = in.nextLine();
        //--leemos apellido paterno
        System.out.print("Apellido Paterno : ");
        ApellidoPaterno =  in.nextLine();
        //--leemos apellido materno
        System.out.print("Apellido Materno : ");
        ApellidoMaterno =  in.nextLine();
        }catch(Exception e)
        {
            System.out.print(e.toString());
        }
    }
     /*======================== OVERRIDE ===============================*/
    /*reescribimos los metodos tostring equals and hascode*/
    @Override
    public String toString(){
        return (getApellidoPaterno()+" "+getApellidoMaterno() + " " + getNombre());
    }
}

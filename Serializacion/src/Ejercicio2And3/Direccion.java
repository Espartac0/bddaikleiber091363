
package Ejercicio2And3;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Kleiber
 */
public class Direccion implements Serializable {
    //==============================ATRIBUTOS===============================
    public String aTipoDirrecion;
    public String aDirrecion;
    //=====================PROPIEDAES=======================================
    public String getaDirrecion() {
        return aDirrecion;
    }

    public void setaDirrecion(String aDirrecion) {
        this.aDirrecion = aDirrecion;
    }

    public String getaTipoDirrecion() {
        return aTipoDirrecion;
    }

    public void setaTipoDirrecion(String aTipoDirrecion) {
        this.aTipoDirrecion = aTipoDirrecion;
    }

    public void ElegirDirreccion(){
        Scanner in =  new Scanner(System.in);
        //--leemos el tipo de dirrecion
        System.out.print("TipoDirrecion : ");
        aTipoDirrecion =  in.nextLine();
        //--leemos la direccion
        System.out.print("Direccion : ");
        aDirrecion =  in.nextLine();
    }

    /*======================== OVERRIDE ===============================*/
    /*reescribimos los metodos tostring equals and hascode*/
    @Override
    public String toString(){
        return (getaTipoDirrecion()+"  "+getaDirrecion());
    }
}

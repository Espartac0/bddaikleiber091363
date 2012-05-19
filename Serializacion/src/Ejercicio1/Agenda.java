package Ejercicio1;
import java.io.*;
import java.util.Calendar;
/**
 *
 * @author Kleiber
 */
public class Agenda implements Serializable {
    /*================== ATRIBUTOS ===========================*/
    private String nombre;
    private String p_apellido;
    private String s_apellido;
    //--para probar la selializacion con atributos transiet y static
    //--una variable la cual no sera serealizada
    //--por que no es importatnte
    /*recuperamos la hora del sistema*/
    Calendar Calendario =  Calendar.getInstance();
    transient private String Hora = String.valueOf(Calendario.get(Calendar.HOUR) + ":"+Calendario.get(Calendar.MINUTE) + ":"+Calendario.get(Calendar.MILLISECOND));

    /*===================PROPIEDADES ========================*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getP_apellido() {
        return p_apellido;
    }

    public void setP_apellido(String p_apellido) {
        this.p_apellido = p_apellido;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    /*================= CONSTRUCTORES =================================*/
    public Agenda(String nombre,String p_apellido,String s_apellido){
        super();
        this.nombre = nombre;
        this.p_apellido = p_apellido;
        this.s_apellido = s_apellido;
    }

    /*======================== OVERRIDE ===============================*/
    /*reescribimos los metodos tostring equals and hascode*/
    @Override
    public String toString(){
        return (getNombre() + " " + getP_apellido()+" "+getS_apellido() + " " + Hora);
    }

}

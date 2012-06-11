/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor_.memoria;

/**
 *
 * @author Kleiber
 */
public class Pagina<T> {
    //--atributos
    private int numeroPagina;
    private T datos;
    //--variable para verificar si se actualizo la pagina
    private boolean Clavada;
    private boolean Actualizo;

    //--constructor
    public Pagina(int numeroPagina,T datos,boolean clavada){
        this.numeroPagina = numeroPagina;
        this.datos = datos;
        /*un atributo, para verificar si una pagina es clavada o no*/
        this.Clavada = clavada;
        /* inicializamos con false, cuando se llegue a actualizar sera true
           pero solo hasta que sea grabado en disco, por que luego volvera 
           con el valor de false ya que esta grabado en disco y aun no se actualizo
       */
        this.Actualizo =  false;
    }
    
    //--propiedades
    public T getDatos() {
        return datos;
    }

    public void setDatos(T datos) {
        this.datos = datos;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }
    
    public boolean getActualizo() {
        return Actualizo;
    }

    public void setActualizo(boolean actualizo) {
        this.Actualizo = actualizo;
    }
    public boolean getClavada() {
        return Clavada;
    }

    public void setClavada(boolean clavada) {
        this.Clavada = clavada;
    }
    //--tostring()
    @Override
    public String toString(){
        return "Numero de Pagina: " + this.numeroPagina + "\t" + "Dato de Pagina : " + this.datos;
    }   
}


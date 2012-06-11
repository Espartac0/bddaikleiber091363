/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor_.memoria;

import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;

/**
 *
 * @author Kleiber
 */
public class GestorMemoriaIntermedia {
    //--no importa
    static final Logger logger = Logger.getLogger("Gestion de Buffer");
    //representa los bloques de la memoria intermedia
    private Pagina[] buffer;
    //numero de paginas en el buffer
    private int numeroPaginas;
    //Posicion de la ultima pagina en el buffer
    private int posicionUltimaPagina = -1;
    //cola para el control de sustitucion basada en LRU
    private Queue ColaLRU;
    
    /*Crear un nuevo gestor de memoria intermedia*/
    public GestorMemoriaIntermedia(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
        //crea el buffer con paginas vacias
        buffer = new Pagina[numeroPaginas];
        //Crea una cola FIFO
        ColaLRU = new LinkedList<Integer>();
    }
    
    //==========================================================================
    /*devuleve una pagina conociendo el numero de paginas*/
    public Pagina recuperarPaginaDelBuffer(int numeroPaginas){
        /*ver si pagina esta en el buffer*/
        int posicion = posicionDePaginaEnBuffer(numeroPaginas);
        if(posicion >= 0){
            //Marcar pagina o bloque como recientemente referenciado
            ColaLRU.remove(numeroPaginas);
            ColaLRU.add(numeroPaginas);
            //devolver la pagina del buffer al solicitante
            return buffer[posicion];
        }
        return null;
    }

    //==========================================================================
    /*ACTUALIZAR EL VALOR DE LA PAGINA*/
    public Pagina GrabarEnDisco(Pagina pagina){
        if(pagina.getActualizo()){
            System.out.println("SE GRABO EN DISCO " + pagina.toString());
            /*VOLVEMOS SU VALOR ACTUAL DE ACTUALIZAR*/
            pagina.setActualizo(false);
        }
        return pagina;
    }
    //==========================================================================
    //pone una pagina en el buffer de memoria intermedia
    public Pagina ponerPaginaEnBuffer(Pagina pagina){
        //si la pagina esta en el buffer
        if(estaPaginaEnBuffer(pagina)){
        /*SI LA PAGINA SE ENCUENTRA EN EL BUFFER MODIFICAMOS SU VALOR 
          COMO ACTUALIZADO Y MANDAMOS A GRABAR EN DISCO
        */
            int posicion = posicionDePaginaEnBuffer(numeroPaginas);
            if(pagina.getDatos() != buffer[posicion].getDatos()){
                pagina.setActualizo(true);    
                /*MANDAMOS A GRABAR EN DISCO Y MODIFICAMOS EL VALOR EN EL BUFFER Y LA COLA*/
                buffer[posicion] = GrabarEnDisco(pagina);
            }
            return null;
        }
        //si la pagina no  esta en el buffer , pero no con espacio
        else
            if(!bufferLleno()){
                //Asignar la nueva pagina al bloque o pagina llena
                posicionUltimaPagina++;
                buffer[posicionUltimaPagina] = pagina;
               /*Actualizar la LRU*/
                ColaLRU.remove(posicionUltimaPagina);
                ColaLRU.add(posicionUltimaPagina);
                return null;
            }
            //si la pagina no esta en el buffer pero sin espacio
            else{
                //recuperar la pagina a descartar
                int numeroPaginaDescartada = (Integer) ColaLRU.remove();
                int posicion = posicionDePaginaEnBuffer(numeroPaginaDescartada);
                // sacar la pagina a descartar
                Pagina paginaDescartada = buffer[posicion] ;
                //actualizamos buffer con la nueva pagina en la misma posicion 
                buffer[posicion] = pagina;
                //hacer q la pagina sea el mas recientemente referenciado
                ColaLRU.add(pagina.getNumeroPagina());
                return paginaDescartada;
            }
    }
    //==========================================================================
    public int posicionDePaginaEnBuffer(int numeroPagina){
        int posicion = -1;
        for (int i = 0; i < buffer.length; i++) {
            if((buffer[i] != null) && (numeroPagina == buffer[i].getNumeroPagina())){
                posicion = i;
                break;
            }
        }
        return posicion;
    }
    //==========================================================================
    private boolean estaPaginaEnBuffer(Pagina pagina){
        return (posicionDePaginaEnBuffer(pagina.getNumeroPagina()) != -1);
    }
    //==========================================================================
    private boolean bufferLleno(){
        return numeroPaginas -1 == posicionUltimaPagina;
    }
    //==========================================================================
    @Override
    public String toString(){
        String resultado = "";
        for (int i = 0; i < buffer.length; i++) {
            resultado += "Pagina["+i+"] : " + buffer[i] + "\n" ;
        }
        return resultado + "\n" + this.ColaLRU;
    }
    //==========================================================================
    
    
}
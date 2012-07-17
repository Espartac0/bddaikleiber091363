/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoriaIntermedia;
import alamacenamiento.Pagina;
/**
 *
 * @author Jennifer,Kleiber,Anibal
 */
public class ContenedorPagina {
    public Pagina pagina;
    public boolean modificadorEnBuffer;

    public ContenedorPagina(Pagina pagina) {
        this.pagina = pagina;
        modificadorEnBuffer = false;
    } // ContenedorPagina
} // ContenedorPagina
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gestor_.memoria;

/**
 *
 * @author Kleiber
 */
public class PruebaGestorMemoriaIntermedia {

    public static void main(String[] args) {
        // TODO code application logic here
        // craer un gestro de memoria
        GestorMemoriaIntermedia gestorBuffer =  new GestorMemoriaIntermedia(6);
        // paginas del disco
        System.out.println("Paginas del Disco : ");
        Pagina[] paginas = new Pagina[10];
        for (int i = 0; i < paginas.length; i++) {
            Pagina pagina =  new Pagina(i,"p" + i);
            paginas[i] = pagina;
            System.out.println(pagina);
        }
        System.out.println("Contenido del Gestor: ");
        System.out.println(gestorBuffer);
        
        for (int i = 0; i < paginas.length; i++) {
            gestorBuffer.ponerPaginaEnBuffer(paginas[i]);
        }
        System.out.println("Contenido del gestor despues de poner bloques: ");
        System.out.println(gestorBuffer);
        
        System.out.println("Poner una pagina en el buffer: ");
        Pagina paginaN = new Pagina(10, "p10");
        Pagina paginaE = gestorBuffer.ponerPaginaEnBuffer(paginaN);
        System.out.println(paginaE);
        System.out.println(gestorBuffer);
        
       
        System.out.println("Recuperar la pagina del buffer: ");
        Pagina pagina1 = gestorBuffer.recuperarPaginaDelBuffer(7);
        System.out.println(pagina1);
        System.out.println(gestorBuffer);
        
        System.out.println("Recuperar otra pagina del buffer: ");
        Pagina pagina2 = gestorBuffer.recuperarPaginaDelBuffer(3);
        System.out.println(pagina2);
        System.out.println(gestorBuffer);
        
         
        /*EJERCICIO 1*/
        /*INSERTAMOS LAS MISMAS PAGINAS*/
        System.out.println("Actualizar una pagina");
        Pagina paginaA1 = new Pagina(6,"pa6");
        Pagina Actualizado = gestorBuffer.ponerPaginaEnBuffer(paginaA1);
        paginaA1 = new Pagina(4,"pa4");
        Actualizado = gestorBuffer.ponerPaginaEnBuffer(paginaA1);
        System.out.println(Actualizado);
        System.out.println(gestorBuffer);
        
    }
}
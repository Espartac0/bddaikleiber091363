/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//=======================================================================
// IMPLEMENTACION DE LA CLASE INDICE 
package alamacenamiento;

import MemoriaIntermedia.GestorMemoriaIntermedia;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Jennifer,Kleiber,Anibal
 */
public class Indice {
    //--variables globales
    private Pagina Puntero;
    private int Identificador;
    //--constructores
    public Indice(){
        Puntero = null;
        Identificador = -1;
    }
    public Indice(Pagina Puntero,int Identificador){
        this.Puntero = Puntero;
        this.Identificador = Identificador;
    }
    //--propiedades

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int Identificador) {
        this.Identificador = Identificador;
    }

    public Object getPuntero() {
        return Puntero;
    }

    public void setPuntero(Pagina Puntero) {
        this.Puntero = Puntero;
    }
    //--otros metodos
    public long Dirreccion(RandomAccessFile raf) throws IOException{
        // buscar el lugar correcto en el archivo
        long seek = Identificador * 4096;
        //--realiza el salto
        raf.seek(seek);
        
        return seek;
    }
    
       //==========================================================
    // PRUEBA DE INDICES
    public static void main(String args[]) {
        try {
            GestorMemoriaIntermedia gmi = new GestorMemoriaIntermedia(2);
            GestorAlmacenamiento ga = new GestorAlmacenamiento(null, gmi);

            List<Atributo> atributos = new ArrayList<Atributo>();
            atributos.add(new Atributo("integer", Integer.class));
            atributos.add(new Atributo("string", String.class));
            
            Relacion relacion = new Relacion(atributos);
            String nombreArchivo = "D:/Kleiber/Base de Datos II/Alamacenamiento/pruebarelacion.db";
            ga.crearArchivo(nombreArchivo);

            GestorIORelacion gestor = new GestorIORelacion(ga, relacion, nombreArchivo);

            //===================================================
            // CREAMOS LA LISTA DE INDICES
            Map<Integer,Indice> Indices = new TreeMap<Integer, Indice> ();
            //===================================================
            for (int i = 0; i < 108; i++) {
                List<Comparable> v = new ArrayList<Comparable>();
                v.add(new Integer(i));
                v.add(new String("12345678901234567890123456789012345678901234567890"));
                //--hacemos una pequeña modificacion a inserta tupla
                gestor.insertarTupla(v);
            }
            System.out.println("Tuplas insertadas correctamente.");
            //=====================================================
            // MOSTRAMOS LA PAGINA 
            int ID = 2;
            //String nombre = "D:/Kleiber/Base de Datos II/Alamacenamiento/pruebarelacion.db";
            RandomAccessFile raf = new RandomAccessFile(nombreArchivo,"r");
            Indice I = new Indice(null, ID);
            char[] b =  new char[4096];
            int j = 0;
            long D = I.getIdentificador() * 4096;
            raf.seek(0);
            while(j < 257){
            
                b[j]= raf.readChar();
                //System.out.println(raf.readChar());
        
            for (int i = 0; i < 257; i++) {
                System.out.print(b[i] +" ");
                if(i%7 == 0)System.out.println();
            }
        }
            //=====================================================
        
        }catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace(System.err);
        }
    }
    
    /*
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nombre = "D:/Kleiber/Base de Datos II/Alamacenamiento/relacion.db";
        RandomAccessFile raf = new RandomAccessFile(nombre,"r");
        Indice I = new Indice(null, 1);
        char[] b =  new char[4096];
        int j = 0;
        long D = I.getIdentificador() * 4096;
        raf.seek(0);
        while(j < 257){
            
            
            b[j]= raf.readChar();
            //System.out.println(raf.readChar());
            
            /*raf.seek(00000030);
            b[3] = raf.readByte();
            raf.seek(00000040);
            b[4] = raf.readByte();
            raf.seek(00000050);
            b[5] = raf.readByte();
            raf.seek(00000060);
            b[6] = raf.readByte();
            raf.seek(00000070);
            b[7] = raf.readByte();
           
            
            //System.out.println(" ---> " + n);
            //D++;
            j++;
        }
        
        for (int i = 0; i < 257; i++) {
            System.out.print(b[i] +" ");
            if(i%7 == 0)System.out.println();
        }
    }
*/
}



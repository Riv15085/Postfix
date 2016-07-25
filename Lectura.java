package Pila;
/**
 * Jorge Mario Tezen 15417
 * Diego Fernando Rivera 15085
 * Clase Lectura permite la lectura archivos .text
 */

import java.io.*;
import java.util.*;
        
public class Lectura {
    
    // permite la lectura de un path y devuelve un string de las lineas del texto
    public static Vector leerArchivo (String path) throws FileNotFoundException,IOException{
        //se define un tamaño de vector inicial
        String linea;
        Vector parrafo= new Vector(20,5);
        FileReader fr= new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);
        //se llena el vector parrafo por cada linea
        while((linea=textReader.readLine())!=null){
            parrafo.addElement(linea);
        }
        textReader.close();
        return parrafo;
    }
   
}


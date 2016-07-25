package Pila;
/**
 * Jorge Mario Tezen 15417
 * Diego Fernando Rivera 15085
 * Clase que implementa iPila 
 */

import java.util.*;

public class Stack implements iPila {
    
    private int posicion;
    Vector miPila;
    
    //metodo contructor
    public Stack( ){
        posicion=0;
        miPila= new Vector(10,5);
     
    }
    
    //metodo push que ingresa elementos al vector
    @Override
    public void push (String operando){
        miPila.addElement(operando);
        posicion++;
    }
    
    //metodo po que obtine el elemento actual y resta al contador posicion
    @Override
    public String pop (){
        String elemento=  (String) miPila.elementAt(posicion-1);
        miPila.removeElementAt(posicion-1);
        posicion--;
        return elemento;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public Vector getVector(){
        return miPila;
    }
}

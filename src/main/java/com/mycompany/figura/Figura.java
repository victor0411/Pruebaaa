/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;

import java.util.ArrayList;

/**
 * Clase padre de Bidimencional y Tridimencional
 * @author Edward Ramos
 * @author Victor Preciado
 */

public abstract class Figura implements Comportamiento{
    /**
     * figura Lista
     */
    public static ArrayList<ArrayList<Double>> figura = new  ArrayList();
    /**
     * Metodo el cual implementan los hijos
     */
    public void imprimirPerimetroArea(){
    
    }
}

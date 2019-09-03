/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;

/**
 *
 * @author Edward Ramos
 * @author Victor Preciado
 */

/**
 * Clase Bidimencional es la clase Padre de Cuadrado, Triangulo y Circulo
 * Hereda de la Clase Figura
 * @author Edward Ramos
 * @author Victor Preciado
 */
public abstract class Bidimencional extends Figura{
    
    /**
     * perimeto Variable que guarda el perimetro de las figuras en 2D
     * area Variable que guarda el area de las figuras en 2D
     * contador Variable que sirve coomo contador
     */
    public double perimetro;
    public double area;
    public int contador;
    
    /**
     * Constructor de la clase Bidimencional
     * @param perimetro
     * @param area
     * @param contador 
     */
    public Bidimencional(double perimetro, double area, int contador) {
        this.perimetro = perimetro;
        this.area = area;
        this.contador = contador;
    }
    /**
     * Constructor de la clase Bidimencional
     */
    public Bidimencional() {
    }
    /**
     * get de la variable perimetro
     * @return perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }
    /**
     * set de la variable perimetro
     * @param perimetro
     */   
    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }   
    /**
     * get de la variable area
     * @return area
     */  
    public double getArea() {
        return area;
    }
    /**
     * set de la variable area
     * @param area
     */    
    public void setArea(int area) {
        this.area = area;
    }
    /**
     * get de la variable contador
     * @return contador
     */
     public double getContador() {
        return contador;
    }
     /**
      * set de la variable contador
      * @param contador 
      */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
   
}

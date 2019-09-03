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
public abstract class Tridimencional extends Figura{
    /**
     * area variable que almacena el area
     * perimetro variable que almacena el perimetro
     * volumen variable que almacena el volumen
     * contador variable qe sirve como contador
     */
    public double area;
    public double perimetro;
    public double volumen;
    public int contador;
    /**
     * Constructor clase Tridimencional
     * @param area
     * @param perimetro
     * @param volumen
     * @param contador1 
     */
    public Tridimencional(double area, double perimetro, double volumen, int contador1) {
        this.area = area;
        this.perimetro = perimetro;
        this.volumen = volumen;
    }
    /**
     * constructor clase tridimencional
     */
    public Tridimencional() {
    }
    /**
     * get varibal area
     * @return area
     */
    public double getArea() {
        return area;
    }
    /**
     * set variable area
     * @param area 
     */
    public void setArea(double area) {
        this.area = area;
    }
    /**
     * get variable perimetro
     * @return perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }
    /**
     * set variable perimetro
     * @param perimetro 
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    /**
     * get variable volumen
     * @return volumen
     */
    public double getVolumen() {
        return volumen;
    }
    /**
     * set variable volumen
     * @param volumen 
     */
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    
    
}

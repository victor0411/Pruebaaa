/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;

/**
 *
 * @author SuperUs
 */
public abstract class Tridimencional implements Comportamiento{
    public double area;
    public double perimetro;
    public double volumen;

    public Tridimencional(double area, double perimetro, double volumen) {
        this.area = area;
        this.perimetro = perimetro;
        this.volumen = volumen;
    }

    public Tridimencional() {
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    
    
    
}

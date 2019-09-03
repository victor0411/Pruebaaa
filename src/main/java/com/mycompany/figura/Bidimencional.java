/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;

import java.util.ArrayList;

/**
 *
 * @author SuperUs
 */
public abstract class Bidimencional implements Comportamiento{
    
    public double perimetro;
    public double area;
     public int contador;
    public Bidimencional(double perimetro, double area, int contador) {
        this.perimetro = perimetro;
        this.area = area;
        this.contador = contador;
    }

    public Bidimencional() {
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
     public double getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
   
}

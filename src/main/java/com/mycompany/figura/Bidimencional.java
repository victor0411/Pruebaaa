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
public abstract class Bidimencional implements Comportamiento{
    
    public int perimetro;
    public int area;

    public Bidimencional(int perimetro, int area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    public Bidimencional() {
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
   
}

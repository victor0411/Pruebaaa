/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author SuperUs
 */
public class Circulo extends Bidimencional {

    Scanner sc = new Scanner(System.in);
    private double diametro;
    private double radio;

    public Circulo() {
        
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void digite(){
        System.out.println("Digite Diametro");
        diametro = sc.nextInt();
        perimetro = diametro*Math.PI;
        radio = perimetro/(2*Math.PI);
        area = Math.PI*(Math.pow(radio, 2));
        imprimirTipoFigura();
    }
   
    @Override
    public void imprimirTipoFigura() {
        System.out.println("Circulo");
        imprimirPerimetroArea();
    }

    @Override
    public void imprimirPerimetroArea() {
        System.out.println("Area es igual a: " +(double)Math.round(area * 100)/100 );
        System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
/**
 * Clase Circulo hijo de Bidimencional
 * @author Edward Ramos
 * @author Victor Preciado
 */

public class Circulo extends Bidimencional {
    /**
     * diametro Variable que guarda el diametro del circulo
     * radio Variable que guarda el radio del circulo
     * 
     */
    Scanner sc = new Scanner(System.in);
    private double diametro;
    private double radio;
    /**
     * Constructor clase circulo
     */
    public Circulo() {
        
    }
    /**
     * get vaiable diametro
     * @return diametro
     */
    public double getDiametro() {
        return diametro;
    }
    /**
     * set variable diametro
     * @param diametro 
     */
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    /**
     * get varibale radio
     * @return 
     */
    public double getRadio() {
        return radio;
    }
    /**
     * set variable radio
     * @param radio 
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    /**
     * Metodo digite el cual pide el diametro del circulo
     */
    public void digite(){
        System.out.println("Digite Diametro");
        diametro = sc.nextInt();
        perimetro = diametro*Math.PI;
        radio = perimetro/(2*Math.PI);
        area = Math.PI*(Math.pow(radio, 2));
        imprimirTipoFigura();
    }
   /**
    * Metodo imprimir figura el cual proviene de la interface Comportamiento
    */
    @Override
    public void imprimirTipoFigura() {
        System.out.println("Circulo");
        imprimirPerimetroArea();
    }
    /**
     * Metodo ImprimirPerimetroArea el cual proviene del padre
     */
    @Override
    public void imprimirPerimetroArea() {
        //System.out.println("Area es igual a: " +(double)Math.round(area * 100)/100 );
        //System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
        System.out.println("Circulo Ingresado");
        contador = Figura.figura.size();
        Figura.figura.add(new ArrayList<Double>());
        Figura.figura.get(contador).add(1.0);
        Figura.figura.get(contador).add(area);
        Figura.figura.get(contador).add(perimetro);
    }
    
}

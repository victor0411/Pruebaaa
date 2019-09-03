/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Esfera extends Tridimencional{
    /**
     * radio variable que almacena el radio de la esfera
     * tipo variable que almacena el tipo 
     */
    Scanner sc = new Scanner(System.in);
    private double radio;
    private int tipo;
    /**
     * constructor clase esfera
     */
    public Esfera() {
    }
    /**
     * get variable radio
     * @return radio
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
     * metodo digite el cual pide el radio
     */
    
    public void digite(){
        
        System.out.println("Digite Radio");
        radio = sc.nextInt();
        perimetro=2*radio*Math.PI;
        area=(4*(Math.PI)*(Math.pow(radio, 2)));
        volumen=(4*Math.PI*(Math.pow(radio, 3)))/3;
        imprimirTipoFigura();
    }
    /**
    * Metodo imprimir figura el cual proviene de la interface Comportamiento
    */
   
    @Override
    public void imprimirTipoFigura() {
        System.out.println("Esfera");
        imprimirPerimetroArea();
    }

    /**
     * Metodo ImprimirPerimetroArea el cual proviene del padre
     */
    public void imprimirPerimetroArea() {
       // System.out.println("Area es igual a: " +(double)Math.round(area * 100)/100 );
       // System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
       // System.out.println("Volumen es igual a: " + (double)Math.round(volumen * 100)/100 );
        System.out.println("Esfera Ingresado");
        contador = (Figura.figura.size());
        Figura.figura.add(new ArrayList<Double>());
        Figura.figura.get(contador).add(5.0); // 0 , Tipo Figura    ##Cuadrado = 1.0
        Figura.figura.get(contador).add(area); //1, Area del Cadrado
        Figura.figura.get(contador).add(perimetro);//2, 
        Figura.figura.get(contador).add(volumen); //3
        Figura.figura.get(contador).add((tipo*1.0)); //4,  Tipo de Figura cuadrada  ##Rectangulo = 2.0
    }
}

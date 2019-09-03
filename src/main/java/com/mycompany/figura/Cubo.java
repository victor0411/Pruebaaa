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
public class Cubo extends Tridimencional{
    /**
     * lado1 variable que guarda el lado1 del cubo
     * lado2 variable que guarda el lado2 del cubo
     * lado3 variable que guarda el lado3 del cubo
     * tipo variable que guarda si es cubo o octoedro
     */
    Scanner sc = new Scanner(System.in);
    private double lado1;
    private double lado2;
    private double lado3;
    private int tipo;
    
    /**
     * Constructor clase Cubo
     */
    public Cubo() {
    }
    /**
     * get variable lado3
     * @return lado3
     */
    public double getLado3() {
        return lado3;
    }
    /**
     * set variable lado3
     * @param lado3 
     */
    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    /**
     * get variable lado1
     * @return lado1
     */
    public double getLado1() {
        return lado1;
    }
    /**
     * ser variable lado1
     * @param lado1 
     */
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }
    /**
     * get variable lado2
     * @return lado2
     */
    public double getLado2() {
        return lado2;
    }
    /**
     * set variable lado2
     * @param lado2 
     */
    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    /**
     * get variable tipo
     * @return tipo
     */
    public int getTipo() {
        return tipo;
    }
    /**
     * set variable tipo
     * @param tipo 
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
   /**
    * metodo digite el cual almacena los 3 lados del cubo
    */
    public void digite(){
        System.out.println("Digite Lado 1");
        lado1 = sc.nextInt();
        System.out.println("Digite Lado 2");
        lado2 = sc.nextInt();
        System.out.println("Digite Lado 3");
        lado3 = sc.nextInt();
        if(lado1==lado2 && lado1==lado3 && lado2==lado3){
            area=((Math.pow(lado1, 2))*6);
            tipo=1;
        }else{
            area=2*((lado1*lado2)+(lado1*lado3)+(lado2*lado3));
            tipo=2;
        }
        perimetro=((lado1*4)+(lado2*4)+(lado3*4));
        volumen=lado1*lado2*lado3;
        imprimirTipoFigura();
    }

   /**
    * Metodo imprimir figura el cual proviene de la interface Comportamiento
    */
    @Override
    public void imprimirTipoFigura() {
        if(tipo==1){
            System.out.println("Figura Cubo");
        }else{
            System.out.println("Figura ortoedro");
        }
        imprimirPerimetroArea();
    }

    /**
     * Metodo ImprimirPerimetroArea el cual proviene del padre
     */
    @Override
    public void imprimirPerimetroArea() {
        
       // System.out.println("Area es igual a: " + (double)Math.round(area * 100)/100 );
       // System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
       // System.out.println("Volumen es igual a: " + (double)Math.round(volumen * 100)/100 );
        System.out.println("Cubo Ingresado");
        contador = (Figura.figura.size());
        Figura.figura.add(new ArrayList<Double>());
        Figura.figura.get(contador).add(4.0);
        Figura.figura.get(contador).add(area); 
        Figura.figura.get(contador).add(perimetro);
        Figura.figura.get(contador).add(volumen); 
        Figura.figura.get(contador).add((tipo*1.0));
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Clase Triangulo Hijo de Bidimencional
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Triangulo extends Bidimencional{
    /**
     * variable lado1 que guarda el lado 1 del triangulo
     * variable lado2 que guarda el lado 2 del triangulo
     * variable lado3 que guarda el lado 3 del triangulo
     * variable tipo que guarda el tipo del triangulo
     */
    Scanner sc = new Scanner(System.in);
    private double lado1;
    private double lado2;
    private double lado3;
    private int tipo;
    
    /**
     * Constructor clase triangulo
     */
    public Triangulo() {
    }

    
    
    
    /**
     * get variable lado1
     * @return lado1
     */
    public double getLado1() {
        return lado1;
    }
    /**
     * set variable lado1
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
     * Metodo submenu que pide los lados del triangulo
     */
    public void subMenu(){     
        System.out.println("Digite Lado 1");
        lado1 = sc.nextInt();
        System.out.println("Digite Lado 2");
        lado2 = sc.nextInt();
        System.out.println("Digite Lado 3");
        lado3 = sc.nextInt();
        determina();
    } 
    /**
     * metodo determina que determina que tipo de triangulo es y si existe
     */
    public void determina(){
        if((lado1+lado2>lado3)&&(lado1+lado3>lado2)&&(lado2+lado3>lado1)){
            digite();
        }else{
            System.out.println("El triangulo no existe");
        }
    }
    public void digite(){
        double semiperimetro;
        if((lado1==lado2) && (lado2==lado3)){
           tipo=1;       
        }else if((lado1==lado2)&&(lado2!=lado3)||(lado2==lado3)&&(lado3!=lado1)||(lado1==lado3)&&lado3!=lado2){
           tipo=2;
        }else{
           tipo=3;
        }
        perimetro=lado1+lado2+lado3;
        semiperimetro = perimetro/2;
        area=Math.sqrt(semiperimetro*((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
        imprimirTipoFigura();
    }
      /**
    * Metodo imprimir figura el cual proviene de la interface Comportamiento
    */
    @Override
    public void imprimirTipoFigura() {    
        if(tipo==1){
            System.out.println("Equilatero");
        }else if(tipo==2){
            System.out.println("Isoseles");
        }else{
            System.out.println("Escaleno");
        }
        imprimirPerimetroArea();     
    }
    /**
     * Metodo ImprimirPerimetroArea el cual proviene del padre
     */
    @Override
    public void imprimirPerimetroArea() {
       // System.out.println("Area es igual a: " + (double)Math.round(area * 100)/100 );
      //  System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
        System.out.println("Triangulo Ingresado");
        contador = (Figura.figura.size());
        Figura.figura.add(new ArrayList<Double>());
        Figura.figura.get(contador).add(3.0); 
        Figura.figura.get(contador).add(area); 
        Figura.figura.get(contador).add(perimetro);
        Figura.figura.get(contador).add((tipo*1.0)); 
    }
    
}

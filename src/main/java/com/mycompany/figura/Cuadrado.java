/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *  Clase Cuadrado Hijo de Bidimencional
 * @author Edward Ramos 
 * @author Victor Preciado
 */
public class Cuadrado extends Bidimencional {  
    /**
     * lado1 variable que guarda el lado 1 del cuadrado
     * lado2 variable que guara el lado 2 del cuadrado
     * tipo variable que guarda si es un cuadrado o un rectangulo
     */
    Scanner sc = new Scanner(System.in);
    private int lado1;
    private int lado2;
    private int tipo;
    /**
     * Constructor de la clase Cuadrado
     */
    public Cuadrado() {
    }
    /**
     * get del variable tipo
     * @return tipo
     */
    
    public int getTipo() {
        return tipo;
    }
    /**
     * set de la variable tipo
     * @param tipo 
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    /**
     * get de la variable lado1
     * @return lado1
     */
    public int getLado1() {
        return lado1;
    }
    /**
     * set de la varibale lado1
     * @param lado1 
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    /**
     * get de la varibale lado2
     * @return lado2
     */
    public int getLado2() {
        return lado2;
    }
    /**
     * set de la varibale lado2
     * @param lado2 
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
  /**
   * Metodo digite que pide los lados del cuadrado
   */
    public void digite(){
        System.out.println("Digite Lado 1");
        lado1 = sc.nextInt();
        System.out.println("Digite Lado 2");
        lado2 = sc.nextInt();       
        if(lado1==lado2){
            area = lado1*lado2;
            perimetro = lado1*4;
            tipo=1;
            imprimirTipoFigura();
        }else{           
            area = lado1*lado2;
            perimetro = (lado1*2) + (lado2*2);
            tipo=2;
            imprimirTipoFigura();
        }
    }
     /**
    * Metodo imprimir figura el cual proviene de la interface Comportamiento
    */
    @Override
    public void imprimirTipoFigura() {    
        if(tipo==1){ 
            System.out.println("Figura Cuadrado");
            imprimirPerimetroArea();
        }else{
            System.out.println("Figura Rectangulo");
            imprimirPerimetroArea();
        }
    }
    /**
     * Metodo ImprimirPerimetroArea el cual proviene del padre
     */
    @Override
    public void imprimirPerimetroArea() {
        //System.out.println("Area es igual a: " + (double)Math.round(area * 100)/100 );
        //System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
        System.out.println("Cuadrado Ingresado");
        contador = (Figura.figura.size());
        Figura.figura.add(new ArrayList<Double>());
        Figura.figura.get(contador).add(2.0);
        Figura.figura.get(contador).add(area); 
        Figura.figura.get(contador).add(perimetro);
        Figura.figura.get(contador).add((tipo*1.0)); 
    }

    
}

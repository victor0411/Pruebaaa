/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author SuperUs
 */
public class Cuadrado extends Bidimencional {    
    Scanner sc = new Scanner(System.in);
    private int lado1;
    private int lado2;
    private int tipo;
    ArrayList<ArrayList<Double>> arrayCuadrado = new  ArrayList();
    public Cuadrado() {
    }
    
    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
 
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

    @Override
    public void imprimirPerimetroArea() {
        System.out.println("Area es igual a: " + (double)Math.round(area * 100)/100 );
        System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
        contador = (Main.figura.size());
        Main.figura.add(new ArrayList<Double>());
        Main.figura.get(contador).add(2.0);
        Main.figura.get(contador).add(area); 
        Main.figura.get(contador).add(perimetro);
        Main.figura.get(contador).add((tipo*1.0)); 
    }

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;

import java.util.Scanner;

/**
 *
 * @author SuperUs
 */
public class Cubo extends Tridimencional{
    Scanner sc = new Scanner(System.in);
    private double lado1;
    private double lado2;
    private double lado3;
    private int tipo;

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
   
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

   
    @Override
    public void imprimirTipoFigura() {
        if(tipo==1){
            System.out.println("Figura Cubo");
        }else{
            System.out.println("Figura ortoedro");
        }
        imprimirPerimetroArea();
    }

  
    @Override
    public void imprimirPerimetroArea() {
        System.out.println("Area es igual a: " + area);
        System.out.println("Perimetro es igual a: " + perimetro);
        System.out.println("Volumen es igual a: " + volumen);
    }
    
    
}

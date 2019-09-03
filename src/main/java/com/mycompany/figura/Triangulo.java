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
 * @author SuperUs
 */
public class Triangulo extends Bidimencional{
    Scanner sc = new Scanner(System.in);
    private double lado1;
    private double lado2;
    private double lado3;
    private int tipo;

    public Triangulo() {
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    public void subMenu(){     
        System.out.println("Digite Lado 1");
        lado1 = sc.nextInt();
        System.out.println("Digite Lado 2");
        lado2 = sc.nextInt();
        System.out.println("Digite Lado 3");
        lado3 = sc.nextInt();
        determina();
    } 
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
    
    @Override
    public void imprimirPerimetroArea() {
        System.out.println("Area es igual a: " + (double)Math.round(area * 100)/100 );
        System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
        contador = (Main.figura.size());
        Main.figura.add(new ArrayList<Double>());
        Main.figura.get(contador).add(3.0); // 0 , Tipo Figura    ##Cuadrado = 1.0
        Main.figura.get(contador).add(area); //1, Area del Cadrado
        Main.figura.get(contador).add(perimetro);//2, 
        Main.figura.get(contador).add((tipo*1.0)); //3,  Tipo de Figura cuadrada  ##Rectangulo = 2.0
    }
    
}

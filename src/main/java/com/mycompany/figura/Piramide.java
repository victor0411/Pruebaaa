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
public class Piramide extends Tridimencional{
    Scanner sc = new Scanner(System.in);
    private double ladoBase;
    private double altura;
    private double numLado;

    public Piramide() {
    }

    
    public double getLadoBase() {
        return ladoBase;
    }

    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getNumLado() {
        return numLado;
    }

    public void setNumLado(double numLado) {
        this.numLado = numLado;
    }
    

    public void digite(){
        double areaLateral;
        System.out.println("Digite numero de lados :");
        numLado = sc.nextInt();
        if(numLado>=7||numLado<=3){
            System.out.println("Numero de Lados Invalido");
        }else{      
            System.out.println("Digite el Lado Base :");
            ladoBase = sc.nextInt();
            System.out.println("Digite Altura :");
            altura = sc.nextInt();
        }
        volumen = ((numLado*ladoBase)*altura)/3;
        perimetro=numLado*ladoBase;
        areaLateral=Math.sqrt(altura+(ladoBase/2));
        area=(((numLado*ladoBase)*areaLateral)/2);
        imprimirTipoFigura();
    }
    
    
    @Override
    public void imprimirTipoFigura() {
        if(numLado==3){
            System.out.println("Piramide Triangular");
        }else if(numLado==4){
            System.out.println("Piramide Cuadrangular");
        }else if(numLado==5){
            System.out.println("Piramide Pentagonal");
        }else{
            System.out.println("Piramide Hexagonal");
        }
        imprimirPerimetroArea();
    }

    @Override
    public void imprimirPerimetroArea() {
        System.out.println("Area es igual a: " + (double)Math.round(area * 100)/100 );
        System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
        System.out.println("Volumen es igual a :" + (double)Math.round(volumen * 100)/100 );
    }
}

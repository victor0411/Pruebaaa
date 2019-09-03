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
public class Esfera extends Tridimencional{
    Scanner sc = new Scanner(System.in);
    private double radio;
    private int tipo;
    public Esfera() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    public void digite(){
        
        System.out.println("Digite Radio");
        radio = sc.nextInt();
        perimetro=2*radio*Math.PI;
        area=(4*(Math.PI)*(Math.pow(radio, 2)));
        volumen=(4*Math.PI*(Math.pow(radio, 3)))/3;
        imprimirTipoFigura();
    }

   
    @Override
    public void imprimirTipoFigura() {
        System.out.println("Esfera");
        imprimirPerimetroArea();
    }

    
    @Override
    public void imprimirPerimetroArea() {
        System.out.println("Area es igual a: " +(double)Math.round(area * 100)/100 );
        System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
        System.out.println("Volumen es igual a: " + (double)Math.round(volumen * 100)/100 );
        contador = (Main.figura.size());
        Main.figura.add(new ArrayList<Double>());
        Main.figura.get(contador).add(5.0); // 0 , Tipo Figura    ##Cuadrado = 1.0
        Main.figura.get(contador).add(area); //1, Area del Cadrado
        Main.figura.get(contador).add(perimetro);//2, 
        Main.figura.get(contador).add(volumen); //3
        Main.figura.get(contador).add((tipo*1.0)); //4,  Tipo de Figura cuadrada  ##Rectangulo = 2.0
    }
}

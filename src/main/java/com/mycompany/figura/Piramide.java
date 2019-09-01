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
    private int numLado;
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    private double lado5;
    
    public void subMenu(){  
        System.out.println("Digite numero de Lados de la Base (3-5):");
        numLado = sc.nextInt();
        switch(numLado){
            case 1:
                System.out.println("Digite Lado 1");
                lado1=sc.nextInt();
                System.out.println("Digite Lado 2");
                lado2=sc.nextInt();
                System.out.println("Digite Lado 3");
                lado3=sc.nextInt();
                break;
            case 2:
                System.out.println("Digite Lado 1");
                lado1=sc.nextInt();
                System.out.println("Digite Lado 2");
                lado2=sc.nextInt();
                System.out.println("Digite Lado 3");
                lado3=sc.nextInt();
                System.out.println("Digite Lado 4");
                lado4=sc.nextInt();
                break; 
            case 3:
                System.out.println("Digite Lado 1");
                lado1=sc.nextInt();
                System.out.println("Digite Lado 2");
                lado2=sc.nextInt();
                System.out.println("Digite Lado 3");
                lado3=sc.nextInt();
                System.out.println("Digite Lado 4");
                lado4=sc.nextInt();
                System.out.println("Digite Lado 5");
                lado4=sc.nextInt();
                break;
            default:
                System.out.println("Numero de Lados Invadidos");
        }
    }
    public void digite(){
        
    }

    
    @Override
    public void imprimirTipoFigura() {
    }

    @Override
    public void imprimirPerimetroArea() {
    }
}

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
public class Principal {
    Cuadrado cuadrado = new Cuadrado();
    Circulo circulo = new Circulo();
    Triangulo triangulo = new Triangulo();
    Scanner sc = new Scanner(System.in);
    private int elije;
    private String desea;
    
    public void Elejir(){
       
        
        do{          
            System.out.println("Digite Tipo de Figura :");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            elije = sc.nextInt();
            
            switch(elije){
                        case 1:
                            cuadrado.digite();
                            break;
                        case 2:
                            triangulo.digite();
                            break;
                        case 3:
                             circulo.digite();
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
            System.out.println("¿Desea agregar otra figura? ");
            desea = sc.next();
        }while(desea.equalsIgnoreCase("s"));
      
    }
    
}

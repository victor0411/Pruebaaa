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
    Triangulo triangulo = new Triangulo();
    Circulo circulo = new Circulo();
    Cubo cubo = new Cubo();
    Piramide piramide = new Piramide();
    Esfera esfera = new Esfera();
    
    Scanner sc = new Scanner(System.in);
    private int elije;
    private String desea;
    
    public void menu(){
            System.out.println("Digite Tipo de Figura :");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Cubo");
            System.out.println("5. Piramide");
            System.out.println("6. Esfera");
            elije = sc.nextInt();
    }
    public void elejir(){
        do{          
            menu();
            switch(elije){
                        case 1:
                            cuadrado.digite();
                            break;
                        case 2:
                            triangulo.subMenu();
                            break;
                        case 3:
                             circulo.digite();
                            break;
                        case 4:
                            cubo.digite();
                            break;
                        case 5:
                            piramide.subMenu();
                            break;
                        case 6:
                            esfera.digite();
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                            break;
                    }
            System.out.println("Digite (S) para agregar otra Figura");
            desea = sc.next();
        }while(desea.equalsIgnoreCase("s"));    
    }
    
}

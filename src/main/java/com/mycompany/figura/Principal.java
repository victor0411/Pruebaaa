/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura;
import java.util.Scanner;

/**
 *  Clase principal donde estan las impresiones y el menu
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Principal {
    /**
     * elije variable que almacena la opcion que el usuario elije
     * desea variable que almacena si desea agregar otra figura
     */
    Cuadrado cuadrado = new Cuadrado();
    Triangulo triangulo = new Triangulo();
    Circulo circulo = new Circulo();
    Cubo cubo = new Cubo();
    Piramide piramide = new Piramide();
    Esfera esfera = new Esfera();
    
    Scanner sc = new Scanner(System.in);
    private int elije;
    private String desea;
    
    /**
     * Metodo menu almacena la figura que el usuario elije
     */
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
    /**
     * metodo elejir es depende de lo que el usuario halla ingresado en elije y
     * se dirige al metodo escojido de la clase
     */
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
                            piramide.digite();
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
        imprimir();
    }
    /**
     * metodo imprimir imprime el arraylist figura
     */
    public void imprimir(){
          String a= "";
          for(int i=0;i<Figura.figura.size(); i++) 
          {
                  if(Figura.figura.get(i).get(0) == 1.0)
                  {
                      System.out.println("Figura "+ i + " - Circulo: ");
                      System.out.println("    Area: " + Figura.figura.get(i).get(1) + "    Perimetro: " + Figura.figura.get(i).get(2) + "    Tipo Figura: " + "Circulo");
                  }else if(Figura.figura.get(i).get(0) == 2.0)
                  {
                      System.out.println("Figura "+ i + " - Cuadrado: ");
                      if(Figura.figura.get(i).get(3) == 1.0) a="Cuadrado"; else a= "Rectangulo";
                      System.out.println("    Area: " + Figura.figura.get(i).get(1) +"    Perimetro: " + Figura.figura.get(i).get(2) + " Tipo Figura: " + a);
                  }else if(Figura.figura.get(i).get(0) == 3.0)
                  {
                      System.out.println("Figura "+ i + " - Triangulo: ");
                      if(Figura.figura.get(i).get(3) == 1.0) a="Equilatero"; else if(Figura.figura.get(i).get(3) == 2.0)a = "Isosceles";  else a= "Escaleno";
                      System.out.println("    Area: " + Figura.figura.get(i).get(1) +"   Perimetro: " + Figura.figura.get(i).get(2) + "    Tipo Figura: " + a);
                  }else if(Figura.figura.get(i).get(0) == 4.0)
                  {
                      System.out.println("Figura "+ i + " - Cubo: ");
                      if(Figura.figura.get(i).get(4) == 1.0) a="Cubo"; else a="Ortoedro";
                      System.out.println("    Area: " + Figura.figura.get(i).get(1) +"    Perimetro: " + Figura.figura.get(i).get(2) +"   Volumen: "+ Figura.figura.get(i).get(3) +"    Tipo Figura: " + a);
                  }else if(Figura.figura.get(i).get(0) == 5.0)
                  {
                      System.out.println("Figura "+ i + " - Esfera: ");
                      System.out.println("    Area: " + Figura.figura.get(i).get(1) +"    Perimetro: " + Figura.figura.get(i).get(2) +"   Volumen: "+ Figura.figura.get(i).get(3) +"    Tipo Figura: " + "Esfera");
                  }
                   if(Figura.figura.get(i).get(0) == 6.0)
                  {
                      System.out.println("Figura "+ i + " - Piramide: ");
                      if(Figura.figura.get(i).get(4) == 3.0) a="Piramide Triangular"; else if(Figura.figura.get(i).get(4) == 4.0)a = "Piramide Cuadrangular";  else if(Figura.figura.get(i).get(4) == 5.0)a = "Piramide Pentagonal"; else a = "Piramide Hexagonal";
                      System.out.println("    Area: " + Figura.figura.get(i).get(1) +"    Perimetro: " + Figura.figura.get(i).get(2) +"   Volumen: "+ Figura.figura.get(i).get(3) +"    Tipo Figura: " + a);
                  }                  
              System.out.println(" ");
          }
    }
    
}

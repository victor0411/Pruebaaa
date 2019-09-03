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
 * @author Edward Ramos
 * @author Victor Preciado
 */
public class Piramide extends Tridimencional{
    /**
     * ladoBase Variable que almacena el ladoBase de la piramide
     * altura variable que almacena la altura de la piramide
     * numLado Variable que almacena el numero de lados de la piramide
     * tipo variable que almacena el tipo de triangulo
     */
    Scanner sc = new Scanner(System.in);
    private double ladoBase;
    private double altura;
    private double numLado;
    private int tipo;
    /**
     * Constructor clase piramide
     */
    public Piramide() {
    }
    /**
     * get variable ladobase
     * @return 
     */
    public double getLadoBase() {
        return ladoBase;
    }
    /**
     * set variable ladoBase
     * @param ladoBase 
     */
    public void setLadoBase(double ladoBase) {
        this.ladoBase = ladoBase;
    }
    /**
     * get variable altura
     * @return 
     */
    public double getAltura() {
        return altura;
    }
    /**
     * set variable altura
     * @param altura 
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    /**
     * get variable numlado
     * @return numlado
     */
    public double getNumLado() {
        return numLado;
    }
    /**
     * set variable numlado
     * @param numLado 
     */
    public void setNumLado(double numLado) {
        this.numLado = numLado;
    }
    
    /**
     * metodo digite qu pide el numero de lados, lado base y altura
     */
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
    
    /**
    * Metodo imprimir figura el cual proviene de la interface Comportamiento
    */
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
    /**
     * Metodo ImprimirPerimetroArea el cual proviene del padre
     */
    @Override
    public void imprimirPerimetroArea() {
       // System.out.println("Area es igual a: " + (double)Math.round(area * 100)/100 );
       // System.out.println("Perimetro es igual a: " + (double)Math.round(perimetro * 100)/100 );
       // System.out.println("Volumen es igual a :" + (double)Math.round(volumen * 100)/100 );
        System.out.println("Piramide Ingresado");
        contador = (Figura.figura.size());
         Figura.figura.add(new ArrayList<Double>());
         Figura.figura.get(contador).add(6.0); // 0 , Tipo Figura    ##Cuadrado = 1.0
         Figura.figura.get(contador).add(area); //1, Area del Cadrado
         Figura.figura.get(contador).add(perimetro);//2, 
         Figura.figura.get(contador).add(volumen); //3
         Figura.figura.get(contador).add((numLado*1.0)); //4,  Tipo de Figura cuadrada  ##Rectangulo = 2.0
    }
}

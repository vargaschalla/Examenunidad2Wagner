/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe;

import java.util.Scanner;

/**
 *
 * @author waldir vargas challa
 */
public class CategoriaWVCH {
     public static void categoria(){
        int numV=0,P1,P2,P3,TP1=0,TP2=0,TP3=0,TOTAL;
        String categoria;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de VEHICULO:");
        numV=leer.nextInt();
        System.out.println("Ingrese el precio deL VEHICULO 1:");
        P1=leer.nextInt();
        System.out.println("Ingrese el precio deL VEHICULO 2:");
        P2=leer.nextInt();
        System.out.println("Ingrese el precio deL VEHICULO 3:");
        P3=leer.nextInt();
         for (int inc = 1; inc <= numV; inc++) {
            System.out.println("CUAL ES LA CATEGORIA DEL VEHICULO:");
            categoria=leer.next();
            categoria=categoria;
            if(categoria.equals("cat1")){
                TP1=(int) (0.1*P1);
            }else if(categoria.equals("cat2")){
                TP2= (int) (P2*0.07);
            }else if(categoria.equals("cat3")){
                TP3=(int) (0.05*P3);
            }else{
                System.out.println("Ya no hay ninguna categoria");
            }
        }
        TOTAL=TP1+TP2+TP3;
        System.out.println("El PRECIO DEL VEHICULO DE CLAVE 1 ES:"+TP1);
         System.out.println("El PRECIO DEL VEHICULO DE CLAVE 2 ES:"+TP2);
        System.out.println("El PRECIO DEL VEHICULO DE CLAVE 3 ES:"+TP3);
        
        System.out.println("El TOTAL DE PRECIO DE LAS TRES CATEGORIAS ES:"+TOTAL);
    } 
      public static void main(String[] args) {
          categoria();
      }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe;

import java.util.Scanner;
import static upeu.edu.pe.CategoriaWVCH.categoria;
import static upeu.edu.pe.LeerTecladoWVChalla.operacionesMateWVCh;

/**
 *
 * @author waldir vargas challa
 */
public class MenuWVCh {
     public static void main(String[] args) {
        System.out.println("Ingrese el numero del Algoritmo que desea probar");
        Scanner leer=new Scanner(System.in);
        int opcion=leer.nextInt();
        while (opcion!=0){            
            switch(opcion){
            case 1: { categoria(); break; }
            case 2: { int[] vector = {42, 57, 14, 40, 96, 19, 8, 68, 1, 4};
                    OrdenarWVCH  or = new OrdenarWVCH ();
                    or.imprimir(or.Ordenacion(vector)); break; }
            case 3: { int vector[]={1,10,9,8,11,7,6,12,2,3,4,5};
                    BusquedaWVCh or = new BusquedaWVCh ();
                    or.imprimir(or.OrdenacionWVC(vector));
                    BusquedaWVCh b=new BusquedaWVCh(); 
                    b.busquedaBinariaWVC(vector, 9);  
                    System.out.println("EL NUMERO ESTA EN LA POSICIÓN:"+b.busquedaBinariaWVC(vector, 12)); break; }
            case 4: {  operacionesMateWVCh();break; }
             default:{System.out.println("Opción no Valida"); break;}
            }

            System.out.println("Ingrese el numero de algoritmo que desea probar:");
            opcion=leer.nextInt();
        }               
    }             
    }
    


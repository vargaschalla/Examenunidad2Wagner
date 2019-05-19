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
public class OrdenarWVCH {
    public int[] Ordenacion(int[] vector) {
        int aux,numV, j,inc=1;
        String ordenado;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la forma que quiere ordenar(ascendente(ASC)o Descendente(DES))");
        while(inc<=1){
            inc++;
            ordenado=leer.next();
            ordenado=ordenado;
            if(ordenado.equals("ASC")){
                for (int i = 1; i < vector.length; i++) {
                    aux = vector[i];
                    j = i;
                    while (j > 0 && aux < vector[j - 1]) {
                        vector[j] = vector[j - 1];
                        j--;
                    }
                    vector[j] = aux;
                }
                return vector;
            }else if(ordenado.equals("DES")){
                for (int i = 1; i < vector.length; i++) {
                    aux = vector[i];
                    j = i;
                    while (j > 0 && aux > vector[j - 1]) {
                        vector[j] = vector[j - 1];
                        j--;
                    }
                    vector[j] = aux;
                }
                return vector;
            }
        }
        
        return null;
    }
    public void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]=" + vector[i]);
        }
    }
    public static void main(String[] args) {
        int[] vector = {42, 57, 14, 40, 96, 19, 8, 68, 1, 4};
        OrdenarWVCH  or = new OrdenarWVCH ();

        or.imprimir(or.Ordenacion(vector));
    }
}

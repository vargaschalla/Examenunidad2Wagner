/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenCasa;

/**
 *
 * @author Usuario
 */
public class OrdeWVCh {

        public static void ordenacion(int vector[]){
                int N=vector.length;
                ORDEN_WAGNER(vector, 0, N-1);
        }
        public static void ORDEN_WAGNER(int vec[], int primero, int ultimo){
                if(primero>=ultimo) return;
                int valorA=vec[primero];
                int Izquierda=primero+1;
                int Derecha=ultimo;
                while(Izquierda<=Derecha){
                        while(Izquierda<=ultimo && vec[Izquierda]<valorA){
                                Izquierda++;
                        }
                        while(Derecha>primero && vec[Derecha]>=valorA){
                                Derecha--;
                        }
                        if(Izquierda<Derecha){
                                int temp=vec[Izquierda];
                                vec[Izquierda]=vec[Derecha];
                                vec[Derecha]=temp;
                        }
                }
                
                if(Derecha>primero){
                        int temp=vec[primero];
                        vec[primero]=vec[Derecha];
                        vec[Derecha]=temp;
                }
                ORDEN_WAGNER(vec, primero, Derecha-1);
                ORDEN_WAGNER(vec, Derecha+1, ultimo);
        }
        public static void imprimirVector(int vec[]){
                for(int i=0;i<vec.length;i++){
                        System.out.print(vec[i]+" ");
                }
        }
    public static void main(String[] args) {
        int vec[]={2,5,128,4,3,9,89,12,32,43,6,7,56};
         System.out.println("Vector desordenado");
                imprimirVector(vec);
                ordenacion(vec);
                System.out.println("\nVector ordenado");
                imprimirVector(vec);
                System.out.println("\n");

    }
}

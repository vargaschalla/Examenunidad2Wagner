/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe;

/**
 *
 * @author waldir vargas challa
 */
public class BusquedaWVCh {
    
    public int busquedaBinariaWVC(int[] vector, int valorB){
        int encontrado=-1, primero=0, ultimo=vector.length-1, medio;
        while((primero<=ultimo) && (encontrado<0)){
        medio = (primero+ultimo)/2;
        if(vector[medio]==valorB){
            encontrado=medio;
        }else if(vector[medio]<valorB){
        primero=medio+1;
        }else{
        ultimo=medio-1;
        }
        }    
            return encontrado;
        }
        public int[] OrdenacionWVC(int[] vector) {
            int aux, j;
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
        }
        public void imprimir(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.println("vector[" + i + "]=" + vector[i]);
        }
    }
        
  
    public static void main(String[] args){
        int vector[]={1,10,9,8,11,7,6,12,2,3,4,5};
        BusquedaWVCh or = new BusquedaWVCh ();

        or.imprimir(or.OrdenacionWVC(vector));
        
        BusquedaWVCh b=new BusquedaWVCh(); 
        b.busquedaBinariaWVC(vector, 9);  
        System.out.println("EL NUMERO ESTA EN LA POSICIÓN:"+b.busquedaBinariaWVC(vector, 12));

    }
}


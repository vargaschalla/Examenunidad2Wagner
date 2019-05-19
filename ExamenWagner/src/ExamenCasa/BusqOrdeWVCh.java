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
public class BusqOrdeWVCh {
    public static int buscar(int[] vector, int chave) {
		return BusqBinariaWVC(vector, 0, vector.length - 1, chave);
	}
	public static int BusqBinariaWVC(int[] vector, int primero, int ultimo,int encontrado) {
		int media = (primero + ultimo) / 2;
		int valorB= vector[media];

		if (primero > ultimo)
			return -1;
		else if(valorB == encontrado) 
			return media;
		else if (valorB < encontrado)
			return BusqBinariaWVC(vector, media+1, ultimo, encontrado);
		else
			return BusqBinariaWVC(vector, primero, media-1, encontrado);
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
   
    public void imprimirWVC(int[] vector) {
    for (int i = 0; i < vector.length; i++) {
        System.out.println("vector[" + i + "]=" + vector[i]);
    }
}
   
    public static void main(String[] args) {
         int vector[]={4,5,1,9,50,35,23,45,8};
    BusqOrdeWVCh or = new BusqOrdeWVCh ();

    or.imprimirWVC(or.OrdenacionWVC(vector));

    BusqOrdeWVCh b=new BusqOrdeWVCh(); 
    b.buscar(vector, 9);  
        System.out.println("EL NUMERO ESTA EN LA POSICIÓN:"+b.buscar(vector, 8));
    }
}

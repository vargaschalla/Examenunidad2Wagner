/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upeu.edu.pe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LeerTecladoWVChalla {


    BufferedReader br = new BufferedReader(new 
    InputStreamReader(System.in));    
    
    public int leer(int dato, String texto){          
        try {
            System.out.println(texto);
            dato=Integer.parseInt(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public boolean leer(boolean dato, String texto){       
        try {
            System.out.println(texto);
            dato=br.ready() ;
        } catch (IOException e) { 
            System.err.println(e.getMessage());
        }
        return dato;
    }
    
    public double leer(double dato, String texto){         
        try {
            System.out.println(texto);
            dato=Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    return dato;
    }
    public static boolean operacionesMateWVCh(){
        int num1,num2,inc=1;
        boolean b=true;
        double result=0;
        String operador;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        num1=leer.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2=leer.nextInt();
        System.out.println("Ingrese el símbolo para la operación (+,-,/,*):");
        operador=leer.next();
        operador=operador;

        while(inc<=2){
            inc++;
            if(operador.equals("+")) {
            result=num1+num2;

        } else if(operador.equals("-")){
            result=num1-num2;

        }else if(operador.equals("*")){
            result=num1*num2;

        }else if(operador.equals("/")){
            result=num1/num2;
        }else {
                System.out.println("error!!"+"false");
                return false;
        }

    }
        System.out.println("El resultado de la operación es:"+result);
        System.out.println("El resultado de la operación es:"+b);

        return true;

}
    
    public static void main(String[] args) {
        operacionesMateWVCh();
    }
}



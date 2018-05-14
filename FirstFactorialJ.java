/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbyte;

import java.util.Scanner;

/**
 *
 * @author EXCP0035
 */
public class FirstFactorialJ {
    public static int FirstFactorial(int num) { 
        if(num==0){
            return 1;
        }
        else{
            return num*FirstFactorial(num-1);  
        }
    }
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        int i_entrada = Integer.parseInt(entrada);
        salida += FirstFactorial(i_entrada);
        System.out.print(salida);
    }
}

package coderbyte;

import java.util.Scanner;

public class CheckNumsJ {
    public static String CheckNums(int num1, int num2) { 
        if(num2 == num1){
            return "-1";
        }
        else{
            return (num2 > num1) ? "true" : "false";
        }        
    }
    
    //3 122     true
    //67 67     -1
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        String[] numeros = entrada.split(" ");
        int i_entrada1 = Integer.parseInt(numeros[0]);   
        int i_entrada2 = Integer.parseInt(numeros[1]);
        salida += CheckNums(i_entrada1,i_entrada2);
        System.out.print(salida);
    }  
}

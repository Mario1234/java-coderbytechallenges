package coderbyte;


import java.util.Scanner;

public class FirstReverseJ {
    public static String FirstReverse(String str) { 
        String sol = "";
        for (int i = str.length() - 1; i >= 0; i--) {   
          sol += str.charAt(i);
        }
        return sol;
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += FirstReverse(entrada);
        System.out.print(salida);
    }
}

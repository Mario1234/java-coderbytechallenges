package coderbyte;

import java.util.Scanner;

public class LetterChangesJ {
    public static String LetterChanges(String str) { 
        String sol = "";
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            String letra = ""+c;
            if(letra.replaceAll("([a-zA-Z])","").length()==0){//si es letra
                if(c=='z' || c=='Z')letra="a";
                else letra = ""+(char)((c+1));
                if(letra.replaceAll("([aeiou])","").length()==0){//si es vocal minuscula
                    letra = letra.toUpperCase();               
                }            
            }     
            sol+=letra;
        }
        return sol;
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += LetterChanges(entrada);
        System.out.print(salida);
    }
}

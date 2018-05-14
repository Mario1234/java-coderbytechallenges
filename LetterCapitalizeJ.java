package coderbyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCapitalizeJ {
    public static String LetterCapitalize(String str) { 
        Pattern pattern = Pattern.compile("([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(str);
        String sol = "";
        List<String> todasPalabras = new ArrayList<String>();
        while (matcher.find()) {
            todasPalabras.add(matcher.group());
        }      
        for(String palabra: todasPalabras){
            if(palabra.length()>0){
                sol+=(""+palabra.charAt(0)).toUpperCase()+palabra.substring(1);
            }
            sol+=" ";
        }
        return sol.substring(0,sol.length()-1);
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += LetterCapitalize(entrada);
        System.out.print(salida);
    }
}

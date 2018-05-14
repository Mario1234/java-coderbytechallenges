/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbyte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestWord {
    public static String LongestWord(String sen) {   
        String sololetrasEspacios = sen.replaceAll( "((?![a-zA-Z ]).)", "" );
        Pattern pattern = Pattern.compile("([a-zA-Z]+)");
        Matcher matcher = pattern.matcher(sololetrasEspacios);
        String sol = "";
        List<String> todasPalabras = new ArrayList<String>();
        while (matcher.find()) {
            todasPalabras.add(matcher.group());
        }    
        for(String palabra: todasPalabras){
            if(palabra.length()>sol.length()){
                sol=palabra;
            }
        }       
        return sol;    
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += LongestWord(entrada);
        System.out.print(salida);
    }
}

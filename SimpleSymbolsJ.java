package coderbyte;

import java.util.Scanner;

public class SimpleSymbolsJ {
    //"+f+e+d+" "true"
    //"+d+=3=+s+" "false"
    //"+d+==+s+"  "true"
    //"f++d+" "false"
    public static String SimpleSymbols(String str) { 
        String sinMasLetraMas = str.replaceAll( "((\\+[a-zA-Z])+)\\+", "");
        String sinMasIgual = sinMasLetraMas.replaceAll( "(\\+)", "");
        sinMasIgual = sinMasIgual.replaceAll( "(=)", "");
        if(sinMasIgual.length()==0){
            return "true";
        }
        else{
            return "false";
        }
    }
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += SimpleSymbols(entrada);
        System.out.print(salida);
    }
}

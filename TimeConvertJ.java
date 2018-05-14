package coderbyte;

import java.util.Scanner;

public class TimeConvertJ {
    public static String TimeConvert(int num) { 
        if(num==0)return "0:0";
        return num/60+":"+num%60;
    } 
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        int i_entrada = Integer.parseInt(entrada);
        salida += TimeConvert(i_entrada);
        System.out.print(salida);
    }    
}

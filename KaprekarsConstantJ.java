package coderbyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KaprekarsConstantJ {
    public static int KaprekarsConstant(int num){
        int pasos = 0;
        while(num!=6174){
            List<String> listaCaracteres = new ArrayList<String>();
            String s_numero = ""+num;
            for(int i=0;i<s_numero.length();i++){
                listaCaracteres.add(""+s_numero.charAt(i));
            }
            //padding
            int cantidadCeros = 4-listaCaracteres.size();
            for(int i=0;i<cantidadCeros;i++){
                listaCaracteres.add("0");
            }
            Collections.sort(listaCaracteres);//ordenado ascendente
            List<String> invertida = new ArrayList<>(listaCaracteres);
            Collections.reverse(invertida);//ordenado descendente
            String num1 = String.join("", listaCaracteres);
            String num2 = String.join("", invertida);
            System.out.println(num1+" "+num2);
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            if(n1<n2){
                num = n2-n1;
            }
            else{
                num = n1-n2;
            }
            pasos++;
        }
        return pasos;
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        int i_entrada = 0;
        i_entrada = Integer.parseInt(entrada);
        salida += KaprekarsConstant(i_entrada);
        System.out.print(salida);
    } 
}

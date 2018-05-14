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
            String s_numero = ""+num;
            //encuentra los digitos repetidos
            String expresionRepes = "((.)\\2{1,})";
            Pattern pattern = Pattern.compile(expresionRepes);
            Matcher matcher = pattern.matcher(s_numero);
            List<String> repetidos = new ArrayList<String>();
            //guarda los grupos de digitos repetidos
            while (matcher.find()) {
                repetidos.add(matcher.group());
            }   
            //guarda una lista de los digitos repetidos, uno de cada
            ArrayList<String> listaSinRepes = new ArrayList<String>();
            for(String repe: repetidos){//repe es del estilo "111"
                listaSinRepes.add(""+repe.charAt(0));//cogemos el primer caracter solo
            }
            //quita los digitos repetidos de la cadena s_numero
            s_numero = s_numero.replaceAll(expresionRepes,"");
            //aniade a la lista sin repes los digitos que quedan en la cadena s_numero
            for(int i=0;i<s_numero.length();i++){
                listaSinRepes.add(""+s_numero.charAt(i));
            }
            //padding
            int cantidadCeros = 4-listaSinRepes.size();
            for(int i=0;i<cantidadCeros;i++){
                listaSinRepes.add("0");
            }
            Collections.sort(listaSinRepes);//ordenado ascendente
            List<String> invertida = new ArrayList<>(listaSinRepes);
            Collections.reverse(invertida);//ordenado descendente
            String num1 = String.join("", listaSinRepes);
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

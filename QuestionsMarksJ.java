package coderbyte;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionsMarksJ {
    //aa6?9     false
    //acc?7??sss?3rr1??????5    true
    //arrb6???4xxbl5???eee5     true
    //acc?5??sss?3rr1??????5    false
    public static String QuestionsMarks(String str) { 
        String sinLetras = str.replaceAll("([a-zA-z])","");
        Pattern pattern = Pattern.compile("([1-9]\\?\\?\\?[1-9])");
        Matcher matcher = pattern.matcher(sinLetras);
        //%???%
        while (matcher.find()) {
            String aux = matcher.group();
            if(((aux.charAt(0)-'0')+(aux.charAt(4)-'0'))==10)return "true";
        }
        return "false";
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += QuestionsMarks(entrada);
        System.out.print(salida);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AlphabetSoupJ {
    public static String AlphabetSoup(String str) { 
        ArrayList<String> lista = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            lista.add(""+str.charAt(i));
        }
        Collections.sort(lista);
        String sol=String.join("", lista);
        return sol;
    } 
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += AlphabetSoup(entrada);
        System.out.print(salida);
    }
}

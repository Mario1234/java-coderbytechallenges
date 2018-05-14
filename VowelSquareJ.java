package coderbyte;

import java.util.Scanner;

public class VowelSquareJ {
    private static boolean esVocal(char letra){
        return ( (""+letra).replaceAll("([a|e|i|o|u])", "").length()==0 );
    }
    
    //abcd,eikr,oufj 1-0
    //aqrst,ukaei,ffooo 1-2
    //gg,ff
    public static String VowelSquare(String[] strArr) { 
        int alto = strArr.length;
        int ancho = strArr[0].length();
        char[][] tablero = new char[alto][ancho];
        for(int i=0;i<alto;i++){
            String s = strArr[i];
            for(int j=0;j<ancho;j++){
                tablero[i][j]=s.charAt(j);
            }
        }
        for(int i=0;i<(alto-1);i++){
            for(int j=0;j<(ancho-1);j++){
                if(esVocal(tablero[i][j]) && esVocal(tablero[i][j+1]) && esVocal(tablero[i+1][j]) && esVocal(tablero[i+1][j+1])){
                    return i+"-"+j;
                }
            }
        }
        return "not found";
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        String[] a_entrada = null;
        a_entrada = entrada.split(",");
        salida += VowelSquare(a_entrada);
        System.out.print(salida);
    } 
}

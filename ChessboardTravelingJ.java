package coderbyte;

import java.util.Scanner;

public class ChessboardTravelingJ {
    //(1 1)(2 2) 2
    //(1 1)(3 3) 6
    //(2 2)(4 3) 3
    public static int ChessboardTraveling(String str) {
        String casillaDestino = str.substring(5,10);
        String casillaOrigen = str.substring(0,5);
        if(casillaDestino.equalsIgnoreCase(casillaOrigen)){
            return 1;//este camino llega al destino
        }
        else{
            char c_der = casillaOrigen.charAt(3);c_der++;
            String casillaDerecha = casillaOrigen.substring(0, 3)+c_der+")";
            char c_arr = casillaOrigen.charAt(1);c_arr++;
            String casillaArriba = "("+c_arr+casillaOrigen.substring(2, 5);
            int caminosDerecha = 0;//el camino muere a la der
            if(c_der<=str.charAt(8)){//el camino sigue a la der
                caminosDerecha = ChessboardTraveling(casillaDerecha+casillaDestino);
            }
            int caminosArriba = 0;//el camino muere hacia arriba
            if(c_arr<=str.charAt(6)){//el camino sigue arriba
                caminosArriba = ChessboardTraveling(casillaArriba+casillaDestino);
            }
            return caminosArriba+caminosDerecha;
        }
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += ChessboardTraveling(entrada);
        System.out.print(salida);
    } 
}

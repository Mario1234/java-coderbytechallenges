package coderbyte;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import javafx.util.Pair;

public class CorrectPathJ {
    
    private static boolean dentroMatriz(int x, int y, boolean[][] matriz){
        return (0<=x && x<matriz.length && 0<=y && y<matriz.length);
    }
    
    private static Pair<Integer, Integer> dameCasillaSig(char direccion, Stack<Pair<Integer, Integer>> casillas, boolean[][] tablero) {
        Pair<Integer,Integer> casillaSig = null;
        Pair<Integer,Integer> casillaActual = casillas.lastElement();
        int x = casillaActual.getKey();
        int y = casillaActual.getValue();
        switch(direccion){
            case 'r':
                y=y+1;
                break;
            case 'l':
                y=y-1;
                break;
            case 'u':
                x=x-1;
                break;
            case 'd':
                x=x+1;
                break;
            default:        
        }
        if(dentroMatriz(x,y,tablero) && !tablero[x][y]){
            casillaSig = new Pair<Integer,Integer>(x,y);
        }
        return casillaSig;
    }
    
    private static String recursion(char direccion, String caminoSig, Stack<Pair<Integer, Integer>> casillas, boolean[][] tablero) {
        String solActual = null;
        Pair<Integer,Integer> casillaSig = dameCasillaSig(direccion,casillas,tablero);
        if(casillaSig!=null){
            casillas.push(casillaSig);//apila el paso
            tablero[casillaSig.getKey()][casillaSig.getValue()]=true;
            solActual = backtracking(caminoSig,casillas,tablero);//prueba el paso
            if(solActual==null){
                //deshace el paso que lleva a camino muerto
                tablero[casillaSig.getKey()][casillaSig.getValue()]=false;
                casillas.pop();
            }
        } 
        return solActual;
    }
    
    public static String backtracking(String caminoActual, Stack<Pair<Integer,Integer>> casillas, boolean[][] tablero) {
        int posicion = casillas.size()-1;
        int limitePosicion = caminoActual.length();
        String solActual=null;
        if(tablero[4][4]){
            if(posicion==limitePosicion)
                return caminoActual;
            else
                return null;//llega al final pero le quedan pasos por dar de los predefinidos
        }
        else if(posicion<limitePosicion){            
            //caminoActual.indexOf('?');
            System.out.println(posicion+" "+caminoActual);    
            String caminoSig = caminoActual;
            char direccion = caminoActual.charAt(posicion);
            //si en este paso toma decision
            if(direccion=='?'){
                char[] posibles = {'r','l','d','u'};
                int i=0;
                //intenta las 4 direcciones
                while(i<4 && solActual==null){
                    direccion = posibles[i];  
                    String ini = "";
                    if(posicion>0){
                        ini = caminoActual.substring(0,posicion);
                    }
                    caminoSig = ini+direccion+caminoActual.substring(posicion+1,caminoActual.length());
                    solActual = recursion(direccion, caminoSig, casillas, tablero);                                 
                    i++;     
                } 
            }
            else{//si este paso estaba ya definido
                solActual = recursion(direccion, caminoSig, casillas, tablero);
            }            
        }
        return solActual;//camino muerto
    }
    
    public static String CorrectPath(String str) {
        Stack<Pair<Integer,Integer>> casillas = new Stack<Pair<Integer,Integer>>();
        casillas.push(new Pair<Integer,Integer>(0,0));
        boolean[][] tablero = new boolean[5][5];
        for(boolean[] fila: tablero){
            Arrays.fill(fila,false);
        }
        tablero[0][0]=true;
        return backtracking(str,casillas,tablero);
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        salida += CorrectPath(entrada);
        System.out.print(salida);
    }
}

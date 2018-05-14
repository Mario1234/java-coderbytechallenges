package coderbyte;

import java.util.Scanner;

public class ClosestEnemyIIJ {
    
    private static boolean dentroMatriz(int x, int y, int[][] matriz){
        return (0<=x && x<matriz.length && 0<=y && y<matriz.length);
    }
    
    private static int distanciaEnemigoMasCercano(int x, int y, int[][] tablero, int paso) {
        if(!dentroMatriz(x,y,tablero)){
            return 9900000;
        }
        else if(tablero[x][y]==-2){
            return paso;
        }
        else if(tablero[x][y]==paso || paso==0){
            int xder = x;int yder = y+1;
            int xaba = x+1;int yaba = y;
            int xizq = x;int yizq = y-1;
            int xarr = x-1;int yarr = y;
            //marca que ha pasado por aqui
            if(dentroMatriz(xder,yder,tablero) && tablero[xder][yder]==-1)tablero[xder][yder]=paso+1;
            if(dentroMatriz(xaba,yaba,tablero) && tablero[xaba][yaba]==-1)tablero[xaba][yaba]=paso+1;
            if(dentroMatriz(xizq,yizq,tablero) && tablero[xizq][yizq]==-1)tablero[xizq][yizq]=paso+1;
            if(dentroMatriz(xarr,yarr,tablero) && tablero[xarr][yarr]==-1)tablero[xarr][yarr]=paso+1;
            //amplia el camino siguiente paso
            int der = distanciaEnemigoMasCercano(xder,yder,tablero,paso+1);
            int aba = distanciaEnemigoMasCercano(xaba,yaba,tablero,paso+1);
            int izq = distanciaEnemigoMasCercano(xizq,yizq,tablero,paso+1);
            int arr = distanciaEnemigoMasCercano(xarr,yarr,tablero,paso+1);
            int longitudCaminoMinimo = Math.min(der,Math.min(izq,Math.min(aba,arr)));
            return longitudCaminoMinimo;
        }
        return 8800000;//si ya ha pasado por esta casilla
    }
    
    //000,100,200   1
    //0000,2010,0000,2002   2
    public static String ClosestEnemyII(String[] strArr) { 
        boolean hayEnemigos = false;
        int x = -1;
        int y = -1;
        int alto = strArr.length;
        int ancho = strArr[0].length();
        int[][] tablero = new int[alto][ancho];
        for(int i=0;i<alto;i++){
            for(int j=0;j<alto;j++){
                int valor = Integer.parseInt(""+strArr[i].charAt(j));
                tablero[i][j]=-1;
                if(valor==1){x=i;y=j;tablero[i][j]=-3;}
                if(valor==2){tablero[i][j]=-2;hayEnemigos=true;}
            }
        }
        if(!hayEnemigos)return "0";
        String solucion =  ""+distanciaEnemigoMasCercano(x,y,tablero,0);
        for(int[] fila : tablero){
            for(int casilla:fila){
                System.out.print(casilla);
            }
            System.out.println();            
        }
        return solucion;
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        String[] a_entrada = null;
        a_entrada = entrada.split(",");
        salida += ClosestEnemyII(a_entrada);
        System.out.print(salida);
    } 
}

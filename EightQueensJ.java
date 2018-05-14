/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbyte;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author EXCP0035
 */
public class EightQueensJ {
    private static class Casilla{
        private int x;
        private int y;

        public Casilla(int x, int y) {
            this.x = x;
            this.y = y;
        }       
        
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    
    private static boolean dentroMatriz(int x, int y, Object[][] matriz){
        return (0<=x && x<matriz.length && 0<=y && y<matriz.length);
    }
    
    private static void amenazaDiagonales(Casilla c, int x, int y, Casilla[][] casillasAmenazadas, int i) {        
        int xaux = x+i;
        int yaux = y+i;
        //System.out.println(xaux+"-"+yaux);
        if(dentroMatriz(xaux,yaux,casillasAmenazadas) && casillasAmenazadas[xaux][yaux]==null){
            casillasAmenazadas[xaux][yaux]=c;//amenaza diagonal abj-der
        }
        xaux = x+i;
        yaux = y-i;
        //System.out.println(xaux+"-"+yaux);
        if(dentroMatriz(xaux,yaux,casillasAmenazadas) && casillasAmenazadas[xaux][yaux]==null){
            casillasAmenazadas[xaux][yaux]=c;//amenaza diagonal abj-izq
        }
        xaux = x-i;
        yaux = y+i;
        //System.out.println(xaux+"-"+yaux);
        if(dentroMatriz(xaux,yaux,casillasAmenazadas) && casillasAmenazadas[xaux][yaux]==null){
            casillasAmenazadas[xaux][yaux]=c;//amenaza diagonal arr-der
        }
        xaux = x-i;
        yaux = y-i;
        //System.out.println(xaux+"-"+yaux);
        if(dentroMatriz(xaux,yaux,casillasAmenazadas) && casillasAmenazadas[xaux][yaux]==null){
            casillasAmenazadas[xaux][yaux]=c;//amenaza diagonal arr-izq
        }
    }
    
    //2.1,4.3,6.3,8.4,3.4,1.6,7.7,5.8   2.1
    //2.1,5.3,6.3,8.4,3.4,1.8,7.7,5.8   5.3
    //2.1,4.2,6.3,8.4,3.5,1.6,7.7,5.8   true
    public static String EightQueens(String[] strArr) {         
        //tablero sin reinas
        Casilla[][] casillasAmenazadas = new Casilla[8][8];
        for(Casilla[] fila: casillasAmenazadas){
            Arrays.fill(fila, null);
        }
        //lee casillas de reinas
        for(String s_casilla : strArr){
            String[] coordenadas = s_casilla.split("\\.");
            int x = Integer.parseInt(coordenadas[0])-1;
            int y = Integer.parseInt(coordenadas[1])-1;
            Casilla c = new Casilla(x,y);
            //si esta casilla no esta amenazada
            if(casillasAmenazadas[x][y]==null){
                //calcula casillas amenazadas con esta reina en tablero
                casillasAmenazadas[x][y]=c;
                for(int i=0;i<8;i++){
                    if(casillasAmenazadas[x][i]==null)casillasAmenazadas[x][i]=c;//amenaza fila
                    if(casillasAmenazadas[i][y]==null)casillasAmenazadas[i][y]=c;//amenaza columna
                    //amenaza diagonales
                    amenazaDiagonales(c,x,y,casillasAmenazadas,i);
                }
            }
            else{
                Casilla casillaQueAmenaza = casillasAmenazadas[x][y];
                return (casillaQueAmenaza.getX()+1)+"."+(casillaQueAmenaza.getY()+1);
            }
        }
        return "true";
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        String[] a_entrada = null;
        a_entrada = entrada.split(",");
        salida += EightQueens(a_entrada);
        System.out.print(salida);
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbyte;

import java.util.Scanner;
import javafx.util.Pair;

/**
 *
 * @author EXCP0035
 */
public class MaximalSquareJ {
    
    private static boolean dentroMatriz(int x, int y, boolean[][] matriz){
        return (0<=x && x<matriz.length && 0<=y && y<matriz.length);
    }
    
    private static boolean dentroMatriz(Pair<Integer, Integer> par, boolean[][] matriz){
        return dentroMatriz(par.getKey(), par.getValue(), matriz);
    }
    
    private static int cuadradoCasilla(Pair<Integer, Integer> par, boolean[][] matriz) {
        int i = par.getKey();
        int j = par.getValue();
        int tamanioAux = 0;
        boolean creciendo=(dentroMatriz(par,matriz) && matriz[i][j]);
        if(creciendo)tamanioAux=1;
        while(creciendo){
            Pair<Integer, Integer> der = new Pair<>(i,j+1);
            Pair<Integer, Integer> aba = new Pair<>(i+1,j);
            Pair<Integer, Integer> diag = new Pair<>(i+1,j+1);
            if(dentroMatriz(diag,matriz)){
                int tamDer = cuadradoCasilla(der,matriz);
                int tamAba = cuadradoCasilla(aba,matriz);
                int tamDiag = cuadradoCasilla(diag,matriz);
                boolean sonCuadradosAdyacentes = (tamDer>0 && tamAba>0 && tamDiag>0);
                if(sonCuadradosAdyacentes){
                    int tamCuadradoMin = Math.min(tamDer,Math.min(tamAba, tamDiag));
                    if(tamanioAux<=tamCuadradoMin){
                        tamanioAux=(int) Math.pow(Math.sqrt(tamanioAux)+Math.sqrt(tamCuadradoMin), 2);
                        creciendo=true;
                    }
                    else
                        creciendo=false;
                }  
                else
                    creciendo=false;
            }
            else
                creciendo=false;
        }
        return tamanioAux;
    }
    
    //10100,10111,11111,10010   4
    //0111,1111,1111,1111   9
    //0111,1101,0111    1
    public static int MaximalSquare(String[] strArr) {
        boolean[][] matriz = new boolean[strArr.length][strArr[0].length()];
        //Arrays.fill(matriz, false);
        //conversion estructura datos
        for(int i=0;i<strArr.length;i++){
            for(int j=0;j<strArr[i].length();j++){
                matriz[i][j]=strArr[i].charAt(j)=='1';
            }
        }
        int cuadradoMaximo = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                cuadradoMaximo = Math.max(cuadradoMaximo,cuadradoCasilla(new Pair<>(i,j),matriz));
            }
        }
        return cuadradoMaximo;
    }
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        String[] a_entrada = null;
        a_entrada = entrada.split(",");
        salida += MaximalSquare(a_entrada);
        System.out.print(salida);
    } 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderbyte;

import java.util.Scanner;

/**
 *
 * @author EXCP0035
 */
public class PentagonalNumberJ {
    public static int SimpleAdding(int num) { 
        if(num<=1){
            return num;
        }
        else{
            return num+SimpleAdding(num-1);
        }
    }
    public static int PentagonalNumber(int num) { 
        int puntosTriangulo = SimpleAdding(num);
        int cincoTriang = 5*puntosTriangulo;
        //5 triangulos - (lineas interseccion triangulos) + centro
        int pentagono = cincoTriang-(5*num)+1;
        return pentagono;
    }
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        int i_entrada = 0;    
        i_entrada = Integer.parseInt(entrada);
        salida += PentagonalNumber(i_entrada);
        System.out.print(salida);
    } 
}

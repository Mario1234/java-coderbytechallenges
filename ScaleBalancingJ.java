package coderbyte;

import java.util.Scanner;

public class ScaleBalancingJ {
    //5.9,1.2.6.7   6,2
    //3.4,1.2.7.7   1
    //13.4,1.2.3.6.14   3,6
    //3.4,2.7.7   not possible
    public static String ScaleBalancing(String[] strArr) {   
        String[] balanza = strArr[0].split("\\.");
        int pesoIzq = Integer.parseInt(balanza[0]);
        int pesoDer = Integer.parseInt(balanza[1]);
        String[] plomosDisponibles = strArr[1].split("\\.");
        int[] listaPlomosDisponibles = new int[plomosDisponibles.length];
        int i = 0;
        for(String pesoDis : plomosDisponibles){
            listaPlomosDisponibles[i]=Integer.parseInt(pesoDis);
            i++;
        }
        //soluciones de un solo plomo
        for(int plomoDis1 : listaPlomosDisponibles){
            if((pesoIzq + plomoDis1)==pesoDer || pesoIzq ==(pesoDer+ plomoDis1)){
                return ""+plomoDis1;
            }
        }
        //soluciones con dos plomos
        for(int plomoDis1 : listaPlomosDisponibles){
            for(int plomoDis2 : listaPlomosDisponibles){
                if(plomoDis1!=plomoDis2){
                    if((pesoIzq + plomoDis1)==(pesoDer+plomoDis2)){
                        return plomoDis1+","+plomoDis2;
                    }
                    if((pesoIzq + plomoDis1 + plomoDis2)==pesoDer){
                        return plomoDis1+"."+plomoDis2+",";
                    }
                    if(pesoIzq==(pesoDer + plomoDis1 + plomoDis2)){
                        return ","+plomoDis1+"."+plomoDis2;
                    } 
                }                
            }
        }
        return "not possible";
    } 
    
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        String[] a_entrada = null;
        a_entrada = entrada.split(",");
        salida += ScaleBalancing(a_entrada);
        System.out.print(salida);
    } 
}

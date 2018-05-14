
package coderbyte;
import java.util.Scanner;

public class SimpleAddingJ {
    public static int SimpleAdding(int num) { 
        if(num<=1){
            return num;
        }
        else{
            return num+SimpleAdding(num-1);
        }
    }
    public static void main (String[] args) {      
        Scanner s = new Scanner(System.in);
        String entrada = s.nextLine();
        String salida = "";
        int i_entrada = Integer.parseInt(entrada);
        salida += SimpleAdding(i_entrada);
        System.out.print(salida);
    }    
}

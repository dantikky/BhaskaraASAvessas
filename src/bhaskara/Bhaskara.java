
package bhaskara;

import java.util.Scanner;


public class Bhaskara {

    
    public static void main(String[] args) {
Scanner console = new Scanner (System.in);       
 //Entradas
        System.out.print("x1: ");
        double x1 = console.nextDouble();
        
        System.out.print("x2: ");
        double x2 = console.nextDouble();
        
        System.out.print("c: ");
        double c = console.nextDouble();
      //Processamento
        double s = x1 + x2;
        double p = x1 * x2;
        double a = c / p;
        double b = -(a*s);
      // saida
        System.out.println(a + " xÂ² + " + b + " x + " + c + " = 0");
    }
    
}

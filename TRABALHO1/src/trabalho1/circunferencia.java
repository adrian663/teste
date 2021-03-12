
package trabalho1;

import java.util.Scanner;

public class circunferencia {
    
    Double numero;

    static Scanner ler = new Scanner (System.in);

public static void main(String[] args) {
    
     System.out.println ("digite o raio da circunferencia");
     Double numero = ler.nextDouble();
    
     System.out.println ("diametro: " +numero*2);
     
     System.out.println("Quadrante: " +(3.14*(numero*numero))/4);
}
}
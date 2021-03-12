
package trabalho1;

import java.util.Scanner;

public class Calculo {
    
    double numero;
    
    static Scanner ler = new Scanner (System.in);
    
public static void main(String[] args){
    
    System.out.println("Digite um valor: ");
    Double numero = ler.nextDouble();
    
    double dobro = numero*2;
    double triplo = numero*3;
    double metade = (dobro*3)/2;
    
    System.out.println("Dobro do valor: " +dobro);
    System.out.println("Triplo do valor: " +triplo);
    System.out.println("Metade do triplo do dobro do valor: " +metade);

}
}
    

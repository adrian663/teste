
package trabalho1;

import java.util.Scanner;

public class media {

    String nome;
    int nota1, nota2, nota3;
    static Scanner ler = new Scanner (System.in);
   
    public static void main(String[] args) {
 
 System.out.println ("digite seu nome");
 String nome = ler.nextLine();
 
System.out.println ("digite nota 1");
 int nota1 = ler.nextInt();
 
System.out.println ("digite nota 2");
 int nota2 = ler.nextInt();
 
System.out.println ("digite nota 3");
 int nota3 = ler.nextInt();
 
System.out.println ("nome: " + nome);

 
System.out.println ("media: " + (nota1+nota2+nota3)/3);

    }
}
//Leia a idade de uma pessoa e determine se a pessoa é maior ou menor de idade
package Problemas_TheHuxley;
import java.util.Scanner;

public class maior_idade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int idade = ler.nextInt();
        
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
        else {
            System.out.println("Menor de idade");
        }
    }
}
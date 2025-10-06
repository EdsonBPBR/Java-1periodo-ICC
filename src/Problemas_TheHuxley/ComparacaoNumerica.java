package Problemas_TheHuxley;
import java.util.Scanner;

public class ComparacaoNumerica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero:");
        double n1 = entrada.nextInt();
        System.out.println("Digite outro numero:");
        double n2 = entrada.nextInt();
        entrada.close();

        if (n1 > n2) {
            System.out.printf("Maior numero: %.1f", n1);
        }

        else {
            System.out.printf("Maior numero: %.1f", n2);
        }
    }
}
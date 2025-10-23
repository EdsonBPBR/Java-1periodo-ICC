package Problemas_TheHuxley;
import java.util.Scanner;

public class ParouImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        entrada.close();

        if (numero % 2 == 0) {
            System.out.printf("%s é par", numero);
        }
        
        else {
            System.out.printf("%s é ímpar", numero);
        }
    }
}

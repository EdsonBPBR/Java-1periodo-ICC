package Problemas_TheHuxley;
import java.util.Scanner;

public class Sequencial_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        entrada.close();
        double y = (3 * (Math.pow(x, 3))) - (2 * (Math.pow(x, 2))) + (3 * x) - 1;
        System.out.printf("Y= %.1f", y);
    }
    
}
package Problemas_TheHuxley;
import java.util.Scanner;

public class ComparadordeNumerosInteiros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        entrada.close();

        if (n1 > n2) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        if (n1 == n2) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        if (n1 < n2) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        if (n1 != n2) {
            System.out.println("1");
        } 
        else {
            System.out.println("0");
        }

        if (n1 > n2 || n1 == n2) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }

        if (n1 < n2 || n1 == n2) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
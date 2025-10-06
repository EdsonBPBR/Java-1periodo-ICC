package Problemas_TheHuxley;
import java.util.Scanner;

public class BaskharaOctave {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b, c;

        System.out.println("Digite o coeficiente A:");
        a = entrada.nextInt();

        System.out.println("Digite o coeficiente B:");
        b = entrada.nextInt();

        System.out.println("Digite o coeficiente C:");
        c = entrada.nextInt();

        entrada.close();

        double delta = Math.pow(b, 2) - (4*a*c);
        System.out.println(delta);

        if (delta < 0) {
            System.out.println("A funcao nao tem raizes reais");
        }

        else if (delta == 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("Primeira raiz: %.1f", x1);
            System.out.println();
            System.out.printf("Segunda raiz: %.1f", x2);
        }

        else {
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.printf("Primeira raiz: %.0f", x1);
            System.out.println();
            System.out.printf("Segunda raiz: %.0f", x2);
        }
    }
}

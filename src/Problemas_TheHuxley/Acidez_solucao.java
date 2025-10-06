package Problemas_TheHuxley;
import java.util.Scanner;

public class Acidez_solucao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o pH da solucao:");
        double ph = entrada.nextDouble();
        entrada.close();

        if (ph == 7.0) {
            System.out.println("Essa solucao e neutra.");
        }

        else if (ph > 7 && ph <= 14) {
            System.out.println("Essa solucao e basica.");
        }

        else if (ph > 0 && ph < 7) {
            System.out.println("Essa solucao e acida.");
        }

        else {
            System.out.println("Valor deve estar entre 0 e 14.");
        }
    }
}
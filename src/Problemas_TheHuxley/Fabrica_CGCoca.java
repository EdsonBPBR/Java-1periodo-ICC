package Problemas_TheHuxley;
import java.util.Scanner;

public class Fabrica_CGCoca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int refri_350 = entrada.nextInt();
        int refri_600 = entrada.nextInt();
        int refri_2l = entrada.nextInt();

        entrada.close();
        double volume_total = (refri_350 * 0.35) + (refri_600 * 0.6) + (refri_2l * 2);
        String saida = String.format("Foram comprados %.1f litros de refrigerante.", volume_total);
        System.out.println(saida);
    }
}
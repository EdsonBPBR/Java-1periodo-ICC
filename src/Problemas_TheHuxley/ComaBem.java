package Problemas_TheHuxley;
import java.util.Scanner;

public class ComaBem {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor = ler.nextDouble();
        double total = valor * 1.1;
        String saida_total = String.format("%.2f", total);
        ler.close();
        System.out.print(saida_total);
    }
}

package Problemas_TheHuxley;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double peso = ler.nextDouble();
        double altura = ler.nextDouble();
        double imc = (peso / Math.pow(altura, 2));

        String saida_imc = String.format("%.2f", imc);
        System.out.print(saida_imc);
    }
}

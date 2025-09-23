package Problemas_TheHuxley;
import java.util.Scanner;

public class As4Operacoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double numero1 = ler.nextDouble();
        double numero2 = ler.nextDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = (numero1 / numero2);

        String saida_soma = String.format("%.2f", soma);
        String saida_subtracao = String.format("%.2f", subtracao);
        String saida_multiplicacao = String.format("%.2f", multiplicacao);
        String saida_divisao = String.format("%.2f", divisao);

        System.out.println(saida_soma);
        System.out.println(saida_subtracao);
        System.out.println(saida_multiplicacao);
        System.out.print(saida_divisao);
    }
}

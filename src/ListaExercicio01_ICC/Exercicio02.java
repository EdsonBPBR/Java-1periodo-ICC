package ListaExercicio01_ICC;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, soma, subtracao, multiplicacao, divisao;

        numero1 = entrada.nextInt();
        numero2 = entrada.nextInt();

        entrada.close();

        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;

        String saida_soma = String.format("%s + %s = %s", numero1, numero2, soma);
        System.out.println(saida_soma);

        String saida_subtracao = String.format("%s - %s = %s", numero1, numero2, subtracao);
        System.out.println(saida_subtracao);

        String saida_multiplicacao = String.format("%s x %s = %s", numero1, numero2, multiplicacao);
        System.out.println(saida_multiplicacao);

        String saida_divisao = String.format("%s / %s = %s", numero1, numero2, divisao);
        System.out.println(saida_divisao);
    }
}

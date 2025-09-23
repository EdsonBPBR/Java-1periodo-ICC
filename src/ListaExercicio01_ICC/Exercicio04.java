package ListaExercicio01_ICC;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe seu nome: ");

        String nome = ler.next();
        double salario = ler.nextDouble();
        double valor_vendas = ler.nextDouble();
        double resultado = salario + (valor_vendas * 0.15);
        System.out.println(resultado);

    }
}

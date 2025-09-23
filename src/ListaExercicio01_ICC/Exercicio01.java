package ListaExercicio01_ICC;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero1, numero2, soma;
        numero1 = ler.nextDouble();
        numero2 = ler.nextDouble();
        soma = numero1 + numero2;
        System.out.println(soma);
    }
}

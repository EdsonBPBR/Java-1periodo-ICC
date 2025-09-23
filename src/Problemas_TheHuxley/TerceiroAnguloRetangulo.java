package Problemas_TheHuxley;
import java.util.Scanner;

public class TerceiroAnguloRetangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double angulo_a = ler.nextDouble();
        double angulo_b = ler.nextDouble();
        ler.close();

        double angulo_c = 180 - (angulo_a + angulo_b);
        String saida = String.format("3o angulo=%.6f", angulo_c);

        System.out.print(saida);
    }
}

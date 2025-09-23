package Problemas_TheHuxley;
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double raio, resultado;
        final double PI = 3.14159;

        raio = ler.nextDouble();
        ler.close();

        resultado = (Math.pow(raio, 2) * PI) / 10000;

        String saida = String.format("Area = %.4f", resultado);
        System.out.println(saida);
    }
}

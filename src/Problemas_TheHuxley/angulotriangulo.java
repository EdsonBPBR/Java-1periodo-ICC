package Problemas_TheHuxley;
import java.util.Scanner;

public class angulotriangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double angulo_a, angulo_b;
        System.out.println("Digite o 1° ângulo:");
        angulo_a = ler.nextDouble();
        System.out.println("Digite o 2° ângulo:");
        angulo_b = ler.nextDouble();
        ler.close();
        double angulo_c = 180 - (angulo_a + angulo_b);
        System.out.printf("O terceiro ângulo é: %.1f", angulo_c);
    }
}

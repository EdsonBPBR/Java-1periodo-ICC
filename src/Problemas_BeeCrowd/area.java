package Problemas_BeeCrowd;
import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double A, B, C, pi;
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        C = entrada.nextDouble();
        pi = 3.14159;
        entrada.close();

        double triangulo = ((A*C)/2);
        System.out.printf("TRIANGULO: %.3f\n", triangulo);

        double circulo = (C*C*pi);
        System.out.printf("CIRCULO: %.3f\n", circulo);

        double trapezio = ((A + B)*C)/2;
        System.out.printf("TRAPEZIO: %.3f\n", trapezio);
        
        double quadrado = (B*B);
        System.out.printf("QUADRADO: %.3f\n", quadrado);

        double retangulo = (A*B);
        System.out.printf("RETANGULO: %.3f\n", retangulo);

    }
}
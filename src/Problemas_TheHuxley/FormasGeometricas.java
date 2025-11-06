package Problemas_TheHuxley;
import java.util.Scanner;

public class FormasGeometricas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao = entrada.nextLine();

        if (opcao.equals("Q")) {
            double lado, area, perimetro;
            lado = entrada.nextDouble();

            area = Math.pow(lado, 2);
            perimetro = 4 * lado;
            System.out.printf("%.2f", area);
            System.out.println();
            System.out.printf("%.2f", perimetro);

        } 

        else if (opcao.equals("R")) {
            double lado, altura, area, perimetro;
            lado = entrada.nextDouble();
            altura = entrada.nextDouble();

            area = lado * altura;
            perimetro = (2*lado) + (2*altura);

            System.out.printf("%.2f", area);
            System.out.println();
            System.out.printf("%.2f", perimetro);
        }

        else if (opcao.equals("C")) {
            double raio, pi, area, perimetro;
            pi = 3.14;
            raio = entrada.nextDouble();

            area = Math.pow(raio, 2) * pi;
            perimetro = 2 * pi * raio;

            System.out.printf("%.2f", area);
            System.out.println();
            System.out.printf("%.2f", perimetro);
        }
        

        else {
            System.out.println("Nenhuma figura selecionada");
        }
        entrada.close();
    }
}
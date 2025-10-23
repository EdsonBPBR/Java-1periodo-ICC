package Problemas_TheHuxley;
import java.util.Scanner;

public class AreasFiguras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String forma = entrada.next();

        if (forma.equals("retangulo")) {
            double base, altura, area;
            base = entrada.nextDouble();
            altura = entrada.nextDouble();
            area = base * altura;

            System.out.printf("%.2f", area);
        }

        else if (forma.equals("triangulo")) {
            double base, altura, area;

            base = entrada.nextDouble();
            altura = entrada.nextDouble();
            area = (base * altura) / 2;

            System.out.printf("%.2f", area);
        }

        else if (forma.equals("trapezio")) {
            double base_menor, base_maior, altura, area;
            base_menor = entrada.nextDouble();
            base_maior = entrada.nextDouble();
            altura = entrada.nextDouble();
            area = ((base_maior + base_menor) * altura) / 2;

            System.out.printf("%.2f", area);

        }

        else if (forma.equals("circulo")) {
            double pi, raio, area;
            pi = 3.1415;
            raio = entrada.nextDouble();
            area = pi * Math.pow(raio, 2);

            System.out.printf("%.2f", area);
        }

        else {
            System.out.println("Figura invalida.");
        }
        entrada.close();
    }
    
}
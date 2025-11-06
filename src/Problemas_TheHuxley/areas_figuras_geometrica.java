package Problemas_TheHuxley;
import java.util.Scanner;

public class areas_figuras_geometrica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String opc = ler.next();
        if (opc.equals("retangulo")) {
            double base = ler.nextDouble();
            double altura = ler.nextDouble();
            double area = base * altura;
            System.out.printf("%.2f", area);
        }        
        else if (opc.equals("triangulo")) {
            double base = ler.nextDouble();
            double altura = ler.nextDouble();
            double area = (base * altura)/2;
            System.out.printf("%.2f", area);
        }

        else if (opc.equals("trapezio")) {
            double base_maior = ler.nextDouble();
            double base_menor = ler.nextDouble();
            double altura = ler.nextDouble();
            double area = ((base_maior + base_menor)*altura) /2;
            System.out.printf("%.2f", area);
        }

        else if (opc.equals("circulo")) {
            double pi = 3.1415;
            double circulo = ler.nextDouble();
            double area = pi * circulo*circulo;
            System.out.printf("%.2f", area);
        }
        else {
            System.out.println("Figura invalida.");
        }
        ler.close();
    }
}

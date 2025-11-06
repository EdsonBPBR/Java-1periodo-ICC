package Problemas_TheHuxley;
import java.util.Scanner;

public class areas_dois_circulos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pi, raio1, raio2, area1, area2;
        pi = 3.14;
        raio1 = ler.nextDouble();
        raio2 = ler.nextDouble();
        ler.close();
        area1 = raio1*raio1 * pi;
        area2 = raio2*raio2 * pi;

        if (area1 == area2) {
            System.out.println("Iguais");
        }

        else if (area1 > area2) {
            System.out.println("Primeiro circulo");
        }
        else {
            System.out.println("Segundo circulo");
        }
    }
}

package Problemas_TheHuxley;
import java.util.Scanner;

public class classificando_triangulos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double lado_a, lado_b, lado_c;
        lado_a = ler.nextDouble();
        lado_b = ler.nextDouble();
        lado_c = ler.nextDouble();
        ler.close();
        
        if (lado_a == lado_b && lado_b == lado_c) {
            System.out.println("equilatero");
        }

        else if (lado_a == lado_b || lado_c == lado_b || lado_c == lado_a) {
            System.out.println("isosceles");
        }
        else {
            System.out.println("escaleno");
        }

    }
}

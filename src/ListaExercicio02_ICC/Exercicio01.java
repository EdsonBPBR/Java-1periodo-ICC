package ListaExercicio02_ICC;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double lado_a, lado_b, lado_c;

        lado_a = entrada.nextDouble();
        lado_b = entrada.nextDouble();
        lado_c = entrada.nextDouble();
        entrada.close();

        if (((lado_a + lado_b) > lado_c) && ((lado_a + lado_c) > lado_b) && ((lado_c + lado_b) > lado_a))   {
            if ((lado_a == lado_b  && lado_b == lado_c)) {
                System.out.println("Triângulo Equilátero");
            }

            else if ((lado_b == lado_c) || (lado_b == lado_a) || (lado_a == lado_b) || (lado_a == lado_c) || (lado_c == lado_a) || (lado_c == lado_b)) {
                System.out.println("Triângulo Isósceles");
            }

            else {
                System.out.println("Triângulo Escaleno");
            }
        } 
        else {
            System.out.println("Triângulo inválido!!");
        }

    }
}

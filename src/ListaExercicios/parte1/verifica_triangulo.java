package ListaExercicios.parte1;
import java.util.Scanner;

public class verifica_triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3;
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();
        ler.close();

        if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
            if (n1 == n2 && n2 == n3) {
                System.out.println("É um triângulo equilátero");
            }

            else if (n1 == n2 || n2 == n3 || n3 == n1) {
                System.out.println("É um triângulo isósceles");
            }

            else {
                System.out.println("É um triângulo escaleno");
            }
        }

        else {
            System.out.println("Não é um triângulo");
        }
    }
}

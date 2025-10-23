import java.util.Scanner;

public class VerificaTriangulo {
   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float lado_a, lado_b, lado_c;

        System.out.print("Informe a medida do lado A: ");
        lado_a = entrada.nextFloat();

        System.out.print("Informe a medida do lado B: ");
        lado_b = entrada.nextFloat();

        System.out.print("Informe a medida do lado C: ");
        lado_c = entrada.nextFloat();

        entrada.close();

        if ((lado_a + lado_b > lado_c) && (lado_a + lado_c > lado_b) && (lado_c + lado_b > lado_a)) {
            // System.out.println("Triângulo válido!");
            if ((lado_a == lado_b) && (lado_b == lado_c)) {
                System.out.println("Os segmentos de retas formam um triângulo EQUILÁTERO");
            }

            else if ((lado_a == lado_b) || (lado_a == lado_c) || (lado_b == lado_c)) {
                System.out.println("Os segmentos de retas formam um triângulo ISÓSCELES");
            }

            else {
                System.out.println("Os segumentos de retas formam um triângulo ESCALENO");
            }
        }
        else {
            System.out.println("Não é um triângulo!");
        }


    }
}

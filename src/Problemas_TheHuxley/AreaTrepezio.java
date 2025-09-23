package Problemas_TheHuxley;
import java.util.Scanner;

public class AreaTrepezio {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Integer base_maior, base_menor, altura;

        System.out.println("Digite a base menor:");
        base_maior = ler.nextInt();
        System.out.println("Digite a base maior:");
        base_menor =  ler.nextInt();
        System.out.println("Digite a altura:");
        altura = ler.nextInt();

        double area = (1.0 / 2.0) * (base_maior + base_menor) * altura;
        String saida = String.format("Area do trapezio: %.6f", area);
        System.out.println(saida);
    }
}

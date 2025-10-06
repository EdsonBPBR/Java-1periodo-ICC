package Problemas_TheHuxley;
import java.util.Scanner;

public class MediadosAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1, n2, n3, media;

        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        n3 = entrada.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("aprovado");
        }

        else if (media >= 3 && media < 7) {
            System.out.println("prova final");
        }

        else {
            System.out.println("reprovado");
        }
    }
}

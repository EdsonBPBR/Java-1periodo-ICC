package ListaExercicio02_ICC;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double media_final = entrada.nextDouble();
        entrada.close();
        if (media_final >= 0 && media_final <= 4) {
            System.out.println("Reprovado");
        }

        else if (media_final >= 5 && media_final <= 6) {
            System.out.println("Recuperação");
        }

        else {
            System.out.println("Aprovado");
        }   
    }
}

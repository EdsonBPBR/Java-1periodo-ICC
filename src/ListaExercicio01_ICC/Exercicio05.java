package ListaExercicio01_ICC;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = ler.next();

        double nota1, nota2, nota3, media;
        nota1 = ler.nextDouble();
        nota2 = ler.nextDouble();
        nota3 = ler.nextDouble();
        media = ((nota1 + nota2 + nota3) / 3);

        String saida = String.format("A média do aluno %s é %.2f", nome, media);
        System.out.print(saida);
    }
}

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, nota3, media;
       
        System.out.print("Informe o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.println("Informe a primeira nota:");
        nota1 = entrada.nextDouble();

        System.out.println("Informe a segunda nota:");
        nota2 = entrada.nextDouble();

        System.out.println("Informe a terceira nota:");
        nota3 = entrada.nextDouble();

        entrada.close();

        media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("%s ,aprovado com media %.1f", nome, media);
        }

        else if (media >= 5 && media < 7) {
            System.out.printf("%s, recuperacao com media %.1f",nome, media);
        }

        else {
            System.out.printf("%s, reprovado com media %.1f",nome, media);
        }
    }
}

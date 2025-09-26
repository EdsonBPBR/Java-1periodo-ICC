package Problemas_TheHuxley;
import java.util.Scanner;

public class média_entre_3_notas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, nota3, media, ponderada_1, ponderada_2;
        
        //entradas
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        entrada.close();

        media = (nota1 + nota2 + nota3) / 3;
        ponderada_1 = ((nota1 * 2) + (nota2 * 2) + (nota3 * 3)) / 7;
        ponderada_2 = ((nota1 * 1) + (nota2 * 2) + (nota3 * 2)) / 5;

        String saida_media = String.format("%.2f", media);
        String saida_ponderada1 = String.format("%.2f", ponderada_1);
        String saida_ponderada2 = String.format("%.2f", ponderada_2);

        System.out.println(saida_media);
        System.out.println(saida_ponderada1);
        System.out.println(saida_ponderada2);
    }
}

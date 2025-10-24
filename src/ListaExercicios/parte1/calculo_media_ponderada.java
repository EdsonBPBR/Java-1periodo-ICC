package ListaExercicios.parte1;
import java.util.Scanner;

public class calculo_media_ponderada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, p1, p2, p3, media_p;
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        n3 = ler.nextDouble();
        p1 = ler.nextDouble();
        p2 = ler.nextDouble();
        p3 = ler.nextDouble();
        ler.close();
        media_p = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 +p3);
        
        if (media_p >= 5 && media_p < 7 ){
            System.out.println("Recuperação");
        }

        else if (media_p >= 7) {
            System.out.println("Aprovado!");
        }

        else {
            System.out.println("Reprovado...                                                                                  ");
        }
    }
}

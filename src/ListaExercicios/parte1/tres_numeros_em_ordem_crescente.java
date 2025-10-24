package ListaExercicios.parte1;
import java.util.Scanner;

public class tres_numeros_em_ordem_crescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, maior, meio, menor;
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();
        ler.close();

        maior = n1;
        menor = n1;
        meio = n1;

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        if (n2> menor && n2 < maior) {
            meio = n2;
        }

        if (n3 > menor && n3 < maior) {
            meio = n3;
        }

        System.out.printf("%s %s %s",menor, meio, maior);
    }
}

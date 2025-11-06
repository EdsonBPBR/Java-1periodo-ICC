package Problemas_TheHuxley;

import java.util.Scanner;

public class decrescente_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, n3, maior, meio, menor;
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        n3 = ler.nextInt();
        ler.close();
        
        maior = meio = menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }

        if (n2 > maior) {
            maior = n2;
        }

        if (n3 > maior) {
            maior = n3;
        }

        meio = n1 + n2 + n3 - (maior + menor);

        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
    }
}

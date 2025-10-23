package Problemas_BeeCrowd;
import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, n3, n4, diferenca;

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        n4 = entrada.nextInt();
        entrada.close();

        diferenca = ((n1 * n2) - (n3 * n4));

        System.out.println("DIFERENCA = "+ diferenca);
    }
}

package Aulas;
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;

        n1 = entrada.nextInt();
        n2 = entrada.nextInt();

        if (n1 > n2) {
            System.out.println("Não há valores no intervalo");
        }
        else {
            int somatorio = 0;
            for (int i = n1; i <= n2; i++) {
                    somatorio = somatorio + i;
            }
            System.out.println(somatorio);
        }
    }
}

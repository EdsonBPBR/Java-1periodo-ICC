package Problemas_TheHuxley;
import java.util.Scanner;

public class a_formula_de_janaina {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        ler.close();
        for (int i = a; i <= b; i++) {
            System.out.println(((i*i) - 4*i)+5);
        }
    }
}

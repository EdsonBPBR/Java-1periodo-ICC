package Problemas_TheHuxley;
import java.util.Scanner;

public class divisibilidade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        ler.close();
        if (numero % 4 == 0 && numero % 7 == 0 && numero % 5 != 0) {
            System.out.println("sim");
        }
        else {
            System.out.println("nao");
        }
    }
}

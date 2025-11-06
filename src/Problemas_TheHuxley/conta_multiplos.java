package Problemas_TheHuxley;
import java.util.Scanner;

public class conta_multiplos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1 = ler.nextInt();
        int numero2 = ler.nextInt();
        ler.close();
        int freq = 0;
        for (int i = 1; i < 50; i++) {
            if (i % numero1 == 0 && i % numero2 == 0) {
                freq += 1;
            }
        }
        System.out.println(freq);
    }
}

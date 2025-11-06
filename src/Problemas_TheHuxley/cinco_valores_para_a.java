package Problemas_TheHuxley;
import java.util.Scanner;
public class cinco_valores_para_a {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int freq = 0;
        for (int i =0; i < 5; i ++) {
            System.out.println("Digite um valor:");
            double valor = ler.nextDouble();
            if (valor < 0) {
                freq += 1;
            }
        }
        ler.close();
        System.out.printf("Foram digitados %s numeros negativos",freq);
    }
}
package Problemas_TheHuxley;

import java.util.Scanner;

public class escadinha_magica {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        ler.close();
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++){
                if (i == j) {
                    System.out.printf("%s", j);
                }
                else {
                    System.out.printf("%s ", j);
                }
                
            }
            System.out.print("\n");
        }
    }
}
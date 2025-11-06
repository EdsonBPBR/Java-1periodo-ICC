package Problemas_TheHuxley;
import java.util.Scanner;

public class arrays_pares_e_impares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] array_pares = new int[5];
        int[] array_impares = new int[5];

        for (int i = 0; i < 15; i++) {
            int numero = ler.nextInt();

            if (numero % 2 == 0) {
                array_pares[i] = numero;
            }
            else {
                array_impares[i] = numero;
            }
        }
        ler.close();
        
        System.out.println(array_pares);
        System.out.println(array_impares);
    }    
}

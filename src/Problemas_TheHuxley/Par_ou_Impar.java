package Problemas_TheHuxley;
import java.util.Scanner;

public class Par_ou_Impar {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            String saida = String.format("O numero eh %s e ele eh par", numero);
            System.out.println(saida);
        }
        else {
            String saida = String.format("O numero eh %s e ele eh impar", numero);
            System.out.println(saida);
        }
   } 
}

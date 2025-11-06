package Problemas_TheHuxley;
import java.util.Scanner;

public class administradora_de_cartao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor_total = ler.nextDouble();
        ler.close();
        System.out.printf("Valor total da fatura: R$ %.2f\n", valor_total);
        System.out.printf("Valor a pagar em Marco: R$ %.2f\n", valor_total*0.5);
        System.out.printf("Valor a pagar em Abril: R$ %.2f\n", (valor_total * 0.5) * 1.065);
    }    
}

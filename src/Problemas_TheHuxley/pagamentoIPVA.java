package Problemas_TheHuxley;
import java.util.Scanner;

public class pagamentoIPVA {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double ipva, taxa, resultado;
        ipva = ler.nextDouble();
        taxa = ler.nextDouble();
        resultado =  taxa + (ipva * 0.95);

        String saida_resultado = String.format("%.2f", resultado);
        System.out.println(saida_resultado);
    }
}

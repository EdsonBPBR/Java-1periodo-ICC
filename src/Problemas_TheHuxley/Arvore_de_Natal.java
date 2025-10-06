package Problemas_TheHuxley;
import java.util.Scanner;

public class Arvore_de_Natal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double preco_arvore, preco_enf_a, preco_enf_b, preco_enf_c, preco_total, preco_medio;
        int quant_enf_a, quant_enf_b, quant_enf_c;
        preco_arvore = entrada.nextDouble();

        quant_enf_a = entrada.nextInt();
        preco_enf_a = entrada.nextDouble();

        quant_enf_b = entrada.nextInt();
        preco_enf_b = entrada.nextDouble();

        quant_enf_c = entrada.nextInt();
        preco_enf_c = entrada.nextDouble();

        preco_total = preco_arvore + (quant_enf_a*preco_enf_a) + (quant_enf_b*preco_enf_b) +  (quant_enf_c*preco_enf_c);

        System.out.printf("%.2f",preco_total);
        System.out.println();
        preco_medio = (1.0/21.0) * preco_total;
        System.out.printf("%.2f", preco_medio);
    }
}
package Problemas_TheHuxley;
import java.util.Scanner;

public class ComparacaoCotacaoGasolina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double galao_gaso_eua, valor_gaso_bra, cotacao, preco_gaso_eua_conver;

        galao_gaso_eua = entrada.nextDouble();
        valor_gaso_bra = entrada.nextDouble();
        cotacao = entrada.nextDouble();

        entrada.close();
        
        preco_gaso_eua_conver = (galao_gaso_eua * cotacao) / (3.8);

        System.out.printf("Gasolina EUA: R$ %.2f", preco_gaso_eua_conver);
        System.out.println();
        System.out.printf("Gasolina Brasil: R$ %.2f", valor_gaso_bra);
        System.out.println();

        if (preco_gaso_eua_conver > valor_gaso_bra) {
            System.out.println("Mais barata no Brasil");
        }

        else if (preco_gaso_eua_conver == valor_gaso_bra) {
            System.out.println("Igual");
        }

        else {
            System.out.println("Mais barata nos EUA");
        }
    }
}
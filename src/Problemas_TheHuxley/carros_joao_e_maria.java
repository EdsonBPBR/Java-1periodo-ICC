package Problemas_TheHuxley;
import java.util.Scanner;

public class carros_joao_e_maria {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double velocidade, somatorio_velocidades = 0,  velocidade_mais_alta = 0;
        int c = 0, ano, carro_mais_novo = 0;
        while (true) {
            String opc = ler.next();
            if (opc.equals("n") || opc.equals("N")) {
                if (c == 0) {
                    System.out.println("zero");
                }
                break;
            }
            ano = ler.nextInt();
            velocidade = ler.nextDouble();
            

            somatorio_velocidades += velocidade;
            

            if (c == 0) {
                velocidade_mais_alta = velocidade;
                carro_mais_novo = ano;
            }
            else {
                if (velocidade > velocidade_mais_alta) {
                    velocidade_mais_alta = velocidade;
                }

                if (ano > carro_mais_novo) {
                    carro_mais_novo = ano;
                }
            }
            c++;
        }
        ler.close();

        if (c != 0) {
            System.out.printf("%.2f\n", velocidade_mais_alta);
            System.out.println(carro_mais_novo);
            System.out.printf("%.2f\n", (somatorio_velocidades/c));
        }
    }
}
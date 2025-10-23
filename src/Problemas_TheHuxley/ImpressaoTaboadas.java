package Problemas_TheHuxley;
import java.util.Scanner;

public class ImpressaoTaboadas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int taboada_inicio, taboada_fim;
        taboada_inicio = entrada.nextInt();

        if (taboada_inicio >= 1 && taboada_inicio <= 9) {
            taboada_fim = entrada.nextInt();
            entrada.close();

            if (taboada_inicio > taboada_fim) {
                System.out.println("Nenhuma tabuada nesse intervalo");
            }

            else if (taboada_fim >= 1 && taboada_fim <= 9) {
                for (int i = taboada_inicio; i <= taboada_fim; i++) {
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i + " x " + j +" = " + j*i);
                    }
                
                if (i+1 == taboada_fim) {
                    System.out.println();
                }
                }
            }

            else {
                System.out.println("Insira um número final entre 1 e 9");
            }
        }
        
        else {
            System.out.println("Insira um número inicial entre 1 e 9");
        }
    }
}

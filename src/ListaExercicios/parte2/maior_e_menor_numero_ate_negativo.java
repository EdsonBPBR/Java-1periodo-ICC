import java.util.Scanner;
public class maior_e_menor_numero_ate_negativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // 
        int c = 0;
        double maior, menor;
        maior = 0;
        menor = 0;
        while (true) {
            double numero = ler.nextDouble();
            if (numero < 0) {
                break;
            }

            if (c == 0) {
                menor = maior = numero;
            }

            else {
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
            c++;
        }
        ler.close();
        System.out.printf("Maior número informado foi: %s \n", maior);
        System.out.printf("Menor número informado foi: %s", menor);
    }
}

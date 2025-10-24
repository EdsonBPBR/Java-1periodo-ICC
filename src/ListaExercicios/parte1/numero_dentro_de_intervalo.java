/*Ler um numero
Se o numero estiver compreendido no intervalo fechado 10, 50, afirmar que o nº está
Senao, afirmar que não está
Se numero resto da divisao por 2 for 0, é par
Senao, o número é impar*/
package ListaExercicios.parte1;
import java.util.Scanner;

public class numero_dentro_de_intervalo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero = ler.nextInt();
        ler.close();
        if (numero >= 10 && numero <= 50) {
            System.out.println("Sim, está!");
        }
        else {
            System.out.println("Não está!");
        }

        if (numero % 2 == 0) {
            System.out.printf("%s é par", numero);
        }
        else {
            System.out.printf("%s é ímpar", numero);
        }
    }
}

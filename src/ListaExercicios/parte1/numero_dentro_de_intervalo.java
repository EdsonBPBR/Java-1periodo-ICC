/*Ler um numero
Se o numero estiver compreendido no intervalo fechado 10, 50, afirmar que o nº está
Senao, afirmar que não está
Se numero resto da divisao por 2 for 0, é par
Senao, o número é impar*/
package ListaExercicios.parte1;
import java.util.Scanner;

public class numero_dentro_de_intervalo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do Scanner, fundamental pois é a partir dessa função / módulo permitimos obter os valores de entrada para o processamento informados pelo usuário
        int numero = ler.nextInt(); // criação da variável numero inteira informada pelo usuário
        ler.close(); // fechamento do Scanner, pois o mesmo não será mais necessário, nenhum dado será lido para o processamento
        if (numero >= 10 && numero <= 50) { // estrutura de decisão, primeira parte do processamento do algoritmo, se o número estiver no intervalo fechado compreendido entre 10 E 50, exibir a mensagem que o número está no intervalo
            System.out.println("Sim, está!");
        }
        else { // senão, o último caso é que o número não está compreendido no intervalo, logo deverá ser exibido a mensagem abaixo
            System.out.println("Não está!");
        }

        if (numero % 2 == 0) { // segunda parte do processamento, caso o número seja divisível por 2, isso é, o resto da divisão do número por 2 resulte em 0, é considerado um número par. Logo, é exibido uma mensagem formatada informando que o número do usuário também é par
            System.out.printf("%s é par", numero);
        }
        else { // senão, é informado ao usuário que o número informado também é ímpar
            System.out.printf("%s é ímpar", numero);  
        }
    }
}

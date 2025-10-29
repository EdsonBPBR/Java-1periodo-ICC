package ListaExercicios.parte1;
import java.util.Scanner;

public class tres_numeros_em_ordem_crescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // scanner necessário para obter os dados informados pelo usuário
        int n1, n2, n3, maior, meio, menor; // tipando as variáveis utilizadas pelo algoritmo como inteiro
        n1 = ler.nextInt(); // primeiro valor informado pelo usuário
        n2 = ler.nextInt(); // segundo valor informado pelo usuário
        n3 = ler.nextInt(); // terceiro' valor informado peo usuário
        ler.close(); // fechamento do scanner pois o mesmo não será mais necessário

        maior = n1;  // defini um valor n1 como sendo o maior valor
        menor = n1; // defini o valor n1 como sendo também o menor valor
        meio = n1; // defini o valor n1 também como sendo o termo do meio. Como o algoritmo é para organizar os números informados pelo usuário SEM ARRAY, e evitar na decisão mais de 3 termos lógico, decidi colocar sempre o valor das variáveis maior, menor e meio como um dos valores n1, n2, n3,esses valores serão alterados conforme as estruturas lógicas posteriores do programa

        // obtem maior valor
        if (n2 > maior) { // sabendo que o maior é n1, se n2 > n1, o maior passará a ser o valor de n2.
            maior = n2;
        }

        if (n3 > maior) { // não podemos utilizar else if ao iinvés do IF senão quando n2 > maior for verdadeiro ele irá ignorar a verificação, e como queremos checar todos os valores deveremos trabalhar, nesse caso em específico, sempre com if
            maior = n3;
        }

        // obtem menor valor
        if (n2 < menor) { // sabendo que o menor também é n1, se n2 for MENOR que menor, então o valor da variável menor, que inicialmente, possui o mesmo valor de n1 passará a ser n2
            menor = n2;
        }

        if (n3 < menor) { // e se ainda o valor de n3 for MENOR que menor, o valor de menor passará a ser n3
            menor = n3;
        }
        // obtem o valor que está entre maior e menor
        if (n2> menor && n2 < maior) { 
            meio = n2;
        }

        if (n3 > menor && n3 < maior) {
            meio = n3;
        }

        System.out.printf("%s %s %s",menor, meio, maior); // imprime os valores das variáveis onde possuem a sequencia devidamente em ordem
    }
}

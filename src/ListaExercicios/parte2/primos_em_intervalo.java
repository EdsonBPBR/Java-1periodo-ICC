import java.util.Scanner;

public class primos_em_intervalo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criar o scanner para leitura
        int numero = ler.nextInt(); // numero inteiro n informado pelo usuário
        ler.close(); // fechamento do scanner
        
        for (int i = 2; i <= numero; i++) { // primeiro laço de repetição, mostra todos os números no intevalo de 2 (primeiro número primo) até N, ex: numero = 3. i (2, 3), numero = 4 (2, 3, 4)
            // System.out.println(i);
            boolean primo = true; // por padrão o número é primo
            for (int j = 2; j < i; j++) { // segundo laço de repetição, percorrer cada valor de i para verificar se o número i não possui nenhum divisor inteiro, pois um número primo é só é divisível por 1 e por ele mesmo, se o valor de i para todos os valores do valor j for diferente de 0 ele permanece um valor primo, senão ele não é mais primo
                if (i % j == 0) { // se o número i for divisível por j e o resto for 0, então esse número possui divisores, deixando de ser primo.
                    primo = false; // atualizar o valor da variável boleana primo, tornando o número no intervalo como false, não é primo
                    break;  // para não percorrer desnecessariamente e afetar o desempenho do algoritmo, já que não tem necessidade de percorrer os outro números, quebramos o segundo laço de repetição
                }
            }
 
            if (primo) {
                System.out.println(i); // ainda dentro do primeiro laço de repetição, se primo (variável essa que possui valor boleano) imprimir o valor
            }
        }
    }    
}

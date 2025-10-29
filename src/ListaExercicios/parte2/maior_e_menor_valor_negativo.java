import java.util.Scanner;
public class maior_e_menor_valor_negativo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do scanner, fundamental para ler as entradas fornecidas pelo usuário, necessários para o processamento do algoritmo
        int c = 0; // contador que utilizarei para definir, inicialmente o valor de maior e menor mais poderia fazer como o João fez, mas dessa forma evita a criação de duas variáveis
        double maior = 0, menor = 0; // tipagem e atribuição dos contadores e maior e menor valores, utilizados para contabilizar o maior e menor valor, defini como valores 0 pois 0 é o caso que o programa quebra, entao não é possível que elas exibam o valor 0

        while (true) { // enquanto a condição verdadeira
            double numero = ler.nextInt(); // variável numero, onde o usuário irá informar um número real
            if (numero == 0) { // se o número real informado pelo usuário for 0, entrará no laço de decisão onde a presença do break forçará a quebra do laço de repetição
                break;
            }

            if (c == 0) { // quando o laço de repetição iniciar, com o contador 0, assumimos como valor maior igual a valor menor que é igual ao primeiro número informado pelo usuário
                maior = menor = numero;
            } // senão, quando c é maior que 0
            else {
                if (numero > maior) { // se o número for maior que o número definido como maior, o maior passará a ser esse novo valor
                    maior = numero;
                } // é válido destacar aqui a utilização dos if, porque não poderia ser um if e else if? Porque são dois casos distintos, se a primeira condição fosse verdadeira ele pularia a verificação da variável menor
 
                if (numero < menor) { // se o número informado pelo usuário for menor que o valor armazenado na variável menor, menor passará a ter o valor menor
                    menor = numero;
                }
            }
            c ++; // incremento linear 1
        }
        ler.close(); // fecha o scanner, não será mais necessário
        System.out.printf("Maior número informado: " + maior); // exibir informações de maior e menor número
        System.out.println("Menor número informado: " + menor);
    }
}

import java.util.Scanner;

public class inversao_de_numero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do scanner, fundamental para ler os dados informados pelo usuário, que serão utilizadas para o processamento do algoritmo 
        int numero = ler.nextInt(); // ler o número inteiro informadoo pelo usuar3io
        int invertido = 0; // invertido inicia com 0, sera o novo nuemero invertido formado
        ler.close(); // fechamento do Scanner, não será mais necessário

        while (numero > 0) { // enquanto o numero original for maior q 0
            int digito = numero % 10; // pega o ultimo digito 123, pegará o 3, pois 123 % 10 = 3
            invertido = invertido * 10 + digito; // multiplicao o numero intervido por 10 e incrementa com o novo digito, 0 * 10 = 0 + 3 = 3
            numero = numero / 10; // remove o ultimo digito do numero original já obtido
        }

        // considerando o tipo de dados int, o java no trabaia com decimal
        // 123
        // 123 é maior que 0? Sim
        // 1. digito = 123 % 10 = 3
        // 2. invertido = 0 * 10 + 3 = 3
        // numero = 123 / 10 = 12

        // 12,3 é maior que 0?  Sim
        // 1. digito = 12,3 % 10 = 2
        // 2. invertido = 3 * 10 + 2 = 32
        // numero = 12 / 10 = 1

        // 1,2333 é maior que 0? sim
        //1. digito = 1 % 10 = 1
        //2. invertido = 32 * 10 + 1 = 321
        // numero = 1, 25 / 10 = 0

        // 0 é maior que 0? não
        System.out.println(invertido);
    }
}

import java.util.Scanner;

public class quant_numeros_inter {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do Scanner, fundamental para a leitura dos dados informados pelo usuário
        int freq = 0; // acumulador, armazenar o nº de vezes em que o número informado pelo usuário é maior que 10 e menor que 50
        for (int i = 0; i < 10; i++) { // segundo acumulador utilizado pelo laço de repetição for, inicialmente com valor 0, como serão 10 valores informados pelo usuário, então, enquanto MENOR QUE,10 (0,1,2,3,..,8) executar:
            int numero = ler.nextInt(); // numero inteiro informado pelo usuário, mas poderia ser valor real
            if (numero >= 10 && numero <= 50) { // se numero maior ou igual a 10 E numero menor ou igual a 50, increemnta um no acumulador
                freq = freq + 1;
            }
        }
        ler.close(); // fechamendo do Scanner pois o mesmo não será mais necessário
        System.out.println(freq); // exibir o valor do contator freq, onde o mesmo possui o número de casos em que o número informado pelo usuário esteve no intervalo estabelecido na decisão
    }
}

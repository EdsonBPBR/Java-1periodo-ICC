import java.util.Scanner;

public class soma_pares {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do scanner, necessário para ler os dados informados pelo usuário para o processamento do algoritmo
        int numero = ler.nextInt(); // número inteiro informado pelo usuário, utilizado pois irá listar os números de 1 a n
        ler.close(); // fechamento do Scanner, não será mais necessário pois não terá mais entradas informadas pelo usuário
        double somatorio = 0; // acumulador que será responsável por somar todos os números pares infromados no intervalor

        for (int i = 0; i <= numero; i++) { // estrutura de repetição, enquanto a variável criada i for MENOR OU IGUAL ao número, incrementar ao variável +1 e entrar no laço
            if (i % 2 == 0){ // se o número no intervalo for divisível por 2 isso é, se o número resto da divisão por 2 for 0, ele é um número par
                somatorio += i;  // logo é adicionado ao acumulador o valor de i que é 
            }
        }
        System.out.printf("A soma dos números pares compreendidos no intervalo 1 e %s é %s", numero, somatorio); // exibe a saída formatada
    }
}

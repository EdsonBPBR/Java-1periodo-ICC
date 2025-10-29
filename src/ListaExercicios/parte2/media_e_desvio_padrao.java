import java.util.Scanner;
public class media_e_desvio_padrao { 
    // PARCIALMENTE RESOLVIDA, NÃO DEU PARA EU COLOCAR MINHA IDEIA POIS NÃO CONHEÇO O SUFICIENTE DA SINTAXE DO JAVA
    // CRÉDITOS PARA MIKAEL, QUE RESOLVEU O RESTANTE DA QUESTÃO, AINDA É NECESSÁRIO COMENTAR AS INSTRUÇÕES
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // scanner, fundamental para a entrada de dados fornecida pelo usuário
        int n = ler.nextInt(); // número inteiro informado pelo usuário, será necessário pois é o número de notas que ele irá informar
        double[] notas = new double[n]; // array com tamanho n, ele irá armazenar as notas que o usuário informar, utilizaremos ele para poder calcular o desvio padrão pois deveremos retornar a esses valores para subtrair do valor da média geral de todos os valores informados e elevar ao quadrado essas diferenças e finalmente calcular a média dessas diferenças elevado ao quadrado
        double soma = 0; // somatório para poder calcular a média inicial
        
        for (int i = 0; i < n; i++) { // contador i, enquando o valor do acumulador i for menor que n, incrementar +1 e entrar no laço
            notas[i] = ler.nextDouble(); // obter a nota informada pelo usuário e armazenar no índice i da lista
            soma += notas[i]; // bem como realizar incrementar o valor informado pelo usuário no acumulador definido acima, como somatório
        }
        ler.close(); // fechamento do scanner, não será mais necessário o usuário informar valores de entrada para o algoritmo
        
        double media = soma /n; // calculo da média que será utilizar para subtrair dos outros valores
        double somaquadrados = 0; // outro acumulador que será utilizado para armazenar o resultado da variável que irá calcular o  
        for (int i = 0; i < n; i++) { // enquanto o número
            somaquadrados += Math.pow(notas[i]-media,2); // o acumulador calcula o quadrado da diferença do elemento da lista na posição i ao quadrado
        }
        double desviopadrao = Math.sqrt(somaquadrados/n); // no final é realizado o cálculo da média do desvio padrão
        System.out.printf("Média: %.2f, desvio: %.2f", media, desviopadrao); // exibir os resultados
    }
}

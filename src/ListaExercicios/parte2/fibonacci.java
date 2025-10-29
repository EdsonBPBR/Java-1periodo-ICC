import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do scanner, fundamental para a entrada de dados fornecida pelo usuário para o processamento do algoritmo
        int numero, termo_sucessor, termo_anterior; // tipagem das variáveis que serão fundamentais para a formação da sequencia
        numero = ler.nextInt(); // entrada de um número inteiro informado pelo usuário, necessário para saber até que ponto o usuário quer que o tamanho da sequência chegue.
        ler.close(); // fechamento do scanner, não será mais necessário
        termo_anterior = 0; // a variável termo_anterior começará com o valor 0
        termo_sucessor = 1; // bem como a variável termo_sucessor iniciará com o valor 1, pois na sequencia de fibonnaci os primeiros dois valores presentes é o valor 0 e 1, o próximo termo será a soma desses dois: 0 + 1 = 1, o próximo termo será o termo anterior utilizado na soma, isso é, o 1 com o a soma realizada: 1 + 1 = 2, e assim sucessivamente...

        for (int i = 1; i <= numero; i++) { // variável contador i que inicia com 1, se iniciar com 0 ele irá printar N+1 elemento, e só queremos N valores. Enquanto i for menor ou igual a numero, incrementar +1 no conteudo e executar:
            System.out.println(termo_anterior); // exibe o termo anterior
            int soma = termo_anterior + termo_sucessor; // realiza a soma do próximo termo da sequencia
            termo_anterior = termo_sucessor; // a variável termpo_anteior passa a ter o valor termo_sucessor, e o termo_sucesso o valor de som
            termo_sucessor = soma;
        }
    }
}

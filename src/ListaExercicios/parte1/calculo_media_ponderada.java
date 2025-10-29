package ListaExercicios.parte1;
import java.util.Scanner;

public class calculo_media_ponderada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); //criação do scanner, necessário para ler os dados informados no terminal pelo usuário final do sistema
        double n1, n2, n3, p1, p2, p3, media_p; // tipagem dos dados, onde os valores das variáveis das notas, o peso e a media ponderada serão decimais, valores reais.
        n1 = ler.nextDouble(); // variável informada pelo usuário referente a nota n1
        n2 = ler.nextDouble(); // variável informada pelo usuário referente a nota n2
        n3 = ler.nextDouble(); // variável informada pelo usuário referente a nota n3
        p1 = ler.nextDouble(); // variável informada pelo usuário referente ao peso 1
        p2 = ler.nextDouble(); // variável informada pelo usuário refereten ao peso 2
        p3 = ler.nextDouble(); // vairável informada pelo usuário refereten ao peso 3
        ler.close(); // fechamendo do scanner, não será mais necessário
        media_p = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 +p3); // calculo da média ponderada, definida matematicamente
        
        if (media_p >= 5 && media_p < 7 ){ // estrutura de decisão para verificar a situação do aluno ou ator do sistema com base no calcula da média ponderada. Se a média ponderada estiver no intervalo compreendido entre MAIOR ou IGUAL a 5 E MENOR que 7, exibir recuperação
            System.out.println("Recuperação");
        }

        else if (media_p >= 7) { // senão, se a media ponderada for MAIOR ou IGUAL a 7, exibe aprovado
            System.out.println("Aprovado!");
        }

        else { // o último caso a acontecer, é a média for menor que 5, nesse caso, é exibido a mensagem reprovado.
            System.out.println("Reprovado...");
        }
    }
}

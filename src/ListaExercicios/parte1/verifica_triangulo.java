package ListaExercicios.parte1;
import java.util.Scanner;

public class verifica_triangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // scanner para leitura dos dados de entrada informados pelo usuário, necessários para o processamento do algoritmo
        double n1, n2, n3; // tipagem das variáveis n1, n2 e n3, onde o valor de um segmento de um triângulo não necessariamente é um numero inteiro, podendo ser um número racional
        n1 = ler.nextDouble(); // valor do lado n1
        n2 = ler.nextDouble(); // valor do lado n2
        n3 = ler.nextDouble(); // valor do lado n3
        ler.close(); // fechamento do scanner, 

        if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) { // a primeira condição do algoritmo verifica se os dados informados pelo usuário formam ou não um triângulo, seguindo as propriedades matemáticas da geometria. Se as três consições forem verdadeiras: True e True e True, ele passará passa a classificação do triângulo com base na medida dos seus lados
            if (n1 == n2 && n2 == n3) { // se o lado do triângulo n1 for igual a n2 E n2 igual a n3 caracteriza-se por um triângulo equilátero, logo é exibido a mensagem classificando o mesmo
                System.out.println("É um triângulo equilátero");
            }

            else if (n1 == n2 || n2 == n3 || n3 == n1) { // senão se, pelo menos uma das condições forem verdadeiras, isso é, se o triângulo possuir pelo menos 2 lados iguais, ele é caracterizado por ser um triângulo isósceles, logo é exibido a mensagem para ele.
                System.out.println("É um triângulo isósceles");
            }

            else { // senão, o último caso é do mesmo possuir os três lados distintos, caracterizando como um triângulo escaleno
                System.out.println("É um triângulo escaleno");
            }
        }

        else {
            System.out.println("Não é um triângulo"); // senão os dados informados não formam um triângulo
        }
    }
}

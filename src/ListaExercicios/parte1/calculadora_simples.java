package ListaExercicios.parte1;
import java.util.Scanner;

public class calculadora_simples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // definindo o scanner
        double n1, n2; // tipando os valores das variáveis n1 e n2, onde receberam os valores informados pelo usuário. Aqui tratamos que o dado informado pelo usuário pode ser racional 
        n1 = ler.nextDouble(); // variável n1, número real informado pelo usuário
        n2 = ler.nextDouble(); // variável n2, número real informado pelo usuário
        String operador = ler.next(); // operador, fundamental para a decisão de qual operação o usuário quer realizar. 
        ler.close(); // fechamento do Scanner, pois não será mais útil.

        switch (operador) {  //estrutra switch, semelhante ao match case no Python, inplementado a partir da versão 3.10, mas poderia utilizar uma estrutura de decisão convencional como IF, ELSE IF e ELSE
            case "+": // caso o operador seja o caractere '+', entrará no laço
                System.out.printf("%s + %s = %s", n1, n2, (n1+n2)); // saida formatada, onde %s será os números previamente informados como argumentos, no último %s é exibido a operação
                break; // caso não seja inserido o break ele irá passar para a próxima operação, o que não é interessante

            case "-": // mesmo caso, caractere informando o operador
                System.out.printf("%s - %s = %s", n1, n2, (n1-n2));
                break;
            
            case "*":
                System.out.printf("%s x %s = %s", n1, n2, (n1*n2));
                break;

            case "/": // a operação de divisão necessita de uma observação a mais. Caso a variável n2, que é o denominador da operação seja igual a 0, não será possível realizar a operação por 0, por isso é necessário realizar o tratamento desse caso em específico.
                if (n2 != 0) {
                    System.out.printf("%s / %s = %.2f", n1, n2, (n1 / n2)); // se o denominador n2 for diferente de 0, ele irá efetuar a operação sem problemas
                }

                else {
                    System.out.println("Não é possível realizar a divisão por 0"); // senão ele irá exibir uma mensagem na saída do programa
                }
                break;
            
            default: // finalmente, o último caso é um operador não válido informado pelo usuário, nesse caso o 'default' trata exibindo uma mensagem
                System.out.println("Operador inválido!"); 
                break;
        }
    }
}

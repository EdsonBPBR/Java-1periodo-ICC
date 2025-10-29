package ListaExercicios.parte1;
import java.util.Scanner;

public class tarifa_energia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do scanner, necessário para obter/ler os valores de entradas do algoritmo informado pelo usuário.
        double consumo, valor; // tipagem das variáveis consumo e valor como valores reais, pois o consumo bem como o valor podem ser valores racionais.
        consumo = ler.nextDouble(); // variável consumo, ler o consumo realizado pelo usuário
        ler.close(); // fechar o scanner, pois não será mais necessário

        if (consumo <= 100) { // se o consumo informado pelo usuário for menor ou igual a 100, o valor total da conta será multiplicado por x0.5
            valor = consumo * 0.5;
        }

        else if (consumo > 100 && consumo <= 200) { // se o consumo estiver no intervalo compreendido entre MAIOR que 100 E MENOR OU IGUAL a 200, o valor total do consumo 
            valor = consumo * 0.7;
        }

        else {
            valor = consumo * 0.9; //senão, o único caso a acontecer é o consumo ser maior que 200, para esse caso é necessário multiplicar por 0.9
        }

        System.out.printf("%s KWh = R$ %.2f", consumo, valor); // exibi a saída formatada
    }
}

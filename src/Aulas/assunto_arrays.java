package Aulas;
import java.util.Scanner;

public class assunto_arrays {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] numeros = new int[3]; // definir o tipo e o tamanho do array
        int soma;

        System.out.println("Digite 3 números inteiros: ");
        
        System.out.print("Informe um número: ");
        numeros[0] = ler.nextInt();

        System.out.print("Informe outro número: ");
        numeros[1] = ler.nextInt();

        System.out.print("Informe novamente outro número: ");
        numeros[2] = ler.nextInt();
        ler.close();

        soma = numeros[0] + numeros[1] + numeros[2];
        System.out.printf("A soma dos valores informados é: %s", soma);

    }
}

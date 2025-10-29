package ListaExercicios.parte1;
import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); // criação do scanner ler
        int ano = ler.nextInt(); //scanner, ler um número inteiro informado pelo usuário
        ler.close(); // fechamento do scanner, pois não será mais útil.
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) { //condicional, Se ano for divisível por 4 E NÃO por 100 OU ano divisível por 400, ele será um bissexto. 
            System.out.printf("%s é bissexto", ano); // mensagem informando que o ano é bissexto
        }
        else {
            System.out.printf("%s não é bissexto", ano); //Senão, ele não é bissexto, mensagem
        }
    }
}

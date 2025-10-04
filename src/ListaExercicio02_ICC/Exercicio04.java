package ListaExercicio02_ICC;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double saldo = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.println();
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Sacar Dinheiro");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sair");

            System.out.print(": ");
            int opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("VISUALIZAR SALDO");
                    System.out.printf("Seu saldo é R$ %.2f", saldo);
                    break;
                case 2:
                    System.out.println("SACAR DINHEIRO");
                    System.out.print("Informe o valor a ser sacado (R$): ");

                    double valor_saque = entrada.nextDouble();

                    if (valor_saque > saldo) {
                        System.out.println("Não foi possível sacar. Não há dinheiro suficiente!");
                    }
                    else {
                        saldo = saldo - valor_saque;
                        System.out.printf("Saque de R$ %.2f realizado com sucesso!", valor_saque);
                        System.out.printf("Restou R$ %.2f em sua conta", saldo);
                    }
                    break;
                case 3:
                    System.out.println("DEPOSITAR DINHEIRO");
                    System.out.print("Informe o valor a ser depositado (R$): ");

                    double valor_deposito = entrada.nextDouble();
                    saldo = saldo + valor_deposito;
                    System.out.printf("Deposito de R$ %.2f adicionado com sucesso! Saldo total = R$ %.2f", valor_deposito, saldo);
                    break;
                case 4:
                    System.out.println("SAINDO DO PROGRAMA....");
                    break;
                
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }
        }
        entrada.close();
    }
}

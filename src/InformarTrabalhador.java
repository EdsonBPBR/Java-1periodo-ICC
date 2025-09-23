import java.util.Scanner;

public class InformarTrabalhador {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      ConcordNet Serviços em Informática LTDA.");
        System.out.println("==================================================");

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nome_completo = ler.nextLine();

        System.out.println("Informe seu departamento ['TELECOM', 'DESENVOLVIMENTO', 'INFRAESTRUTURA', 'MANUTENCAO']");
        String departamento = ler.nextLine();

        System.out.println("Informe sua data de nascimento: ");
        String data = ler.nextLine();

        System.out.println("Salário bruto (R$): ");
        Double salario = ler.nextDouble();

        Double reajuste;
        reajuste = salario * 1.15;

        ler.close();

        System.out.println("Prezado, "+ nome_completo + "!");
        System.out.println("Agradecemos por você fazer parte do time ConcordNet!");
        System.out.println("E em comemoração ao seu dia, seu salário base será reajustado para +15% durante os próximos 8 MESES!");
        System.out.println("Seu novo salário base passará a ser R$ " + reajuste + " !");
    }
}

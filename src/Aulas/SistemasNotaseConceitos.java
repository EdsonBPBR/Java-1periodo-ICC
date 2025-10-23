import java.util.Scanner;

public class SistemasNotaseConceitos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota_final = entrada.nextDouble();
        entrada.close();

        String status;

        if (nota_final <= 4) {
            System.out.println("Reprovado...");
            status = "R";
        }

        else if (nota_final >= 5 && nota_final <= 6) {
            System.out.println("Recuperação.");
            status = "RC";
        }

        else {
            System.out.println("Aprovado!");
            status = "A";
        }

        switch (status) {
            case "R":
                System.out.println("Precisa se dedica mais!");
                break;

            case "RC":
                System.out.println("Ainda há chance, revise o conteúdo.");
                break;

            case "A":
                System.out.println("Parabéns pelo excelente desempenho!");
                break;
        
            default:
                break;
        }
    }
}

package Problemas_TheHuxley;
import java.util.Scanner;

public class CanaldeTV {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero de um canal de tv:");
        int canal = entrada.nextInt();
        entrada.close();

        switch (canal) {
            case 2:
                System.out.println("SBT");
                break;
            
            case 4:
                System.out.println("BAND");
                break;

            case 6:
                System.out.println("REDETV!");
                break;

            case 9:
                System.out.println("RECORD");
                break;

            case 13:
                System.out.println("GLOBO");
                break;

            default:
                System.out.println("Canal Invalido");
                break;
        }
    }
}

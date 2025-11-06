package Problemas_TheHuxley;
import java.util.Scanner;
public class acidez_de_varias_solucoes {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        while (true) {
            double numero = ler.nextDouble();
            if (numero == -1) {
                break;
            }
            else {
                if (numero < 7) {
                    System.out.println("ACIDA");
                }
                else if (numero == 7) {
                    System.out.println("NEUTRA");
                }
                else {
                    System.out.println("BASICA");
                }
            }
        }
        ler.close();
    }
}

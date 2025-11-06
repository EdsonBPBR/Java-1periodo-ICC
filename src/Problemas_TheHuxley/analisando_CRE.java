package Problemas_TheHuxley;
import java.util.Scanner;
public class analisando_CRE {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double somatorio_cre = 0;
        int c = 0;
        double menor = 0;
        String matricula_menor = "";
        while (true) {
            String matricula = ler.next();
            if (matricula.equals("999")) {
                break;
            }
            double cre = ler.nextDouble();

            if (c == 0) {
                menor = cre;
                matricula_menor = matricula;
            }
            else {
                if (cre < menor) {
                    menor = cre;
                    matricula_menor = matricula;
                }
            }
            somatorio_cre += cre;
            c ++;
        }
        ler.close();
        System.out.println(matricula_menor);
        System.out.printf("%.2f\n", (somatorio_cre/c));
    }
}

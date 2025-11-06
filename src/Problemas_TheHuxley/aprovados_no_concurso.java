package Problemas_TheHuxley;
import java.util.Scanner;

public class aprovados_no_concurso {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int aprovados = 0;
        while (true) {
            int quant_portugues = ler.nextInt();
            if (quant_portugues < 0) {
                break;
            }   
            int quant_matematica = ler.nextInt();
            double redacao = ler.nextDouble();


            if (quant_portugues >= 40 && quant_matematica >= 21 && redacao >= 7) {
                aprovados += 1;
            }
        }        
        ler.close();
        System.out.println(aprovados);
    }
}

package Problemas_TheHuxley;
import java.util.Scanner;

public class Cavalos_e_Ferraduras {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de cavalos");
        int n_cavalos = ler.nextInt();
        String saida = String.format("Sao necessarias %s ferraduras", n_cavalos*4);
        System.out.println(saida);
        
    }    
}

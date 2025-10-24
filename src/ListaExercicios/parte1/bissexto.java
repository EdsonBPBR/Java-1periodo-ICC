package ListaExercicios.parte1;
import java.util.Scanner;

public class bissexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int ano = ler.nextInt();
        ler.close();
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.printf("%s é bissexto", ano);
        }
        else {
            System.out.printf("%s não é bissexto", ano);
        }
    }
}

package Problemas_TheHuxley;
import java.util.Scanner;
public class apresentacao_de_trabalho {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Trabalho aborda Interface Grafica? (0 - Nao 1 - Sim)");
        int ig = ler.nextInt();
        System.out.println("Trabalho aborda Inteligencia Artificial? (0 - Nao 1 - Sim)");
        int ia = ler.nextInt();
        System.out.println("Trabalho aborda Encapsulamento? (0 - Nao 1 - Sim)");
        int e = ler.nextInt();
        System.out.println("Trabalho aborda Indentacao? (0 - Nao 1 - Sim)");
        int i = ler.nextInt();
        System.out.println("Trabalho aborda Structs? (0 - Nao 1 - Sim)");
        int s = ler.nextInt();
        ler.close();
        if ((e == 1 && i == 1 && s == 1) && (ig == 1 || ia == 1)) {
            System.out.println("Seu trabalho sera avaliado.");
        } 
        else {
            System.out.println("Seu trabalho nao sera avaliado, nota 0.");
        }
    }
}

package Problemas_TheHuxley;
import java.util.Scanner;

public class IdadeemSegundos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int idade = ler.nextInt();
        ler.close();
        int segundos = idade * 365*24*60*60;
        System.out.printf("%s", segundos);
    }
}

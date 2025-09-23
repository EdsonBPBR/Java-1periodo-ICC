package Problemas_TheHuxley;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Integer largura, altura, resultado;
        largura = ler.nextInt();
        altura = ler.nextInt();

        resultado = largura * altura;
        System.out.print(resultado);
    }
}

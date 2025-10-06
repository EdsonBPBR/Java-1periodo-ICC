package Problemas_TheHuxley;
import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cateto_a, cateto_b, calculo, hipotenusa;

        cateto_a = entrada.nextDouble();
        cateto_b = entrada.nextDouble();
        entrada.close();
        calculo = Math.pow(cateto_a, 2) + Math.pow(cateto_b, 2);
        hipotenusa = Math.sqrt(calculo);
        System.out.printf("%.2f", hipotenusa);
    }
}
package Problemas_TheHuxley;
import java.util.Scanner;

public class Fahrenheit_para_Celsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Double fahrenheit, celsius;

        fahrenheit = entrada.nextDouble();
        entrada.close();

        celsius  = (5.0 / 9.0) * (fahrenheit - 32);
        
        String saida = String.format("%.10f", celsius);
        System.out.println(saida);

    }
}

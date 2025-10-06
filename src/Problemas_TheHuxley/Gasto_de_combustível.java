package Problemas_TheHuxley;
import java.util.Scanner;

public class Gasto_de_combustível {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double velocidade_media, tempo, volume_litros;

        velocidade_media = entrada.nextDouble();
        tempo = entrada.nextDouble();
        entrada.close();

        volume_litros = (1.0/12.0) * (velocidade_media*tempo);

        System.out.printf("%.3f", volume_litros);
    }
}

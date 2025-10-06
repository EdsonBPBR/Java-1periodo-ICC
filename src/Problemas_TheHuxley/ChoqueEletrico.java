package Problemas_TheHuxley;
import java.util.Scanner;

public class ChoqueEletrico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int level = entrada.nextInt();
        entrada.close();

        double potencia;
        if (level >= 1 && level <= 20) {
            potencia = 20 + Math.pow(level, 3);
            System.out.printf("Potencia de : %.0f W", potencia);
        }

        else if (level >= 21 && level <= 40) {
            potencia = 8000 + Math.pow((level-10), 2);
            System.out.printf("Potencia de : %.0f W", potencia);
        }

        else if (level >= 41 && level <= 60) {
            potencia = 9000 + 5 * level;
            System.out.printf("Potencia de : %.0f W", potencia);
        }

        else if (level >= 61 && level <= 80) {
            potencia = 9300 + 2 * level;
            System.out.printf("Potencia de : %.0f W", potencia);
        }

        else if (level >= 81 && level <= 100) {
            potencia = 9500 + level;
            System.out.printf("Potencia de : %.0f W", potencia);
        }
    }
}

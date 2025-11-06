package Problemas_TheHuxley;
import java.util.Scanner;

public class acima_da_media {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double[] array = new double[3];
        double somatorio = 0;
        for (int i =0; i < 3; i++){
            array[i] = ler.nextDouble();
            somatorio += array[i];
        }
        ler.close();
        int freq = 0;
        for (int i = 0; i < 3; i++) {
            if (array[i] > somatorio/3) {
                freq += 1;
            }
        }
        System.out.println(freq);
    }
}

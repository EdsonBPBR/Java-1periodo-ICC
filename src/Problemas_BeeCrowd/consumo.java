package Problemas_BeeCrowd;
import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int distancia = ler.nextInt();
        double consumo = ler.nextDouble();
        ler.close();

        double autonomia = distancia / consumo;
        System.out.printf("%.3f km/l\n", autonomia);
    }    
}

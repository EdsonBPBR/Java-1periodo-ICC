import java.util.Scanner;

public class CalculaVolumeEsfera {
    public static void main(String[] args) {
        System.out.println("Cálculo Volume Esfera");
        Scanner ler = new Scanner(System.in); // criando o "input" para a entrada de dados

        final double PI = 3.14153294; // constante
        double raio, volume;

        System.out.println("Informe o valor do raio: ");
        raio = ler.nextDouble();
        volume = (4.0/3.0) * PI * Math.pow(raio, 3);

        ler.close();
        String resultado = String.format("O volume da esfera de raio %s é %.2f",raio, volume);
        System.out.println(resultado);
    }
}

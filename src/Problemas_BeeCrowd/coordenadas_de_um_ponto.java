package Problemas_BeeCrowd;
import java.util.Scanner;

public class coordenadas_de_um_ponto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // obter os dados em uma só linha, como no Python
        String linha = entrada.nextLine();
        String[] partes = linha.split(" ");

        double x = Double.parseDouble(partes[0]);
        double y = Double.parseDouble(partes[1]); // utilizar o método parseDouble, para converter o dado

        System.out.printf("(%s, %s)", x, y);
    }
}
    
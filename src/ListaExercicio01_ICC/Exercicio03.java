package ListaExercicio01_ICC;
import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a distância [KM]: ");
        double distancia = entrada.nextDouble();

        System.out.print("Informe o consolumo [Litros]: ");
        double consumo = entrada.nextDouble();

        double razao = distancia / consumo;

        String saida_razao = String.format("%.2f Km/L", razao);
        System.out.println(saida_razao);
    }
}

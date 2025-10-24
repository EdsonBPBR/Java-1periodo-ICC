package ListaExercicios.parte1;
import java.util.Scanner;

public class tarifa_energia {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double consumo, valor;
        consumo = ler.nextDouble();
        ler.close();

        if (consumo <= 100) {
            valor = consumo * 0.5;
        }

        else if (consumo > 100 && consumo <= 200) {
            valor = consumo * 0.7;
        }

        else {
            valor = consumo * 0.9;
        }

        System.out.printf("%s KWh = R$ %.2f", consumo, valor);
    }
}

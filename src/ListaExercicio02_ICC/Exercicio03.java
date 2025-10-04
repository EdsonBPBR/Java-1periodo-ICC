package ListaExercicio02_ICC;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura, peso;
        altura = entrada.nextDouble();
        peso = entrada.nextDouble();
        entrada.close();

        double imc = (peso / (Math.pow(altura, 2)));

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }

        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        }

        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }

        else {
            System.out.println("Obesidade");
        }
    }
}

package ListaExercicio02_ICC;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println();
        System.out.println("1 - Converter de Celsius para Fahrenheit");
        System.out.println("2 - Converter de Fahrenheit para Celsius");
        System.out.println("3 - Converter de Metros para Centímetros");
        System.out.println("4 - Converter de Centímetros para Metros");
        System.out.print(": ");

        int opcao = entrada.nextInt();
        double medida = entrada.nextDouble();

        switch (opcao) {
            case 1:
                if (medida < -459.67) {
                    System.out.println("Não foi possível realizar a conversão. Medida com valor inválido!");
                }
                else {
                    double f = medida * (9.0/5.0) + 32;
                    System.out.println(f);
                }
                
                break;
            
            case 2:
                double c = (medida - 32) * (5.0/9.0);
                System.out.println(c);
                break;

            case 3:
                if (medida < 0) {
                    System.out.println("Não foi possível realizar a conversão. Medida com valor inválido!");
                }
                else {
                    double cm = (medida * 100);
                    System.out.println(cm); 
                }
            
                break;
            
            case 4:
                if (medida < 0) {
                    System.out.println("Não foi possível realizar a conversão. Medida com valor inválido!");
                }
                else {
                    double m = (medida / 100);
                    System.out.println(m);
                }
                
                break;

            default:
                System.out.println("Entrada Inválida!");
                break;
        }
    }
}
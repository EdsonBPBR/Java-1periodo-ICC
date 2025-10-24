package ListaExercicios.parte1;
import java.util.Scanner;

public class calculadora_simples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2;
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();
        String operador = ler.next();
        ler.close();

        switch (operador) {
            case "+":
                System.out.printf("%s + %s = %s", n1, n2, (n1+n2));
                break;

            case "-":
                System.out.printf("%s - %s = %s", n1, n2, (n1-n2));
                break;
            
            case "*":
                System.out.printf("%s x %s = %s", n1, n2, (n1*n2));
                break;

            case "/":
                if (n2 != 0) {
                    System.out.printf("%s / %s = %.2f", n1, n2, (n1 / n2));
                }

                else {
                    System.out.println("Não é possível realizar a divisão por 0");
                }
                break;
            
            default:
                System.out.println("Operador inválido!"); 
                break;
        }
    }
}

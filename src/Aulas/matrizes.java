package Aulas;
import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[][] matriz = new String[4][4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++) {
                System.out.printf("Informe o valor ou string da posição (%s, %s): ", i, j);
                String dado = entrada.next();
                matriz[i][j] = dado;
            }
        }
        entrada.close();
        // saida
        for (int k = 0; k < 4; k ++) {
            System.out.printf("%s %s %s %s", matriz[k][0], matriz[k][1], matriz[k][2], matriz[k][3]);
            System.out.println();
        }
    }    
}

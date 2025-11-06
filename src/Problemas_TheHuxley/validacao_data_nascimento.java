package Problemas_TheHuxley;
import java.util.Scanner;

public class validacao_data_nascimento {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int dia = ler.nextInt();
        if (dia > 0 && dia <= 31) {
            int mes = ler.nextInt();

            if (mes > 0 && mes <= 12) {
                int ano = ler.nextInt();
                ler.close();

                // o restante das deciões aqui

                if (((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) && dia == 29 && mes == 2) {
                    System.out.println("Esse ano não é bissexto");
                }
                else {
                    System.out.println("O ano NÃO é bissexto");
                }

            }  
            else {
                System.out.println("Mês inexistente");
            }
        }
        else {
            System.out.println("Dia inexistente");
        }
    }    
}

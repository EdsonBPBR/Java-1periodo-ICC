/******************************************************************************

 Welcome to GDB Online.
 GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
 C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
 Code, Compile, Run and Debug online from anywhere in world.

 *******************************************************************************/
import java.util.Scanner;

public class Script_aula_icc
{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        final double PI = 3.14153294; // final, palavra reservada para a criação de cconstante
        double raio, volume;

        System.out.println("Informe o valor do raio:");
        raio = ler.nextDouble();
        volume = (4.0 / 3.0) * PI * Math.pow(raio, 3.0);

        String resultado = String.format("O volume da esfera é %.2f", volume);
        System.out.println(resultado);
    }
}

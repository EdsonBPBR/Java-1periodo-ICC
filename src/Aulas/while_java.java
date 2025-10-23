package Aulas;

public class while_java {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 300) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}

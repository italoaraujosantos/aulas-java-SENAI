package classroom;

import java.util.Scanner;

public class Objective3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number % 2 == 0) {
            System.out.println("O número é Par");
        } else {
            System.out.println("O número é Ímpar");
        }
        if(number > 0) {
            System.out.println("O número é Positivo");
        } else {
            System.out.println("O número é Negativo");
        }
    }
}

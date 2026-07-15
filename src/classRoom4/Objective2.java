package classRoom4;

import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int altura = scanner.nextInt();
        desenharEscada(altura, '#');
        scanner.close();
    }

    public static void desenharEscada(int altura, char simbolo) {
        for (int i = 1; i <= altura; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
}

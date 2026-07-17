package classRoom5;

import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("Vetor preenchido: "+ java.util.Arrays.toString(numbers));
        System.out.println("A soma de todos os elementos é: " + sum);
        scanner.close();
    }
}

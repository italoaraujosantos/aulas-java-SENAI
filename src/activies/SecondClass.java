package activies;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine();

        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Teste add nova linha");
        scanner.close();
    }
}

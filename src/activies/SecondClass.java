package activies;

import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite sua idade: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite sua altura: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Sua idade é: " + age);
        System.out.println("Sua altura é: " + height);
        System.out.println("Teste add nova linha");
        scanner.close();
    }
}

package classRoom2;

import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if( age < 16 ) {
            System.out.println("Não pode votar.");
        } else if (age >= 16 && age < 18 || age >= 70) {
            System.out.println("Voto facultativo.");
        }
        if ((age >= 18) && (age < 70)) {
            System.out.println("Voto obrigatório.");
        }
    }
}

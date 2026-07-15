package classRoom3;

import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int resultado = calcularDobro(numero);
        System.out.println("O dobro do número é "+resultado);
        scanner.close();
    }

    public static int calcularDobro(int numero) {
        return numero * 2;
    }
}

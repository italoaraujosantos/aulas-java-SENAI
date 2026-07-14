package classRoom3;

import java.util.Scanner;

public class Objective4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        imprimirResultado(subtrairNumeros(numero1, numero2));

    }

    public static int subtrairNumeros(int x, int y){
        return x - y;
    }

    public static void imprimirResultado(int resultado) {
        System.out.println("O resultado da operação é: "+resultado);
    }
}

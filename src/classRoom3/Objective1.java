package classRoom3;

import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        imprimirSaudacao(nome);
    }

    public static void imprimirSaudacao(String nome) {
        System.out.println("Olá, "+nome+"! Bem-vindo(a) à nossa aula de métodos.");
    }
}


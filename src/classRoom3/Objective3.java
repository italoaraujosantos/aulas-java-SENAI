package classRoom3;

import java.util.Scanner;

public class Objective3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        verificaMaioridade(idade);
    }

    public static void verificaMaioridade(int idade){
        if(idade >= 18){
            System.out.println("Acesso Liberado");
        } else {
            System.out.println("Acesso Negado");
        }
    }
}

package classRoom4;

import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int tentativas = 5;
        String senha;
        do {
            senha = scanner.nextLine();
            abrirCofre(senha, tentativas);
            tentativas--;
        } while(tentativas > 0);
        scanner.close();
    }

    public static void abrirCofre(String senha, int tentativas) {
        String[] valor = new String[tentativas];
        int indice = 0;
        if(senha.equals("9999")) {
            System.out.println("Cofre Aberto!");
            return;
        } else if(tentativas > 0) {
            tentativas--;
            indice++;
            valor[indice] = senha;
            System.out.println("Código Errado. Restam "+tentativas+"...");
        }else if(tentativas == 0) {
            indice++;
            valor[indice] = senha;
            System.out.print(valor+", ");
            System.out.print(" Cofre Bloqueado!");
        }
    }
}


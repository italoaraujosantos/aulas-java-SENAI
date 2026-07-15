package classRoom4;

import java.util.Scanner;

public class Objective1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teste = 5;
        String senha;
        do {
            senha = scanner.toString();
            scanner.nextLine();
            abrirCofre(senha, 5);
            teste--;
        } while(teste != 0);
    }

    public static void abrirCofre(String senha, int tentativas) {
        String[] valor = new String[0];
        int indice = 0;
        if(senha.equals("9999")) {
            System.out.println("Cofre Aberto!");
        } else if(tentativas > 0) {
            tentativas--;
            indice++;
            valor[indice] = senha;
            System.out.println("Código Errado. Restam "+tentativas+"...");
        }else if(tentativas == -1) {
            indice++;
            valor[indice] = senha;
            System.out.print(valor+", ");
            System.out.print(" Cofre Bloqueado!");
        }
    }
}


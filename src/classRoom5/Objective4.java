package classRoom5;

import java.util.ArrayList;
import java.util.Scanner;

public class Objective4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (valor negativo para terminar):");

        // Leitura das notas
        while (true) {
            double nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            notas.add(nota);
        }

        // Cálculo da média
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi inserida.");
        } else {
            double soma = 0;

            for (double nota : notas) {
                soma += nota;
            }

            double media = soma / notas.size();
            System.out.printf("Média das notas: %.2f%n", media);
        }

        // Remoção das notas inferiores a 5.0
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < 5.0) {
                notas.remove(i);
                i--; // Ajusta o índice após a remoção
            }
        }

        // Exibição da lista final
        System.out.println("Notas aprovadas (>= 5.0):");
        System.out.println(notas);

        scanner.close();
    }
}




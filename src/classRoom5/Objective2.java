package classRoom5;

import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperartures = new double[6];
        double maior = 0;
        double menor = 0;
        for (int i = 0; i < temperartures.length; i++) {
            temperartures[i] = scanner.nextDouble();
            if (i == 0) {
                maior = temperartures[i];
                menor = temperartures[i];
            } else {
                if (temperartures[i] > maior) {
                    maior = temperartures[i];
                } else if (temperartures[i] < menor) {
                    menor = temperartures[i];
                }
            }
        }
        System.out.println("Maior temperatura: " + maior+"°C");
        System.out.println("Menor temperatura: " + menor+"°C");
        scanner.close();
    }
}

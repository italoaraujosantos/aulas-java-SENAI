package classRoom3;

import java.util.Scanner;

public class Objective5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tempCelsius = scanner.nextDouble();
        avaliarClima(converterParaFahrenheit(tempCelsius));
    }

    public static double converterParaFahrenheit(double tempC){
        return ((tempC * 1.8) + 32);
    }

    // Avaliar clima recebe temperatura em fahrenheit
    public static void avaliarClima(double tempF) {
        if(tempF < 50.0){
            System.out.println("Clima frio");
        } else if (tempF >= 50.0 && tempF <= 79.9) {
            System.out.println("Clima Agradável");
        } else {
            System.out.println("Clima quente");
        }
    }
}

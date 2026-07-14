package classRoom2;

import java.util.Scanner;

public class Objective4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float peso = scanner.nextFloat();
        float altura = scanner.nextFloat();
        float IMC = peso / (altura * altura);

        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        }
        if(IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        }
        if(IMC >= 25 && IMC <= 29.9) {
            System.out.println("Peso normal");
        }
        if(IMC >= 30.0) {
            System.out.println("Obesidade");
        }
    }
}

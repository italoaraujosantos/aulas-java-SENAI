package classroom;

import java.util.Scanner;

public class Objective2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float note1 = scanner.nextFloat();
        float note2 = scanner.nextFloat();
        float note3 = scanner.nextFloat();
        float media = (note1+note2+note3)/3;
        if(media >= 7.0){
            System.out.println("Aprovado!");
        }else if(media >= 5.0 && media <= 6.9) {
            System.out.println("Em Recuperação.");
        } else if (media < 5.0) {
            System.out.println("Reprovado.");
        }
        System.out.println(media);
    }
}

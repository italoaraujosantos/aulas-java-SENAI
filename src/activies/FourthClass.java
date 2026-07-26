package activies;

import java.util.Scanner;

public class FourthClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int limit = scanner.nextInt();
        scanner.nextLine();

        int repections = 0;
        while (repections <= limit) {
            System.out.println(repections);
            repections++;
        }

        char simbol = 'N';

        for(int x = 0; x <= 10; x++ ) {
            for(int y = 0; y <= 10; y++){
                System.out.println(simbol + " ");
            }
            System.out.println("\n" + simbol + " ");
        }
    }


}

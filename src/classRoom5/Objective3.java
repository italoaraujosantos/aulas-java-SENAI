package classRoom5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Objective3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int count = 1;
        while (true) {
            String task = scanner.nextLine().toLowerCase();
            if(task.equalsIgnoreCase("fim")
                ) {
                break;
            }
            tasks.add(task);
        }
        System.out.println("Tarefas adicionadas: "+tasks.size());
        for(String task : tasks) {
            System.out.println(count + ". "+task);
            count++;
        }
        scanner.close();
    }
}

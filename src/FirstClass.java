import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Italo";
        int age = 39;
        String professional = "Analista de Sistemas";
        int year = 1990;

        System.out.println(name);
        System.out.println(age);
        System.out.println(professional);
        System.out.println(year);

        System.out.println("Digite sua idade:  ");
        year = scanner.nextInt();
    }
}

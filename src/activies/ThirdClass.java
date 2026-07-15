package activies;

import java.util.Scanner;

public class ThirdClass {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.println("Início metódo main\n\n");

        System.out.println("Chamada do metodo de soma!" );
        int result = sum(number1, number2);

        System.out.println("Resultado do metodo soma: ");
        print(result);

       System.out.println("metodo de comparação");
       if(purchase(result)){
           System.out.println("A opção estava correta!");
       } else {
           System.out.println("A opção estava errada!");
       }
        System.out.println("Fim metódo main\n\n");
        scanner.close();
   }

    public static int sum (int parse1, int parse2 ) {
        return parse1 + parse2;
    }

    public static void print (int result) {
       System.out.println("Resultado: "+result);
    }

    public static boolean purchase( int result) {
        return result == 1;
    }
}

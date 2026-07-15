package classRoom2;

import java.util.Scanner;

public class Objective5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorCompra = scanner.nextDouble();

        if(valorCompra < 100.0){
            System.out.println("Sem Desconto R$"+valorCompra);
        }
        if(valorCompra >= 100.00 && valorCompra <= 299.99){
            System.out.println("Sem Desconto R$"+valorCompra*0.9);
        }else if(valorCompra >= 300.0){
            System.out.println("Sem Desconto R$"+valorCompra*0.8);
        }
        scanner.close();    
    }
}

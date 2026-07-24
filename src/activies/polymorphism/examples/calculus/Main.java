package activies.polymorphism.examples.calculus;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Calculus calculusSum = new Calculus();

        System.out.println("Resultado soma inteira: "+calculusSum.sum(1, 5));
        System.out.println("Resultado soma francionário: "+calculusSum.sum(5.6, 9.8 ));
        calculusSum.sum(5.9, 15);
        calculusSum.sum(5, 5.9);
    }

}

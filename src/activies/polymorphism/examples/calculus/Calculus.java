package activies.polymorphism.examples.calculus;

public class Calculus {
    private int integerResult;
    private double doubleResult;

    public int getIntegerResult() {
        return integerResult;
    }

    public void setIntegerResult(int integerResult) {
        this.integerResult = integerResult;
    }

    public double getDoubleResult() {
        return doubleResult;
    }

    public void setDoubleResult(double doubleResult) {
        this.doubleResult = doubleResult;
    }

    public int sum(int numberOne, int numberTuo){
        setIntegerResult(numberOne + numberTuo);
        return this.getIntegerResult();
    }

    public double sum(double numberOne, double numberTuo){
        setDoubleResult(numberOne + numberTuo);
        return this.getDoubleResult();
    }

    public void sum(double numberOne, int numberTuo){
        setIntegerResult((int)(numberOne+ numberTuo));
        System.out.println("Soma fracionario e inteiro com resultado da parte inteira: "+this.getIntegerResult());
    }

    public void sum(int numberOne, double numberTuo) {
        setDoubleResult((double) (numberOne + numberTuo));
        System.out.println("A some de inteiro mais um double: "+this.getDoubleResult());
    }


}

package JavaCore.Model;

public class Calculator implements Calculations {
    private int number1;
    private int number2;


    @Override
    public int sum(int number1, int number2) {
        return number1+number2;
    }

    @Override
    public int subtracting(int number1, int number2) {
        return number1-number2;
    }

    @Override
    public int multiplication(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public int dividing(int number1, int number2) {
        return number1 / number2;
    }
}

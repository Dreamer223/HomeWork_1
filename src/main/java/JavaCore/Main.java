package JavaCore;

import JavaCore.Model.Calculator;
import JavaCore.utils.Decorator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(2,3);
        System.out.println(Decorator.decorate(result));
        result = calculator.subtracting(2,3);
        System.out.println(Decorator.decorate(result));
        result = calculator.multiplication(2,3);
        System.out.println(Decorator.decorate(result));
        result = calculator.dividing(2,3);
        System.out.println(Decorator.decorate(result));
    }
}
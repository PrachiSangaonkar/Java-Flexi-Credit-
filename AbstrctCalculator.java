//write a program in java where we will be using astract keyword to design a calculator application
abstract class Calculator {
    abstract int add(int a, int b);

    abstract int subtract(int a, int b);

    abstract int multiply(int a, int b);

    abstract int divide(int a, int b);

}

class SimpleCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int subtract(int a, int b) {
        return a - b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    @Override
    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}

public class AbstrctCalculator {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));
        System.out.println("Multiplication: " + calc.multiply(10, 5));
        System.out.println("Division: " + calc.divide(10, 5));

    }

}

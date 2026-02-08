//write a program in java where we will be using astract keyword to design a calculator application
abstract class SimpleCalculator {
    abstract int add(int a, int b);

    abstract int sub(int a, int b);

    abstract int mul(int a, int b);

    abstract int div(int a, int b);

}

class Calculation extends SimpleCalculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }

    @Override
    int sub(int a, int b) {
        return a - b;
    }

    @Override
    int mul(int a, int b) {
        return a * b;
    }

    @Override
    int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }

    }
}

public class Calcluator {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        int a = 10;
        int b = 5;
        System.out.println("Addition: " + c.add(a, b));
        System.out.println("Subtraction: " + c.sub(a, b));
        System.out.println("Multiplication: " + c.mul(a, b));
        System.out.println("Division: " + c.div(a, b));
    }

}

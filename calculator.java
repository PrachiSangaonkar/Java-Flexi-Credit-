public class calculator {
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int sum = add(a, b);
        System.out.println("The sum is: " + sum);
    }
}

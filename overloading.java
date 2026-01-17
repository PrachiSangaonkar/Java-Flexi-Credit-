//Write a program in java, write two methods with same name with different parameters will be used.
public class overloading {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 8;
        int sum1 = add(a, b);
        int sum2 = add(a, b, c);
        System.out.println("The sum is: " + sum1);
        System.out.println("The sum is: " + sum2);
    }
}

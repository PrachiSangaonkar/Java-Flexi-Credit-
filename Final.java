class Keyword {
    final int Max = 10;

    void display() {
        System.out.println("Max:" + Max);
    }
}

public class Final {

    public static void main(String[] args) {
        // int Max=20; cannot change the value of final variable
        Keyword a = new Keyword();
        a.display();

    }

}

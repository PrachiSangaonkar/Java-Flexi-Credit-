interface A {
    default void display() {
        System.out.println("This is interface A");
    }
}

interface B {
    default void display() {
        System.out.println("This is interface B");
    }
}

class C implements A, B {
    @Override
    public void display() {
        A.super.display();
        B.super.display();
    }
}

public class Diamond {
    public static void main(String[] args) {
        C c = new C();
        c.display();
    }

}

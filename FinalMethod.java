class Parent {
    final void display() {
        System.out.println("This is a final method in Parent class.");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is Child class method.");
    }
    /*
     * void display(){
     * // Trying to override final method will cause a compile-time error
     * System.out.println("Attempting to override final method.");
     * }
     */
}

public class FinalMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        c.show();
    }
}

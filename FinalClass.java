final class Parent {
    void display() {
        System.out.println("This is Parent class.");
    }
}

/*
 * class Child extends Parent{
 * void show(){
 * System.out.println("This is Child class.");
 * }
 * }
 */
public class FinalClass {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.display();
    }

}

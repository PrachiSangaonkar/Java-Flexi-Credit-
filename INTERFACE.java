//First interface
interface Printable {
    void print();
}

// Second interface
interface Showable {
    void show();
}

// Class implementing multiple interfaces
class Document implements Printable, Showable {

    public void print() {
        System.out.println("Printing document");
    }

    public void show() {
        System.out.println("Showing document");
    }

}

// Main class
public class INTERFACE {
    public static void main(String[] args) {

        Document d = new Document();
        d.print();
        d.show();
    }
}

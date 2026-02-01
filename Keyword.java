class Student {
    String name;

    Student(String name) {
        this.name = name;

    }

    void display() {
        System.out.println("Name:" + this.name);
    }

}

public class Keyword {
    public static void main(String[] args) {
        Student s = new Student("Prachi");
        s.display();
    }

}

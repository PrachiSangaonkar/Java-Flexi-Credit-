class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    /*
     * Student() {
     * name = "Prachi";
     * age = 19;
     * }
     */
    void display() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Student s = new Student();
        Student s = new Student("Prachi", 19);
        s.display();
    }

}

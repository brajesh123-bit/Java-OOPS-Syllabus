class Student {
    String name;
    int roll;

    // Constructor
    Student(String n, int r) {
        name = n;
        roll = r;
    }

    void display() {
        System.out.println(name + " - " + roll);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 101);
        s1.display();
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing Triangle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}
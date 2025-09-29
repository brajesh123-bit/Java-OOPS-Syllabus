class Car {
    String brand = "Tata";
    int year = 2024;

    void drive() {
        System.out.println("Car is driving...");
    }
}

public class ClassAndObject {
    public static void main(String[] args) {
        Car c1 = new Car();  // object creation
        System.out.println(c1.brand + " " + c1.year);
        c1.drive();
    }
}
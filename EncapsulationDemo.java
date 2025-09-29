class Employee {
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Rohit");
        System.out.println("Employee: " + e.getName());
    }
}
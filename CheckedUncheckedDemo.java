import java.io.*;

public class CheckedUncheckedDemo {
    public static void main(String[] args) {
        // Unchecked Exception
        try {
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Unchecked: " + e);
        }

        // Checked Exception
        try {
            FileReader fr = new FileReader("test.txt");
        } catch (IOException e) {
            System.out.println("Checked: " + e);
        }
    }
}
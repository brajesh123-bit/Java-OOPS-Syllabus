class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

public class UserDefinedExceptionDemo {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18+");
        } else {
            System.out.println("Valid Age");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
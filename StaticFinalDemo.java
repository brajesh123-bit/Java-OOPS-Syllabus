class MathUtil {
    static int counter = 0;          // static variable
    final double PI = 3.14159;       // final constant

    MathUtil() {
        counter++;
    }
}

public class StaticFinalDemo {
    public static void main(String[] args) {
        MathUtil m1 = new MathUtil();
        MathUtil m2 = new MathUtil();
        System.out.println("Objects created: " + MathUtil.counter);
    }
}
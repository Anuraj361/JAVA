public class PositiveNumberDemo {
    public static void checkPositive(int num) {
        if (num < 0)
            throw new IllegalArgumentException("Number must be positive");
        System.out.println("Valid number");
    }
    public static void main(String[] args) {
        try {
            checkPositive(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
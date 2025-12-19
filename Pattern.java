public class Pattern {
    public static void main(String[] args) {
        printPattern(1, 5);
    }

    static void printPattern(int current, int max) {
        if (current > max) {
            return;
        }

        printNumber(current, current);
        System.out.println();
        printPattern(current + 1, max);
    }

    static void printNumber(int num, int count) {
        if (count == 0) {
            return;
        }
        System.out.print(num);
        printNumber(num, count - 1);
    }
}

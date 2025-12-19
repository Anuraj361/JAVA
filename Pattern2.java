public class Pattern2 {
    public static void main(String[] args) {
        printPattern(1, 5);
    }

    static void printPattern(int current, int max) {
        if (current > max) {
            return;
        }

        printLine(1, current);
        System.out.println();
        printPattern(current + 1, max);
    }

    static void printLine(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(start);
        printLine(start + 1, end);
    }
}

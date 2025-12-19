import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("a / b = undefined (division by zero)");
            System.out.println("a % b = undefined (division by zero)");
        }
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));

        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > 10 && a < 50): " + (a > 10 && a < 50));
        System.out.println("(a < 10 || b < 10): " + (a < 10 || b < 10));
        System.out.println("!(a == b): " + (!(a == b)));

        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));

        System.out.println("\n--- Assignment Operators ---");
        int c = a;
        c += b;
        System.out.println("c += b: " + c);
        c -= b;
        System.out.println("c -= b: " + c);
        c *= b;
        System.out.println("c *= b: " + c);
        if (b != 0) {
            c /= b;
            System.out.println("c /= b: " + c);
            c %= b;
            System.out.println("c %= b: " + c);
        } else {
            System.out.println("c /= b: undefined (division by zero)");
            System.out.println("c %= b: undefined (division by zero)");
        }

        System.out.println("\n--- Ternary Operator ---");
        String result = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println("a is " + result);

        System.out.println("\n--- Miscellaneous Operators ---");
        double d = 10.5;
        int x = (int) d; // type casting
        System.out.println("d = " + d + " cast to int = " + x);

        String str = "Hello";
        System.out.println("str is instance of String? " + (str instanceof String));

        System.out.println("\n--- Complex Expression ---");
        int expr = a + b * (a - b) / 2 % 3;
        System.out.println("a + b * (a - b) / 2 % 3 = " + expr);

        sc.close();
    }
}
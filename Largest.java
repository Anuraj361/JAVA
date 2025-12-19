import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number (A): ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the second number (B): ");
        int b = scanner.nextInt();
        
        System.out.print("Enter the third number (C): ");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The largest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
        
        scanner.close();
    }
}
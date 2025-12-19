import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int m = sc.nextInt();
        if (m >= 90 && m <= 100) System.out.println("A");
        else if (m >= 80) System.out.println("B");
        else if (m >= 70) System.out.println("C");
        else System.out.println("Fail");
        sc.close();
    }
}

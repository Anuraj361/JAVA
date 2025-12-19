import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter years of experience (can be decimal): ");
        double years = sc.nextDouble();
        int bonus;
        if (years >= 10) bonus = 20000;
        else if (years >= 5) bonus = 10000;
        else if (years >= 1) bonus = 5000;
        else bonus = 0;
        System.out.println("Bonus: " + bonus);
        sc.close();
    }
}

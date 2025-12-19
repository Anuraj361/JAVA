import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the candidate's age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("The candidate is eligible for casting his/her vote.");
        } else {
            System.out.println("The candidate is not eligible for casting his/her vote.");
        }
        
        scanner.close();
    }
}
import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bill amount: ");
        double bill = sc.nextDouble();
        if (bill > 2000) {
            double discount = bill * 0.10;
            double finalAmt = bill - discount;
            System.out.printf("Discount applied: %.2f%nFinal amount: %.2f%n", discount, finalAmt);
        } else {
            System.out.printf("No discount. Final amount: %.2f%n", bill);
        }
        sc.close();
    }
}
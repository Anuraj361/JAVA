import java.util.Scanner;
public class AffordableCheck {
    void checkAffordable(double cost) {
        if (cost <= 1000) {
            System.out.println("Affordable");
        } else {
            System.out.println("Not Affordable");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AffordableCheck obj = new AffordableCheck();

        System.out.print("Enter cost: ");
        double cost = sc.nextDouble();

        obj.checkAffordable(cost);
    }
}

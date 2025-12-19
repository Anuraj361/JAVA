import java.util.Scanner;

public class AddDemo {

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        AddDemo addObj = new AddDemo();
        addObj.sum(num1, num2);
    }
}

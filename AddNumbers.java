import java.util.Scanner;
public class AddNumbers {
    int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddNumbers obj = new AddNumbers();
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("Sum = " + obj.add(n1, n2));
    }
}

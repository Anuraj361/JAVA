import java.util.Scanner;
public class GetAge {
    int getAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        GetAge obj = new GetAge();

        int age = obj.getAge();
        System.out.println("Your age is: " + age);
    }
}

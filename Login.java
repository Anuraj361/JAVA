import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        if ("admin".equals(user)) {
            if ("1234".equals(pass)) System.out.println("Login successful");
            else System.out.println("Wrong password");
        } else {
            System.out.println("Unknown username");
        }
        sc.close();
    }
}

import java.util.Scanner;
public class TempCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (°C): ");
        double t = sc.nextDouble();
        System.out.println(t > 37.0 ? "Fever" : "Normal");
        sc.close();
    }
}

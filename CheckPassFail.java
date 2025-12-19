import java.util.Scanner;
public class CheckPassFail {
    void checkResult(int marks) {
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CheckPassFail obj = new CheckPassFail();
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        obj.checkResult(marks);
    }
}

public class ParseDemo {
    public static void main(String[] args) {
        try {
            String s = "abc123";
            int num = Integer.parseInt(s);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
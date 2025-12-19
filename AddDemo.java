public class AddDemo {
    class Sum {
        int a = 20;
        int b = 30;

        void displaySum() {
            int sum = a + b;
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        AddDemo addObj = new AddDemo();
        Sum sumObj = addObj.new Sum();
        sumObj.displaySum();
    }
}

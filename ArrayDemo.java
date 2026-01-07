public class ArrayDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            System.out.println(arr[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of range");
        }
    }
}
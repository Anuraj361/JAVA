class Smallest {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1};
        int min = a[0];
        for (int i : a)
            if (i < min) min = i;
        System.out.println(min);
    }
}

class Largest2D {
    public static void main(String[] args) {
        int[][] a = {{1,5},{9,3}};
        int max = a[0][0];
        for (int[] r : a)
            for (int x : r)
                if (x > max) max = x;
        System.out.println(max);
    }
}

class ProductPrice {
    public static void main(String[] args) {
        double[][] p = {{10.5,20.5},{30.5,40.5}};
        for (double[] r : p) {
            for (double x : r)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}

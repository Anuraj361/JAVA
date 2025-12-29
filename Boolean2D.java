class Boolean2D {
    public static void main(String[] args) {
        boolean[][] b = {{true,false},{false,true}};
        for (boolean[] r : b) {
            for (boolean x : r)
                System.out.print(x+" ");
            System.out.println();
        }
    }
}

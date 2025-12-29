class Marks {
    public static void main(String[] args) {
        int[][] m = {
            {80,70,60},
            {75,85,65},
            {90,88,78},
            {60,55,70}
        };
        for (int i=0;i<4;i++) {
            for (int j=0;j<3;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
    }
}

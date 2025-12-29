class CityTable {
    public static void main(String[] args) {
        String[][] c = {
            {"Kathmandu","Pokhara"},
            {"Lalitpur","Biratnagar"}
        };
        for (String[] r : c) {
            for (String x : r)
                System.out.print(x+"\t");
            System.out.println();
        }
    }
}

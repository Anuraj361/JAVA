class StudentSubject {
    public static void main(String[] args) {
        String[][] s = {
            {"Ram", "Math"},
            {"Sita", "Science"}
        };
        for (int i=0;i<s.length;i++)
            System.out.println(s[i][0] + " - " + s[i][1]);
    }
}
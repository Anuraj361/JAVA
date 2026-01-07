class InsertExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.insert(4, " Language");
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("Java");
        sbuf.insert(4, " Language");
        System.out.println(sbuf);
    }
}

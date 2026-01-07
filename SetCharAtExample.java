class SetCharAtExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.setCharAt(0, 'L');
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("Java");
        sbuf.setCharAt(0, 'L');
        System.out.println(sbuf);
    }
}

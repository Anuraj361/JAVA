class DeleteCharAtExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.deleteCharAt(1);
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("Java");
        sbuf.deleteCharAt(1);
        System.out.println(sbuf);
    }
}

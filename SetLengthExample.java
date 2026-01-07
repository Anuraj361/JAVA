class SetLengthExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JavaProgramming");
        sb.setLength(4);
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("JavaProgramming");
        sbuf.setLength(4);
        System.out.println(sbuf);
    }
}

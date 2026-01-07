class ReplaceExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.replace(0, 4, "Core");
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("Java");
        sbuf.replace(0, 4, "Core");
        System.out.println(sbuf);
    }
}

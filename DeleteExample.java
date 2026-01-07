class DeleteExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("JavaProgramming");
        sb.delete(4, 15);
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("JavaProgramming");
        sbuf.delete(4, 15);
        System.out.println(sbuf);
    }
}

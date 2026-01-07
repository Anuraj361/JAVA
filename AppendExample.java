public class AppendExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);

        StringBuffer sbuf = new StringBuffer("Java");
        sbuf.append(" Programming");
        System.out.println(sbuf);
    }
}

class ToStringExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String str1 = sb.toString();
        System.out.println(str1);

        StringBuffer sbuf = new StringBuffer("Java");
        String str2 = sbuf.toString();
        System.out.println(str2);
    }
}

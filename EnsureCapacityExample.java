class EnsureCapacityExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());

        StringBuffer sbuf = new StringBuffer();
        sbuf.ensureCapacity(50);
        System.out.println(sbuf.capacity());
    }
}

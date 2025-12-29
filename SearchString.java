class SearchString {
    public static void main(String[] args) {
        String[] s = {"Ram", "Hari", "Sita"};
        String key = "Hari";
        boolean found = false;
        for (String str : s)
            if (str.equals(key)) found = true;
        System.out.println(found ? "Found" : "Not Found");
    }
}

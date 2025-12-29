public class VowelCount {
    public static void main(String[] args) {
        String[] s = {"Ram", "Sita"};
        int count = 0;
        for (String str : s)
            for (char c : str.toLowerCase().toCharArray())
                if ("aeiou".indexOf(c) != -1) count++;
        System.out.println(count);
    }
}

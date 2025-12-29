interface Operation {
    int calculate();
}

class Addition implements Operation {
    public int calculate() {
        int a = 10, b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        Operation op = new Addition();
        System.out.println("Sum = " + op.calculate());
    }
}

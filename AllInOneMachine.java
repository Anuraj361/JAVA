interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

public class AllInOneMachine implements Printable, Scannable {
    public void print() {
        System.out.println("Printing");
    }

    public void scan() {
        System.out.println("Scanning");
    }

    public static void main(String[] args) {
        AllInOneMachine m = new AllInOneMachine();
        m.print();
        m.scan();
    }
}

interface Student {
    void display();
}

public class CollageStudent implements Student {
    public void display() {
        System.out.println("Name: Anuraj");
        System.out.println("Roll No: 6");
    }

    public static void main(String[] args) {
        CollageStudent s = new CollageStudent();
        s.display();
    }
}

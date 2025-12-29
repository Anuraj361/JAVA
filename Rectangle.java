interface Shape {
    void area();
}

class Circle implements Shape {
    public void area() {
        double r = 5;
        System.out.println(3.14 * r * r);
    }
}

public class Rectangle implements Shape {
    public void area() {
        int l = 4;
        int b = 6;
        System.out.println(l * b);
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.area();

        Rectangle r = new Rectangle();
        r.area();
    }
}

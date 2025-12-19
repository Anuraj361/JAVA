class Vehicle {
    void startEngine() {
        System.out.println("Engine started");
    }
}

class Car extends Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
    }
}

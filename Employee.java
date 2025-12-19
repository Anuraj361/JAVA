class Employee {
    protected int salary = 50000;
}

class Manager extends Employee {
    int bonus = 10000;

    void display() {
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.display();
    }
}

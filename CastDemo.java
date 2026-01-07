class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
public class CastDemo {
    public static void main(String[] args) {
        try {
            Animal a = new Dog();
            Cat c = (Cat) a;
        } catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }
    }
}
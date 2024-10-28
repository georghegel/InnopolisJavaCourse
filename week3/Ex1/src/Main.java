
public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("kitty", "black", 100, 200);
        Cow cow = new Cow("Stake", "black", 200, 800);
        Dog dog = new Dog("China", "black", 100, 200);

        c.makeSound();
        c.eat();
        c.sleep();

        cow.makeSound();
        cow.eat();
        cow.sleep();

        dog.makeSound();
        dog.sleep();
        dog.eat();

    }
}
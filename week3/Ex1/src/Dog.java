public class Dog extends Animal {
    public Dog() {
        super();
    }
    public Dog(String name, String color, int height, int weight) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

    @Override
    public void makeSound () {
        System.out.println("BARKING");
    }
}

public class Cat extends Animal {

    public Cat() {
        super();
    }

    public Cat(String name, String color, int height, int weight) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping...");
    }

    @Override
    public void makeSound () {
        System.out.println("MEOW MEOW MEOW");
    }

}

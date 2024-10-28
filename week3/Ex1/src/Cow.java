public class Cow extends Animal {
    public Cow() {
        super();
    }
    public Cow(String name, String color, int height, int weight) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Cow is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Cow is sleeping...");
    }

    @Override
    public void makeSound () {
        System.out.println("MUUUUUUUUUU");
    }
}

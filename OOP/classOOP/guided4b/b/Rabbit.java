package alamsyah.OOP.classOOP.guided4b.b;

public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    public String getType() {
        return "Rabbit";
    }

    public String playSound() {
        return "Squeak!";
    }
}

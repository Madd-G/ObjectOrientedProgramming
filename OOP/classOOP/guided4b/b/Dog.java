package alamsyah.OOP.classOOP.guided4b.b;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String getType() {
        return "Dog";
    }

    public String playSound() {
        return "Guk!";
    }
}

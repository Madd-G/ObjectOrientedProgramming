package alamsyah.OOP.classOOP.guided4b.b;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public String getType() {
        return "Cat";
    }

    public String playSound() {
        return "Meow!";
    }
}

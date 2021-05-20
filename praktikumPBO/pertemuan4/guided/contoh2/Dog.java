package alamsyah.praktikumPBO.pertemuan4.guided.contoh2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String getType() {
        return "Dog";
    }

    public String playSound() {
        return "Woof!";
    }
}

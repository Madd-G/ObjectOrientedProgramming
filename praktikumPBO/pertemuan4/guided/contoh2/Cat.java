package alamsyah.praktikumPBO.pertemuan4.guided.contoh2;

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

package alamsyah.OOP.classOOP.guided4b.b;

public class Main {
    public static void main(String[] args) {    
        // Object constructors
        Animal animal = new Animal("An animal");
        Cat cat = new Cat("Lucas");
        Dog dog = new Dog("Sebastian");
        Rabbit rabbit = new Rabbit("Mina");

        // Outputs
        animal.showProfile();
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
    }
}

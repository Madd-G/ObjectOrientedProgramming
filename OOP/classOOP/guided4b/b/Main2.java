package alamsyah.OOP.classOOP.guided4b.b;

public class Main2 {
    public static void main(String[] args) {
        // Array of objects of inherited classes
        Animal[] animals = {
                new Cat("Cat1"),
                new Dog("Dog1"),
                new Rabbit("Rabbit1"),
        };

        // output first way
        int animalCount = animals.length;
        for (int i = 0; i < animalCount; i++)
            animals[i].showProfile();

        // output second way
        for (Animal animal : animals)
            animal.showProfile();
    }
}

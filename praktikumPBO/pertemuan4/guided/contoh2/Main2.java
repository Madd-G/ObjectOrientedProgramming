package alamsyah.praktikumPBO.pertemuan4.guided.contoh2;

public class Main2 {
    public static void main(String[] args) {
        // tipeData namaArray = new tipeData[indexMax];
        Animal[] animals = {
                new Cat("cat"),
                new Dog("dog"),
                new Rabbit("rabbit"),
        };

        // output
        int animalCount = animals.length;
        for (int i = 0; i < animalCount; i++)
            animals[i].showProfile();

        for (Animal animal : animals)
            animal.showProfile();
    }
}

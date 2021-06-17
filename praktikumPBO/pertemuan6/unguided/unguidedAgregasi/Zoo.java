package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedAgregasi;

public class Zoo {
    // attribute
    private final String zooName;
    private Animal animal; // create an animal attribute from the Animal class
    // so that can set and get it from the Zoo class

    // constructor
    public Zoo(String zooName) {
        this.zooName = zooName;
    }

    // setter and getter
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getZooName() {
        return zooName;
    }

    public Animal getAnimal() {
        return animal;
    }
}

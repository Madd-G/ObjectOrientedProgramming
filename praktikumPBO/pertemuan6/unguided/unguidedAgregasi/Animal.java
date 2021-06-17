package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedAgregasi;

public class Animal {
    // attribute
    private final String name;
    private final String habitat;
    private final String food;

    // constructor
    public Animal(String name, String habitat, String food) {
        this.name = name;
        this.habitat = habitat;
        this.food = food;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getFood() {
        return food;
    }
}

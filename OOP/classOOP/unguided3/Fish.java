package alamsyah.OOP.classOOP.unguided3;

public class Fish {
    private final String name;
    private final int size;
    private final String habitat;
    private final int price;

    public Fish(String name, int size, String habitat, int price) {
        this.name = name;
        this.size = size;
        this.habitat = habitat;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getHabitat() {
        return habitat;
    }

    public int getPrice() {
        return price;
    }

    public void showDetail() {
        System.out.println("- " + getName() + " " + getSize() + " cm" + " (" + getHabitat() + ") - Rp " + getPrice());
    }
}

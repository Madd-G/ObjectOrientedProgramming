package alamsyah.praktikumPBO.pertemuan4.guided.contoh2;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return "Unknown animal";
    }

    public String playSound() {
        return "Error: Unknown animal type!";
    }

    public void showProfile() {
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Sound: " + playSound());
        System.out.println();
    }
}

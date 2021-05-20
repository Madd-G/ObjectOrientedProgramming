package alamsyah.OOP.classOOP.guided5.overloading;

public class Chef {
    String name;

    // constructor Chef
    public Chef(String name) {
        this.name = name;
    }

    // Method cook original
    public void cook() {
        System.out.println("Chef" + name + " is cooking.");
    }

    // Method cook overloaded 
    public void cook(String foodName) {
        System.out.println("Chef " + name + " is cooking " + foodName + ".");
    }
}

package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedAgregasi;

public class Main {
    public static void main(String[] args) {
        // instance
        Animal hewan = new Animal("Lion", "Savana", "Meat");
        Zoo bonbin = new Zoo("KITA Zoo");

        // to set argument of setAnimal with hewan object
        bonbin.setAnimal(hewan);

        // output
        System.out.println("\n ========== " + bonbin.getZooName() + " ==========");
        System.out.println("| Special Collection           |");
        System.out.println("| " + bonbin.getAnimal().getName() + "                         |");
        System.out.println("| Habitat: " + bonbin.getAnimal().getHabitat() + "              |");
        System.out.println("| Food: " + bonbin.getAnimal().getFood() + "                   |");
        System.out.println(" ------------------------------");
    }
}

package alamsyah.praktikumPBO.pertemuan4.unguided;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String carnivoreCharacteristics = "-Only eat meat \n-Have short, smooth digestive tract \n-Have sharp claws";
        String herbivoreCharacteristics = "-Only eat plant materials \n-Have long digestive tracts \n-Usually have flattened nails";
        String omnivoreCharacteristics = "-Eat both meat and plant materials \n-Have short, smooth digestive tract \n-Have sharp claws";

        // membuat objek Map
        Map<String, Animal> animals = new HashMap();
        animals.put("Carnivore", new Carnivore(carnivoreCharacteristics)); // method put() untuk menambahkan objek ke Map
        animals.put("Herbivore", new Herbivore(herbivoreCharacteristics));
        animals.put("Omnivore", new Omnivore(omnivoreCharacteristics));

        Scanner input = new Scanner(System.in);

        boolean isLooping = true;
        do {
            System.out.println("\n==> MAIN MENU <==");
            System.out.println("1) Carnivore");
            System.out.println("2) Herbivore");
            System.out.println("3) Omnivore");
            System.out.println("4) EXIT");
            System.out.print("> ");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    // // method get() untuk melihat isi Map berdasarkan key
                    animals.get("Carnivore").showDetail();
                    break;
                case 2:
                    animals.get("Herbivore").showDetail();
                    break;
                case 3:
                    animals.get("Omnivore").showDetail();
                    break;
                case 4:
                    isLooping = false;
                    break;
                default:
                    System.out.println("ERROR: YOUR CHOICE IS NOT AVAILABLE");
                    isLooping = true;
                    break;
            }
        } while (isLooping);
    }
}
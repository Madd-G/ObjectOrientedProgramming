package alamsyah.OOP.classOOP.unguided4;

/*
This program was created to practise the concept of inheritance in java
Inheritance is a mechanism in which one class acquires the property of another class
we can reuse the fields and methods of the existing class / Super Class
Carnivore, Herbivore, and Omnivore Class inherit from Animal Class
So they don't have to initiate/create the same fields and method over and over again
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String carnivoreCharacteristics = "-Only eat meat \n-Have short, smooth digestive tract \n-Have sharp claws";
        String herbivoreCharacteristics = "-Only eat plant materials \n-Have long digestive tracts \n-Usually have flattened nails";
        String omnivoreCharacteristics = "-Eat both meat and plant materials \n-Have short, smooth digestive tract \n-Have sharp claws";

        // create objek Map
        Map<String, Animal> animals = new HashMap();
        animals.put("Carnivore", new Carnivore(carnivoreCharacteristics)); // method put() to add objek to the Map
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
                    // // method get () to view the contents of the Map by key
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
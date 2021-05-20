package alamsyah.OOP.classOOP.guided3.restaurant;

import java.util.Scanner;

public class Main {
    static Item[] menu = {
            new Item("Mendoan", 1_000, "Makanan"),
            new Item("Es Teh", 2_500, "Minuman"),
            new Item("Aneka Sayur", 5_000, "Makanan"),
            new Item("Ayam Goreng", 7_500, "Makanan"),
            new Item("Milk Tea", 10_000, "Minuman"),
            new Item("Sate Ayam", 15_000, "Makanan"),
    };

    static void showMenu() {
        System.out.println("==> Menu <==");
        int noItem = 1;
        for (Item product : menu) {
            System.out.println(noItem + ") " + product.getName() + " - Rp " + product.getPrice());
            noItem++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String buyerName = input.nextLine();

        Buyer buyer = new Buyer(buyerName);

        System.out.println("Welcome, " + buyer.getName() + "!");
        boolean isLooping = true;
        do {
            System.out.println("==> Main menu <==");
            System.out.println("1) Order your food and drink");
            System.out.println("2) show order history");
            System.out.println("3) Clear order history");
            System.out.println("4) Exit");
            System.out.print("> ");

            int nav = input.nextInt();
            System.out.println();

            switch (nav) {
                case 1:
                    showMenu();
                    System.out.print("> ");
                    int choose = input.nextInt() - 1;
                    boolean inputInvalid = (choose < 0 || choose >= menu.length);

                    if (inputInvalid) {
                        System.out.println("Error: Please enter correctly!");
                    } else {
                        Item item = menu[choose];
                        buyer.order(item);
                    }
                    System.out.println();
                    break;
                case 2:
                    buyer.showHistory();
                    break;
                case 3:
                    buyer.clearHistory();
                    break;
                case 4:
                    System.out.println("Thank you for shopping! ^^");
                    isLooping = false;
                    break;
                default:
                    System.out.println("Error: Please input correctly!");
                    System.out.println();
                    break;

            }
        } while (isLooping);
    }
}

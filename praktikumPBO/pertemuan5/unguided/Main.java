package alamsyah.praktikumPBO.pertemuan5.unguided;

import java.util.Scanner;

public class Main {

    static Product product = new Product();
    static Product washingMachine = new Product("Washing Machine", 5_000_000);
    static Product refrigerator = new Product("Refrigerator", 4_000_000);
    static Product iron = new Product("Iron", 400_000);
    static Handphone handphone = new Handphone();
    static Handphone galaxyNote8 = new Handphone("Galaxy Note 8", 6_000_000);
    static Handphone galaxyNote9 = new Handphone("Galaxy Note 9", 8_000_000);
    static Handphone galaxyA10 = new Handphone("Galaxy A10", 1_000_000);

    static void showProductList() {
        // same function name with different output (overriding)
        product.showTitle();
        // same function name but different parameters(overloading)
        washingMachine.showProduct("Iron");
        refrigerator.showProduct();
        iron.showProduct();
    }

    static void showHandphoneList() {
        handphone.showTitle();
        galaxyNote8.showProduct("JBL Headphone");
        galaxyNote9.showProduct("Wireless Charger");
        galaxyA10.showProduct();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean isLooping = true;
        do {
            System.out.println("\n==> MAIN MENU <==");
            System.out.println("1) Common Product");
            System.out.println("2) Smartphone");
            System.out.println("3) EXIT");
            System.out.print("> ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    showProductList();
                    break;
                case 2:
                    showHandphoneList();
                    break;
                case 3:
                    isLooping = false;
                    break;
            }
        } while (isLooping);
    }
}

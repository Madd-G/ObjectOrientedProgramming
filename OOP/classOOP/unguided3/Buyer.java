package alamsyah.OOP.classOOP.unguided3;

import java.util.Scanner;

public class Buyer {
    Scanner input = new Scanner(System.in);

    private Fish[] newCart = new Fish[999];
    private int fishOrdered = 0;
    int total = 0;
    int totalQuantity = 0;
    int moneyChanges = 0;

    public Buyer() {
    }

    public void buy(Fish item) {
        newCart[fishOrdered] = item;
        fishOrdered++;
        System.out.println(item.getName() + " has been added to your basket ");
        System.out.println();
    }

    public void totalItems() {
        total = 0;
        for (int i = 0; i < fishOrdered; i++) {
            total += newCart[i].getPrice();
        }
        System.out.println("Total Qty: " + fishOrdered + " items");
        System.out.println("Total: Rp " + total);
        System.out.println();
    }

    public void showCart() {
        boolean emptyCart = (fishOrdered == 0);

        if (emptyCart) {
            System.out.println("Your cart is empty!");
            System.out.println();
        } else {
            System.out.println("==> Your Cart <==");
            for (int i = 0; i < fishOrdered; i++) {
                newCart[i].showDetail();
            }
            totalItems();
        }
    }

    public void resetCart() {
        newCart = new Fish[999];
        fishOrdered = 0;
        total = 0;
        totalQuantity = 0;
        System.out.println("\nYour cart has been removed\n");
    }

    public void pay() {
        System.out.print("enter the amount of your money: ");
        int money = input.nextInt();
        if (money >= total) {
            moneyChanges = money - total;
            System.out.println("Payment received");
            System.out.println("\nYour change: " + moneyChanges);
        } else {
            System.out.println("Your money is not enough");
        }
        System.out.println("\nThank you for shopping at ABC Fish Store");
    }
}

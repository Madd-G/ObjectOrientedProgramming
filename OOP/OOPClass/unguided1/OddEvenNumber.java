package alamsyah.OOP.OOPClass.unguided1;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int bil = input.nextInt();

        if (bil % 2 == 0)
            System.out.println(bil + " is even number");
        else
            System.out.println(bil + " is odd number");
    }
}
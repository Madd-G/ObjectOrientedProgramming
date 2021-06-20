package alamsyah.praktikumPBO.pertemuan7.unguided;

import java.util.Scanner;

public class UnguidedNumberFormatException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String: ");
        // input
        String num = input.nextLine();
        try {
            // change the String value from variable num to integer
            System.out.println(Integer.parseInt(num));
        }
        catch (NumberFormatException e) {
            // will be executed if the value of variable num can't be changed to an integer
            System.out.println("Can't convert the input to Integer");
            System.out.println("cause " + e);
        }
    }
}

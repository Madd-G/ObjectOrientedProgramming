package alamsyah.OOP.classOOP.guided1;

import java.util.Scanner;

public class DemoIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        if(num > 0)
            System.out.println(num + " is positive");
        else if(num <0 )
            System.out.println(num + " is negative");
        else
            System.out.println(num + " is zero");
    }
}

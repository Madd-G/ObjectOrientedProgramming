package alamsyah.OOP.OOPClass.unguided2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Age age = new Age();

        System.out.print("enter the year of birth: ");
        age.yearOfBirth = input.nextInt();
        System.out.println(age.calculate(age.yearOfBirth));
    }
}
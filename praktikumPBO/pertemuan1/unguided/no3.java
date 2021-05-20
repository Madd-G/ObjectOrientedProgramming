package alamsyah.praktikumPBO.pertemuan1.unguided;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "admin";
        String password = "admin";

        for (int x = 1; x <= 3; x++) {

            System.out.print("Username: ");
            String user = input.nextLine();
            System.out.print("Password: ");
            String pass = input.nextLine();

            if (user.equals(username) && pass.equals(password)) {
                System.out.println("Login successful!");
                break;
            }
            System.out.println("Login failed! (" + x + "/3)");

            if (x == 3) {
                System.out.println("You have been blocked!");
                break;
            }
        }
    }
}

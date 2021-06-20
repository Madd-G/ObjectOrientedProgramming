package alamsyah.praktikumPBO.pertemuan7.guided;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan bilangan: ");
            int bil1 = input.nextInt();
            System.out.print("Masukkan pembagi: ");
            int bil2 = input.nextInt();

            int hasil = bil1 / bil2;
            System.out.println(bil1 + " : " + bil2 + " = " + hasil + " (dibulatkan");
        } catch (ArithmeticException e) {
            System.out.println("Error: Tidak dapat melakukan kalkulasi!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Mohon jangan masukan selain angka!");
        }
    }
}


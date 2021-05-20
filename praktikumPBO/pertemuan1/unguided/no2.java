package alamsyah.praktikumPBO.pertemuan1.unguided;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bil = input.nextInt();

        if (bil % 2 == 0)
            System.out.println(bil + " merupakan bilangan genap");
        else
            System.out.println(bil + " merupakan bilangan ganjil");
    }
}

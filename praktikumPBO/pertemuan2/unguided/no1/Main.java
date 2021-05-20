package alamsyah.praktikumPBO.pertemuan2.unguided.no1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Function fun = new Function();

        System.out.print("Masukkan tahun lahir: ");
        fun.yearOfBirth = input.nextInt();
        System.out.println("Umur kamu adalah " + fun.calculate(fun.yearOfBirth) + " tahun");
    }
}

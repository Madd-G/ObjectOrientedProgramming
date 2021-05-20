package alamsyah.praktikumPBO.pertemuan3.guided.array;

import java.util.Scanner;

public class ArrayVariableLength {
    public static void isiArray(int[] arrayKosong) {
        for (int i = 0; i < arrayKosong.length; i++)
            arrayKosong[i] = i;
    }

    public static void lihatIsiArray(int[] array) {
        System.out.print("Nilai array: [ ");
        for (int isiArray : array)
            System.out.print(isiArray + " ");
        System.out.println("]");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = input.nextInt();

        int[] numbers = new int[panjangArray];

        isiArray(numbers);
        lihatIsiArray(numbers);
    }
}



package alamsyah.praktikumPBO.pertemuan3.guided.array;

public class ArrayNotSoBasic {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 6, 7, 0, 5, 9, 1};
        int panjangArray = numbers.length;

        System.out.print("Nilai array: [ ");
        for (int number : numbers)
            System.out.print(number + " ");
        System.out.println("]");

        System.out.println("Panjang array: " + panjangArray);
    }
}

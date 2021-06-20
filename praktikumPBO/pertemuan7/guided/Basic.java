package alamsyah.praktikumPBO.pertemuan7.guided;

public class Basic {
    public static void main(String[] args) {
        int[] myNumber = {1, 2, 3};
        try {
            System.out.println(myNumber[10]);
            System.out.println("Sukses tanpa error");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array tidak sebesar itu!");
        }

    }
}

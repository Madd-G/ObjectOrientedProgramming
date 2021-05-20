package alamsyah.praktikumPBO.pertemuan1.guided;

public class DemoLoop {
    public static void main(String[] args) {
        // For loop
        for(int i=1; i<=5; i++)
            System.out.println("For loop (" + i + "/5)");
        System.out.println();

        // While loop
        int j=1;
        while (j<=5) {
            System.out.println("While loop (" + j + "/5");
            j++;
        }
        System.out.println();

        // Do-While loop
        int k=1;
        do {
            System.out.println("Do-while loop (" + k + "/5");
            k++;
        }while (k<=5);
        System.out.println();

        // Break demo
        int x=0;
        while (x<999999) {
            System.out.println("Looping... (" + x + "/999999)");
            x++;

            if(x == 5) {
                System.out.println("Udah ah, cape!");
                break;
            }
        }
    }
}

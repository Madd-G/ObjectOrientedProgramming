package alamsyah.praktikumPBO.pertemuan1.unguided;

public class no1 {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.println("Loading " + x + "%");
            x++;
        } while (x <= 100);
        System.out.println("Loading complete!");
    }
}

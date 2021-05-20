package alamsyah.praktikumPBO.pertemuan2.guided;

public class Coba {
    public static void main(String[] args) {
        drawTriangle(3);
        drawSquare(5,7);
        drawSquare(2,2);

    }
    public static void drawTriangle(int length) {
        for (int row = 1; row<=length; row++) {
            for (int column = 1; column<=row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void drawSquare(int length, int width) {
        for (int row = 1; row<=length; row++) {
            for (int column = 1; column <= width; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}

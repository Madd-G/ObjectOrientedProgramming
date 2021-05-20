package alamsyah.OOP.classOOP.guided2;

public class DemoFunction {
    public static void drawTriangle(int length){
        for(int i=1;i<=length;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawRectangle(int height, int width){
        for (int i=1;i<=height;i++){
            for (int j=1;j<=width;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        drawTriangle(7);
        drawRectangle(5,7);
    }
}

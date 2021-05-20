package alamsyah.praktikumPBO.pertemuan2.guided.method;

public class Passed {
    public static void main(String[] args) {
        int nomer1;
        int nomer2;

        TestPass tp = new TestPass(50, 100);
        nomer1 = 10;
        nomer2 = 20;

        // Passed by value
        System.out.println("Nilai sebelum passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer1\t: " + nomer2);

        tp.calculate(nomer1, nomer2);
        System.out.println("Nilai setelah passed by value\t: ");
        System.out.println("Nomer1\t: " + nomer1);
        System.out.println("Nomer1\t: " + nomer2);
        System.out.println();

        // Passed by reference
        System.out.println("Nilai sebelum passed by reference\t: ");
        System.out.println("tp.nomer1\t: " + tp.nomer1);
        System.out.println("tp.nomer1\t: " + tp.nomer2);

        tp.calculate(tp);
        System.out.println("Nilai setelah passed by reference\t: ");
        System.out.println("tp.nomer1\t: " + tp.nomer1);
        System.out.println("tp.nomer1\t: " + tp.nomer2);
    }
}

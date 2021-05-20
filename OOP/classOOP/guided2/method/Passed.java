package alamsyah.OOP.classOOP.guided2.method;

public class Passed {
    public static void main(String[] args) {
        int number1;
        int number2;

        TestPass tp = new TestPass(50, 100);
        number1 = 10;
        number2 = 20;

        // Passed by value
        System.out.println("Before passed by value\t: ");
        System.out.println("number1\t: " + number1);
        System.out.println("number1\t: " + number2);

        tp.calculate(number1, number2);
        System.out.println("After passed by value\t: ");
        System.out.println("number1\t: " + number1);
        System.out.println("number1\t: " + number2);
        System.out.println();

        // Passed by reference
        System.out.println("Before passed by reference\t: ");
        System.out.println("tp.number1\t: " + tp.number1);
        System.out.println("tp.number1\t: " + tp.number2);

        tp.calculate(tp);
        System.out.println("After passed by reference\t: ");
        System.out.println("tp.number1\t: " + tp.number1);
        System.out.println("tp.number1\t: " + tp.number2);
    }
}

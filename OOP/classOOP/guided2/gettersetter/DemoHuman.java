package alamsyah.OOP.classOOP.guided2.gettersetter;

public class DemoHuman {
    public static void main(String[] args) {
        Human[] arrayHuman = new Human[3];

        Human manusia1 = new Human();
        manusia1.setName("Jake");
        manusia1.setAge(20);

        Human manusia2 = new Human("Finn");
        Human manusia3 = new Human("Darwin", 16);

        arrayHuman[0] = manusia1;
        arrayHuman[1] = manusia2;
        arrayHuman[2] = manusia3;

        for (Human x : arrayHuman) {
            System.out.println("Character ");
            System.out.println("name\t: " + x.getName());
            System.out.println("age\t: " + x.getAge());
        }
    }
}


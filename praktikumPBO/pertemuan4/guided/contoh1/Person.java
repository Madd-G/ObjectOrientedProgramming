package alamsyah.praktikumPBO.pertemuan4.guided.contoh1;

public class Person {
    public String name = "";

    public void talk() {
        if (name.equals(""))
            System.out.println("Hi, kenalan yuk!");
        else
            System.out.println("Namaku " + name);
    }
}

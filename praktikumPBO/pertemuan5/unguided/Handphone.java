package alamsyah.praktikumPBO.pertemuan5.unguided;

public class Handphone extends Product {

    public Handphone(String name, int price) {
        super(name, price);
    }
    public Handphone(){}

    // This function will override showAdv function in the parent class
    public void showTitle() {
        System.out.println("\nHandphone List");
    }
}

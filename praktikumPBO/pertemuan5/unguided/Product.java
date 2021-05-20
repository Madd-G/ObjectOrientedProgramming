package alamsyah.praktikumPBO.pertemuan5.unguided;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product(){}

    // The 2 functions below are examples of overloading
    public void showProduct() {
        System.out.println(name + " Rp. " + price);
    }

    public void showProduct(String bonus) {
        System.out.println(name + " Rp. " + price + " + bonus: " + bonus);
    }

    // this function will be overridden with function in child class
    public void showTitle() {
        System.out.println("\nElectronics List");
    }
}

package alamsyah.praktikumPBO.pertemuan6.unguided.unguidedKomposisi;

public class Main {
    public static void main(String[] args) {
        // instance of Laptop class
        Laptop laptop = new Laptop("Macbook pro M1");

        // to set arguments to setDisplay, setProcessor, etc
        laptop.setDisplay("Retina Display", 13.3, "1680 x 1050");
        laptop.setProcessor("M1");
        laptop.setGraphics("Neural Engine 16-core");
        laptop.setMemory(512);
        laptop.setRam(8);

        // to call showLaptopSpec method
        laptop.showLaptopSpec();

    }
}

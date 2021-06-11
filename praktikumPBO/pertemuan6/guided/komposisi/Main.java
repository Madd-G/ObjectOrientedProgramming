package alamsyah.praktikumPBO.pertemuan6.guided.komposisi;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Lancer");

        mobil.setJok("Kulit Kuda", "L");
        mobil.setMesin("Water Cooling", "Aftur", 12);
        mobil.setRoda("Marchessini", "15");

        mobil.showSpec();
    }
}

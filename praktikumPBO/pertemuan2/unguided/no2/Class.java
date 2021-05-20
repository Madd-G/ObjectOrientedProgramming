package alamsyah.praktikumPBO.pertemuan2.unguided.no2;

public class Class {
    String nama;
    String vision;

    // constructor tanpa parameter
    public Class(){
        this.nama = "no name";
        this.vision = "no vision";
    }

    public Class (String nama) {
        this.nama = nama;
        this.vision = "no vision";
    }

    public Class (String nama, String vision) {
        this.nama = nama;
        this.vision = vision;
    }
}

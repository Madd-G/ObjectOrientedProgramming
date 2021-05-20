package alamsyah.praktikumPBO.pertemuan2.guided.classobject;

public class Mahasiswa {
    // Attribute
    String nama;
    int nim;

    // constructor tanpa parameter
    public Mahasiswa() {
        this.nama = "Default";
        this.nim = 0;
    }

    // constructor dengan parameter
    public Mahasiswa(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }

}

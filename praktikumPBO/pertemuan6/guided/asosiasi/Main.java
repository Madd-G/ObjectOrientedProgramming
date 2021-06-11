package alamsyah.praktikumPBO.pertemuan6.guided.asosiasi;

public class Main {
    public static void main(String[] args) {
        Matkul m1 = new Matkul("Pemrograman Berorientasi Objek", "m1");
        Matkul m2 = new Matkul("Kecerdasan Buatan", "m2");

        Mahasiswa mhs = new Mahasiswa("19104027");

        mhs.setmatkul(m1);
        mhs.setmatkul(m2);

        mhs.showMatkul();
    }
}

package alamsyah.praktikumPBO.pertemuan2.guided.classobject;

public class Object {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("Alamsyah", 19102190);

        // Output mhs1
        System.out.println("==> Data Mhs1 <==");
        System.out.println("Nama: " + mhs1.nama);
        System.out.println("NIM : " + mhs1.nim);
        System.out.println();

        // Output mhs2
        System.out.println("==> Data Mhs2 <==");
        System.out.println("Nama: " + mhs2.nama);
        System.out.println("NIM : " + mhs2.nim);
        System.out.println();
    }
}

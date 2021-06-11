package alamsyah.praktikumPBO.pertemuan6.guided.agregasi;

public class Main {
    public static void main(String[] args) {
        // Objek Construction
        Dosen dosen = new Dosen("209847", "paijo");
        Jurusan jurusan = new Jurusan("Teknik Informatika");

        jurusan.setDosen(dosen);

        System.out.println("NIDN Dosen: " + jurusan.getDosen().getNidn());
        System.out.println("Nama Dosen: " + jurusan.getDosen().getNama());
        System.out.println("Jurusan   : " + jurusan.getNamaJurusan());
    }
}

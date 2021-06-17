package alamsyah.praktikumPBO.pertemuan6.guided.agregasi;

public class Jurusan {
    // Attribute
    private String namaJurusan;
    private Dosen dosen;

    // Constructor
    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    // getter dan Setter
    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public Dosen getDosen() {
        return dosen;
    }
}

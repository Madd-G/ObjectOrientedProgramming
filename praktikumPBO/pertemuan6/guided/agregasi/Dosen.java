package alamsyah.praktikumPBO.pertemuan6.guided.agregasi;

public class Dosen {
    private String nidn;
    private String nama;

    public Dosen(String nidn, String nama) {
        this.nidn = nidn;
        this.nama = nama;
    }

    public String getNidn() {
        return nidn;
    }

    public String getNama() {
        return nama;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

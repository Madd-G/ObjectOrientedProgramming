package alamsyah.praktikumPBO.pertemuan6.guided.asosiasi;

public class Mahasiswa {
    private String nim;
    private String[] kodeMatkul = new String[10];
    private String[] namaMatkul = new String[10];
    private int jmlMatkul = 0;

    public Mahasiswa(String nim) {
        this.nim = nim;
    }

    // getter NIM
    public String getNim() {
        return nim;
    }

    // setter NIM
    public void setNim(String nim) {
        this.nim = nim;
    }

    //Set Matkul ke index terakhir
    public void setmatkul(Matkul matkul) {
        if (jmlMatkul != this.kodeMatkul.length) {
            this.namaMatkul[jmlMatkul] = matkul.getNamaMatkul();
            this.kodeMatkul[jmlMatkul] = matkul.getKodeMatkul();
            jmlMatkul++;
        } else {
            System.out.println("Maaf, daftar matkul penuh!");
        }
    }

    // Set matkul ke index yang ditentukan (Overload)
    public void setmatkul(Matkul matkul, int index) {
        this.namaMatkul[index] = matkul.getNamaMatkul();
        this.kodeMatkul[index] = matkul.getKodeMatkul();
    }

    // Menampilkan seluruh matkul yang diambil mahasiswa
    public void showMatkul() {
        System.out.println("Daftar Matkul Mahasiswa berNIM " + nim);
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("- " + namaMatkul[i] + " (" + kodeMatkul[i] + ")");
        }
        System.out.println();
    }
}

package alamsyah.praktikumPBO.pertemuan6.guided.asosiasi;

public class Mahasiswa {
    private String nim;
    private final String[] kodeMatkul = new String[10];
    private final String[] namaMatkul = new String[10];
    private int jmlMatkul = 0;

    public Mahasiswa(String nim) {
        this.nim = nim;
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

    // Menampilkan seluruh matkul yang diambil mahasiswa
    public void showMatkul() {
        System.out.println("Daftar Matkul Mahasiswa berNIM " + nim);
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.println("- " + namaMatkul[i] + " (" + kodeMatkul[i] + ")");
        }
        System.out.println();
    }
}

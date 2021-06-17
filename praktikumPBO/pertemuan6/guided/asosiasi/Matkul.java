package alamsyah.praktikumPBO.pertemuan6.guided.asosiasi;

public class Matkul {
    // attribute
    private final String namaMatkul;
    private final String kodeMatkul;

    // constructor
    public Matkul(String namaMatkul, String kodeMatkul) {
        this.namaMatkul = namaMatkul;
        this.kodeMatkul = kodeMatkul;
    }

    // getter
    public String getNamaMatkul() {
        return namaMatkul;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }


}

package alamsyah.praktikumPBO.pertemuan6.guided.komposisi;

public class Mobil {
    private String nama;
    private Jok jok;
    private Mesin mesin;
    private Roda roda;

    public Mobil(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJok(String bahan, String ukuran) {
        jok = new Jok(bahan, ukuran);
    }

    public void setMesin(String radiator, String oli, int piston) {
        mesin = new Mesin(radiator, oli, piston);
    }

    public void setRoda(String merk, String ring) {
        roda = new Roda(merk, ring);
    }

    public void showSpec() {
        System.out.println("Spesifikasi Mobil " + nama + ":");
        System.out.println("Jok:");
        System.out.println("- " + jok.getBahan());
        System.out.println("- Bahan : ");
        System.out.println("- Ukuran: " + jok.getUkuran());
        System.out.println();
        System.out.println("Mesin:");
        System.out.println("- Radiator: " + mesin.getRadiator());
        System.out.println("- Oli     : " + mesin.getOli());
        System.out.println("- Ring    : " + mesin.getPiston());
        System.out.println();
        System.out.println("Roda:");
        System.out.println("- Merk: " + roda.getMerk());
        System.out.println("- Ring: " + roda.getRing());
        System.out.println();
    }
}
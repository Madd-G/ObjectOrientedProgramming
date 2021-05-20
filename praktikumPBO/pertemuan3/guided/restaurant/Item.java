package alamsyah.praktikumPBO.pertemuan3.guided.restaurant;

public class Item {
    private String nama;
    private int harga;
    private String jenis;

    public Item(String nama, int harga, String jenis) {
        this.nama = nama;
        this.harga = harga;
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getJenis() {
        return jenis;
    }

    public void showDetail() {
        System.out.println("- " + getNama() + " (" + getJenis() + " ) - Rp " + getHarga());
    }
}

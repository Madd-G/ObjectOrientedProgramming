package alamsyah.praktikumPBO.pertemuan3.guided.restaurant;

public class Pembeli {
    private String nama;
    private Item[] historyBelanja = new Item[999];
    private int itemsOrdered = 0;

    public Pembeli(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void beli(Item item) {
        historyBelanja[itemsOrdered] = item;
        itemsOrdered++;
        System.out.println(item.getNama() + " telah ditambahkan ke history belanja sdr " + getNama());
        System.out.println();
    }

    public void lihatHistory() {
        boolean historyKosong = (itemsOrdered == 0);

        if (historyKosong) {
            System.out.println("History belanja Anda masih kosong!");
            System.out.println();
        }
        else {
            System.out.println("==> History Belanja <==");
            for (int i = 0; i<itemsOrdered; i++)
                historyBelanja[i].showDetail();
        }
        System.out.println();
    }

    public void kosongkanHistory() {
        historyBelanja = new Item[999];
        itemsOrdered = 0;
        System.out.println("History belanja anda berhasil dikosongkan!");
    }
}


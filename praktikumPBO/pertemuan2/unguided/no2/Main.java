package alamsyah.praktikumPBO.pertemuan2.unguided.no2;

public class Main {
    public static void main(String[] args) {

        Class main1 = new Class();
        Class main2 = new Class("Paimon");
        Class main3 = new Class("Tatang", "Hydro");

        System.out.println("Daftar Nama Chara Cringe");
        System.out.println("Nama Chara : " + main1.nama);
        System.out.println("Vision     : " + main1.vision);
        System.out.println();
        System.out.println("Nama Chara : " + main2.nama);
        System.out.println("Vision     : " + main2.vision);
        System.out.println();
        System.out.println("Nama Chara : " + main3.nama);
        System.out.println("Vision     : " + main3.vision);
    }
}

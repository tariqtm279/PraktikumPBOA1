public class MainTeman {
    public static void main(String[] args) {
        // Instansiasi
        Teman koleksi = new Teman();

        // d. addNama
        koleksi.addNama("Andi");
        koleksi.addNama("Budi");
        koleksi.addNama("Siti");
        koleksi.addNama("Budi");

        // i. showTeman
        koleksi.showTeman();

        // a. getNbelm
        System.out.println("\nTotal Teman: " + koleksi.getNbelm());

        // h. countNama
        System.out.println("Jumlah nama 'Budi': " + koleksi.countNama("Budi"));

        // f. isMember
        System.out.println("Apakah ada 'Siti'? " + koleksi.isMember("Siti"));

        // g. gantiNama
        System.out.println("\nMengganti Andi menjadi Andre");
        koleksi.gantiNama("Andi", "Andre");

        // e. delNama
        System.out.println("Menghapus Siti");
        koleksi.delNama("Siti");

        // Lihat hasil akhir
        System.out.println("\nKoleksi Akhir:");
        koleksi.showTeman();
        System.out.println("nbelm sekarang: " + koleksi.getNbelm());
    }
}
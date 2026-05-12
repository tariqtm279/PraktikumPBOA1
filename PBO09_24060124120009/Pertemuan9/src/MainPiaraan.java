public class MainPiaraan{
    public static void main(String[] args) {
        // Instansiasi
        Piaraan koleksi = new Piaraan();
        Anabul k = new Kucing("Kitty Anabul", 4);
        Anabul a = new Anjing("Doggy Anabul", 8);
        Anabul b = new Burung("Tweety Anabul", 2.3);
        // d. enqueueAnabul
        koleksi.enqueueAnabul(k);
        koleksi.enqueueAnabul(a);
        koleksi.enqueueAnabul(b);

        // i. showAnabul
        koleksi.showAnabul();

        // a. getNbelm
        System.out.println("\nTotal Anabul: " + koleksi.getNbelm());

        // h. countKucing
        System.out.println("Jumlah Kucing: " + koleksi.countKucing());

        // f. isMember
        System.out.println("Apakah ada Anjing? " + koleksi.isMember(a));

        // g. gantiNama (tidak ada, jadi kita skip)

        // e. delNama (tidak ada, jadi kita skip)

        // Lihat hasil akhir
        System.out.println("\nKoleksi Akhir:");
        koleksi.showAnabul();
        System.out.println("nbelm sekarang: " + koleksi.getNbelm());
    }
}
/*
 * Nama File   : MainDatum.java
 * Deskripsi   : Kelas MainDatum untuk menguji kelas Datum dengan berbagai tipe data (Integer, String, Anabul)
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */
public class MainDatum {
    public static void main(String[] args) {

        // Datum berisi Integer
        Datum<Integer> datumAngka = new Datum<>();
        datumAngka.setIsi(42);
        System.out.println("Datum<Integer>");
        System.out.println("  Isi: " + datumAngka.getIsi());
        datumAngka.setIsi(100);
        System.out.println("  Setelah setIsi(100): " + datumAngka.getIsi());

        System.out.println();

        // Datum berisi String
        Datum<String> datumTeks = new Datum<>();
        datumTeks.setIsi("Halo, Generik!");
        System.out.println("Datum<String>");
        System.out.println("  Isi: " + datumTeks.getIsi());

        System.out.println();

        // Datum berisi objek Anabul (Kucing)
        Datum<Anabul> datumKucing = new Datum<>();
        Kucing kitty = new Kucing("Kitty", 3.5);
        datumKucing.setIsi(kitty);
        System.out.println("Datum<Anabul> berisi Kucing:");
        System.out.println("  Nama: " + datumKucing.getIsi().nama);
        datumKucing.getIsi().suara();
        datumKucing.getIsi().gerak();

        System.out.println();

        // Datum berisi objek Anggora
        Datum<Kucing> datumAnggora = new Datum<>();
        Anggora persian = new Anggora("Persian", 4.2);
        datumAnggora.setIsi(persian);
        System.out.println("Datum<Kucing> berisi Anggora:");
        System.out.println("  Nama : " + datumAnggora.getIsi().nama);
        System.out.println("  Bobot: " + datumAnggora.getIsi().getBobot() + " kg");
        datumAnggora.getIsi().suara();

        System.out.println();

        // Datum berisi Anjing
        Datum<Anabul> datumAnjing = new Datum<>();
        Anjing doggy = new Anjing("Doggy");
        datumAnjing.setIsi(doggy);
        System.out.println("Datum<Anabul> berisi Anjing:");
        System.out.println("  Nama: " + datumAnjing.getIsi().nama);
        datumAnjing.getIsi().suara();
        datumAnjing.getIsi().gerak();

        // Ganti isi dengan Burung
        Burung tweety = new Burung("Tweety");
        datumAnjing.setIsi(tweety);
        System.out.println("\n  Setelah setIsi(Burung):");
        System.out.println("  Nama: " + datumAnjing.getIsi().nama);
        datumAnjing.getIsi().suara();
    }
}
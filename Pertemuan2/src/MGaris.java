/*
 * Nama File   : MGaris.java
 * Deskripsi   : berisi aplikasi method dalam class Titik
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 23 Februari 2026
 */


public class MGaris{
    public static void main(String[] args) {
        
        // Membuat objek Garis g1 dan g2
        Garis g1 = new Garis();
        Garis g2 = new Garis(new Titik(1,2), new Titik(3,4));

        // Menampilkan jumlah objek garis
        System.out.println("Jumlah objek Garis = " + Garis.getCounterGaris());
        
        // Menampilkan titik awal objek g1
        Titik tAwal = g1.getTitikAwal();
        tAwal.printTitik();

        // Menampilkan titik akhir objek g1
        Titik tAkhir = g1.getTitikAkhir();
        tAkhir.printTitik();

        // Mengubah titik awal dan akhir objek g1
        g1.setTitikAwal(new Titik(1,5));
        g1.setTitikAkhir(new Titik(3,7));

        // Menampilkan panjang garis g1
        System.out.println("Panjang garis g1 = " + g1.panjangGaris());

        // Menampilkan gradien garis g1
        System.out.println("Gradien garis g1 = " + g1.gradien());

        // Menampilkan titik tengah garis g2
        Titik tTengah = g2.titikTengah();
        tTengah.printTitik();

        // mengecek apakah g1 sejajar dengan g2
        System.out.println("Apakah g1 sejajar dengan g2 = " + g1.isSejajar(g2));

        // mengecek apakah g1 tegak lurus dengan g2
        System.out.println("Apakah g1 tegak lurus dengan g2 = " + g1.isTegakLurus(g2));

        // Menampilkan titik awal dan titik akhir garis g1
        g1.printGaris();

        // Menampilkan persamaan garis g1
        g1.persamaanGaris();

        // Menampilkan persamaan garis g2
        g2.persamaanGaris();
    }

}
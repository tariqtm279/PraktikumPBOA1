/**
 * File : MBangunDatar.java
 * Deskripsi : Class main untuk menguji class BangunDatar, Lingkaran, Persegi, dan interface IResize
 * Nama : Arsy Thariq Munawar
 * Tanggal : 16 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
 
        // Membuat objek Lingkaran dan Persegi
        Lingkaran l1 = new Lingkaran(14, "Merah", "Solid");
        Lingkaran l2 = new Lingkaran();
        l2.setJari(10);
        l2.setWarna("Biru");
        l2.setBorder("Dashed");
 
        Persegi p1 = new Persegi(8, "Hijau", "Dotted");
        Persegi p2 = new Persegi();
        p2.setSisi(5);
        p2.setWarna("Kuning");
        p2.setBorder("Solid");
 
        // printInfo
        l1.printInfo();
        System.out.println();
        p1.printInfo();
        System.out.println("Luas     : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
        System.out.println("Diagonal : " + p1.getDiagonal());
 
        // isEqualLuas dan isEqualKeliling
        System.out.println("\nLuas L1 == Luas P1?         " + l1.isEqualLuas(p1));
        System.out.println("Keliling L2 == Keliling P1? " + l2.isEqualKeliling(p1));
 
        // IResize - zoomIn, zoomOut, zoom
        System.out.printf("%nJari L1 sebelum zoomIn  : %.2f%n", l1.getJari());
        l1.zoomIn();
        System.out.printf("Jari L1 setelah zoomIn  : %.2f%n", l1.getJari());
        l1.zoomOut();
        System.out.printf("Jari L1 setelah zoomOut : %.2f%n", l1.getJari());
        l1.zoom(200);
        System.out.printf("Jari L1 setelah zoom(200): %.2f%n", l1.getJari());
 
        System.out.printf("%nSisi P1 sebelum zoomIn  : %.2f%n", p1.getSisi());
        p1.zoomIn();
        System.out.printf("Sisi P1 setelah zoomIn  : %.2f%n", p1.getSisi());
        p1.zoomOut();
        System.out.printf("Sisi P1 setelah zoomOut : %.2f%n", p1.getSisi());
        p1.zoom(50);
        System.out.printf("Sisi P1 setelah zoom(50) : %.2f%n", p1.getSisi());
 
        // Counter total objek BangunDatar
        BangunDatar.printCounterBangunDatar();
    }
}
 
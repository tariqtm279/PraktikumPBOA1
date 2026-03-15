/**
 * File : MBangunDatar.java
 * Deskripsi : Class utama (main) untuk menjalankan semua class
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

public class MBangunDatar{
    public static void main (String[] args){
        Persegi Persegi1 = new Persegi(4, "biru", "hitam");
        Lingkaran Lingkaran1 = new Lingkaran(14, "pink", "hitam");
        Persegi1.printInfo();
        System.out.println("\n");
        Lingkaran1.printInfo();

        System.out.println("\n");
        System.out.println("Keliling Persegi1 : " + Persegi1.getKeliling());
        System.out.println("Luas Persegi : " + Persegi1.getLuas());
        System.out.println("Diagonal Persegi1 : " + Persegi1.getDiagonal());
        System.out.println("\n");
        System.out.println("Keliling Lingkaran1 : " + Lingkaran1.getKeliling());
        System.out.println("Luas Lingkaran1 : " + Lingkaran1.getLuas());

                BangunDatar.printCounterBangunDatar();
    }
}
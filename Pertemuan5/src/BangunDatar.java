/**
 * File : BangunDatar.java
 * Deskripsi : Class Parent untuk semua bangun datar
 * Nama : Arsy Thariq Munawar
 * Tanggal : 16 Maret 2026
 */

public abstract class BangunDatar {
    // Atribut umum untuk semua bangun datar
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    //method
    // Konstruktor tanpa parameter
    public BangunDatar() {
        counterBangunDatar++;
    }

    // Konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Method getter dan setter
    //selektor jumlah sisi
    public int getJmlSisi() {
        return jmlSisi;
    }

    //mutator jumlah sisi
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    //selektor warna
    public String getWarna() {
        return this.warna;
    }

    //mutator warna
    public void setWarna(String warna) {
        this.warna = warna;
    }

    //selektor border
    public String getBorder() {
        return this.border;
    }

    //mutator border
    public void setBorder(String border) {
        this.border = border;
    }

    // abstract method untuk menghitung luas dan keliling, harus di override di class turunan
    public abstract double getLuas();

    // abstract method untuk menghitung keliling, harus di override di class turunan
    public abstract double getKeliling();

    // method untuk membandingkan luas bangun datar
    public boolean isEqualLuas(BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    // method untuk membandingkan keliling bangun datar
    public boolean isEqualKeliling(BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }

    // method untuk menampilkan informasi bangun datar
    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);
    }

    // method untuk menampilkan jumlah objek bangun datar
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}
/**
 * File : BangunDatar.java
 * Deskripsi : Class Parent untuk semua bangun datar
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

public class BangunDatar {
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
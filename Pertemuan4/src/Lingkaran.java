/**
 * File : Lingkaran.java
 * Deskripsi : Class untuk bangun datar lingkaran
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    // Atribut khusus untuk lingkaran
    private double jari;

    //method 
    // Konstruktor tanpa parameter
    public Lingkaran() {
        super();
        setJmlSisi(0); // Lingkaran direpresentasikan memiliki 0 sisi lurus
    }

    // Konstruktor dengan parameter
    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    // Getters and Setters

    //selektor untuk jari-jari
    public double getJari() {
        return jari;
    }

    //mutator untuk jari-jari
    public void setJari(double jari) {
        this.jari = jari;
    }

    // Menghitung luas lingkaran
    public double getLuas() {
        return Math.PI * jari * jari;
    }
    // Menghitung keliling lingkaran
    public double getKeliling() {
        return 2 * Math.PI * jari;
    }
    // Menanpilkan informasi lingkaran, override method printInfo dari BangunDatar
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
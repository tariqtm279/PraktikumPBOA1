/**
 * File : Lingkaran.java
 * Deskripsi : Class untuk bangun datar lingkaran
 * Nama : Arsy Thariq Munawar
 * Tanggal : 16 Maret 2026
 */

public class Lingkaran extends BangunDatar implements IResize {
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

    // Implementasi method dari interface IResize
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(int percent) {
        jari = jari * percent / 100.0;
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
/**
 * File : Persegi.java
 * Deskripsi : Class untuk bangun datar persegi
 * Nama : Arsy Thariq Munawar
 * Tanggal : 16 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    //atribut
    private double sisi;

    //method

    //konstruktor tanpa parameter
    public Persegi() {
        super();
        setJmlSisi(4);
    }

    //konstruktor dengan parameter
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    //getter and setter

    //selektor sisi
    public double getSisi() {
        return this.sisi;
    }

    //mutator sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    //mencari luas, keliling, dan diagonal

    //menghitung luas persegi
    public double getLuas() {
        return sisi * sisi;
    }

    //menghitung keliling persegi
    public double getKeliling() {
        return 4 * sisi;
    }

    //menghitung diagonal persegi
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    //mengimplementasikan method dari interface IResize
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(int percent) {
        sisi = sisi * percent / 100.0;
    }

    //method untuk menampilkan informasi persegi, override method printInfo dari class BangunDatar
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());         
        System.out.println("Keliling: " + getKeliling()); 
        System.out.println("Diagonal: " + getDiagonal());
    }
}
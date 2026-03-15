/**
 * File : Persegi.java
 * Deskripsi : Class untuk bangun datar persegi
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

public class Persegi extends BangunDatar {
    
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

    //method untuk menampilkan informasi persegi, override method printInfo dari class BangunDatar
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}
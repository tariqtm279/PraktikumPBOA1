/**
 * File        : Pengusaha.java
 * Deskripsi   : Class turunan Manusia untuk Pengusaha
 * Nama        : Arsy Thariq Munawar
 * Tanggal     : 16 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak {
    //atribut
    private String npwp;
    private static int counterPengusaha = 0;

    //konstruktor
    public Pengusaha() {
        super();
        counterPengusaha++;
    }

    //konstruktor
    public Pengusaha(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String npwp) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //method
    // Selector
    public String getNpwp() { 
        return npwp; 
    }
    public static int getCounterPengusaha() { 
        return counterPengusaha; 
    }

    // Mutator
    public void setNpwp(String npwp) { 
        this.npwp = npwp; 
    }

    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    // digit ke-13 NIM = 0, sehingga B = 0
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NPWP            : " + npwp);
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
    }
}
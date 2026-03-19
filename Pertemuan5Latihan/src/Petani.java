/**
 * File        : Petani.java
 * Deskripsi   : Class turunan Manusia untuk Petani
 * Nama        : Arsy Thariq Munawar
 * Tanggal     : 16 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak {
    //atribut 
    private String asal_kota;
    private static int counterPetani = 0;

    // Konstruktor
    public Petani() {
        super();
        counterPetani++;
    }

    // Konstruktor dengan semua parameter
    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //method 
    // Selector
    public String getAsalKota() { 
        return asal_kota; 
    }
    public static int getCounterPetani() { 
        return counterPetani; 
    }

    // Mutator
    public void setAsalKota(String asal_kota) { 
        this.asal_kota = asal_kota; 
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    // digit ke-12 NIM = 0, sehingga C = 0
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 0;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota       : " + asal_kota);
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
    }
}
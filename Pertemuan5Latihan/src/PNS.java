/**
 * File        : PNS.java
 * Deskripsi   : Class turunan Manusia untuk PNS
 * Nama        : Arsy Thariq Munawar
 * Tanggal     : 16 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak {
    //atribut
    private String nip;
    private static int counterPNS = 0;

    // Konstruktor
    public PNS() {
        super();
        counterPNS++;
    }

    // Konstruktor dengan alamat
    public PNS(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }
 
    // Konstruktor tanpa alamat
    public PNS(String nama, String tgl_mulai_kerja, double pendapatan, String nip) {
        super(nama, tgl_mulai_kerja, "Alamat belum diisi", pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    //method
    // Selector
    public String getNip() { 
        return nip; 
    }
    public static int getCounterPNS() { 
        return counterPNS; 
    }

    // Mutator
    public void setNip(String nip) { 
        this.nip = nip; 
    }

    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    // digit ke-14 NIM = 9, sehingga A = 9
    @Override
    public int hitungMasaKerja() {
        int tahun = Period.between(tgl_mulai_kerja, LocalDate.now()).getYears();
        return tahun + 9;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP             : " + nip);
        System.out.println("Pajak           : " + hitungPajak());
        System.out.println("Masa Kerja      : " + hitungMasaKerja());
    }
}
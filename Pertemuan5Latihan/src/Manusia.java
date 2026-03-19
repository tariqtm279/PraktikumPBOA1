/**
 * File        : Manusia.java
 * Deskripsi   : Abstract class sebagai parent PNS, Pengusaha, Petani
 * Nama        : Arsy Thariq Munawar
 * Tanggal     : 16 Maret 2026
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Manusia {
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia() {
        counterMns++;
    }

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tgl_mulai_kerja, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    // Selector
    public String getNama() { 
        return nama; 
    }
    public LocalDate getTglMulaiKerja() { 
        return tgl_mulai_kerja; 
    }
    public String getAlamat() { 
        return alamat; 
    }
    public double getPendapatan() { 
        return pendapatan; 
    }
    public static int getCounterMns() { 
        return counterMns; 
    }

    // Mutator
    public void setNama(String nama) { 
    this.nama = nama; }
    public void setTglMulaiKerja(LocalDate tgl_mulai_kerja) { 
        this.tgl_mulai_kerja = tgl_mulai_kerja; 
    }
    public void setAlamat(String alamat) { 
        this.alamat = alamat; 
    }
    public void setPendapatan(double pendapatan) { 
        this.pendapatan = pendapatan; 
    }

    public void cetakInfo() {
        System.out.println("Nama            : " + nama);
        System.out.println("Tgl Mulai Kerja : " + tgl_mulai_kerja);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Pendapatan      : " + pendapatan);
    }

    //method abstract untuk menghitung masa kerja
    public abstract int hitungMasaKerja();
}
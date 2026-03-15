
/**
 * File : Pegawai.java
 * Deskripsi : class parent (superclass) pegawai
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;

public abstract class Pegawai {

    //atribut
    protected String nip, nama;
    protected LocalDate tanggalLahir, tmt;
    protected int gajiPokok;

    //method

    //konstruktor
    public Pegawai(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = LocalDate.parse(tanggalLahir);
        this.tmt = LocalDate.parse(tmt);
        this.gajiPokok = gajiPokok;
    }

    //method untuk menghitung masa kerja
    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    //method untuk menghitung tanggal pensiun
    public String getIdDateFormat(LocalDate tanggal) {
        return tanggal.format(DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID")));
    }

    //method untuk menghitung tanggal pensiun
    public LocalDate getTanggalPensiun(int bup) {
        return tanggalLahir.plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    //method untuk format rupiah
    public String getCurrencyIdFormat(double number) {
        Locale loc = new Locale("id", "ID");
        NumberFormat idrFormatter = NumberFormat.getCurrencyInstance(loc);
        return idrFormatter.format(number).replace("Rp", "Rp ");
    }

    //method untuk menghitung tunjangan
    public abstract double getTunjangan();

    //method untuk print info
    public abstract void printInfo();
} // End of Pegawai class
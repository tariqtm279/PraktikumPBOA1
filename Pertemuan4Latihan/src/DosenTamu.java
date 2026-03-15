
/**
 * File : DosenTamu.java
 * Deskripsi : Class (Subclass) untuk Dosen tamu yang merupakan anak dari class Dosen
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    //atribut
    protected String nidk;
    protected LocalDate tanggalBerakhirKontrak;
    protected static double persenTunjangan = 2.5;

    //konstruktor
    public DosenTamu(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String fakultas, String nidk, String tanggalBerakhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
        this.tanggalBerakhirKontrak = LocalDate.parse(tanggalBerakhirKontrak);
    }

    //method untuk menghitung tunjangan
    public double getTunjangan() {
        return (persenTunjangan / 100) * gajiPokok;
    }

    //method untuk print info
    public void printInfo() {
        System.out.println("NIP: " + nip);
        System.out.println("NIDK: " + nidk);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + getIdDateFormat(tanggalLahir));
        System.out.println("TMT: " + getIdDateFormat(tmt));
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + fakultas);
        System.out.println(
                "Masa Kerja: " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan");
        System.out.println("Tanggal Berakhir Kontrak: " + getIdDateFormat(this.tanggalBerakhirKontrak));
        System.out.println("Gaji Pokok: " + getCurrencyIdFormat(gajiPokok));
        System.out.println("Tunjangan: " + persenTunjangan + "% x " +  getCurrencyIdFormat(gajiPokok)
                + " = " + getCurrencyIdFormat(getTunjangan()));
    }
} // End of DosenTamu class
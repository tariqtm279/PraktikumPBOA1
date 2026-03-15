/**
 * File : DosenTetap.java
 * Deskripsi : Class (Subclass) untuk dosen tetap yamg merupakan anak dari class Dosen
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

public class DosenTetap extends Dosen {
    //atribut
    protected String nidn;
    protected static int bup = 65;
    protected static double persenTunjangan = 2;

    //konstruktor
    public DosenTetap(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String fakultas, String nidn) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    //method untuk menghitung tunjangan
    public double getTunjangan() {
        return (persenTunjangan / 100) * getMasaKerja().getYears() * gajiPokok;
    }

    //method untuk print info
    public void printInfo() {
        System.out.println("NIP : " + nip);
        System.out.println("NIDN : " + nidn);
        System.out.println("Nama : " + nama);
        
        System.out.println("Tanggal Lahir : " + getIdDateFormat(tanggalLahir));
        System.out.println("TMT : " + getIdDateFormat(tmt));
        
        System.out.println("Jabatan : Dosen Tetap");
        
        System.out.println("Fakultas : " + fakultas);
        
        System.out.println("Masa Kerja : " + getMasaKerja().getYears() + " tahun " + getMasaKerja().getMonths() + " bulan");
        
        System.out.println("Tanggal Pensiun : " + getIdDateFormat(getTanggalPensiun(bup)));
        
        System.out.println("Gaji Pokok : " + getCurrencyIdFormat(gajiPokok));
        
        System.out.println("Tunjangan : " + (int)persenTunjangan + "% x " + getMasaKerja().getYears() + " x " + getCurrencyIdFormat(gajiPokok)
                + " = " + getCurrencyIdFormat(getTunjangan()));
    }
} // End of DosenTetap class
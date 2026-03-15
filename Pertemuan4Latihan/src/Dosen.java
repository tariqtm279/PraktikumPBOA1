/**
 * File : Dosen.java
 * Deskripsi : Class (Subclass) untuk Dosen extend ke class parent Pegawai
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

public abstract class Dosen extends Pegawai {
    //atribut
    protected String fakultas;

    //konstruktor
    public Dosen(String nip, String nama, String tanggalLahir, String tmt, int gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }
} // End of Dosen class
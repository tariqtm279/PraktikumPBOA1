/*
 * Nama File   : Datum.java
 * Deskripsi   : Kelas Datum sebagai kelas generik untuk menyimpan data dengan tipe yang fleksibel
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

public class Datum<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T isiBaru) {
        this.isi = isiBaru;
    }
}
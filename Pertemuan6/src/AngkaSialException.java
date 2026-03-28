/**
 * File         : AngkaSialException.java
 * Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13!
 * Pembuat      : Arsy Thariq Munawar 24060124120009
 * Tanggal      : 26 Maret 2026
 */

public class AngkaSialException extends Exception {
    public AngkaSialException() {
        super("Jangan memasukkan angka 13 karena angka sial !!!");
    }
}
/*
 * Nama File   : Data.java
 * Deskripsi   : Kelas Data sebagai implementasi larik generik untuk menyimpan berbagai jenis objek
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

public class Data<T> {
    // Atribut
    private Object[] ruang; // larik statik 100 elemen
    private int banyak;     // banyak elemen efektif

    // Konstruktor
    public Data() {
        ruang = new Object[100];
        banyak = 0;
    }

    // Prosedur setIsi: mengisi elemen pada posisi pos (1..100)
    public void setIsi(int pos, T objek) {
        if (pos >= 1 && pos <= 100) {
            ruang[pos - 1] = objek;
            // Hitung ulang banyak elemen efektif (elemen tidak null)
            banyak = 0;
            for (Object o : ruang) {
                if (o != null) banyak++;
            }
        } else {
            System.out.println("Posisi " + pos + " di luar jangkauan (1..100)!");
        }
    }

    // Fungsi getIsi: mengembalikan elemen pada posisi pos (1..100)
    @SuppressWarnings("unchecked")
    public T getIsi(int pos) {
        if (pos >= 1 && pos <= 100) {
            return (T) ruang[pos - 1];
        } else {
            System.out.println("Posisi " + pos + " di luar jangkauan (1..100)!");
            return null;
        }
    }

    // Fungsi getSize: mengembalikan banyak elemen efektif
    public int getSize() {
        return banyak;
    }
}
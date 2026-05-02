/*
 * Nama File   : Kembangtelon.java
 * Deskripsi   : Kelas Kembangtelon sebagai salah satu keturunan keluarga Kucing
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */
class Kembangtelon extends Kucing {

    Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    void suara() {
        System.out.println(nama + "berbunyi meong-meong");
    }

    @Override
    void gerak() {
        System.out.println(nama + "bergerak dengan melata");
    }
}
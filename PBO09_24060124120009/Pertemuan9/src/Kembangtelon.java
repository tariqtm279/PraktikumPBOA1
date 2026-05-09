/*
 * Nama File   : Kembangtelon.java
 * Deskripsi   : Kelas Kembangtelon sebagai salah satu keturunan keluarga Kucing
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */
class Kembangtelon extends Kucing {

    Kembangtelon(String panggilan, double bobot) {
        super(panggilan, bobot);
    }

    @Override
    void suara() {
        System.out.println(panggilan + " berbunyi meong-meong");
    }

    @Override
    void gerak() {
        System.out.println(panggilan + " bergerak dengan melata");
    }
}
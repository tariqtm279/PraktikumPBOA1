/*
 * Nama File   : Kucing.java
 * Deskripsi   : Kelas Kucing sebagai salah satu keturunan keluarga Anabul
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

class Kucing extends Anabul {
    //atribut
    double bobot; // dalam kg

    //Konstruktor
    Kucing(String nama, double bobot){
        super(nama);
        this.bobot = bobot;
    }
    //method
    public double getBobot() {
        return this.bobot;
    }

    @Override
    void gerak (){
        System.out.println(nama + "bergerak dengan melata");
    }
    @Override
    void suara(){
        System.out.println(nama + "berbunyi meong");
    }

}
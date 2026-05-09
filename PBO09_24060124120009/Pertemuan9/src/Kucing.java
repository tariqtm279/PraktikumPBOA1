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
    Kucing(String panggilan, double bobot){
        super(panggilan);
        this.bobot = bobot;
    }
    //method
    public double getBobot() {
        return this.bobot;
    }

    @Override
    void gerak (){
        System.out.println(panggilan + " bergerak dengan melata");
    }
    @Override
    void suara(){
        System.out.println(panggilan + " berbunyi meong");
    }

}
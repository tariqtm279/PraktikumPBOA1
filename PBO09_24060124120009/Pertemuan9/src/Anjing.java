/*
 * Nama File   : Anjing.java
 * Deskripsi   : Kelas Anjing sebagai salah satu keturunan keluarga Anabul
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

class Anjing extends Anabul {
    //atribut
    double bobot; // dalam kg

    //Konstruktor
    Anjing(String panggilan, double bobot){
        super(panggilan);
        this.bobot = bobot;
    }

    //method
    public double getBobot() {
        return this.bobot;
    }

    @Override
    void gerak (){
        System.out.println(panggilan + " bergerak dengan berlari");
    }

    @Override
    void suara(){
        System.out.println(panggilan + " bersuara guk-guk");
    }

}
/*
 * Nama File   : Burung.java
 * Deskripsi   : Kelas Burung sebagai salah satu keturunan keluarga Anabul
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

class Burung extends Anabul {
    //atribut
    double bobot; // dalam kg

    //Konstruktor
    Burung(String panggilan, double bobot){
        super(panggilan);
        this.bobot = bobot;
    }

    //method
    @Override
    void gerak (){
        System.out.println(panggilan + " bergerak dengan terbang");
    }

    //method 
    @Override
    void suara(){
        System.out.println(panggilan + " berbunyi cuit");
    }

}
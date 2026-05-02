/*
 * Nama File   : Anjing.java
 * Deskripsi   : Kelas Anjing sebagai salah satu keturunan keluarga Anabul
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

class Anjing extends Anabul {
    //Konstruktor
    Anjing(String nama){
        super(nama);
    }

    //method
    @Override
    void gerak (){
        System.out.println(nama + "bergerak dengan melata");
    }
    @Override
    void suara(){
        System.out.println(nama + "bersuara guk-guk");
    }

}
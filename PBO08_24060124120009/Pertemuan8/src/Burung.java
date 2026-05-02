/*
 * Nama File   : Burung.java
 * Deskripsi   : Kelas Burung sebagai salah satu keturunan keluarga Anabul
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

class Burung extends Anabul {
    //Konstruktor
    Burung(String nama){
        super(nama);
    }

    //method
    @Override
    void gerak (){
        System.out.println(nama + "bergerak dengan terbang");
    }

    //method 
    @Override
    void suara(){
        System.out.println(nama + "berbunyi cuit");
    }

}
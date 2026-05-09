/*
 * Nama File   : Anabul.java
 * Deskripsi   : Kelas Anabul sebagai kelas induk untuk keluarga hewan peliharaan (kucing, anjing, burung)
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */
abstract class Anabul {
    //atribut 
    String panggilan;


    //konstruktor
    Anabul(String panggilan){
        this.panggilan = panggilan;
    }

    //method
    abstract void gerak();

    //method suara
    abstract void suara();

    void getNama(){
        System.out.println("Nama panggilan hewan: " + this.panggilan);
    }

    void setNama(String panggilan){
        this.panggilan = panggilan;
    }
}
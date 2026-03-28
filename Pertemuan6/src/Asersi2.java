/**
 * File         : Asersi2.java
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input
 * jari-jari lingkaran yang bernilai nol
 * Pembuat      : Arsy Thariq Munawar 24060124120009
 * Tanggal      : 26 Maret 2026
 */


class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2{
    public static void main(String[] args){
        /**
         * PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
            Jelaskan pada lembar laporan praktikum!
         */

        /**
         * 
            Penggunaan assert di program Asersi2 kurang tepat, karena assert sebenarnya hanya digunakan untuk debugging,
            bukan untuk validasi input. Soalnya, assert bisa dinonaktifkan saat program dijalankan tanpa -enableassertions, 
            sehingga kondisi jariJari > 0 tidak selalu diperiksa. Akibatnya, nilai jari-jari yang tidak valid masih bisa diproses oleh program.
            Seharusnya, validasi kayak seperti ini memakai if dan exception biar pengecekan selalu dilakukan.

         */
        double jariJari = 0;
        assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);


        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
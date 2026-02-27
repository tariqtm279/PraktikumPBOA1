/*
 * Nama File   : MTitik.java
 * Deskripsi   : berisi aplikasi method dalam class Titik
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 23 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {

        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        T1.setAbsis(3); //Mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        T1.printTitik(); // Mencetak koordinat T1 ke layar
        T1.geser(2, 1); // menggeser T1 sejauh (2,1)
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        Titik T2 = new Titik(3, 5); //Membuat objek titik T2 (3,5)
        Titik T3 = new Titik(-3, 5); //Membuat objek titik T3 (-3,5)
        Titik T4 = new Titik(-3, -5); //Membuat objek titik T4 (-3,-5)
        Titik T5 = new Titik(3, -5); //Membuat objek titik T5 (3,-5)
        Titik T6 = new Titik(0, 0); //Membuat objek titik T6 (0,0)

        //Menampilkan jumlah objek Titik
        System.out.println("Jumlah objek Titik = " + Titik.getCounterTitik());
        //Menampilkan absis T2
        System.out.println("Absis T2 = " + T2.getAbsis());
        //Menampilkan ordinat T2
        System.out.println("Ordinat T2 = " + T2.getOrdinat());

        // Menampilkan kuadran titik T2,T3,T4,T5,T6
        System.out.println("Kuadran T2 = " + T2.getKuadran());
        System.out.println("Kuadran T3 = " + T3.getKuadran());
        System.out.println("Kuadran T4 = " + T4.getKuadran());
        System.out.println("Kuadran T5 = " + T5.getKuadran());
        System.out.println("Kuadran T6 = " + T6.getKuadran());

        // Menampilkan jarak T2 ke pusat
        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat());
        // Menampilkan jarak T2 ke T4
        System.out.println("Jarak T2 ke T4 = " + T2.getJarak(T4));

        // Membuat objek titik T7 (3,4)
        Titik T7 = new Titik(3, 4);
        // Mencetak koordinat T7
        T7.printTitik();
        // Merefleksikan T7 terhadap sumbu X
        T7.refleksiX();
        System.out.println("Titik T7 setelah refleksi X : " );T7.printTitik();

        // Membuat objek titik T8 (3,6)
        Titik T8 = new Titik(3, 6);
        // Mencetak koordinat T8
        T8.printTitik();
        // Merefleksikan T8 terhadap sumbu Y
        T8.refleksiY();
        System.out.println("Titik T8 setelah refleksi Y " );T8.printTitik();

        // Membuat objek titik T9 (3,8)
        Titik T9  = new Titik(3, 8);
        // Menyimpan objek titik T9 yang di-refleksikan terhadap sumbu X
        Titik T10 = T9.getRefleksiX();
        T9.printTitik(); //Titik T9 tidak berubah
        System.out.println("Titik T10 hasil refleksi X T9 "); T10.printTitik();

        Titik T11 = new Titik(3, 2);
        Titik T12 = T11.getRefleksiY();
        T11.printTitik(); //Titik T11 tidak berubah
        System.out.println("Titik T12 hasil refleksi Y T11 ");T12.printTitik();
    }
}
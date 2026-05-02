/*
 * Nama File   : MainData.java
 * Deskripsi   : Kelas MainData untuk menguji kelas Data dengan tipe Anabul dan Integer
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

public class MainData {
    public static void main(String[] args) {

        // (a) Data berisi Integer
        System.out.println("Data<Integer>");
        Data<Integer> dataInt = new Data<>();
        dataInt.setIsi(1, 10);
        dataInt.setIsi(2, 20);
        dataInt.setIsi(3, 30);
        System.out.println("getIsi(1) = " + dataInt.getIsi(1));
        System.out.println("getIsi(2) = " + dataInt.getIsi(2));
        System.out.println("getIsi(3) = " + dataInt.getIsi(3));
        System.out.println("getSize() = " + dataInt.getSize());

        System.out.println();

        // (b) setIsi untuk keluarga Anabul
        System.out.println("Data<Anabul> : setIsi");
        Data<Anabul> dataAnabul = new Data<>();
        dataAnabul.setIsi(1, new Kucing("Kitty", 3.5));
        dataAnabul.setIsi(2, new Anjing("Doggy"));
        dataAnabul.setIsi(3, new Burung("Tweety"));
        dataAnabul.setIsi(4, new Anggora("Persian", 4.2));
        dataAnabul.setIsi(5, new Kembangtelon("Kembang", 3.8));
        System.out.println("5 Anabul berhasil dimasukkan ke dalam Data.");

        System.out.println();

        // (c) getIsi untuk keluarga Anabul
        System.out.println("Data<Anabul> : getIsi");
        for (int i = 1; i <= 5; i++) {
            Anabul a = dataAnabul.getIsi(i);
            System.out.print("Posisi " + i + " -> " + a.nama + " : ");
            a.suara();
        }

        System.out.println();

        // Uji posisi di luar jangkauan
        System.out.println("Uji posisi tidak valid");
        dataAnabul.setIsi(0, new Anjing("Error"));
        dataAnabul.getIsi(101);

        System.out.println();

        // (d) getSize untuk keluarga Anabul
        System.out.println("Data<Anabul> : getSize");
        System.out.println("Jumlah elemen efektif: " + dataAnabul.getSize());

        // Tambah elemen baru lalu cek size lagi
        dataAnabul.setIsi(6, new Kucing("Tom", 5.0));
        System.out.println("Setelah tambah 1 elemen, getSize() = " + dataAnabul.getSize());

        System.out.println();

        // Tampilkan gerak semua anabul
        System.out.println("Semua Anabul bergerak");
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            Anabul a = dataAnabul.getIsi(i);
            a.gerak();
        }
    }
}
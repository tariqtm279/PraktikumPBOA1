/*
 * Nama File   : MainOperatorGenerik.java
 * Deskripsi   : Kelas MainOperatorGenerik untuk menguji kelas OperatorGenerik dengan berbagai tipe data (Integer, String, Anabul, Kucing)
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */
public class MainOperatorGenerik {
    public static void main(String[] args) {

        // (b) Tukar sesama Integer
        System.out.println("Tukar Integer");
        Ref<Integer> intA = new Ref<>(3);
        Ref<Integer> intB = new Ref<>(6);
        System.out.println("Sebelum : a=" + intA.val + ", b=" + intB.val);
        OperatorGenerik.tukar(intA, intB);
        System.out.println("Sesudah : a=" + intA.val + ", b=" + intB.val);

        System.out.println();

        // (b) Tukar sesama String
        System.out.println("Tukar String");
        Ref<String> strA = new Ref<>("Halo");
        Ref<String> strB = new Ref<>("Dunia");
        System.out.println("Sebelum : a=" + strA.val + ", b=" + strB.val);
        OperatorGenerik.tukar(strA, strB);
        System.out.println("Sesudah : a=" + strA.val + ", b=" + strB.val);

        System.out.println();

        // (b) Tukar sesama keluarga Anabul
        System.out.println("Tukar Anabul (Anjing <-> Burung)");
        Ref<Anabul> animalA = new Ref<>(new Anjing("Doggy"));
        Ref<Anabul> animalB = new Ref<>(new Burung("Tweety"));
        System.out.println("Sebelum : a=" + animalA.val.nama + " (Anjing), b=" + animalB.val.nama + " (Burung)");
        OperatorGenerik.tukar(animalA, animalB);
        System.out.println("Sesudah : a=" + animalA.val.nama + " (Burung), b=" + animalB.val.nama + " (Anjing)");
        animalA.val.suara();
        animalB.val.suara();

        System.out.println();

        // (c) Fungsi Bobot2 - dua keturunan Kucing
        System.out.println("Fungsi Bobot2");
        Anggora anggora = new Anggora("Persian", 4.5);
        Kembangtelon kembang = new Kembangtelon("Kembang", 3.8);
        double totalBobot = OperatorGenerik.Bobot2(anggora, kembang);
        System.out.println("Bobot " + anggora.nama + " (Anggora) : " + anggora.getBobot() + " kg");
        System.out.println("Bobot " + kembang.nama + " (Kembangtelon): " + kembang.getBobot() + " kg");
        System.out.println("Total bobot (Bobot2) : " + totalBobot + " kg");

        System.out.println();

        // Bobot2 dengan dua Kucing biasa
        Kucing kucing1 = new Kucing("Kitty", 3.2);
        Kucing kucing2 = new Kucing("Tom", 5.0);
        System.out.println("Bobot " + kucing1.nama + " : " + kucing1.getBobot() + " kg");
        System.out.println("Bobot " + kucing2.nama + " : " + kucing2.getBobot() + " kg");
        System.out.println("Total bobot (Bobot2) : " + OperatorGenerik.Bobot2(kucing1, kucing2) + " kg");
    }
}
/*
 * Nama File   : OperatorGenerik.java
 * Deskripsi   : Kelas OperatorGenerik sebagai kelas yang berisi metode generik untuk operasi pada tipe data generik
 * Pembuat     : Arsy Thariq Munawar
 * Tanggal     : 27 April 2026
 */

class Ref<T>{
    public T val;
    public Ref(T val){
        this.val = val;
    }
}

public class OperatorGenerik {
    public static <T> void tukar(Ref<T> a, Ref<T> b){
        T temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

    public static <T extends Kucing, U extends Kucing> double Bobot2(T a, U b){
        return a.getBobot() + b.getBobot();
    }
}
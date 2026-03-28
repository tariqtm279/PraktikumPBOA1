/**
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 * Pengenalan klausa 'throw' dan 'throws'
 * Pembuat   : Arsy Thariq Munawar 24060124120009
 * Tanggal   : 26 Maret 2026
 * */
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException(); 
        }
        /**
        *PERTANYAAN: *Ketika eksepsi terjadi, 
        apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
        */

        /**
        *JAWABAN: Tidak, karena saat angka 13 dimasukkan, program akan melempar AngkaSialException, 
        *sehingga eksekusi akan langsung lompat ke blok catch, dan baris 12 tidak akan dieksekusi. 
        *Jadi, pesan "13 bukan angka sial" tidak akan pernah muncul di output ketika angka 13 dimasukkan.
        */
        System.out.println(angka + " bukan angka sial"); //baris ke 12 yang dinyatakan dalam modul
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
            
        } catch (AngkaSialException ase) { //baris ke 21 yang dinyatakan dalam modul
        /**
         * PERTANYAAN:*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
         */

        /**
         * JAWABAN: YA, exception dari cobaAngka(13) akan ditangkap oleh catch (AngkaSialException ase), sehingga baris 21 akan dieksekusi.
         * urutanyannya adalah:
         * 1. cobaAngka(10) dieksekusi, tidak terjadi exception
         * 2. cobaAngka(13) dieksekusi, terjadi AngkaSialException, langsung lompat ke catch
         * 3. cobaAngka(12) tidak dieksekusi karena eksekusi sudah lompat ke catch
        */

            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
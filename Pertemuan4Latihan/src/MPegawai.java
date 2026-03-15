/**
 * File : MPegawai.java
 * Deskripsi : Class main untuk menjalankan semua class
 * Nama : Arsy Thariq Munawar
 * Tanggal : 9 Maret 2026
 */

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", 
        "1990-05-05", "2015-01-01", 5000000, " Fakultas Sains dan Matematika", "78647324");
        dosenTetap.printInfo();  
        System.out.println();

        DosenTamu dmu = new DosenTamu(
            "9900112233", 
            "Budi Santoso, M.T.", 
            "1985-10-10", 
            "2023-01-01", 
            4500000, 
            "Teknik", 
            "NIDK8899", 
            "2026-12-31"
        );
        dmu.printInfo();
        System.out.println();

        Tendik td = new Tendik(
            "198012122005011002", 
            "Siti Aminah", 
            "1980-12-12", 
            "2005-01-01", 
            4000000, 
            Tendik.typeBidang.AKADEMIK
        );
        td.printInfo();
    }
} // End of MPegawai class  
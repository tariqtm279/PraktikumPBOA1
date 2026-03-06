public class MDosen {
    public static void main(String[] args) {
        //membuat objek dosen1 dan dosen2
        Dosen dosen1 = new Dosen("123456789", "Arsyad", "Informatika");
        Dosen dosen2 = new Dosen();

        //Menampilkan data dosen1
        System.out.println("Data Dosen 1:");
        dosen1.printDosen();

        //Mengubah data dosen2 
        System.out.println("\nData Dosen 2:");
        dosen2.printDosen();

        //Mengubah data dosen2 menggunakan mutator NIP, Nama, dan Prodi
        dosen2.setNIP("1987654321");
        dosen2.setNama("Prof. Joko Widodo");
        dosen2.setProdi("Ilmu Kehutanan");

        //Menampilkan data dosen2 setelah diubah
        System.out.println("\nData Dosen 2 (after):");
        dosen2.printDosen();

        //mengambil NIP dosen1
        System.out.println("\nNIP Dosen 1: " + dosen1.getNIP());
        //Mengambil Nama dosen1
        System.out.println("Nama Dosen 1: " + dosen1.getNama());
        //Mengambil Prodi dosen1
        System.out.println("Prodi Dosen 1: " + dosen1.getProdi());
    }
}//end class MDosen
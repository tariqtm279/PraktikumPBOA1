public class MMataKuliah{
    public static void main(String[] args) {
        //membuat objek matkul1 dan matkul2
        MataKuliah matkul1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah matkul2 = new MataKuliah();

        //Menampilkan data matkul1
        System.out.println("Data Mata Kuliah 1:");
        matkul1.printMatkul();

        //Menamppilkan data matkul2
        System.out.println("\nData Mata Kuliah 2:");
        matkul2.printMatkul();

        //Mengubah idMatkul matkul2
        matkul2.setIdMatkul("IF102");
        matkul2.setNama("Metode Numerik");
        matkul2.setSks(3);

        //Menampilkan data matkul2 setelah diubah
        System.out.println("\nData Mata Kuliah 2:");
        matkul2.printMatkul();

        //Mengambil idMatkul matkul1
        System.out.println("\nidMatkul matkul1: " + matkul1.getIdMatkul());
        //Mengambil nama matkul matkul1
        System.out.println("\nNama mata kuliah matkul1: " + matkul1.getNama());
        //Mengambil SKS matkul1
        System.out.println("\nNilai SKS matkul1: " + matkul1.getSks());
    }
}
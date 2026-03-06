public class MMahasiswa {
    public static void main(String[] args) {
        // Membuat objek MataKuliah, Mahasiswa, Dosen, dan Kendaraan
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("009", "Uus", "Informatika");
        Dosen D1 = new Dosen("123", "Aeng", "Informatika");
        Kendaraan K1 = new Kendaraan("699", "Yamaha");

        // Mengatur dosen wali M1
        M1.setDosenWali(D1);
        // Mengatur kendaraan M1
        M1.setKendaraan(K1);
        // Menambahkan mata kuliah yang diambil oleh M1
        M1.addMatkul(PBO);
        // Menambahkan mata kuliah yang diambil oleh M1
        M1.addMatkul(MBD);
        // Menampilkan data mahasiswa M1
        M1.printDetailMhs();
        // Menampilkan jumlah mata kuliah yang diambil oleh M1
        System.out.println("Jumlah Mata Kuliah = " + M1.getJumlahMatkul());
        // Menampilkan jumlah SKS yang diambil oleh M1
        System.out.println("Jumlah SKS = " + M1.getJumlahSKS());

    }
}
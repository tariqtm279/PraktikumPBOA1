class MainCivitasAkademika {
    public static void main(String[] args) {

        //objek dosen
        Dosen dosen1 = new Dosen("Ir. Joko", "12345");
        Dosen dosen2 = new Dosen("Ir. Widodo", "67890");

        //objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Arsy", "001");
        Mahasiswa mhs2 = new Mahasiswa("Thariq", "002");
        Mahasiswa mhs3 = new Mahasiswa("Munawar", "003");
        Mahasiswa mhs4 = new Mahasiswa("Gentara", "004");
        Mahasiswa mhs5 = new Mahasiswa("Karsa", "005");

        //set dosen wali
        mhs1.setWali(dosen1);
        mhs2.setWali(dosen1);
        mhs3.setWali(dosen2);
        mhs4.setWali(dosen2);
        mhs5.setWali(dosen2);

        //objek seminar
        Seminar seminar = new Seminar();

        //registrasi peserta seminar
        seminar.registrasi(dosen1);
        seminar.registrasi(dosen2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);

        //tampil peserta seminar
        seminar.tampilPeserta();

        //tampil jumlah peserta
        System.out.println("\nJumlah Peserta: " + seminar.countPeserta());
        
        //tampil jumlah mahasiswa
        System.out.println("\nJumlah Mahasiswa: " + seminar.countMahasiswa());

        //tampil data mahasiswa
        System.out.println("\nData Mahasiswa:");
        mhs1.tampilDataMahasiswa();

    }
}
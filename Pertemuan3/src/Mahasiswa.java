import java.util.ArrayList;

public class Mahasiswa {

    // Atribut
    private String nim, nama, prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    
    // Konstruktor dengan parameter
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this("", "", "");
    }

    // Selektor untuk NIM
    public String getNIM() {
        return this.nim;
    }

    // Selektor untuk Nama
    public String getNama() {
        return this.nama;
    }

    // Selektor untuk Prodi
    public String getProdi() {
        return this.prodi;
    }

    // Mutator untuk NIM
    public void setNIM(String newNIM) {
        this.nim = newNIM;
    }

    // Mutator untuk Nama
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    // Mutator untuk Prodi
    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }

    // Method untuk menambahkan mata kuliah ke dalam listMatkul
    public void addMatkul(MataKuliah newMatkul) {
        listMatkul.add(newMatkul);
    }

    // Method untuk menghitung jumlah SKS yang diambil oleh mahasiswa
    public int getJumlahSKS() {
        int i;
        int jumlahSks = 0;
        for (i = 0; i < listMatkul.size(); i++) {
            jumlahSks += listMatkul.get(i).getSks();
        }

        return jumlahSks;
    }

    // Method untuk menghitung jumlah mata kuliah yang diambil oleh mahasiswa
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    // Mutator untuk Dosen Wali
    public void setDosenWali(Dosen newDosenWali) {
        this.dosenWali = newDosenWali;
    }

    // Mutator untuk Kendaraan
    public void setKendaraan(Kendaraan newKendaraan) {
        this.kendaraan = newKendaraan;
    }

    // Method untuk menampilkan data mahasiswa
    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }

    // Method untuk menampilkan detail data mahasiswa
    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Nama Dosen Wali: " + dosenWali.getNama());

        int i;
        for (i = 0; i < listMatkul.size(); i++) {
            System.out.println("Nama Mata Kuliah ke-" + (i + 1) + ": " + listMatkul.get(i).getNama());
        }

        System.out.println("No Plat: " + kendaraan.getNoPlat());
    }
}
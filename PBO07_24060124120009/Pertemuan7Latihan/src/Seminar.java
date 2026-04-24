public class Seminar{

    //atribut
    private CivitasAkademika[] peserta = new CivitasAkademika[100];
    private int banyakPeserta;

    public Seminar(){
        this.banyakPeserta = 0;
    }

    public int countPeserta() {
        return banyakPeserta;
    }

    public void registrasi(CivitasAkademika pesertaBaru) {
        if (banyakPeserta < peserta.length) {
            peserta[banyakPeserta] = pesertaBaru;
            banyakPeserta++;
        } else {
            System.out.println("Kapasitas seminar sudah penuh.");
        }
    }

    public void tampilPeserta() {
        System.out.println("\nDaftar Peserta Seminar:");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println((i + 1) + ". " + peserta[i].getNomor() + " - " + peserta[i].getNama());
        }
    }
    
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }

}
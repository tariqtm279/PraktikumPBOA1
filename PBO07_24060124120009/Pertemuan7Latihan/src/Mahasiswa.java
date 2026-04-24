public class Mahasiswa extends CivitasAkademika{

    private String NIM;
    private Dosen dosenWali;

    public Mahasiswa(String nama, String NIM){
        super(nama);
        this.NIM = NIM;
    }

    public void setWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    @Override
    public String getNomor() {
        return NIM;
    } 

    public void tampilDataMahasiswa() {
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNomor());
        if (dosenWali != null) {
            System.out.println("Dosen Wali: " + dosenWali.getNama());
        } else {
            System.out.println("Dosen Wali: Belum ditentukan");
        }
    }

}
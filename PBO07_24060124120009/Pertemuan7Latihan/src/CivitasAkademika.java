public abstract class CivitasAkademika {
    //atribut
    protected String nama;

    //method
    public CivitasAkademika(String nama) {
        this.nama = nama;
    }

    public abstract String getNomor();
    public String getNama() {
        return nama;
    }
}
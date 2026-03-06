public class Dosen {
    //Atribut
    private String NIP;
    private String Nama;
    private String Prodi;

    //Method
    //Konstruktor dosen tanpa parameter set default kosong
    public Dosen(){
        this("", "", "");
    }

    //Konstruktor dosen dengan parameter
    public Dosen(String NIP, String Nama, String Prodi){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Prodi = Prodi;
    }

    //Selektor NIP Dosen
    public String getNIP(){
        return NIP;
    }

    //Selektor Nama Dosen
    public String getNama(){
        return Nama;
    }

    //Selektor Prodi Dosen
    public String getProdi(){
        return Prodi;
    }

    //Mutator NIP Dosen
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //Mutator Nama Dosen
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    //Mutator Prodi Dosen
    public void setProdi(String Prodi){
        this.Prodi = Prodi;
    }

    //Method untuk menampilkan data dosen
    public void printDosen(){
        System.out.println("NIP : " + NIP);
        System.out.println("Nama : " + Nama);
        System.out.println("Prodi : " + Prodi);
    }

} //end class Dosen

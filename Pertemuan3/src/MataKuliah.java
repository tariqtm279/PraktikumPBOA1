public class MataKuliah{

    //atribut
    private String idMatkul;
    private String nama;
    private int sks;


    //method

    //konstruktor mata kuliah tanpa parameter set default id, nama kosong dan sks 0
    public MataKuliah(){
        this("", "", 0);
    }

    //konstruktor mata kuliah dengan parameter
    public MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    //selektor id matakuliah
    public String getIdMatkul(){
        return idMatkul;
    }

    //selektor nama matakuliah
    public String getNama(){
        return nama;
    }

    //selektor sks matakuliah
    public int getSks(){
        return sks;
    }

    //mutator id matakuliah
    public void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    //mutator nama matakuliah
    public void setNama(String nama){
        this.nama = nama;
    }

    //mutator sks matakuliah
    public void setSks(int sks){
        this.sks = sks;
    }

    //method untuk menampilkan data mata kuliah
    public void printMatkul(){
        System.out.println("Nama mata kuliah : " + nama );
        System.out.println("ID mata kuliah : " + idMatkul );
        System.out.println("Jumlah SKS : " + sks );
    }

}
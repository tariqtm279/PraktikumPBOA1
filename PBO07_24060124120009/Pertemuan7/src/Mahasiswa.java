class Mahasiswa {
    // Atribut
    public String NIM, nama, Programstudi;

    //Method

    // Konstruktor
    Mahasiswa(){
        this("-999", "n/a", "n/a");
    }

    //Konstruktor dengan parameter
    Mahasiswa(String NIM, String nama, String Programstudi){
        this.NIM = NIM;
        this.nama = nama;
        this.Programstudi = Programstudi;
    }

    //Method setProgramstudi
    void setProgramstudi(){
        this.Programstudi = "Kosong";
    }

    void setProgramstudi(String Programstudi){
        this.Programstudi = Programstudi;
    }

    void setProgramstudi(Mahasiswa m){
        this.NIM = m.NIM;
        this.nama = m.nama;
        this.Programstudi = m.Programstudi;
    }

    //Method printInfo
    void printInfo(){
        System.out.println("NIM = " + NIM);
        System.out.println("Nama = " + nama);
        System.out.println("Program Studi = " + Programstudi);
    }
}
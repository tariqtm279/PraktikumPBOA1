public class Kendaraan{
    //atribut
    private String noPlat;
    private String jenis;


    //method
    //konstruktor kendaraan tanpa parameter set default kosong
    public Kendaraan(){
        this("","");
    }

    //konstruktor kendaraan dengan parameter
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    //selektor noPlat kendaraan
    public String getNoPlat(){
        return noPlat;
    }

    //selektor jenis kendaraan
    public String getJenis(){
        return jenis;
    }   

    //Mutator noPlat kendaraan dengan masukkan
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    //Mutator jenis kendaraan dengan masukkan
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void printKendaraan(){
        System.out.println("No Plat : " + noPlat);
        System.out.println("Jenis : " + jenis);
    }
}//end class Kendaraan
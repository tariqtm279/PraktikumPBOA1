public class MKendaraan{
    public static void main(String[] args){
    
        //membuat objek kendaraan1 dan kendaraan2
        Kendaraan kendaraan1 = new Kendaraan("B 1234 ABD", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan();

        //Menampilkan data kendaraan1
        System.out.println("Data Kendaraan 1:");
        kendaraan1.printKendaraan();

        //Menampilkan data kendaraan2
        System.out.println("\nData Kendaraan 2:");
        kendaraan2.printKendaraan();

        //Mengubah data kendaraan2 menggunakan mutator noPlat dan jenis
        kendaraan2.setNoPlat("D 5678 XYZ");
        kendaraan2.setJenis("Motor");

        //Menampilkan data kendaraan2 setelah diubah
        System.out.println("\nData Kendaraan 2 (after):");
        kendaraan2.printKendaraan();

        //Mengambil noPlat kendaraan1
        System.out.println("\nNo Plat Kendaraan 1: " + kendaraan1.getNoPlat());
        //Mengambil jenis kendaraan1
        System.out.println("Jenis Kendaraan 1: " + kendaraan1.getJenis());

    }
}//end class MKendaraan
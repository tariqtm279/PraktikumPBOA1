    /* Nama File    : Garis.java
    * Deskripsi    : berisi atribut dan method dalam class Garis
    * Pembuat      : Arsy Thariq Munawar
    * Tanggal      : 23 Februari 2026
    */


public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;

    private static int counterGaris = 0;

        // menginisialisasi titik awal dengan (0,0) dan titik akhir dengan (1,1)
    public Garis(){
        this(new Titik(), new Titik(1,1));
    }

    // menginisialisasi titik awal dan akhir dengan parameter masukan
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    // Mengembalikan titik awal dari garis 
    public Titik getTitikAwal() {
        return titikAwal;
    }

    // Mengembalikan titik akhir dari garis
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    // Mengeset titik awal dengan nilai baru titikAwal
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    // Mengeset titik akhir dengan nilai baru titikAkhir
    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Mengembalikan jumlah objek Garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }

    // Mengembalikan panjang dari suatu garis G
    public double panjangGaris(){
        double selisihAbsis = (titikAkhir.getAbsis() - titikAwal.getAbsis()); //double selisihAbsis = (titikAkhir.absis - titikAwal.absis);
        double selisihOrdinat = (titikAkhir.getOrdinat() - titikAwal.getOrdinat()); //double selisihOrdinat = (titikAkhir.ordinat - titikAwal.ordinat);
        return Math.sqrt((selisihAbsis * selisihAbsis) + (selisihOrdinat * selisihOrdinat));
    }

    // Mengembalikan gradien dari suatu garis G
    public double gradien(){
        return (titikAkhir.getOrdinat() - titikAwal.getOrdinat()) / (titikAkhir.getAbsis() - titikAwal.getAbsis()); //return (titikAkhir.ordinat - titikAwal.ordinat) / (titikAkhir.absis - titikAwal.absis);
    }

    // Mendapatkan titik tengah dari garis G
    public Titik titikTengah(){
        return new Titik ((titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2, (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2);
    }

    //Mengecek apakah dua garis G1 dan G2 sejajar
    public boolean isSejajar(Garis G){
        return this.gradien() == G.gradien();
    }

    //Mengecek apakah dua garis G1 dan G2 tegak lurus
    public boolean isTegakLurus(Garis G){
        return this.gradien() * G.gradien() == -1;
    }

    //Menampilkan titik awal dan akhir garis
    public void printGaris(){
        System.out.println("Titik awal dan Akhir Garis = (" + this.titikAwal.getAbsis() + ", " + this.titikAwal.getOrdinat() + ") dan (" + this.titikAkhir.getAbsis() + ", " + this.titikAkhir.getOrdinat() + ")");
    }

    //Membuat dan Menampilkan persamaan garis
    public void persamaanGaris(){
        double grad = this.gradien();
        double c = this.titikAwal.getOrdinat() - (grad * this.titikAwal.getAbsis()); 
        System.out.println("y = " + grad + "x + " + c);
    }

}



/* Nama File    : Titik.java
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Arsy Thariq Munawar
 * Tanggal      : 23 Februari 2026
 */


public class Titik {
    /*************** ATRIBUT ***************/
    private double absis;
    private double ordinat;
    private static int counterTitik = 0;

    /****************METHOD****************/
    // Konstruktor untuk membuat titik (0,0)
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // Konstruktor default yang membuat titik di koordinat (0,0)
    public Titik() {
        this(0,0);
    }

    // Mengembalikan jumlah objek Titik yang telah dibuat
    public static int getCounterTitik() {
        return counterTitik;
    }

    // Mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    // Mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    // Mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    // Menggeser nilai absis dan ordinat sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // Mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    // Mencetak jumlah objek Titik yang telah dibuat
    public static void printCounterTitik() {
        System.out.println(counterTitik);
    }

    // Mengembalikan kuadran dari titik (1, 2, 3, atau 4), 0 jika di titik asal
    public int getKuadran(){
        if (absis == 0 && ordinat == 0){
            return 0;
        }

        if (ordinat > 0){
            if (absis > 0){
                return 1;
            } else{
                // absis < 0
                return 2;
            }
        } else{
            // ordinat < 0
            if (absis > 0) {
                return 4;
            } else {
                // absis < 0
                return 3;
            }
        }
    }

    // Mengembalikan jarak titik ini ke titik pusat (0,0)
    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Mengembalikan jarak titik ini ke titik T yang diberikan sebagai parameter
    public double getJarak(Titik T) {
        double deltaX = this.absis - T.absis;
        double deltaY = this.ordinat - T.ordinat;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    // Merefleksikan titik terhadap sumbu X (ordinat menjadi negatifnya)
    public void refleksiX() {
        ordinat = -ordinat;
    }

    // Merefleksikan titik terhadap sumbu Y (absis menjadi negatifnya)
    public void refleksiY() {
        absis = -absis;
    }

    // Mengembalikan objek Titik baru hasil refleksi titik ini terhadap sumbu X
    public Titik getRefleksiX() {
        return new Titik(absis, -ordinat);
    }

    // Mengembalikan objek Titik baru hasil refleksi titik ini terhadap sumbu Y    // Mengembalikan objek Titik baru hasil refleksi titik ini terhadap sumbu Y
    public Titik getRefleksiY() {
        return new Titik(-absis, ordinat);
    }  
    
} //end class Titik
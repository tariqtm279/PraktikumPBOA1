import java.util.ArrayList;
import java.util.List;
class Piaraan {
    //atribut
    private int nbelm;
    private List<Anabul> Lanabul;

    //constructor
    public Piaraan() {
        this.nbelm = 0;
        this.Lanabul = new ArrayList<>();
    }

    //method
    public int getnbelm() {
        return this.nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul(){
        if (nbelm > 0) {
            return Lanabul.get(0);
        } else {
            return null; 
        }
    }

    public Anabul dequeueAnabul() {
        if (nbelm > 0) {
            nbelm--;
            return Lanabul.remove(0);
        } else {
            return null; 
        }
    }

    public void showAnabul() {
        System.out.println("Daftar Anabul dalam Piaran:");
        for (Anabul anabul : Lanabul) {
            anabul.getNama();
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) { // Kucing adalah subclass dari Anabul
                count++;
            }
        }
        return count;
    }

    public double bobotKucing() {
        double totalBobot = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                // Casting ke Kucing untuk akses atribut spesifik kucing
                totalBobot += ((Kucing) a).getBobot(); 
            }
        }
        return totalBobot;
    }   

    public void showJenisAnabul() {
        System.out.println("Daftar Panggilan dan Jenis:");
        for (Anabul a : Lanabul) {
            System.out.println(a.panggilan + " [" + a.getClass().getName() + "]");
        }
    } 
}
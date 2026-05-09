import java.util.ArrayList;
import java.util.List;

public class Teman {
    //atribut
    private int nbelm;
    private List<String> Lnama;

    //method
    public Teman(){
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    public int getNbelm() {
        return this.nbelm;
    }

    public String getNama(int indeks){
        return Lnama.get(indeks);
    }

    public void setNama(int indeks, String nama){
        if (indeks >= 0 && indeks < Lnama.size()) {
            Lnama.set(indeks, nama);
        } 
    }

    public void addNama(String nama){
        Lnama.add(nama);
        nbelm++;
    }

    public void delNama(String nama) {
        Lnama.remove(nama);
        nbelm--; 
    }

    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    public void gantiNama(String namaLama, String namaBaru) {
        int idx = Lnama.indexOf(namaLama);
        if (idx != -1) { 
            Lnama.set(idx, namaBaru);
        } else {
            System.out.println(namaLama + " tidak ditemukan.");
        }
    }

    public int countNama(String nama) {
        int count = 0;
        for (String n : Lnama) {
            if (n.equals(nama)) 
            count++;
        }
        return count;
    }

    public void showTeman() {
        System.out.println("Daftar Teman:");
        for (String n : Lnama) {
            System.out.println("- " + n);
        }
    }      
}
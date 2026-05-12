/* Nama file : Piaraan.java
 * Deskripsi : Kelas untuk koleksi queue Piaraan
 * Pembuat   : Arsy Thariq Munawar
 * NIM       : 24060124120009
 * Tanggal   : 9 Mei 2026
* */

import java.util.*;

public class Piaraan{
    /* ATRIBUT */
    private int nbelm;
    private Queue<Anabul> Lanabul;

    /* OPERATOR */
    /* KONSTRUKTOR */
    public Piaraan(){
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    /* SELEKTOR */
    public int getNbelm(){
        return nbelm;
    }

    /* MUTATOR */

    /* OPERATOR LAINNYA */
    public void enqueueAnabul(Anabul X){
        Lanabul.add(X);
        this.nbelm++;
    }

    public boolean isMember(Anabul X){
        return Lanabul.contains(X);
    }

    public void getAnabul(){
        Anabul x = Lanabul.peek();
        x.printInfo();
    }

    public void dequeueAnabul(){
        if(!Lanabul.isEmpty()){
            Lanabul.poll();
            this.nbelm--;
        }
    }

    public void showAnabul(){
        int i = 0;
        for(Anabul a : Lanabul){
            i++;
            System.out.println(i + ". " + a.getNama());
        }
    }

    public int countKucing(){
        int count = 0;
        for(Anabul a : Lanabul){
            if(a instanceof Kucing){
                count++;
            }
        }

        return count;
    }

    public int bobotKucing(){
        int bobot = 0;
        for(Anabul a : Lanabul){
            if(a instanceof Kucing){
                Kucing b = (Kucing) a;
                bobot += b.getBobot();
            }
        }

        return bobot;
    }

    public void showJenisAnabul(){
        int i = 0;
        for(Anabul a : Lanabul){
            i++;
            System.out.println(i + ". Nama Objek  : " + a.getNama());
            System.out.println("   Panggilan   : " + a.getPanggilan());
            System.out.println("   Jenis Objek : " + a.getClass());
        } 
    }




}
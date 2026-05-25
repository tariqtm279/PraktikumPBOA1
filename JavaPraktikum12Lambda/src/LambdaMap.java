/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author arsym
 */

/**
 * Nama pembuat: Arsy Thariq Munawar
 * NIM : 24060124120009
 * Deskripsi file : Program penggunaan Lambda expression pada Map
 */

//import library untuk Map
import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        
        //Objek Map key dan value sama sama bernilai string
        Map<String, String> mahasiswaMap = new HashMap<>();
        
        //add data key dan value ke dalam Map
        mahasiswaMap.put("20008", "Daniel");
        mahasiswaMap.put("20009", "Thariq");
        mahasiswaMap.put("20019", "Amel");
        mahasiswaMap.put("30099", "Riandaru");
        
        //Tampilkan seluruh isi Map menggunakan Lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}

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
 * Deskripsi file : Program penggunaan Lambda expression pada List (collection)
 */
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}

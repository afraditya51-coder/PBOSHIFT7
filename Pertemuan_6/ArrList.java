package Pertemuan_6;

import java.util.ArrayList;

public class ArrList {
    void araylis(){
        ArrayList<String> mobil = new ArrayList<>();

        //Menambahkan data
        mobil.add("Sigra");
        mobil.add("Agya");
        mobil.add("LancerEvolution");
        System.out.println("Mobil unlock : " + mobil);
        
        //Mengambil data
        System.out.println("Mobil yang dipakai : "+mobil.get(1));
        
        //Mengubah data
        mobil.set(0, "Alphad");
        System.out.println("List Mobil Update : " + mobil);
        
        //Menghapus data
        mobil.remove(1);
        System.out.println("List Mobil setelah Dijual : " + mobil);
        
        //Destroy
        mobil.clear();
        System.out.println("List Mobil setelah Dijual : " + mobil);
    }
}
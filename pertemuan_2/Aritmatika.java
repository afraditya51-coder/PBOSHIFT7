/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan_2;

/**
 *
 * @author PC-4 DASAR
 */
public class Aritmatika {
    public static void main(String[] args) {
        
        int angka1 = 100;
        long angka2 = 1000000;
        double angka3 = 3.14;
        float angka4 = 3.4f;
        char chr = 'A';
        char chr2 = 51;
        boolean cek1 = true;
        boolean cek2 = false;
        
        //teknik konversi
        String itos = String.valueOf(angka1);
        String dtos = String.valueOf(angka3);
        int stoi = Integer.parseInt(itos);
        System.out.println("STOI " + (stoi+5));
        
//        System.out.println("chr " + chr);
//        System.out.println("chr " + chr2);

    }
}

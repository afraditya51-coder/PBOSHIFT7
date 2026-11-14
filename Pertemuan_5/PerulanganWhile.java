package Pertemuan_5;

import java.util.Scanner;

public class PerulanganWhile {
    void WhileAngka(){
        int n = 1;
        System.out.print("Angka : ");
        
        while(n <=10){
            System.out.print(n + " ");
            n++;
        }
    }
    void tebakAngka(){
        Scanner s = new Scanner(System.in);
        int angkaRahasia = 7;
        int tebakan = 0;
        
        while(tebakan != angkaRahasia){
            System.out.println("Tebak Angka (1-10)");
            System.out.print("Masukan Tebakan : ");
            tebakan = s.nextInt();
            
            if(tebakan != angkaRahasia){
                System.out.println("Tebakan Salah!");
            } else {
                System.out.println("SELAMAT, TEBAKAN BENAR!");
            }
        }
        System.out.println("Program Selesai....");
    }
}

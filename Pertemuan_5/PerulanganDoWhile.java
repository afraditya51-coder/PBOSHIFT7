package Pertemuan_5;

import java.util.Scanner;

public class PerulanganDoWhile {
    void kepastian(){
        
        Scanner s = new Scanner(System.in);
        String jawaban;
        do{
            System.out.print("Makan yuk ? (y/t) : ");
            jawaban = s.nextLine();            
        }while(jawaban.equalsIgnoreCase("t"));
        System.out.println("Terima Kasih <3");
    }
}

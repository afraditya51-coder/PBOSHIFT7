package Pertemuan_5;

import java.util.Scanner;

public class PerulanganFor {
//    void forAngka (){
//        for (int i = 0; i < 5; i++){
//            System.out.print("Perulangan ke-" + i);
//        }
//    }
    void forAngka (){
        for (int i = 10; i >= 1; i--){
            System.out.println("Perulangan ke-" + i);
        }
    }
    
    void kelipatan (){
        Scanner s = new Scanner(System.in);
        System.out.print("Masukan Kelipatan : ");
        int n = s.nextInt();
        
        System.out.print("Kelipatan 5 : ");
        for (int i = 0; i <= n; i+=10){
            if(i==0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
    
    void nestedLoop(){
        for (int i = 0; i < 10; i++){   //baris
            for (int j = 0; j < 10; j++){   //kolom
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    
}

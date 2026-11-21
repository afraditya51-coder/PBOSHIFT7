
package pertemuan_7;

import java.util.Scanner;

class Segitiga{
    double alas, tinggi;
    
    //type data - nama method
    double LuasSegitiga(){
        double Luas = 0.5*alas*tinggi;
        return Luas;
    }    
}

class PersegiPanjang{
    double panjang, lebar;
    
    void isiKel(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        
    }
    
    double Keliling(){
        double kel = 2*(panjang+lebar);
        return kel;
    }
}

public class Program {
    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();
        PersegiPanjang p2 = new PersegiPanjang();
        Scanner s = new Scanner(System.in);
        
        
        double panjang, lebar;
        System.out.print("Masukkan Panjang : ");
        panjang = s.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lebar = s.nextDouble();

        
        p2.isiKel(panjang, lebar);
        System.out.println("Keliling Persegi Panjang : " + p2.Keliling());
        
        
        s1.alas = 3;
        s1.tinggi = 5;
        System.out.println("Luas Segitiga : " + s1.LuasSegitiga());
        

    }
}

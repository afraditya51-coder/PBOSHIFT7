package pertemuan_3;
import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
//        System.out.println("Masukan Nama : ");
//        String nama = s.nextLine();
//
//        System.out.println("Masukan NPM : ");
//        double npm = s.nextDouble();
//        
//        System.out.println("Masukan Umur : ");
//        int umur = s.nextInt();
//        
//        System.out.println("Masukan IPK : ");
//        float ipk = s.nextFloat();
//        
//        System.out.println("Masukan Predikat : ");
//        char predikat = s. next().charAt(0);
//                
//        System.out.println("\n=====BIODATA MAHASISWA=====");
//        System.out.println("Nama    : " + nama);
//        System.out.println("NPM     : " + npm);
//        System.out.println("Umur    : " + umur);
//        System.out.println("IPK     : " + ipk);
//        System.out.println("Predikat: " + predikat);
        
//        operatot aritmatika
        System.out.println("Masukan angka pertama : ");
        int a1 = s.nextInt();
        System.out.println("Masukan angka kedua : ");
        int a2 = s.nextInt();
        
        System.out.println("OPERATOR ARITMATIKA");
        System.out.println("Pertambahan : " + (a1 + a2));
        System.out.println("Pengurangan : " + (a1 - a2));
        System.out.println("Perkalian : " + (a1 * a2));
        System.out.println("Pembagian : " + ((float)a1 / a2)); //casting
        System.out.println("Modulus : " + (a1 % a2));
                
    }
}

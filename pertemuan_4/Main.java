package pertemuan_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        Perhitungan p = new Perhitungan();
        
        System.out.println("===KALKULATOR===\n"
                + "+. Pertambahan\n"
                + "-. Pengurangan\n"
                + "*. Perkalian\n"
                + "/. Pembagian\n");
        
        System.out.print("Masukan Pilihan : ");
        mhs.kelas = s.next().charAt(0);
        s.nextLine();
        
        switch (mhs.kelas){
            case '+':{
                System.out.println("Masukan Angka Pertama : ");
                p.angka1 = s.nextDouble();
                System.out.println("Masukan Angka Kedua : ");
                p.angka2 = s.nextDouble();
                p.hasil = p.angka1+p.angka2;
                System.out.println("Hasil = " + p.hasil);
                break;
            }
            case '-':{
                System.out.println("Masukan Angka Pertama : ");
                p.angka1 = s.nextDouble();
                System.out.println("Masukan Angka Kedua : ");
                p.angka2 = s.nextDouble();
                p.hasil = p.angka1-p.angka2;
                System.out.println("Hasil = " + p.hasil);
                break;
            }
            case '*':{
                System.out.println("Masukan Angka Pertama : ");
                p.angka1 = s.nextDouble();
                System.out.println("Masukan Angka Kedua : ");
                p.angka2 = s.nextDouble();
                p.hasil = p.angka1*p.angka2;
                System.out.println("Hasil = " + p.hasil);
                break;
            }
            case '/':{
                System.out.println("Masukan Angka Pertama : ");
                p.angka1 = s.nextDouble();
                System.out.println("Masukan Angka Kedua : ");
                p.angka2 = s.nextDouble();
                p.hasil = p.angka1/p.angka2;
                System.out.println("Hasil = " + p.hasil);
                break;
            }
            default : {
                System.out.println("INPUT ULANG!!!");
            }
            
        }
//        System.out.print("Masukan Nama : ");
//        mhs.nama = s.nextLine();
        
//        System.out.print("Masukan Status : ");
//        mhs.status = s.nextBoolean();

//        System.out.print("Masukan Keterangan : ");
//        mhs.keterangan = s.nextLine();
//        
//        if (mhs.nilai>85 && mhs.nilai<=100){
////            if (mhs.status == true){
////                System.out.println("MANTAP!");
////            }
//            System.out.println("Selamat, Kamu Lulus!");
//        }else if (mhs.nilai>=0 && mhs.nilai<=85){
////            if (mhs.status == true){
////                System.out.println("KAMU B AJA!");
////            }
//            System.out.println("Kamu Lulus Dengan Pertimbangan");
//        }else {
//            System.out.println("Maaf, Kamu Tidak Lulus!");
//        }
        
    }
}

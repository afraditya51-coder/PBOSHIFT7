package pertemuan_1;

public class Orang {
    String nama;
    int umur;
    String jenis_kelamin;
    
    void berjalan() {
        System.out.println(nama + " Berjalan");
    }
    
    void makan() {
        System.out.println(nama + " Sedang Makan");
    }
    
    void minum() {
        System.out.println(nama + " Sedang Minum");
    }
    
    void tidur() {
        System.out.println(nama + " Sedang Tidur");
    }
    
    void info() {
        System.out.println("Ini Orang");
        System.out.println("Nama            : " + nama);
        System.out.println("Umur            : " + umur);
        System.out.println("Jenis Kelamin   : " + jenis_kelamin);
    }
    
}
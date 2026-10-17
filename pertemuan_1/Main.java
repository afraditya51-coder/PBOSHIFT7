package pertemuan_1;


public class Main {
    public static void main(String[] args) {
        Orang tinggi = new Orang();
        
        tinggi.nama = "Dadang";
        tinggi.umur = 33;
        tinggi.jenis_kelamin= "Laki laki";

        
        tinggi.berjalan();
        tinggi.makan();
        tinggi.minum();
        tinggi.tidur();
        
        tinggi.info();
    }
}

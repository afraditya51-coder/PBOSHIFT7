package pertemuan_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderInput {
    public static void main(String[] args) throws IOException {
//        cara 1
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );
        
//        cara 2
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br2 = new BufferedReader(isr);
        
//        input
        System.out.println("Masukan Nama : ");
        String nama = br.readLine();
        
        System.out.println("Masukan NPM : ");
        double npm = Double.parseDouble(br.readLine());
        
        System.out.println("Masukan umur : ");
        int umur = Integer.parseInt(br.readLine());
        
        System.out.println("Masukan IPK : ");
        float ipk = Float.parseFloat(br.readLine());
        
        System.out.println("Masukan Predikat : ");
        char predikat = br.readLine().charAt(0);
        
//        output
        System.out.println("\n=====BIODATA MAHASISWA=====");
        System.out.println("Nama    : " + nama);
        System.out.println("NPM     : " + npm);
        System.out.println("Umur    : " + umur);
        System.out.println("IPK     : " + ipk);
        System.out.println("Predikat: " + predikat);
        
        
        
    }
}

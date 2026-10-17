package pertemuan_3;
import java.io.*;

public class DataInputOutputStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("mahasiswa.txt")
        );
        
        dos.writeUTF("SIMADEP");
        dos.writeInt(15);
        dos.writeDouble(3.14123123);
        
        dos.close();
        System.out.println("Data berhasil dibuat!");
        
        DataInputStream dis = new DataInputStream(
                new FileInputStream("mahasiswa.txt")
        );
        
        String nama = dis.readUTF();
        int umur = dis.readInt();
        double PI = dis.readDouble();
        
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("PI      : " + PI);
        
        
    }
}

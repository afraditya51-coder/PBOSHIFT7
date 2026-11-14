package Pertemuan_6;

public class PeError {
    void PeEr(){
        
        try{
            int a=5, b=0, c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.err.println("Data Tidak Bisa Dibagi Dengan Nol!");
        }finally{
            System.out.println("Program Selesai.");
        }
    }
    
    void Trow() throws Exception{
        int umur = 15;
        
        if(umur<20){
            throw new Exception("Anda Belum Baligh");
        }
        
        System.out.println("Anda Sudah Baligh");
    }
}
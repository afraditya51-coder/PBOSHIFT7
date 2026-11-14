package Pertemuan_6;

public class Tred extends Thread{
    
    public void run(){
        int nilai[] = {10,20,30,40,50};
        
        for(int i=0; i<nilai.length; i++){
            System.out.print(nilai[i] + " ");
        }
    }
}

class Tred2 extends Thread{
    
    public void run(){
        char chr[] = {'A', 'B', 'C', 'D', 'E'};
        
        for(int j=0; j<chr.length; j++){
            System.out.print(chr[j] + " ");
        }
    }
}

class Utama{
    public static void main(String[] args) throws InterruptedException {
    Tred t1 = new Tred();
    Tred2 t2 = new Tred2();
    
    t1.start();
//    t1.sleep(1000);
    t2.start();
//    t2.sleep(2000);
    }
}
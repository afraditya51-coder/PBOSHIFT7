package Pertemuan_5;

public class PerulanganForEach {
    void nilai(){
        int nilai[] = {-90,-80,-70,90,78,87,99,100};
        
        System.out.println("Nilai : ");
        for(int n : nilai){
            if (n > 0)
            System.out.print(n+" ");
        }
        
    }
}

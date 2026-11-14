package Pertemuan_6;

public class Arayy {
    void arey(){
//        int angka[] = {1,2,3,4,5};
//        int[] angka2 = {1,2,3,4,5};
//        int angka3[] = new int [2];

//        for(int i=0; i<angka.length; i++){
//            System.out.println(angka[i]+" ");
//        }

        int angka[][] = {
            {1,2,3},
            {4,5,6}
        };
        
        for (int data[] : angka){
            for(int tampil : data){
                System.out.print(tampil + " ");
            }
            System.out.println("");
        }
    //foreach
//        for(int data : angka){
//            System.out.print(data + " ");
//        }
    }
}

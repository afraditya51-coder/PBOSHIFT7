package Pertemuan_6;

public class main {
    public static void main(String[] args) throws Exception {
        Arayy a1 = new Arayy();
        ArrList a2 = new ArrList();
        PeError pe = new PeError();
        
//        a1.arey();
//        a2.araylis();
//        pe.PeEr();
//        pe.Trow();
        try{
            pe.Trow();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}


package pertemuan_7;

class KartuMhs{
    String npm;

    KartuMhs(String npm) {
        this.npm = npm;
    }
}

class Mahasiswa{
    String nama;
    
    private KartuMhs card;

    Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.card = new KartuMhs(npm);
    }
    
    void show(){
        System.out.println(nama + " |NPM di Kartu| " + card.npm);
    }
}

public class Komposisi {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Oliver", "666");
        m1.show();
    }
}

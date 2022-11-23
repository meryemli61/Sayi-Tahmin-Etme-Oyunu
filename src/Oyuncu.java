import java.util.Scanner;

public class Oyuncu {

    int hak;
    int puan;
    String isim;

    public Oyuncu(int hak, int puan, String isim){

        this.hak = hak;
        this.puan = puan;
        this.isim = isim;
    }

    public int sayiTahminEt(){
        System.out.println("Lutfen 0-10 arasi bir sayi giriniz.");
        Scanner klavye = new Scanner(System.in);

        int girilenSayi = klavye.nextInt();

        return girilenSayi;
    }
}

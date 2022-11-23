import java.util.Random;

public class OyunKontrolcusu {

    Random random = new Random();

    int rastgeleSayi = random.nextInt(11);

    Oyuncu oyuncu;

    public OyunKontrolcusu(Oyuncu oyuncu){

        this.oyuncu = oyuncu;
    }
    
    public void basla (){
        while (oyuncu.hak >0){
            int tahminEdilenSayi = oyuncu.sayiTahminEt();
            if(tahminEdilenSayi == rastgeleSayi){
            oyuncu.puan += 10;
                System.out.println("Evet dogru bildin !");
            } else if (tahminEdilenSayi > rastgeleSayi) {
                System.out.println("Yukarida bir sayi girdin.");
            }else {
                System.out.println("Asagida bir sayi girdin.");
            }
        }
    }
}

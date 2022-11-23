public class Main {
    public static void main(String[] args) {

        Oyuncu Meryem = new Oyuncu(3, 0, "Meryem");

        OyunKontrolcusu oyun = new OyunKontrolcusu(Meryem);

        oyun.basla();
    }

}
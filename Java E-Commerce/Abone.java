/**
* @file Dosya adı
* @description Programınızın açıklaması ne yaptığına dair.
* @assignment Kaçıncı proje olduğu
* @date Kodu oluşturduğunuz Tarih
* @author yazar adı ve mail adresi
*/
package Proje;

 
public class Abone extends Kullanici {

    private Urun[] Sepet;
    private Urun[] SatinAldıgi;
    private int SepetUrunSayisi;
    private int SatinAldıgıUrunSayisi;

    public Abone(String AdSoyad, String UyelikTarihi, String Rol, String PaketTipi) {
        super(AdSoyad, UyelikTarihi, Rol, PaketTipi);
        this.Sepet = new Urun[10];
        this.SatinAldıgi = new Urun[10];
        this.SepetUrunSayisi = 0;
        this.SatinAldıgıUrunSayisi = 0;
    }
    
    @Override
    public void print() { //Abone bilgisi yazzdırma
        System.out.println("Ad Soyad: " + this.getAdSoyad() + " Uyelik Tarihi: " + this.getUyelikTarihi() + "Sepet Urun Sayisi: " + this.SepetUrunSayisi + " Satin Aldıgı Urun Sayisi: " + this.SatinAldıgıUrunSayisi + " Paket Tipi: " + this.getPaketTipi() + " Rol: " + this.getRol());

        System.out.println("-----Sepetteki Urunler-----");
        for (int i = 0; i < Sepet.length; i++) {
            if (Sepet[i] != null) {
                Sepet[i].print();
            }
        }

        System.out.println("-----Satilan Urunler-----");
        for (int i = 0; i < SatinAldıgi.length; i++) {
            if (SatinAldıgi[i] != null) {
                SatinAldıgi[i].print();
            }
        }
    }
 
    public void SatinAldigiEkle(Urun urun) {
        for (int i = 0; i < this.SatinAldıgi.length; i++) {
            if (this.SatinAldıgi[i] == null) { //i den gelen kısım boş ise
                this.SatinAldıgi[i] = urun; //Boş bulunan yere urunu yerleştiriyor
                SatinAldıgıUrunSayisi += 1; //SatinAldıgıUrunSayisi 1 attırıyor
                break; //for i bitirir
            }
        }
    }

    public void SepetEkle(Urun urun, Abone abone) {
        boolean check = true;

        if (abone != this) { //Eğer sepete ekelyen kişi sepetin sahibi değil ise hata veriyoruz
            System.out.println("This user has not permission");
            check = false;
        }

        for (int i = 0; i < Sepet.length; i++) { //Bu urun daha once sepete eklendiyse bir daha eklenemez.
            if (Sepet[i] == urun) {
                System.out.println("Bu urun daha once sepete eklenmis.");
                check = false;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < this.Sepet.length; i++) {
                if (this.Sepet[i] == null) {//i den gelen kısım boş ise 
                    this.Sepet[i] = urun;//Boş bulunan yere urunu yerleştiriyor
                    SepetUrunSayisi += 1;//SepetUrunSayisi 1 attırıyor
                    System.out.println("Sepet ekleme islemi basarili.");
                    break; //for i bitirir 
                }
            }
        }
    }

    public void SepetFiyatGetir() {
        print(); //Sepet bilgisi yazdırır
        float toplam = 0;
        for (int i = 0; i < Sepet.length; i++) {
            if (Sepet[i] != null) {
                toplam += Sepet[i].getFiyat(); //Sepetdeki ürünlerin fiyatını topluyoruz
            }
        }

        if (this.getPaketTipi().equals("Premium")) { //Abone premium ise indirim uyguluyoruz
            System.out.println("Toplam sepet tutarı premium: " + (toplam - (toplam * 15 / 100)));
        } else {
            System.out.println("Toplam sepet tutarı: " + toplam);
        }

    }

    public void sepetSil(Urun urun, Abone abone) {

        boolean check = false;

        for (int i = 0; i < Sepet.length; i++) { //Bu urun sepet de var ise sileceğiz
            if (Sepet[i] == urun) {
                check = true;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < Sepet.length; i++) {
                if (Sepet[i] != null) {
                    if (Sepet[i] == urun) {
                        if (abone == this) { //Sepetden ürün silmek isteyen kişi sepetin sahibi ise silebilir
                            Sepet[i] = null;
                            SepetUrunSayisi -= 1;
                            System.out.println("Silme islemi basarili.");
                            break;
                        } else {
                            System.out.println("This user has not permission");
                        }
                    }
                }
            }
        } else {
            System.out.println("Sepete ait Urun bulunamadı");
        }
    }

    public Urun[] getSepet() {
        return Sepet;
    }

    public void setSepet(Urun[] Sepet) {
        this.Sepet = Sepet;
    }

    public Urun[] getSatinAldıgi() {
        return SatinAldıgi;
    }

    public void setSatinAldıgi(Urun[] SatinAldıgi) {
        this.SatinAldıgi = SatinAldıgi;
    }

    public int getSepetUrunSayisi() {
        return SepetUrunSayisi;
    }

    public void setSepetUrunSayisi(int SepetUrunSayisi) {
        this.SepetUrunSayisi = SepetUrunSayisi;
    }

    public int getSatinAldıgıUrunSayisi() {
        return SatinAldıgıUrunSayisi;
    }

    public void setSatinAldıgıUrunSayisi(int SatinAldıgıUrunSayisi) {
        this.SatinAldıgıUrunSayisi = SatinAldıgıUrunSayisi;
    }

}

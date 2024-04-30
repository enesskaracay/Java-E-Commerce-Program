/**
 * @file Dosya adı
 * @description Programınızın açıklaması ne yaptığına dair.
 * @assignment Kaçıncı proje olduğu
 * @date Kodu oluşturduğunuz Tarih
 * @author yazar adı ve mail adresi
 */
package Proje;

public class Magaza {

    private String Ad;
    private String Adress;
    private String Tarih;
    private Urun[] SatilanUrunler;
    private int SatilanUrunSayisi;
    private Abone[] BegenenKullanicilar;
    private int BegeniSayisi;
    private Abone[] TakipEdenKullanicilar;
    private int TakipciSayisi;

    public Magaza(String Ad, String Adress, String Tarih) {
        this.Ad = Ad;
        this.Adress = Adress;
        this.Tarih = Tarih;
        this.SatilanUrunler = new Urun[20];
        this.SatilanUrunSayisi = 0;
        this.BegenenKullanicilar = new Abone[10];
        this.BegeniSayisi = 0;
        this.TakipEdenKullanicilar = new Abone[10];
        this.TakipciSayisi = 0;
    }

    public void print() { //mağaza bilgisi yazdırma
        System.out.println("Ad: " + this.Ad + " Adres: " + this.Adress + " Acilis Tarih: " + this.Tarih + " Begeni Sayisi: " + this.BegeniSayisi + " Takipci Sayisi: " + this.TakipciSayisi + " Satilan Urun Sayisi: " + this.SatilanUrunSayisi);

        System.out.println("Satilan Urunler");
        for (int i = 0; i < SatilanUrunler.length; i++) {
            if (SatilanUrunler[i] != null) {
                SatilanUrunler[i].print();
            }
        }

        System.out.println("Begenen Kullanicilar");
        for (int i = 0; i < BegenenKullanicilar.length; i++) {
            if (BegenenKullanicilar[i] != null) {
                BegenenKullanicilar[i].print();
            }
        }

        System.out.println("Takip Eden Kullanicilar");
        for (int i = 0; i < TakipEdenKullanicilar.length; i++) {
            if (TakipEdenKullanicilar[i] != null) {
                TakipEdenKullanicilar[i].print();
            }
        }
    }

    public void SatilanUrun(Urun urun) {
        for (int i = 0; i < this.SatilanUrunler.length; i++) {
            if (this.SatilanUrunler[i] == null) { //i den gelen kısım boş ise
                this.SatilanUrunler[i] = urun; //Boş bulunan yere urunu yerleştiriyor
                SatilanUrunSayisi += 1; //SatinAldıgıUrunSayisi 1 attırıyor
                break; //for i bitirir
            }
        }
    }

    public void BegenenAboneSayisiEkle(Abone abone) {
        boolean check = true;

        for (int i = 0; i < BegenenKullanicilar.length; i++) { //Bu abone daha once eklendiyse bir daha eklenemez.
            if (BegenenKullanicilar[i] == abone) {
                System.out.println("Bu daha once eklenmis.");
                check = false;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < this.BegenenKullanicilar.length; i++) {
                if (this.BegenenKullanicilar[i] == null) {//i den gelen kısım boş ise
                    this.BegenenKullanicilar[i] = abone;//Boş bulunan yere abone yerleştiriyor
                    BegeniSayisi += 1;//BegenenAboneSayisi 1 attırıyor
                    break; //for i bitirir
                }
            }
        }
    }

    public void TakipEdenAbonelerEkle(Abone abone) {
        boolean check = true;

        for (int i = 0; i < TakipEdenKullanicilar.length; i++) { //Bu abone daha once eklendiyse bir daha eklenemez.
            if (TakipEdenKullanicilar[i] == abone) {
                System.out.println("Bu daha once eklenmis.");
                check = false;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < this.TakipEdenKullanicilar.length; i++) {
                if (this.TakipEdenKullanicilar[i] == null) {//i den gelen kısım boş ise
                    this.TakipEdenKullanicilar[i] = abone;//Boş bulunan yere abone yerleştiriyor
                    TakipciSayisi += 1;//TakipEdenAboneSayisi 1 attırıyor
                    break; //for i bitirir
                }
            }
        }
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public String getTarih() {
        return Tarih;
    }

    public void setTarih(String Tarih) {
        this.Tarih = Tarih;
    }

    public Urun[] getSatilanUrunler() {
        return SatilanUrunler;
    }

    public void setSatilanUrunler(Urun[] SatilanUrunler) {
        this.SatilanUrunler = SatilanUrunler;
    }

    public int getSatilanUrunSayisi() {
        return SatilanUrunSayisi;
    }

    public void setSatilanUrunSayisi(int SatilanUrunSayisi) {
        this.SatilanUrunSayisi = SatilanUrunSayisi;
    }

    public Abone[] getBegenenKullanicilar() {
        return BegenenKullanicilar;
    }

    public void setBegenenKullanicilar(Abone[] BegenenKullanicilar) {
        this.BegenenKullanicilar = BegenenKullanicilar;
    }

    public int getBegeniSayisi() {
        return BegeniSayisi;
    }

    public void setBegeniSayisi(int BegeniSayisi) {
        this.BegeniSayisi = BegeniSayisi;
    }

    public Abone[] getTakipEdenKullanicilar() {
        return TakipEdenKullanicilar;
    }

    public void setTakipEdenKullanicilar(Abone[] TakipEdenKullanicilar) {
        this.TakipEdenKullanicilar = TakipEdenKullanicilar;
    }

    public int getTakipciSayisi() {
        return TakipciSayisi;
    }

    public void setTakipciSayisi(int TakipciSayisi) {
        this.TakipciSayisi = TakipciSayisi;
    }

}

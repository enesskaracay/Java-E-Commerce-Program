/**
* @file Dosya adı
* @description Programınızın açıklaması ne yaptığına dair.
* @assignment Kaçıncı proje olduğu
* @date Kodu oluşturduğunuz Tarih
* @author yazar adı ve mail adresi
*/
package Proje; 
 
public class Uretici {

    private String Ad;
    private String Address;
    private Abone[] BegenenAboneler;
    private int BegenenAboneSayisi;
    private Abone[] TakipEdenAboneler;
    private int TakipEdenAboneSayisi;

    public Uretici(String Ad, String Address) {
        this.Ad = Ad;
        this.Address = Address;
        this.BegenenAboneler = new Abone[10];
        this.BegenenAboneSayisi = 0;
        this.TakipEdenAboneler = new Abone[10];
        this.TakipEdenAboneSayisi = 0;
    }

    public void print() {
        System.out.println("Ad: " + this.Ad + " Address: " + this.Address + " Begenen Abone Sayisi: " + this.BegenenAboneSayisi + " Takip Eden Abone Sayisi: " + this.TakipEdenAboneSayisi);
        System.out.println("Begenen Aboneler");
        for (int i = 0; i < BegenenAboneler.length; i++) {
            if (BegenenAboneler[i] != null) {
                BegenenAboneler[i].print();
            }
        }

        System.out.println("Takip Eden Aboneler");
        for (int i = 0; i < TakipEdenAboneler.length; i++) {
            if (TakipEdenAboneler[i] != null) {
                TakipEdenAboneler[i].print();
            }
        }
    }

    public void BegenenAboneSayisiEkle(Abone abone) {
        boolean check = true;

        for (int i = 0; i < BegenenAboneler.length; i++) { //Bu abone daha once eklendiyse bir daha eklenemez.
            if (BegenenAboneler[i] == abone) {
                System.out.println("Bu daha once eklenmis.");
                check = false;
                 break;
            }
        }

        if (check) {
            for (int i = 0; i < this.BegenenAboneler.length; i++) {
                if (this.BegenenAboneler[i] == null) {//i den gelen kısım boş ise
                    this.BegenenAboneler[i] = abone;//Boş bulunan yere abone yerleştiriyor
                    BegenenAboneSayisi += 1;//BegenenAboneSayisi 1 attırıyor
                    break; //for i bitirir
                }
            }
        }
    }

    public void TakipEdenAbonelerEkle(Abone abone) {
        boolean check = true;

        for (int i = 0; i < TakipEdenAboneler.length; i++) { //Bu abone daha once eklendiyse bir daha eklenemez.
            if (TakipEdenAboneler[i] == abone) {
                System.out.println("Bu daha once eklenmis.");
                check = false;
                break;
            }
        }

        if (check) {
            for (int i = 0; i < this.TakipEdenAboneler.length; i++) {
                if (this.TakipEdenAboneler[i] == null) {//i den gelen kısım boş ise
                    this.TakipEdenAboneler[i] = abone;//Boş bulunan yere abone yerleştiriyor
                    TakipEdenAboneSayisi += 1;//TakipEdenAboneSayisi 1 attırıyor
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Abone[] getBegenenAboneler() {
        return BegenenAboneler;
    }

    public void setBegenenAboneler(Abone[] BegenenAboneler) {
        this.BegenenAboneler = BegenenAboneler;
    }

    public int getBegenenAboneSayisi() {
        return BegenenAboneSayisi;
    }

    public void setBegenenAboneSayisi(int BegenenAboneSayisi) {
        this.BegenenAboneSayisi = BegenenAboneSayisi;
    }

    public Abone[] getTakipEdenAboneler() {
        return TakipEdenAboneler;
    }

    public void setTakipEdenAboneler(Abone[] TakipEdenAboneler) {
        this.TakipEdenAboneler = TakipEdenAboneler;
    }

    public int getTakipEdenAboneSayisi() {
        return TakipEdenAboneSayisi;
    }

    public void setTakipEdenAboneSayisi(int TakipEdenAboneSayisi) {
        this.TakipEdenAboneSayisi = TakipEdenAboneSayisi;
    }

}

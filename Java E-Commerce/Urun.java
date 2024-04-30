/**
* @file Dosya adı
* @description Programınızın açıklaması ne yaptığına dair.
* @assignment Kaçıncı proje olduğu
* @date Kodu oluşturduğunuz Tarih
* @author yazar adı ve mail adresi
*/
package Proje;
 
public class Urun {

    private String Ad;
    private float Fiyat;
    private Uretici Uretici;

    public Urun(String Ad, float Fiyat) {
        this.Ad = Ad;
        this.Fiyat = Fiyat;
    }

    public void print() {
        System.out.println("Urun Adi: " + this.Ad + " Urun fiyati: " + this.Fiyat + " Uretici Adi" + this.Uretici.getAd());

    }

    public Uretici getUretici() {
        return Uretici;
    }

    public void setUretici(Uretici Uretici) {
        this.Uretici = Uretici;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String Ad) {
        this.Ad = Ad;
    }

    public float getFiyat() {
        return Fiyat;
    }

    public void setFiyat(float Fiyat) {
        this.Fiyat = Fiyat;
    }
}

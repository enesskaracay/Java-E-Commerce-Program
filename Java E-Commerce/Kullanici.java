/**
* @file Dosya adı
* @description Programınızın açıklaması ne yaptığına dair.
* @assignment Kaçıncı proje olduğu
* @date Kodu oluşturduğunuz Tarih
* @author yazar adı ve mail adresi
*/
package Proje;
 
public abstract class Kullanici {

    private String AdSoyad;
    private String UyelikTarihi;
    private String PaketTipi;
    private String Rol;
    private boolean Eklemeİzni;
    private boolean Silmeİzni;
    private boolean Güncellemeİzni;
    
    public Kullanici(String AdSoyad, String UyelikTarihi, String Rol, String PaketTipi) {
        this.AdSoyad = AdSoyad;
        this.UyelikTarihi = UyelikTarihi;
        this.Rol = Rol;
        this.PaketTipi = PaketTipi;
        this.Eklemeİzni = false;
        this.Silmeİzni = false;
        this.Güncellemeİzni = false;
    }

    public abstract void print(); //Alt class lara da bu methodu kullanabilmek için absract yapıyorum
    
    public void setDelete_privilege(boolean Silmeİzni) {
        this.Silmeİzni = Silmeİzni;
    }
    
    public void setAdd_privilege(boolean Eklemeİzni) {
        this.Eklemeİzni = Eklemeİzni;
    }

    public void setUpdate_privilege(boolean Güncellemeİzni) {
        this.Güncellemeİzni = Güncellemeİzni;
    }

    public String getAdSoyad() {
        return AdSoyad;
    }

    public boolean isEklemeİzni() {
        return Eklemeİzni;
    }

    public void setEklemeİzni(boolean Eklemeİzni) {
        this.Eklemeİzni = Eklemeİzni;
    }

    public boolean isSilmeİzni() {
        return Silmeİzni;
    }

    public void setSilmeİzni(boolean Silmeİzni) {
        this.Silmeİzni = Silmeİzni;
    }

    public void setAdSoyad(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    public String getUyelikTarihi() {
        return UyelikTarihi;
    }

    public void setUyelikTarihi(String UyelikTarihi) {
        this.UyelikTarihi = UyelikTarihi;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getPaketTipi() {
        return PaketTipi;
    }

    public void setPaketTipi(String PaketTipi) {
        this.PaketTipi = PaketTipi;
    }

    public boolean isGüncellemeİzni() {
        return Güncellemeİzni;
    }

    public void setGüncellemeİzni(boolean Güncellemeİzni) {
        this.Güncellemeİzni = Güncellemeİzni;
    }

}

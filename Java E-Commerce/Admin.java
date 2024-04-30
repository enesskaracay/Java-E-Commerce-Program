/**
* @file Dosya adı
* @description Programınızın açıklaması ne yaptığına dair.
* @assignment Kaçıncı proje olduğu
* @date Kodu oluşturduğunuz Tarih
* @author yazar adı ve mail adresi
*/
package Proje;

 
public class Admin extends Kullanici {

    public Admin(String AdSoyad, String UyelikTarihi, String Rol, String PaketTipi) {
        super(AdSoyad, UyelikTarihi, Rol, PaketTipi);

        this.setAdd_privilege(true); //Ekleme yetkisi veriyorum
        this.setDelete_privilege(true);//Silme yetkisi veriyorum
        this.setUpdate_privilege(true);//Güncelleme yetkisi veriyorum
    }

    @Override
    public void print() { //Admin bilgisi yazdırma
       System.out.println("Ad Soyad: " + this.getAdSoyad() + " Uyelik Tarihi: " + this.getUyelikTarihi() + " ekleme yetkisi: " + this.isEklemeİzni() + " silme yetkisi: " + this.isSilmeİzni() + " guncelleme yetkisi:" + this.isGüncellemeİzni());
    }

}

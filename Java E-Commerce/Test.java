/**
* @file Dosya adı
* @description Programınızın açıklaması ne yaptığına dair.
* @assignment Kaçıncı proje olduğu
* @date Kodu oluşturduğunuz Tarih
* @author yazar adı ve mail adresi
*/
package Proje;

public class Test {

    public static void main(String[] args) {
        Abone[] abonelist = new Abone[20];
        Magaza[] magazalist = new Magaza[20];

        Uretici uretici_1 = new Uretici("Çilek", "Ataşehir");
        Uretici uretici_2 = new Uretici("Atasun", "Fatih");

        Magaza magaza_1 = new Magaza("Çilek Bayi", "Aksaray", "13.07.2012");
        Magaza magaza_2 = new Magaza("Magaza_2", "Bursa", "19.09.2012");
        Magaza magaza_3 = new Magaza("Magaza_3", "İstanbul", "11.05.2012");

        Abone abone_1 = new Abone("Ayşe 1", "05.01.2022", "Kullanıcı", "Free");
        Abone abone_2 = new Abone("Mehmet 2", "12.01.2022", "Kullanıcı", "Premium");
        Abone abone_3 = new Abone("Ahmet 3", "23.01.2022", "Kullanıcı", "Premium");
        Admin admin = new Admin("Enes", "05.01.2022", "Admin", "Premium");
        admin.print();
        magazalist[0] = magaza_1; //magaza listesine magaza ataması
        magazalist[1] = magaza_2;//magaza listesine magaza ataması
        magazalist[2] = magaza_3;//magaza listesine magaza ataması

        magaza_1.BegenenAboneSayisiEkle(abone_3); //magazaya begenme ekliyoruö
        magaza_1.TakipEdenAbonelerEkle(abone_2);//magazaya begenme ekliyoruö

        Urun urun_1 = new Urun("Masa", 200);
        Urun urun_2 = new Urun("Dolap", 300);
        Urun urun_3 = new Urun("Halı", 500);
        Urun urun_4 = new Urun("Urun 4", 1200);
        Urun urun_5 = new Urun("Urun 5", 700);
        Urun urun_6 = new Urun("Urun 6", 15000);

        magaza_1.SatilanUrun(urun_1); //magazaya satilan urun ekliyorum
        magaza_1.SatilanUrun(urun_2);//magazaya satilan urun ekliyorum
        magaza_1.SatilanUrun(urun_3);//magazaya satilan urun ekliyorum

        urun_1.setUretici(uretici_1); //urunun ureticisini belirtiyorum
        urun_2.setUretici(uretici_1);//urunun ureticisini belirtiyorum
        urun_3.setUretici(uretici_1);//urunun ureticisini belirtiyorum
        urun_4.setUretici(uretici_2);//urunun ureticisini belirtiyorum
        urun_5.setUretici(uretici_2);//urunun ureticisini belirtiyorum
        urun_6.setUretici(uretici_2);//urunun ureticisini belirtiyorum

        abonelist[0] = abone_1; //abone listesine abone atıyorum
        abonelist[1] = abone_2;//abone listesine abone atıyorum
        abonelist[2] = abone_3;//abone listesine abone atıyorum

        uretici_1.BegenenAboneSayisiEkle(abone_3);//ureticiye begenme ekliyoruö
        uretici_1.TakipEdenAbonelerEkle(abone_2);//ureticiye takipci ekliyoruö
        uretici_1.TakipEdenAbonelerEkle(abone_1);//ureticiye takipci ekliyoruö

        abone_1.SatinAldigiEkle(urun_3); //aboneye satın aldıgı urun ekliyorum
        abone_1.SatinAldigiEkle(urun_3);//aboneye satın aldıgı urun ekliyorum
        abone_1.SatinAldigiEkle(urun_2);//aboneye satın aldıgı urun ekliyorum
        abone_2.SatinAldigiEkle(urun_2);//aboneye satın aldıgı urun ekliyorum
        abone_2.SatinAldigiEkle(urun_1);//aboneye satın aldıgı urun ekliyorum
        abone_3.SatinAldigiEkle(urun_6);//aboneye satın aldıgı urun ekliyorum
        abone_3.SatinAldigiEkle(urun_5);//aboneye satın aldıgı urun ekliyorum

        abone_1.SepetEkle(urun_3, abone_1); //Abonenin sepetine urun ekliyorum
        abone_1.SepetEkle(urun_2, abone_1);//Abonenin sepetine urun ekliyorum
        abone_1.SepetEkle(urun_1, abone_1);//Abonenin sepetine urun ekliyorum
        abone_2.SepetEkle(urun_6, abone_2);//Abonenin sepetine urun ekliyorum
        abone_2.SepetEkle(urun_5, abone_2);//Abonenin sepetine urun ekliyorum

        System.out.println("1. soru ve 3. soru");
        for (int i = 0; i < abonelist.length; i++) {
            if (abonelist[i] != null && abonelist[i].getAdSoyad().equals("Ayşe 1")) { //isim belirtilen degere eşit ise bilgileri yazdırıyorum
                abonelist[i].print();
            }
        }
        System.out.println("---------------------------");
        System.out.println("2-");
        for (int i = 0; i < magazalist.length; i++) {
            if (magazalist[i] != null && magazalist[i].getAd().equals("Çilek Bayi")) {//isim belirtilen degere eşit ise bilgileri yazdırıyorum
                magazalist[i].print();
            }
        }
        System.out.println("---------------------------");
        System.out.println("4-");

        int max = 0;
        int max_idx = 0;
        for (int i = 0; i < magazalist.length; i++) {
            if (magazalist[i] != null) {
                if (magazalist[i].getTakipciSayisi() > max) { //gelen takipci sayısı max dan fazla ise max a eşitliyorum ardından i değerini tutarak hangi magazanın en cok oldunu öğreniyorum
                    max_idx = i;
                    max = magazalist[i].getTakipciSayisi();
                }
            }
        }
        magazalist[max_idx].print();
        System.out.println("---------------------------");
        System.out.println("5-");

        int max2 = 0;
        int max_idx2 = 0;
        for (int i = 0; i < abonelist.length; i++) {
            if (abonelist[i] != null) {
                if (abonelist[i].getSatinAldıgıUrunSayisi() > max2) { //Satin aldıgı urun sayısı max2 den fazla ise max2 a eşitliyorum ardından i değerini tutarak hangi magazanın en cok oldunu öğreniyorum
                    max_idx2 = i;
                    max2 = abonelist[i].getSatinAldıgıUrunSayisi();
                }
            }
        }
        abonelist[max_idx2].print();
        System.out.println("---------------------------");
        System.out.println("6-");

        int min3 = Integer.MAX_VALUE; 
        int max3 = 0;
        int min_idx3 = 0;
        int max_idx3 = 0;
        for (int i = 0; i < magazalist.length; i++) { 
            if (magazalist[i] != null) { 
                if (magazalist[i].getBegeniSayisi() > max3) {//Eğer gelen değer max3 den büyük ise max3 e eşitliyoruz ve listedeki yeri olan i değerini max_idx 3 e atıyoruz bu sayede hangi magazanın oldugunu bilebiliriyoruz.
                    max_idx3 = i;
                    max3 = magazalist[i].getBegeniSayisi();
                }
                if (magazalist[i].getBegeniSayisi() < min3) {//Eğer gelen değer min3 den küçük ise min3 e eşitliyoruz ve listedeki yeri olan i değerini min_idx3 3 e atıyoruz bu sayede hangi magazanın oldugunu bilebiliriyoruz.
                    min_idx3 = i;
                    min3 = magazalist[i].getBegeniSayisi();
                }
            }
        }
        System.out.println("En cok begeni alan magaza: ");
        magazalist[max_idx3].print(); //magaza yazdırma
        System.out.println("En az begeni alan magaza: ");
        magazalist[min_idx3].print();//magaza yazdırma

        System.out.println("---------------------------");
        System.out.println("7-");

        float min4 = Integer.MAX_VALUE;
        float max4 = 0;
        int abone_idx = 0;
        int abone_minidex = 0;
        int min_idx4 = 0;
        int max_idx4 = 0;
        for (int i = 0; i < abonelist.length; i++) { //abone listsini dönüyorum
            if (abonelist[i] != null) {
                for (int j = 0; j < abonelist[i].getSepet().length; j++) {
                    if (abonelist[i].getSepet()[j] != null) { 
                        Urun sepet = abonelist[i].getSepet()[j]; //aboneye ait sepet bilgisi getiriyorum
                        if (sepet.getFiyat() > max4) { //Gelen urun max4 den buyuk ise en buyuk değer oluyor ve burdaki abone_idx ve max_idx4 den hangi ürün olduğunu anlıyorum
                            max4 = sepet.getFiyat();
                            abone_idx = i;
                            max_idx4 = j;
                        }

                        if (sepet.getFiyat() < min4) { //Gelen urun min4 den küçük ise en buyuk değer oluyor ve burdaki abone_minidex ve min_idx4 den hangi ürün olduğunu anlıyorum
                            min4 = sepet.getFiyat();
                            abone_minidex = i;
                            min_idx4 = j;
                        }
                    }
                }
            }
        }
        System.out.println("En cok pahali urun: ");
        abonelist[abone_idx].getSepet()[max_idx4].print();//gelen değerlere göre abone listesindeki sepetdeki en pahali urun
        System.out.println("En ucuz urun: ");
        abonelist[abone_minidex].getSepet()[min_idx4].print(); //gelen değerlere göre abone listesindeki sepetdeki en ucuz urun

        System.out.println("---------------------------");
        System.out.println("8-");

        String kullaniciAdi = "eh";
        for (int i = 0; i < abonelist.length; i++) {
            if (abonelist[i] != null) {
                Abone abone = abonelist[i];

                if (abone.getAdSoyad().contains(kullaniciAdi)) { // eger abonenin adı soyadında belirtilen deger geçiyor ise
                    abonelist[i].print();
                }

                String harfler = "";
                for (int j = 0; j < kullaniciAdi.length(); j++) { //kullanıcı adı kadar harflere ad soyadın baş harf ekliyorum
                    harfler += abone.getAdSoyad().charAt(j);
                }

                if (harfler.equals(kullaniciAdi)) { //eğer belirtilen şekilde başlıyor ise
                    abonelist[i].print();
                }

                String harfler2 = "";
                for (int j = abonelist[i].getAdSoyad().length() - kullaniciAdi.length(); j < abone.getAdSoyad().length(); j++) { //kullanıcının son harflerini almak için verilen degerden kullanıcın harf sayısını çıkarıyorum bu sayede başlangıc değerimi buluyorum
                    harfler2 += abone.getAdSoyad().charAt(j);
                }

                if (harfler2.equals(kullaniciAdi)) {//eğer belirtilen şekilde başlıyor ise
                    abonelist[i].print();
                }
            }
        }

        System.out.println("---------------------------");
        System.out.println("9.1-");
        abone_2.sepetSil(urun_6, abone_1); //Sepetden sahibe göre urun silme
        abone_1.sepetSil(urun_2, abone_1); //Sepetden sahibe göre urun silme

        System.out.println("---------------------------");
        System.out.println("9.2-");
        Urun urun_7 = new Urun("Sandalye", 200);
        urun_7.setUretici(uretici_2);
        abone_2.SepetEkle(urun_7, abone_1); //Sepete sahibe göre urun ekleme
        abone_1.SepetEkle(urun_7, abone_1); //Sepete sahibe göre urun ekleme

        System.out.println("---------------------------");
        System.out.println("10-");
        abone_1.SepetFiyatGetir();//Sepet fiyat getirme
        abone_2.SepetFiyatGetir();//Sepet fiyat getirme

        System.out.println("---------------------------");
        System.out.println("11-");
        magaza_1.BegenenAboneSayisiEkle(abone_3); //Magazza abone ekleme
        uretici_1.BegenenAboneSayisiEkle(abone_3);//Uretici abone ekleme
        magaza_1.TakipEdenAbonelerEkle(abone_3);//Magazza Takipci ekleme
        uretici_1.TakipEdenAbonelerEkle(abone_3);//Uretici takipci ekleme
        abone_1.SepetEkle(urun_7, abone_1);//Sepete sahibe göre urun ekleme
        abone_1.SepetEkle(urun_7, abone_1);//Sepete sahibe göre urun ekleme
        abone_1.SepetEkle(urun_7, abone_1);//Sepete sahibe göre urun ekleme
    }
}

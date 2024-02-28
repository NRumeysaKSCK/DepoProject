package DepoProjeTaslak;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DepoMethods {

    private Map<Integer, Urun> urunler;

    // Constructor
    public DepoMethods() {
        this.urunler = new HashMap<>();
        this.= 1000;
    }

    // Ürün tanimlama metodu
    public void urunTanimlama(Urun urun) {
        Scanner scan = new Scanner(System.in);












    }



    // Ürünleri listeleme metodu
    public void urunListele() {
        for (Urun urun : urunler) {
            System.out.println(urun);
        }
    }

    // Ürünü rafa koy metodu
    public void urunuRafaKoy(int urunID, String raf) {
        for (Urun urun : urunler) {
            if (urun.getUrunID() == urunID) {
                urun.setRaf(raf);
                System.out.println(urun.getUrunIsmi() + " rafa koyuldu. Raf: " + raf);
                return;
            }
        }
        System.out.println("Belirtilen ID ile ürün bulunamadı.");
    }

    // Ürün çıkışı yap metodu
    public void urunCikisiYap(int urunID, int miktar) {
        for (Urun urun : urunler) {
            if (urun.getUrunID() == urunID) {
                int yeniMiktar = urun.getUrunMiktari() - miktar;
                urun.setUrunMiktari(yeniMiktar >= 0 ? yeniMiktar : 0);
                System.out.println(urun.getUrunIsmi() + " çıkışı yapıldı. Yeni miktar: " + urun.getUrunMiktari());
                return;
            }
        }

    }
}

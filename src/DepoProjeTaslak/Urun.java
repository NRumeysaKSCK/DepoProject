package DepoProjeTaslak;


public class Urun {
    private int urunID;
    private String urunIsmi;
    private String ureticiFirma;
    private int urunMiktari;
    private String urunBirimi;
    private String raf;

    //-----------------------

    // Constructor

    public Urun() {

    }

    public Urun(String urunIsmi, String ureticiFirma, int urunMiktari, String urunBirimi) {
        this.urunBirimi = urunBirimi;
        this.urunMiktari = urunMiktari;
        this.urunIsmi = urunIsmi;
        this.ureticiFirma = ureticiFirma;
        this.raf = null;
        this.urunID = 1000;
    }


    public int getUrunID() {
        return urunID;
    }

    public void setUrunID(int urunID) {
        this.urunID = 1000;
    }

    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public void setUreticiFirma(String ureticiFirma) {
        this.ureticiFirma = ureticiFirma;
    }

    public int getUrunMiktari() {
        return urunMiktari;
    }

    public void setUrunMiktari(int urunMiktari) {
        this.urunMiktari = urunMiktari;
    }

    public String getUrunBirimi() {
        return urunBirimi;
    }

    public void setUrunBirimi(String urunBirimi) {
        this.urunBirimi = urunBirimi;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = null;
    }

    @Override
    public String toString() {
        return "UrunPojoClass{" +
                "urunID=" + urunID +
                ", urunIsmi='" + urunIsmi + '\'' +
                ", ureticiFirma='" + ureticiFirma + '\'' +
                ", urunMiktari=" + urunMiktari +
                ", urunBirimi='" + urunBirimi + '\'' +
                ", raf='" + raf + '\'' +
                '}';
    }

}



package com.mycompany.veri3deneme1;

public class Hasta {
    private int no;
    private String isim;
    private char cinsiyet;
    private int yas;
    private boolean risk;
    public Hasta ileri;
    
    public Hasta(int no, String isim, char cinsiyet, int yas){
        this.no = no;
        this.isim = isim;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.ileri = null;
    }
    
    public int getNo(){
        return no;
    }
    
    public String getIsım(){
        return isim;
    }
    
    public char getCinsiyet(){
        return cinsiyet;
    }
    
    public int getYas(){
        return yas;
    }
    
    public boolean getRisk(){
        HastaManager hastaManager = new HastaManager(new Hasta(no,isim,cinsiyet,yas));
        return hastaManager.RiskHesapla();
    }
    
    private void setRisk(){
        HastaManager hastaManager = new HastaManager(new Hasta(no,isim,cinsiyet,yas));
        risk = hastaManager.RiskHesapla();
    }
}

package com.mycompany.veri3deneme1;

public class HastaManager {
    Hasta hasta;
    
    public HastaManager(Hasta hasta){
        this.hasta = hasta;
    }
    
    public boolean RiskHesapla(){
        if(hasta.getYas() >= 60) return true;
        return false;
    }
}

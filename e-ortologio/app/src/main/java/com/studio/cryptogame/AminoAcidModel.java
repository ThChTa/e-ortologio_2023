package com.studio.cryptogame;

public class AminoAcidModel {


    String month;
    String names;
    String dayoff;
    String pagosmies;
    int images;


    public AminoAcidModel(String month, String names,String pagosmies,String dayoff, int images) {

        this.month = month;
        this.names = names;
        this.dayoff = dayoff;
        this.pagosmies = pagosmies;
        this.images = images;
    }

    public String getMonth() {
        return month;
    }

    public String getNames() {
        return names;
    }

    public String getPagosmies(){return  pagosmies;}

    public String getDayoff() {
        return dayoff;
    }

    public int getImages() {
        return images;
    }

}




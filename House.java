package com.company;

import lombok.ToString;

@ToString
public class House {

    public final String adress;
    public final float sqMeter;
    public String ownersName;

    public House(String adress, float sqMeter, String ownersName) {
        this.adress = adress;
        this.sqMeter = sqMeter;
        this.ownersName = ownersName;
    }

    public House(String adress, float sqMeter) {
        this.adress = adress;
        this.sqMeter = sqMeter;
    }
}

package com.company;

import lombok.AllArgsConstructor;
import lombok.ToString;
@AllArgsConstructor
@ToString
public class Weather {
    public  double cTemp;
    public int humidityPresent0to100;
    public boolean isClouded;
    public int chanceOfRain;

    public void changeChanceOfRain(int chang) {
        if (chang >= 0 && chang <= 100) {
            chanceOfRain = chang;
        } else {
            System.out.println("invalid number");
        }
    }

    public  void printTempFahrenheit(){

        System.out.println(String.format("the temp in Fahrenheit is: %f ", cTemp * 1.8 + 32));
    }
}
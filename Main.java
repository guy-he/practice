package com.company;

import com.company.arkia.Boing747;
import com.company.hardware.Engine;

import java.lang.module.FindException;
import java.util.Random;
import java.util.Scanner;

public class Main {





    public static void createHouses(){
        House h1 = new House("tlv",100, "guy" );
        House h2 = new House("hadera", 150);
        h2.ownersName = "shimshon";
        System.out.println(h1);
        System.out.println(h2);

    }

    public static void creatDog(){
        Dog tracy = new Dog("tracy", 7, "melinoa");

    }

    public static void createMeals(){
        Meal m1 = new Meal("pizza", false, 70);
        System.out.println(m1);
        Meal m2 = new Meal("sensational", true, 40);
        System.out.println(m2);
    }

    public static void printDog(){
        Dog rexi = new Dog("rexi", 8, "golden retriver");

        System.out.println(rexi);
    }
    public static void main(String[] args) {


        creatDog();
        printDog();


    /*    Engine engine = new Engine("bb", 700, 500, 55, 20);
        Boing747 jumbo = new Boing747(engine);
        jumbo.fly(4000);
        if (engine.doesEngineneedsRestart())

        {
            System.out.println("restar engine");
        }*/

       Weather w1 = new Weather(40, 50, true, 20);
       w1.printTempFahrenheit();


        printDog();







        Transaction t9 = new Transaction(200000);
        System.out.println(Transaction.amountsum);
        Transaction.avg();

        Country c1 = new Country("dvdvd", 5.2, 542, "asia");
        System.out.println(c1);


        Tv t1 = new Tv("toshiba", "vv", 2.5, true, 55, 25);
        System.out.println(t1);
        t1.showPriceAfterDiscount();

        Car c8 = new Car("mitsubish", "w2", 2015, 2.5, 110000);

        Car c2 = new Car("bmw", "g6");



         Circle first = new Circle();
         first.radius = 5.4f;

         Circle seconed = new Circle();
         seconed.radius = 8.7f;
          first.printSize();
          seconed.printSize();

        createMeals();
        System.out.println();
        createHouses();




    }
    }














































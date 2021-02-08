package com.company;

import lombok.ToString;

import java.util.Date;
@ToString


public class Movie {
    public final String movieName;
    public final Date date;
    public float rank;
    public String genre;
    public static int movieCount = 0;
    public static final int  ratingForOscar = 9;


    public Movie(String movieName,  float rank, String genre) {
        this.movieName = movieName;
        this.date = new Date();
        this.rank = rank;
        this.genre = genre;
        movieCount++;
    }

    public void resetCounter(){
        movieCount = 0;
    }
    public boolean isWonOscar(){
        if (rank >= 9 ){
            return true;
        }
        else return false;
    }
}

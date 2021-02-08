package com.company;
import java.util.Scanner;
public class FootballTeam {
    Scanner s = new Scanner(System.in);
    String name;
    String state;
    String [] players = {"benayoun", "berkovich","revivo","messi", "ronakdo", "pele", "maradona", "tores", "casillias", "rivaldo", "kaka"};

    int rank;

    public void changeRank(int change){
        System.out.println("please enter a new rank");
        rank = change;
    }

    public void replacePlayer(String players[], String replacment, String oldplayer){
      for (int i = 0; i < players.length; i++){
          if (players[i].equals(oldplayer)){
              players[i] = replacment;
          }
      }
    }
}

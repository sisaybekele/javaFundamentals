package com.fundamentals.java;
/*
 * this class demonstrates control flow using a song.
 * */

public class BottlesOfBeerSong {

  private void Lesson10Privat(){
      System.out.println("This is a private method");
  }


    public void timeToSing(){
        int bottlesOfBeer =99;
        String word ="bottles",result = "";
        while (bottlesOfBeer > 0){
            if(bottlesOfBeer == 1){
                word = "bottle";
            }//end if
            System.out.println(bottlesOfBeer +" "+ word +" of beer on the wall");
            System.out.println(bottlesOfBeer +" "+ word + "of beer");
            System.out.println(" Take one down");
            System.out.println("pass it around");
            bottlesOfBeer --;



            if(bottlesOfBeer > 0){
                System.out.println(bottlesOfBeer +" "+ word + "of beer on the wall");
            }else {
                System.out.println(" no more bootles of beer on the wall");
            }//end if/else
        }//end while


    }//end method

    }//end class


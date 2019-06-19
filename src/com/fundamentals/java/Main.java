package com.fundamentals.java;
/*
* This Class is the String class of this project
* This is the example of a multiple comment.
 */

public class Main {

    public static void main(String[] args) {


      moreLesson6();
        //Lesson6Examples();
        //Lesson5Examples();
      //houseExample();
    }


    public static void moreLesson6(){
        Lesson6 myOtherLesson6 = new Lesson6();
        myOtherLesson6.exampleBuilder("Spaghetti" , 2);
        myOtherLesson6.exampleChar();
        myOtherLesson6.exampleEscape();
    }
public static void Lesson6Examples() {
    Lesson6 myLesson6 = new Lesson6();


    myLesson6.exampleCharAt();
    myLesson6.exampleConcat( " has awesome donuts");
    myLesson6.exampleEquals("LaMars");
    String myLower = myLesson6.examplelowercase();
    System.out.println(myLower);
    String myUpper = myLesson6.exampleUpperCase();
    System.out.println(myUpper);
    myLesson6.exampleLength();
    }









    public static void lessone5Examples(){

     Lesson5 mylesson5 = new Lesson5();
        mylesson5.showLocalExample();
       mylesson5.showLocalWithparameter(10,12);
        int example = mylesson5.showlocalWithReturn(15,8);
        System.out.println(example);
        mylesson5.showInstanceVariable();
        mylesson5.showConversions();



    }

   public static void houseExample(){
       System.out.println("Welcome to Java");
       House myHouse = new House();
       myHouse.doorOpenClose();
   }


}


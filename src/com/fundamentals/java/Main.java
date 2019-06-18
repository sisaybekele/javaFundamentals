package com.fundamentals.java;
/*
* This Class is the String class of this project
* This is the example of a multiple comment.
 */

public class Main {

    public static void main(String[] args) {


        lessone5Examples();
      //houseExample();

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


package com.fundamentals.java;
/*
* This Class is the String class of this project
* This is the example of a multiple comment.
 */

public class Main {

    public static void main(String[] args) {
        lesson8Example2();
      //lesson8Examples1();
       // Demo();
        //Lesson7examples();
      //moreLesson6();
        //Lesson6Examples();
        //Lesson5Examples();
      //houseExample();
    }
    public static void lesson8Example2(){
     Lesson8 otherlesson = new Lesson8();
     otherlesson.basicWhileExample();
     otherlesson.basicDoWhileExample();
     otherlesson.basicForLoopExample();
     otherlesson.basicBranchingExample();

    }
    public static void lesson8Examples1(){
        Lesson8 myLesson8 = new Lesson8();
        myLesson8.basicIfExample(5,10);//print before & after
        myLesson8.basicIfExample(5,5);//print before if & after
        myLesson8.basicIfElseExample(10, 12);//not equal
        myLesson8.basicIfElseExample(12,12);//equal
        myLesson8.basicIfElseChainExample(42);
        myLesson8.basicIfAndOrExample(36);
        myLesson8.basicSwitchExample(3);
    }
    public  static  void  Lesson7examples(){
        //Lesson7 myLesson7 = new Lesson7();
       //myLesson7.basicMath();
       // myLesson7.exampleModulus();
        //myLesson7.addTwoNumbers();
       // myLesson7.exampleAssignment1();
       // myLesson7.exampleAssignment2();
       //myLesson7.exampleRelational();
        //myLesson7.exampleIncrement();
        //myLesson7.exampleDecrement();
    }
    public static void Demo(){
      int  i = 5;
        System.out.println("The value of i is+i "+i);
        i = i+1;
        System.out.println("The value of i is+i"+i);
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


package com.fundamentals.java;

/*
* this class goes over lesson 14 content
* Static
* */
public class Lesson14 {
public static  final  int MY_FIRST_FINAL = 2019;

public static int myFirstStatic = 35;
public static void  setMyFirstStaticMethod(int num){
    int toatl = MY_FIRST_FINAL * num;
    System.out.println(toatl);
}//end method
public static class MyInnerClass{

  public void MyInnerMethod(){
   System.out.println(myFirstStatic);

    }
}
}//end class

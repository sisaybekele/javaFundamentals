package com.fundamentals.java;

/*
* The contant of this class is for the Lesson 6 Slide Deck.
* String & More
* */

public class Lesson6 {

    String myString = "LaMars";
    //Method shows string method for charAt
 public void  exampleCharAt(){
     char myChar = myString.charAt(2);
     System.out.println(myChar);
 }
//method show string method for Concat
 public void exampleConcat(String value) {
     String happy = myString.concat(value);
     System.out.println(happy);
 }
//method show string method for  exampleEquals
 public void  exampleEquals(String donut){
   boolean myBoolean = myString.equals(donut);
   System.out.println(myBoolean);
 }
//method show string for exampleLowercase
  public String  examplelowercase(){
     return myString.toLowerCase();
  }
  //method show string for exampleUppercase
  public String exampleUpperCase() {
      return myString.toUpperCase();
  }
//method show string for exampleLength
  public void exampleLength() {
      int Length = myString.length();
      System.out.println(Length);
  }
//method show string for exampleBuilder
      public void exampleBuilder(String food, int Value){
         StringBuilder build = new StringBuilder();
         build.append("My favorite food is ");
         build.append(food).append(" and I ate ")
                 .append(Value).append(" plates of it.");
          String fav = build.toString();
          System.out.println(fav);
      }
//method show for exampleChar
      public void exampleChar(){
     char c1 = 't';
     char c2 = '\u00A7';
     System.out.println(c2);
      }
      //method show for exampleEscape \'s=single quote(apostrophe) \t=new tab \n=new line.
      public void exampleEscape(){
     System.out.println("That\'s a cool toy.\tCan i\n play wthi it.");
      }
  }


package com.fundamentals.java;

import com.sun.deploy.uitoolkit.Window;

/*
*This is our first class that we create ourselves.
 **/
public class House {

    private String roofType;// This describes a type of roof
 private int windowSize;
  private String foundation;
  private String doorColor;
  public House() {
System.out.println("This is the default constructor");

  }
  public House(String doorColor){
      this(doorColor,24,"concrete", "shingle");
      System.out.println("the Door Color is"+doorColor);
  }

  public House(String doorColor,int WindowSize,String foundation,String roofType){
      this.doorColor = doorColor;
      this.windowSize = WindowSize;
      this.foundation = foundation;
      this.roofType = roofType;
  }


  public  void  SetRoofType(String roofType){
      this.roofType = roofType;
  }

    public String getRoofType() {
        return roofType;
    }

    //Our frist method (function)
  public void doorOpenClose() {
      System.out.println("Open my door");
      System.out.println("Close my door");
      System.out.println("Red");
  }

}

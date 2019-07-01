package com.fundamentals.java;

/*
*This is our first class that we create ourselves.
 **/
public class House implements myFirstInterface {

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
      this.setDoorColor(doorColor);
      this.setWindowSize(WindowSize);
      this.setFoundation(foundation);
      this.setRoofType(roofType);
  }
  public  void  SetRoofType(String roofType){
      this.setRoofType(roofType);
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
  public void  doorOpenClose(String message){
      System.out.println(message);
  }


    public String getDoorColor() {
        return doorColor;
    }

    public void setDoorColor(String doorColor) {
        this.doorColor = doorColor;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public int getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(int windowSize) {
        this.windowSize = windowSize;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public void endCall() {

    }
}

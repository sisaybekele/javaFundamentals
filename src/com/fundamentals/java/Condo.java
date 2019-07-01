package com.fundamentals.java;

public class Condo extends House {
private String balcony;
public  Condo(){
    System.out.println("Default Condo Constructor");
}
public Condo(String balcony){
    this.balcony = balcony;
}
    public  Condo(String balcony, String doorColor, int windowSise,String foundation, String roofType){
super(doorColor,windowSise,foundation,roofType);
this.balcony = balcony;

    }
public void maintenance(){

    System.out.println("will fix condo issues");
}

    public String getBalcony() {
        return balcony;

    }

    public void setBalcony(String balcony) {
        this.balcony = balcony;
    }



    public void  doorOpenClose(){

    System.out.println("my Condo door is open");
    }
}

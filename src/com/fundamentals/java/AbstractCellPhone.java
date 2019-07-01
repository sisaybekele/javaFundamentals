package com.fundamentals.java;

/*
* This class demonstrates an Abstract class
* */
public abstract class AbstractCellPhone implements myFirstInterface {
    /*
    * Volume
    * Screen
    * number keys
    * send key
    *
    * */
    private  int Volume;
    private  int[] numberKeys;
    private  int sendKey;
    private  String Screen;
    public  AbstractCellPhone( int Vol, int[] nkeys ,int sKey  ,String Screen){
        this.Volume = Vol;
        this.numberKeys = nkeys;
        this.sendKey = sKey;
        this.Screen = Screen;
    }//end constructor
    public  abstract   void  recieveCall();
    public  abstract void sendCall();
    public  abstract  void  endCall();
    public int getVolume(){
        return Volume;
    }
    public  String getScreen(){
        return Screen;
    }
    public int[] getNumberKeys(){
        return numberKeys;
    }
    public int getSendKey(){
        return sendKey;
    }


}//end class

package com.fundamentals.java;
/*
* this class serve as a child class to AbsractCellphone
*
* */
public class Blackberry extends  AbstractCellPhone{
    public Blackberry(int Vol,int[] nkeys, int skey, String Screen){
        super(Vol,nkeys,skey,Screen);
    }

    @Override
    public void recieveCall() {
System.out.println("recieving phone call");
    }

    @Override
    public void sendCall() {
        System.out.println("sending phone Cell");

    }

    @Override
    public void endCall() {
   System.out.println("Call has ended");
    }

}

package com.fundamentals.java;

public class SUV {
    public SUV(int passengerSeats) {
        setPassengerSeats(passengerSeats);
        // System.out.println("Default passengerSeats  Constructor");
    }

    public static void Move() {
        System.out.println("big seater");

    }

    private int PassengerSeats;

    public int getPassengerSeats() {
        return PassengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        PassengerSeats = passengerSeats;
    }
}


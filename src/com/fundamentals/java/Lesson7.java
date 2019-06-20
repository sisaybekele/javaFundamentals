package com.fundamentals.java;
            import java.util.Scanner;
/*
* The contents of the class goes over the Lesson 7 content.
* Java operators
* */

public class Lesson7 {

                    //The method of BasicMath

    int value1 = 23, value2 = 45;

    public void  basicMath(){
        int addTotal = value1 + value2;
        int subtractTotal = value2 - value1;
        int multiplyTotl = value1 * value2;
        int divisionTotal = value1 / value2;
        System.out.println(addTotal);
        System.out.println(subtractTotal);
        System.out.println(multiplyTotl);
        System.out.println(divisionTotal);
    }


                                //The method of Modulus example

    public void exampleModulus(){
        int modulusTotal =  value1 % value2;
        System.out.println(modulusTotal);
    }

    public void addTwoNumbers(){
                                          // the method of  Add two numbers
        int x, y, z;
        System.out.println("Enter two integers to calculate their sum. ");
        Scanner in  = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
         z = x + y;
         System.out.println("The sum of Entered values = "+z);
    }

    public  void  exampleAssignment1(){
                                       //The method of Assignment
        int able = 10, may = 15;
        able += may;
        System.out.println(able);
        may -= able;
        System.out.println(may);
        able *= may;
        System.out.println(able);
        able /= may;
        System.out.println(able);
        may %= able;
        System.out.println(may);
    }


    public void  exampleAssignment2(){
                                             //The method of Assignment
        int beta = 10,charlie  = 5;
        beta <<=charlie;
        System.out.println(beta);
        charlie>>=beta;
        System.out.println(charlie);
        beta &= charlie;
        System.out.println(beta);
        charlie ^= beta;
        System.out.println(charlie);
    }

    public void exampleRelational(){
                                         // The method of Rational
        int echo = 25, foxtrot = 30, golf = 25;
        boolean isSample1 = echo == foxtrot;
        System.out.println(isSample1);
        boolean isSample2 = echo != foxtrot;
        System.out.println(isSample2);
        boolean isActual = foxtrot > golf;
        System.out.println(isActual);
        boolean isActual2 = foxtrot < golf;
        System.out.println(isActual2);
        boolean isFamiliar = echo >= golf;
        System.out.println(isFamiliar);
        boolean isFamiliar2 = foxtrot <= echo;
        System.out.println(isFamiliar2);

    }

    public  void  exampleIncriment(){
                                        //Increment method of variable
        int home = 10, jump, car;
        jump = home++;              // the Answer is 10
        System.out.println(jump);

        car = ++home;         // the Answer is 12
        System.out.println(car);

    }
    public  void exampleDecrement(){
                                   //Decrement method of variable
        int toy = 10, joe, jerry;
        joe = toy -- ;                   //The Answer is 10
        System.out.println(joe);

        jerry = --toy;                 // The Answer is 8
        System.out.println(jerry);
    }

    }


package com.fundamentals.java;
import com.fundamentals.Lesson10.Lesson10;
import com.fundamentals.TruckExample;
/*
* This Class is the String class of this project
* This is the example of a multiple comment.
 */

public class Main {

    public static int num = 0;

    static {
        System.out.println("static block 1");
        num = 42;
    }
    static {
       System.out.println("static block 2");
       num = 62;
    }//end static block
    public static void main(String[] args){
        Lesson15Example();
//Lesson14Example();
        //gradeExample();
        //gradeExample2();

        //SUVExample();
        //Lesson12Example();
        //TruckExample();
        //Lesson11Example();

    //Lesson10Example();
   //Lesson9Example();
        //BeerSong();
        // lesson8Example2();
        //lesson8Examples1();
        // Demo();
        //Lesson7examples();
        //moreLesson6();
        //Lesson6Examples();
        //Lesson5Examples();
        //houseExample();
    }//end main method
    public  static  void Lesson15Example() {
        int[] myKes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Blackberry myBlackBerry = new Blackberry(25, myKes, 0, "Color Screen");
        myBlackBerry.recieveCall();
        AbstractCellPhone myOldphone = new Blackberry(30, myKes, 1, "monochrome");
        myOldphone.recieveCall();
        myOldphone.endCall();

    }

    public static void  Lesson14Example(){
      //Lesson14.MY_FIRST_FINAL =10;// can not change value of a final
      int total = Lesson14.MY_FIRST_FINAL * 35;
      System.out.println(total);
      //can change the value of a non final static
        Lesson14.myFirstStatic = 98; // original is 35
        System.out.println(Lesson14.myFirstStatic);
        Lesson14.setMyFirstStaticMethod(10);
        System.out.println("block number was"+num);
        Lesson14.MyInnerClass test = new Lesson14.MyInnerClass();
        test.MyInnerMethod();


    }
    public static void gradeExample(){
        Lab3 myLab3 = new Lab3();
        myLab3.gradeExample();
    }
    public static void gradeExample2() {
        Lab3 myLab3 = new Lab3();
        myLab3.gradeExample2();
    }

    public static void SUVExample(){
        SUV mySUV = new SUV(7);
        System.out.println(mySUV.getPassengerSeats());

    }

    public static void Lesson12Example(){

        Condo myCondo = new Condo();
        myCondo.doorOpenClose();
        Condo mySecondCondo = new Condo("railing","Orange",30,"composite","steel");
        System.out.println(mySecondCondo.getDoorColor());
    }
   public static void TruckExample() {
        TruckExample myTruckExample = new TruckExample("chrome","Tinted","Short","Hunter Green");
myTruckExample.setColor("black");
System.out.println(myTruckExample.getWheels());
System.out.println(myTruckExample.getWindows());
System.out.println(myTruckExample.getBoxBed());
System.out.println(myTruckExample.getColor());




        }

    public static void Lesson11Example(){
        House house1 = new House();

        House house2 = new House(" white");
    }

    public static void Lesson10Example(){
        //try to see a private method in another class.
        Lesson6 myLesson6 = new Lesson6();
        //myLesson6.examplePrivate();//can not access

        BottlesOfBeerSong song = new BottlesOfBeerSong();
        //song.Lesson10Private();//can not access
        Lesson10 myLesson = new Lesson10();
        //myLesson.ShowLesson();//can not access
       // myLesson.ShowProtected();//can not access
    }


    public static void Lesson9Example(){
        Lesson9  myLesson9= new Lesson9();
        myLesson9.basicIntArray();
        myLesson9.basicStringArray();
        myLesson9.basicTwoDimensionalArray();
        myLesson9.basicThreeDimensionalArray();
        myLesson9.basicJaggedArray();

    }


    public static void BeerSong() {
        BottlesOfBeerSong song = new BottlesOfBeerSong();
        song.timeToSing();
    }

        public static void lesson8Example2 () {
            //Lesson8 otherlesson = new Lesson8();
            // otherlesson.basicWhileExample();
            //otherlesson.basicDoWhileExample();
            // otherlesson.basicForLoopExample();
            // otherlesson.basicBranchingExample();

        }

        public static void lesson8Examples1 () {
            //  Lesson8 myLesson8 = new Lesson8();
            //  myLesson8.basicIfExample(5,10);//print before & after
            //  myLesson8.basicIfExample(5,5);//print before if & after
            //  myLesson8.basicIfElseExample(10, 12);//not equal
            //  myLesson8.basicIfElseExample(12,12);//equal
            //  myLesson8.basicIfElseChainExample(42);
            //myLesson8.basicIfAndOrExample(36);
            // myLesson8.basicSwitchExample(3);
        }
        public static void Lesson7examples () {
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
        public static void Demo () {
            int i = 5;
            System.out.println("The value of i is+i " + i);
            i = i + 1;
            System.out.println("The value of i is+i" + i);
        }


        public static void moreLesson6 () {
            Lesson6 myOtherLesson6 = new Lesson6();
            myOtherLesson6.exampleBuilder("Spaghetti", 2);
            myOtherLesson6.exampleChar();
            myOtherLesson6.exampleEscape();
        }
        public static void Lesson6Examples () {
            Lesson6 myLesson6 = new Lesson6();


            myLesson6.exampleCharAt();
            myLesson6.exampleConcat(" has awesome donuts");
            myLesson6.exampleEquals("LaMars");
            String myLower = myLesson6.examplelowercase();
            System.out.println(myLower);
            String myUpper = myLesson6.exampleUpperCase();
            System.out.println(myUpper);
            myLesson6.exampleLength();
        }


        public static void lessone5Examples () {

            Lesson5 mylesson5 = new Lesson5();
            mylesson5.showLocalExample();
            mylesson5.showLocalWithparameter(10, 12);
            int example = mylesson5.showlocalWithReturn(15, 8);
            System.out.println(example);
            mylesson5.showInstanceVariable();
            mylesson5.showConversions();


        }

        public static void houseExample () {
            System.out.println("Welcome to Java");
            House myHouse = new House();
            myHouse.doorOpenClose();
        }


    }



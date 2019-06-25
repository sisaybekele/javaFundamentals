package com.fundamentals.java;

/*
* the contents of the class is for Lesson 9
* Arrays
* */
public class Lesson9 {

    public void basicIntArray(){
        int[] intarray = {23,45,12,8,95,103,37} ;
        for(int i = 0; i < intarray.length;i++){
            System.out.println(intarray[i]);
        }//end for loop

    }//end method

    public void basicStringArray(){
        String[] stringArray = new String[4];
        stringArray[0] ="happy";
        stringArray[1] = "tuesday";
        stringArray[2] ="movie";
        stringArray[3] ="grape";
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i]);

        }//end for loop
    }//end method

    public void basicTwoDimensionalArray(){
     int[][] myArray = {{23,45},{35,46},{57,98}};
     for (int i = 0; i < myArray.length; i++){
      for(int j = 0; j < myArray[j].length; j++){
          System.out.println(myArray[i][j]);
      }// end  inner for loop

     }//end outer  for loop

    }//end method
    //int[][][] arr = { {{1, 2}, {3, 4}}, {{5, 6}, {7, 8}} };
    public void basicThreeDimensionalArray(){
        int [][][] threeArray = new int[2][2][2];
        threeArray[0][0][0] = 10;
        threeArray[0][1][0] = 12;
        threeArray[0][0][1] = 13;
        threeArray[0][1][1] = 14;



        threeArray[1][0][0] = 15;
        threeArray[1][1][0] =16;
        threeArray[1][1][1] =17;
        threeArray[1][0][1] =18;
        for(int i = 0; i< threeArray.length; i++){
            for(int j = 0; j< threeArray[i].length; j++){
                for(int k = 0; k< threeArray[j].length; k++){
                    System.out.println(threeArray[i][j][k]);
                }// end inner inner for loof
            }//end inner for loop
        }//end outer for loop

    }//end method
    public static void basicJaggedArray(){
        String[][] stringArray = new String[1][3];
        stringArray[0][0] = "june";
        stringArray[0][1] = "july";
        stringArray[0][2] = "August";
        for (int i = 0; i < stringArray.length; i++){
            for(int j = 0; j <stringArray[i].length; j++){
                System.out.println(stringArray[i][j]);

            }//end inner for loop
        }//end outer for loop
    }//end method

}//end class

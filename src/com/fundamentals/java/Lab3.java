package com.fundamentals.java;
import java.util.Scanner;
public class Lab3 {
    public void main(String args[]) {
    }

    public void gradeExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade of your marks (less than 100)::");

        int grade = sc.nextInt();

        if (grade >= 80) {
            grade = 'E';
        } else if (grade >= 60 && grade < 80) {
            grade = 'V';
        } else if (grade >= 40 && grade < 60) {
            grade = 'G';
        } else {
            grade = 'A';
        }
        switch (grade) {
            case 'E':
                System.out.println("Excellent!");
                break;
            case 'V':
                System.out.println("Very Good");
                break;
            case 'G':
                System.out.println("Good");
                break;
            case 'A':
                System.out.println("Average");
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

    }

    public static void gradeExample2() {
        int i = 0;
        do {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;

        } while (i < 50);
    }//end  method




    }










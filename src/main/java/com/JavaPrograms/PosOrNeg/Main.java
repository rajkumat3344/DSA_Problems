package com.JavaPrograms.PosOrNeg;

import java.util.Scanner;

//Find positive or negative number
public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("Neither Positive nor Negative");
        } else if (num < 0) {
            System.out.println("Negative Number");
        }else{
            System.out.println("Positive Number");
        }
    }
}

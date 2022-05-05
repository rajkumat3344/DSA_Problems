package com.JavaPrograms.AbsVal;

import java.util.Scanner;

//Absolute value of a number
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        int num = sc.nextInt(); // 1

        if (num < 0) // 1
            num = -num; // 1

        System.out.println(num); // 1 --> Total time = 1 + 1 + 1 + 1 = 4 : Big-O(1)

    }
}

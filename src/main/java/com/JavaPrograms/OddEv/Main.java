package com.JavaPrograms.OddEv;

import java.util.Scanner;

//Odd or Even Problem
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("Odd Number");
        }else{
            System.out.println("Even Number");
        }
    }
}

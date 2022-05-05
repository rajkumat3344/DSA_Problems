package com.JavaPrograms.Swap;

import java.util.Scanner;

//Swap two numbers
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();

        System.out.println("Before Swap \na:"+a+" \nb:"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap \na:"+a+" \nb:"+b);
    }
}

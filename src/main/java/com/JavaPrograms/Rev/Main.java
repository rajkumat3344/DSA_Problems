package com.JavaPrograms.Rev;

import java.util.Scanner;

//Reverse a number
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int N = sc.nextInt();

        int Quotient = 0;
        System.out.print("Reversed Number: ");
        while(N > 0){
           int Remainder = N % 10;
           Quotient = Quotient * 10 + Remainder;
            N = N / 10;
        }
        System.out.println(Quotient+" ");
    }
}

package com.JavaPrograms.Factor;

import java.util.Scanner;

//Factor of a Number
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter N: ");// 1
        int N = sc.nextInt();// 1

        System.out.print("Enter X: ");// 1
        int X = sc.nextInt();// 1

        int Remainder = 0;// 1
        int Quotient = N/X;// 1
        int factor = Quotient * X + Remainder;// 1

        if (factor != N){
            System.out.println(X+" is not a factor of "+N);// 1
        }else{
            System.out.println(X+" is a factor of "+N);// 1
        }
        //Time Complexity: 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1 = 9 , constant time So Big-O(1).
    }
}

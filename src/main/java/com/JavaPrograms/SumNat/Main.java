package com.JavaPrograms.SumNat;

import java.util.Scanner;

//Sum of Natural Numbers
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        int N = sc.nextInt();// 1
        int sum = 0;// 1
        for (int i = 1; i <= N; i++) { // N
             sum += i;// N+1
        }
        System.out.println(sum); // 1
        //T(C) = 1+1+1+N+1 = N+4--> Big-O(N)    ,Time Complexity of this program is O(N)
    }
}

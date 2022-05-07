package com.JavaPrograms.SumNat;
//Sum of Natural Numbers
import java.util.Scanner;

public class MainMethod2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        int N = sc.nextInt();// 1

        //O(1) --> Focus, Time Complexity
        N = N*(N+1)/2; // 1

        System.out.println(N); // 1, T(C) = 1 + 1 + 1 = 3 , Time Complexity is Big-O(1)
    }
}

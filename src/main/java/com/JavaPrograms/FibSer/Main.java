package com.JavaPrograms.FibSer;

import java.util.Scanner;

//Fibonacci series
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;
        for (int i=1 ; i <= num ; i++){
            System.out.print(a+" ");
                c = a + b;
                a = b;
                b = c;
        }
    }
}

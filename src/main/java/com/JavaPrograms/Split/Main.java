package com.JavaPrograms.Split;

import java.util.Scanner;

//Split numbers into digits
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("N: ");
        int N = sc.nextInt();

        while(N > 0) {
            int digit = N % 10;
            N = N / 10;
            System.out.print(digit + " ");
        }
    }
}

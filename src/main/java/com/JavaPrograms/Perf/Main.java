package com.JavaPrograms.Perf;

import java.util.Scanner;

//Perfect number
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        int result = 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0){
                if (num / i == i){
                    result += i;
                }else {
                    result = result + i + num / i;
                }
            }
        }
        if (result == num){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}

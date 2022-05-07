package com.JavaPrograms.SumDig;

import java.util.Scanner;

//Sum of digits
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Input");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10; // taking the last digit of the number
            num = num / 10; // by this removing the last digit from the number
            sum += digit;
        }
        System.out.println("Total Sum of Digit of the number is : "+sum);
    }
}

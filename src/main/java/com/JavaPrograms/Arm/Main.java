package com.JavaPrograms.Arm;

import java.util.Scanner;

//Armstrong number
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int temp = num;
        int quotient = 0;
        while(num > 0){
            int remainder = num % 10;
            quotient = quotient + remainder*remainder*remainder;
            num = num / 10;
        }
        if(temp != quotient){
            System.out.println("Not Armstrong");
        }else{
            System.out.println("Armstrong");
        }
    }
}

package com.JavaPrograms.Palin;

import java.util.Scanner;

//Palindrome number
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int temp = num;
        int quotient = 0;
        while(num > 0){
            int remainder = num % 10;
            quotient = quotient * 10 + remainder;
            num = num / 10;
        }
       if (temp == quotient){
           System.out.println("Palindrome");
       }else{
           System.out.println("Not Palindrome");
       }
    }
}

package com.JavaPrograms.Prime;

import java.util.Scanner;

//Prime number
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        int flag = 0;
        for(int i=2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }

    }
}

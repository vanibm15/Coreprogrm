package com.coreprogrm;

import java.util.Scanner;

public class Coreprogrm {
    public static void main(String[] args) {
        int num;
        System.out.println("enter an number :");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        if((num % 2 == 0) )

        System.out.println("number is even ");
else
        System.out.println("number is odd");
    }
}

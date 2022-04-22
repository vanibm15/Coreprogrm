package com.coreprogrm;

import java.util.Scanner;

public class Coreprogrm {
    public static void main(String[] args) {
        int year;
        System.out.println("enter an year :");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if((year % 4 == 0) )

        System.out.println("specified year is leap year ");
else
        System.out.println("specified year is not a leap year");
    }
}

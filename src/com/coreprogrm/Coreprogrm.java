package com.coreprogrm;

import java.util.Scanner;

public class Coreprogrm {
    public static void main(String[] args) {
        int x,y,t;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of X & Y");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println("before swapping numbers:" +x+  " "+y);
        t = x;
        x = y;
        y = t;
        System.out.println("after swapping:" +x+ " " +y);
    }
}
